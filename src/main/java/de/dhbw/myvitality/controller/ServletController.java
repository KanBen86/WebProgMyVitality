package de.dhbw.myvitality.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ServletController: Mappt die Http Anfragen auf eine JSP
 * @author tamino.fischer
 */
@Controller
public class ServletController {

	//Index Page
	@RequestMapping("/")
	public void getIndexPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
	}

	//Login Page
	@RequestMapping("/login")
	public void getLoginPage(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
	}

	//Warehouse Page
	@RequestMapping("/warehouse")
	public void getWarehousePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/warehouse.jsp").forward(request, response);
	}

	// AddArticle Page
	@RequestMapping("/warehouse/addArticle")
	public void getAddArticlePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("/WEB-INF/jsp/addArticle.jsp").forward(request, response);
	}

	// ShowStock Page
	@RequestMapping("/warehouse/showStock")
	public void getShowStockPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
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
        request.getRequestDispatcher("/WEB-INF/jsp/mySupplements.jsp").forward(request, response);
    }

	//Zum ausprobieren
	@RequestMapping("/test")
	public void getTestPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/templateTest.jsp").forward(request, response);
	}

	//traingsSchedule Page
	@RequestMapping("/traingsschedule")
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
