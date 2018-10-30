package de.dhbw.myvitality.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

import de.dhbw.myvitality.entities.Article;
import de.dhbw.myvitality.entities.Storrage;
import de.dhbw.myvitality.entities.SupplementConfiguration;
import de.dhbw.myvitality.services.*;
import org.hibernate.Hibernate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ServletController: Mappt die Http Anfragen auf eine JSP
 *
 * @author Tamino Fischer alias CodeKeks
 */
@Controller
public class ServletController {

    @Autowired
    private UserAuthentificationService userAuthentificationService;

    @Autowired
    private SupplementConfigurationService supplementConfigurationService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private StorrageService storrageService;

    @Autowired
    private ArticleService articleService;

    private static final Logger log = LoggerFactory.getLogger(ServletController.class);

    private static final String webInfJspPath = "/WEB-INF/jsp/";


    /***
     * Diese Methode realisiert den eigentlichen Seitenaufruf
     * Bevor dies geschieht wird jedoch überprüft:
     *      - handelt es sich um einen Angemeldeten User
     *      - hat der Angemeldete User den richtigen UserType,
     *      sodass Kunden nur auf Kundenseiten gelangen und Mitarbeiter nur auf Mitarbeiterseiten
     *
     * Hat die Überprüfung ein positives Ergebnis, so wird die Page aufgerufen
     *
     * @param request
     * @param response
     * @param userType
     * @param jsp
     * @throws ServletException
     * @throws IOException
     *
     * @author Tamino Fischer alias CodeKeks
     */
    private void getPage(HttpServletRequest request, HttpServletResponse response, String userType, String jsp) throws ServletException, IOException {
        if (request.getSession().getAttribute("token") == "active" && request.getSession().getAttribute("userType") == userType) {
            request.setAttribute("loginLogoutText", "Logout");

            //HTTP-Funktion um das automatische Ablegen der Seite im Browser-Cache zu unterbinden (Sven)
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0
            response.setHeader("Expires", "0"); // Proxies

            request.getRequestDispatcher(webInfJspPath + jsp).forward(request, response);
        } else {
            response.sendRedirect("login");
        }
    }

    //Index Page
    @RequestMapping("/")
    public void getIndexPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //In der HHTP-Session abfragen ob der Benutzer der Website angemeldet ist (Sven)
        if (request.getSession().getAttribute("token") == "active") {
            request.setAttribute("loginLogoutText", "Logout");
        } else {
            request.setAttribute("loginLogoutText", "Login");
        }
        request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
    }

    /**
     * Diese Methode empfängt den http-request des Registrierungsbereichs der Website. Hier können sich Kunde registrieren.
     * Wird der Bereich per URL aufgerufen während der Benutzer angemeldet ist, werden die Attribute der HTTP-Session gelöscht.
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @author Sven Hornung
     */
    //registration Page
    @RequestMapping("/registration")
    public void getRegistrationPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("username");
        request.getSession().removeAttribute("password");
        request.getSession().removeAttribute("token");
        request.getSession().removeAttribute("userType");
        request.setAttribute("loginLogoutText", "Login");
        request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp").forward(request, response);
    }

    /**
     * Empfänger des http-post beim Senden der Registrierungsdaten.
     * Durch das Anwenden der POST-Methode im Formular, wird das Senden der Registrierungsdaten an den Server ermöglicht.
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @author Sven Hornung
     */
    //post Registration Page
    @RequestMapping(method = RequestMethod.POST, value = "/registration")
    public void postRegistrationPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Nutzername, Passwort und E-Mail abspeichern
        String username = request.getParameter("username");
        log.info(username);
        String password = request.getParameter("password");
        log.info(password);
        String email = request.getParameter("email");
        log.info(email);

        //Durch Übergeben der Parameter prüfen ob der Benutzer schon existiert und registriert werden kann, ansonsten Errormessage (Sven)
        if (customerService.registerCustomer(username, password, email)) {
            response.sendRedirect("/login");
        } else {
            request.setAttribute("error", "Username bereits vergeben!");
            request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp").forward(request, response);
        }
    }

    /**
     * Diese Methode empfängt den http-request des Loginbereichs der Website. Hier kann sich der Kunde anmelden.
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @author Sven Hornung
     */
    //Login Page
    @RequestMapping("/login")
    public void getLoginPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("username");
        request.getSession().removeAttribute("password");
        request.getSession().removeAttribute("token");
        request.getSession().removeAttribute("userType");
        request.setAttribute("loginLogoutText", "Login");
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
    }

    /**
     * Empfänger des http-post beim Senden der Logindaten
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @author Sven Hornung
     */
    //post Login Page
    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public void postLoginPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Passwort versuchen auszulesen, um zu prüfen, ob der Benutzer auf Passwort vergessen gegangen ist

        try{
            if(request.getParameter("password") != null){
                HttpSession httpSession = request.getSession();
                httpSession.setAttribute("username", request.getParameter("username"));
                log.info("Post logincredentials");
                httpSession.setAttribute("password", request.getParameter("password"));

                //Aufruf der Serviceklasse "UserAuthentificationService", welche die Authentifizierung durchführt (Tamin & Sven)
                boolean[] authentification = userAuthentificationService.userAuthentification(httpSession);
                if (authentification[0]) {
                    if (authentification[1]) {
                        httpSession.setAttribute("token", "active");
                        log.info("Setze Token aus active");
                        httpSession.setAttribute("userType", "customer");
                        log.info("setze userType auf customer");
                        httpSession.setAttribute("username", request.getParameter("username"));
                        log.info("speichere username in der Session" + request.getParameter("username"));
                        response.sendRedirect("/customerhome");
                    } else {
                        httpSession.setAttribute("token", "active");
                        log.info("setze token auf active");
                        httpSession.setAttribute("userType", "employee");
                        log.info("setze userType auf employee");
                        response.sendRedirect("employeehome");
                    }
                } else {
                    request.setAttribute("error", "Falscher Username oder falsches Passwort");
                    request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
                }
            }else{
                //HIER GEHTS MORGEN WEITER!!!
                log.info("Post passwordForgotten");
                request.setAttribute("error", "E-Mail wurde versendet");
                request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
            }
        }catch(Exception ex){
            log.info("Post passwordForgotten");
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        }


    }

    /**
     * Dies ist der Empfänger des <b>http-request</b> für die warehouse-Seite
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @author KANBEN86
     */
    @RequestMapping("/warehouse")
    public void getWarehousePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getPage(request, response, "employee", "warehouse.jsp");
    }

    /**
     * Diese Mehode liefert die Seite addArticle zu einem neuen Artikel
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @author Benjamin Kanzler
     */
    @RequestMapping("/addArticle")
    public void getArticlePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getPage(request, response, "employee", "addArticle.jsp");
    }

    /**
     * Diese Mehode liefert die Seite addArticle zu einem bestimmten Artikel
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @author Benjamin Kanzler
     */
    @RequestMapping("/addArticle/{articleId}")
    public void getArticlePage(HttpServletRequest request, HttpServletResponse response,
                               @PathVariable("articleId") String articleId) throws ServletException,
            IOException {
        if (articleId != null && articleId != "") {
            request.setAttribute("article", articleService.findById(articleId).get());
        } else {
            request.setAttribute("article", new Article());
        }
        getPage(request, response, "employee", "addArticle.jsp");
    }


    /**
     * Diese Mehode liefert die Seite addArticle zu einem bestimmten Artikel
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @author Benjamin Kanzler
     */
    @RequestMapping(method = RequestMethod.POST, value = "/addArticle")
    public void postArticlePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String articleId = request.getParameter("articleId");
        Article article = null;
        if (articleId != null) {
            article = new Article();
            article = articleService.findById(articleId).get();
        }
        request.setAttribute("article", article);
        getPage(request, response, "employee", "addArticle.jsp");
    }


    /**
     * Diese Methode liefert die Tabelle mit dem Lagerinhalt in Form einer jsp
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @author Benjamin Kanzler
     */
    @RequestMapping("/showStock")
    public void getShowStockPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("articleList", articleService.findAll());
        getPage(request, response, "employee", "showStock.jsp");
    }

    /***
     * Diese Methode mappt die Http Anfrage GET hostname:port/customerhome auf die customerhome.jsp
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     *
     * @author Tamino Fischer alias CodeKeks
     */
    @RequestMapping("/customerhome")
    public void getCustomerHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getPage(request, response, "customer", "custHome.jsp");
    }


    /***
     * Diese Methode mappt die Http Anfrage GET hostname:port/employeehome auf die employeehome.jsp Page
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     *
     * @author Tamino Fischer alias CodeKeks
     */
    @RequestMapping("/employeehome")
    public void getEmployeeHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getPage(request, response, "employee", "emplHome.jsp");
    }

    /***
     * Diese Methode mappt die Http Anfrage GET hostname:port/mysupplements auf die mysupplements.jsp Page
     * Dabei wird dem Request als Attribut die jeweilige Liste Nahrungserzänzungsmitteln übergeben, die angezeigt werden sollen
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     *
     * @author Tamino Fischer alias CodeKeks
     */
    @RequestMapping("/mysupplements")
    public void getMySupplementsPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SupplementConfiguration supplementConfiguration =
                supplementConfigurationService.
                        findSupplementConfigurationByUsername(request.getSession().
                                getAttribute("username").toString());
        request.setAttribute("customerId", supplementConfiguration.getCustomerId());
        request.setAttribute("artileList", supplementConfiguration.getArticleList());
        request.setAttribute("quantityList", supplementConfiguration.getQuantitList());
        request.setAttribute("informationList", supplementConfiguration.getInformationList());
        getPage(request, response, "customer", "mySupplements.jsp");
    }

    //traingsSchedule Page
    @RequestMapping("/trainingsschedule")
    public void getTraingsSchedulePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getPage(request, response, "employee", "traingsSchedule.jsp");
    }

    //preexerciselevel Page
    @RequestMapping("/preexerciselevel")
    public void getPreExerciseLevelPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getPage(request, response, "customer", "preexerciselevel.jsp");
    }

    //scheduleOverview Page
    @RequestMapping("/scheduleoverview")
    public void getTraingsScheduleOverview(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getPage(request, response, "customer", "scheduleOverview1.jsp");
    }

    //profileSettings Page
    @RequestMapping("/profilesettings")
    public void getProfileSettingsPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getPage(request, response, "customer", "profileSettings.jsp");
    }
}
