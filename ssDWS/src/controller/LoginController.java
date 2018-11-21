package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dao.LoginDAO;
import model.Login;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ObjectMapper mapper = new ObjectMapper();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("displayPage", "login");
		RequestDispatcher req = request.getRequestDispatcher("index.jsp");
		req.forward(request, response);
		return;
//		HttpSession session = request.getSession(false);
//		if (session != null) {
//		    session.invalidate();
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String jsonString = request.getParameter("loginData");
		Login login = mapper.readValue(jsonString, Login.class);
		LoginDAO ld = new LoginDAO();
		System.out.println(login);

		if (ld.isAthenticated(login)) {
			request.getSession().setAttribute("role", "admin");
			System.out.println("log in successful");
			PrintWriter out = response.getWriter();
			out.print("true");
		} else {
			PrintWriter out = response.getWriter();
			out.print("false");
		}
	}

}
