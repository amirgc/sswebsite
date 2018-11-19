package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Feedback;

public class FeedbackDAO {
	HashMap<String, Feedback> feedbacksDB = new HashMap<>();

	public void addFeedback(Feedback fb) {
		feedbacksDB.put(fb.getUser().getEmail(), fb);
	}
	
	public void addFeedback(String email, Feedback fb) {
		feedbacksDB.put(email, fb);
	}
	
	public Feedback getFeedbackForUser(String email) {
		return feedbacksDB.get(email);
	}
	
	public List<Feedback> getAllFeedbacks() {
		return new ArrayList<Feedback>(feedbacksDB.values());
	}

}
