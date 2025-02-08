package com.knowledgeForest.controller.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.knowledgeForest.Result;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String target = request.getRequestURI().substring(request.getContextPath().length());

		Result result = null;
//		System.out.println(target); // 이동되는 경로 확인
//      경로 분기처리
		switch (target) {

		case "/login/login.me":
			request.getRequestDispatcher("/html/login/login.jsp").forward(request, response);
			break;

		case "/login/loginOk.me":
			System.out.println("loginFrontController test");
			result = new LoginOkController().execute(request, response);
			break;

		// 로그아웃 처리 추가
		case "/login/logout.me":
			System.out.println("로그아웃 처리 시작");
			HttpSession session = request.getSession(false); // 현재 세션 가져오기
			if (session != null) {
				session.invalidate(); // 세션 무효화
				System.out.println("세션 종료 완료");
			}
			response.sendRedirect(request.getContextPath() + "/knowledgeForest.main"); // 메인 페이지로 이동
			break;

		case "/login/join.me":
			request.getRequestDispatcher("/html/login/join.jsp").forward(request, response);
			break;
			
		case "/login/checkIdOk.me":
			System.out.println("아이디 중복검사");
			result = new CheckIdOkController().execute(request, response);
			break;
			
		case "/login/checkNickOk.me":
			System.out.println("닉네임 중복검사");
			result = new CheckNickOkController().execute(request, response);
			break;	
			
		case "/login/sendSMS.me" :
			 System.out.println("핸드폰 인증 요청");
			 result = new JoinSMSController().execute(request,response);
			break;
			
		case "/login/verifyCode.me":
			System.out.println("인증번호 확인 요청");
			result = new VerifyCodeController().execute(request, response);
			break;	
			
		case "/login/joinOk.me":
			System.out.println("회원가입완료");
			result = new JoinOkController().execute(request, response); // 404 에러 공존
			break;

//		비밀번호 찾기
		case "/login/passwordSelect.me":
			request.getRequestDispatcher("/html/login/passwordSelect.jsp").forward(request, response);
			break;
			
//		아이디와 휴대폰 번호로 유저 조회
		case "/login/checkUserOk.me":
			result = new CheckUserOkController().execute(request, response);
			break;

//		비밀번호 찾기 후 비밀번호 수정페이지로 이동
		case "/login/passwrdUpdate.me":
			request.getRequestDispatcher("/html/login/passwordSelect-detail.jsp").forward(request, response);
			break;
			
//		비밀번호 찾기 후 비밀번호 수정 완료
		case "/login/passwordUpdateOk.me":
			result = new PasswrdUpdateOkController().execute(request, response);
			break;
			
		}

		if (result != null) {
			if (result.isRedirect()) {
				response.sendRedirect(result.getPath());
			} else {
				request.getRequestDispatcher(result.getPath()).forward(request, response);

			}
		}
	}
}