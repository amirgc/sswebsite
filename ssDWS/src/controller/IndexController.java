package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NewsDAO;
import model.News;

/**
 * Servlet implementation class IndexController
 */
@WebServlet("")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("servlet hit");
		String displayPage = request.getParameter("displayPage");
		System.out.println(displayPage);
		request.setAttribute("role", "user");
		request.setAttribute("displayPage", displayPage);

		if (displayPage == null ) {
			display(request, response);
		}

		RequestDispatcher req = request.getRequestDispatcher("index.jsp");
		req.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void display(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("inside");
		NewsDAO newsdao= new NewsDAO();
		List<News> myNews = newsdao.getNews();		
		System.out.println(myNews);

		request.setAttribute("myNews", myNews);
	}

}
