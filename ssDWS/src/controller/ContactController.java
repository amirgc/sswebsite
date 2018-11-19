package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dao.FeedbackDAO;
import model.Feedback;

@WebServlet("/contact")
public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private FeedbackDAO dao;
	ObjectMapper mapper = new ObjectMapper();

	@Override
	public void init() throws ServletException {
		dao = new FeedbackDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get  called");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("called post");
		String jsonString = request.getParameter("feedback");
		System.out.println("feed back ko value");
		System.out.println(jsonString);
		Feedback feedback = mapper.readValue(jsonString, Feedback.class);
		dao.addFeedback(feedback);

		PrintWriter out = response.getWriter();
		try {
			out.print(mapper.writeValueAsString(feedback));
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		}
		
//		String fname = request.getParameter("fname");
//		String lname = request.getParameter("lname");
//		String country = request.getParameter("country");
//		String state = request.getParameter("state");
//		String zip = request.getParameter("zip");
//		String email = request.getParameter("email");
//		String phone = request.getParameter("phone");
//		String feedbackText = request.getParameter("feedback");
//		Feedback fb = new Feedback(fname, lname, country, state, zip, email, phone, feedbackText);
//		dao.addFeedback(email, fb);
	}
} 
