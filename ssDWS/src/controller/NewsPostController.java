package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;

//import com.google.gson.Gson;

import dao.NewsDAO;
import model.News;

/**
 * Servlet implementation class NewsPostController
 */
@WebServlet({ "/newspost" })
public class NewsPostController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	NewsDAO newsdao;
	ObjectMapper mapper = new ObjectMapper();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Ajax call successed");
		newsdao = new NewsDAO();
 		News news = mapper.readValue(request.getParameter("newsData"), News.class);
		
 		newsdao.addNews(news);
		PrintWriter out =response.getWriter();
		try{
			out.print(mapper.writeValueAsString(news));
		}catch (JsonGenerationException e) {
			e.printStackTrace();
		}
		

	}

}
