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
 *
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

}
