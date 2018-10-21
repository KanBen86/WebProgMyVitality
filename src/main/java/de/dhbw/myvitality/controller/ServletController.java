package de.dhbw.myvitality.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.entities.Employee;
import de.dhbw.myvitality.services.CustomerService;
import de.dhbw.myvitality.services.EmployeeService;
import de.dhbw.myvitality.services.SupplementConfigurationService;
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
    private SupplementConfigurationService supplementConfigurationService;

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
        //Dev
        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //Suche Customer mit Query, ist keiner gefunden, suche im catch-Block nach Employee
        //Überprüfe username und password
        try{
            Customer customer = customerService.customerRepository.findCustomerByQuery(username).get();
            System.out.println(customer.toString());

            if (username.equals(customer.getUsername()) && password.equals(customer.getPassword())){
                response.sendRedirect("/customerhome");
            }else{
                //Sind username und password nicht korrekt, gebe Meldung aus.
                request.setAttribute("error", "Falscher Nutzername oder Passwort");
                request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
            }
        }catch (Exception ex){
            try {
                Employee employee = employeeService.employeeRepository.findEmployeeByQuery(username).get();
                System.out.println(employee.toString());

                //Ist der Employee nicht leer, überprüfe username und password.
                if (username.equals(employee.getUsername()) && password.equals(employee.getPassword())){
                    //Sind username und password korrekt, leite auf die Mitarbeiterseite weiter.
                    response.sendRedirect("/employeehome");
                }
                else{
                    //Sind username und password nicht korrekt, gebe Meldung aus.
                    request.setAttribute("error", "Falscher Nutzername oder Passwort");
                    request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
                }

            }catch (Exception e){
                //Benutzer ist nicht vorhanden in der Datenbank
                request.setAttribute("error", "Falscher Nutzername oder Passwort");
                request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
            }
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
        request.getRequestDispatcher("/WEB-INF/jsp/custHome.jsp").forward(request, response);
    }

    //Employee Home Page
    @RequestMapping("/employeehome")
    public void getEmployeeHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/emplHome.jsp").forward(request, response);
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
