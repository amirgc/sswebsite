package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.FeedbackDAO;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/admin")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String role = (String) request.getSession().getAttribute("isLoggedIn");

		if (role == null) {
			request.setAttribute("displayPage", "login");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} else if (role.equals("admin")) {
			request.setAttribute("role", "admin");
			request.setAttribute("displayPage", "admin");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("displayPage", "login");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type = request.getParameter("type");
		String adminDisplay = ""; // jsp to display on main area of admin page

		//FeedbackDAO dao = new FeedbackDAO();

		if (type.equals("logout")) {
			HttpSession session = request.getSession(false);
			if (session != null) {
				session.invalidate();
			}
			request.setAttribute("displayPage", "login");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			return;
		} else if (type.equals("addNews")) {
			adminDisplay = "addNews";
		} else if (type.equals("viewFeedback")) {
			adminDisplay = "feedbacks";
			System.out.println(dao.getAllFeedbacks());
			request.getSession().setAttribute("feedbacks", dao.Select());
// 			System.out.println(FeedbackDAO.getAllFeedbacks());
// 			request.getSession().setAttribute("feedbacks", FeedbackDAO.getAllFeedbacks());
		} else {

		}

		request.getSession().setAttribute("adminDisplay", adminDisplay);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);

	}

}
