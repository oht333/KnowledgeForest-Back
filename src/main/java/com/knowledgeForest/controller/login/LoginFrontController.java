package com.knowledgeForest.controller.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginFrontController
 */
//@WebServlet("/LoginFrontController")
public class LoginFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginFrontController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doProcess(request, response);
	}
	
	protected void doProcess (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginFrontController 들어옴");
		
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println("test");
//		경로 분기처리
		switch (target) {
			
		case "/login/login.me" :
			request.getRequestDispatcher("/html/login/login.jsp").forward(request, response);
			break;
			
		case "/login/join.me" :
			System.out.println("회원가입");
			request.getRequestDispatcher("/html/login/join.jsp").forward(request, response);
			break;
			
		case "/login/passwordSelect.me" :
			System.out.println("비밀번호찾기");
			request.getRequestDispatcher("/html/login/passwordSelect.jsp").forward(request, response);
			break;
		
		case "/login/loginSendPage.me " :
			System.out.println("mainPage이동");
			request.getRequestDispatcher("/html/main/main.jsp").forward(request, response);
		}
		
	}

}
