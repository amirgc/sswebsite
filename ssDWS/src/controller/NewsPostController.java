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

import com.fasterxml.jackson.databind.ObjectMapper;

//import com.google.gson.Gson;

import dao.NewsDAO;
import model.News;

/**
 * Servlet implementation class NewsPostController
 */
@WebServlet({ "/NewsPostController", "/newspost" })
public class NewsPostController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	NewsDAO newsdao;
	News news;
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		newsdao = new NewsDAO();
		if(newsdao!=null) {
				System.out.println("GET NEWS :- "+newsdao.getNews());
		}
 
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
 		PrintWriter pp= response.getWriter();
		pp.print(objectMapper.writeValueAsString(newsdao.getNews()));
  		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		MainParser mp= mapper.readValue(inputJson, this.class);

 		String title = request.getParameter("newsTitle");
		String description = request.getParameter("newsDescription");
		
		
	
		

	}

}
