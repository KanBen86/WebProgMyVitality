package de.dhbw.myvitality.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.entities.Employee;
import de.dhbw.myvitality.services.CustomerService;
import de.dhbw.myvitality.services.EmployeeService;
import de.dhbw.myvitality.services.SupplementConfigurationService;
import de.dhbw.myvitality.services.UserAuthentificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ServletController: Mappt die Http Anfragen auf eine JSP
 *
 * @author tamino.fischer
 */
@Controller
public class ServletController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private UserAuthentificationService userAuthentificationService;

    @Autowired
    private SupplementConfigurationService supplementConfigurationService;

    private static final Logger log = LoggerFactory.getLogger(ServletController.class);

    //Index Page
    @RequestMapping("/")
    public void getIndexPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
    }

    //Login Page senden
    @RequestMapping("/login")
    public void getLoginPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
    }

    //Login Daten senden und verarbeiten
    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public void postLoginPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Post logincredentials");
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("username", request.getParameter("username"));
        httpSession.setAttribute("password", request.getParameter("password"));

        boolean[] authentification = userAuthentificationService.userAuthentification(httpSession);
        if(authentification[0]){
            if (authentification[1]){
                httpSession.setAttribute("token", "active");
                log.info("Setze Token aus active");
                httpSession.setAttribute("userType", "customer");
                log.info("setze userType auf customer");
                response.sendRedirect("/customerhome");
            }
            else {
                httpSession.setAttribute("token", "active");
                log.info("setze token auf active");
                httpSession.setAttribute("userType", "employee");
                log.info("setze userType auf employee");
                response.sendRedirect("employeehome");
            }
        }
        else {
            request.setAttribute("error", "Falscher Username oder falsches Passwort");
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        }

    }

    //Warehouse Page
    @RequestMapping("/warehouse")
    public void getWarehousePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/warehouse.jsp").forward(request, response);
    }

    // AddArticle Page
    @RequestMapping("/addArticle")
    public void getAddArticlePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/addArticle.jsp").forward(request, response);
    }

    // ShowStock Page
    @RequestMapping("/showStock")
    public void getShowStockPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/showStock.jsp").forward(request, response);
    }

    //Customer Home Page
    @RequestMapping("/customerhome")
    public void getCustomerHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("token") == "active" && request.getSession().getAttribute("userType") == "customer" ){
            request.getRequestDispatcher("/WEB-INF/jsp/custHome.jsp").forward(request, response);
        }
        else {
            response.sendRedirect("login");
        }
    }

    //Employee Home Page
    @RequestMapping("/employeehome")
    public void getEmployeeHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getSession().getAttribute("token") == "active" && request.getSession().getAttribute("userType") == "employee" ){
            request.getRequestDispatcher("/WEB-INF/jsp/emplHome.jsp").forward(request, response);
        }
        else {
            response.sendRedirect("login");
        }
    }

    //My Supplements Page
    @RequestMapping("/mysupplements")
    public void getMySupplementsPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", supplementConfigurationService.findArticleListByCustomerId("11111"));
        request.getRequestDispatcher("/WEB-INF/jsp/mySupplements.jsp").forward(request, response);
    }

    //Zum ausprobieren
    @RequestMapping("/test")
    public void getTestPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/templateTest.jsp").forward(request, response);
    }

    //traingsSchedule Page
    @RequestMapping("/trainingsschedule")
    public void getTraingsSchedulePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/traingsSchedule.jsp").forward(request, response);
    }

    //preexerciselevel Page
    @RequestMapping("/preexerciselevel")
    public void getPreExerciseLevelPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/preexerciselevel.jsp").forward(request, response);
    }

    //scheduleOverview Page
    @RequestMapping("/scheduleoverview")
    public void getTraingsScheduleOverview(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/scheduleOverview1.jsp").forward(request, response);
    }

    //profileSettings Page
    @RequestMapping("/profilesettings")
    public void getProfileSettingsPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/profileSettings.jsp").forward(request, response);
    }

    //registration Page
    @RequestMapping("/registration")
    public void getRegistrationPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp").forward(request, response);
    }

}
