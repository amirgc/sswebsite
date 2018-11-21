package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NewsDAO;
import model.News;

/**
 * Servlet implementation class NewsController
 */
@WebServlet({"/NewsController"})
public class NewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	NewsDAO newsdao;
	News news;
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		news = new News("Gapsco PremiumOne BI Claim Module Deployment", "After successful deployment for Reinsurance and Renewal module of Insurance Software Gapsco deploy Claim Module at Himalayan General Insurance.");   // default data for test
		newsdao = new NewsDAO();
		newsdao.addNews(news);
		news = new News("Deployment Gapsco PremiumOne BI Claim Module ", "After successful deployment for Reinsurance and Renewal module of Insurance Software Gapsco deploy Claim Module at Himalayan General Insurance.");   // default data for test
		newsdao.addNews(news);
		
		List<News> myNews = newsdao.getNews();
		request.setAttribute("myNews", myNews);
 		request.getRequestDispatcher("index.jsp").forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}