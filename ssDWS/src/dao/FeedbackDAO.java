package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dal.Dao;
import model.Feedback;

public class FeedbackDAO implements Dao{
	HashMap<String, Feedback> feedbacksDB = new HashMap<>();

	public void addFeedback(Feedback fb) {
		feedbacksDB.put(fb.getEmail(), fb);
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

	@Override
	public String getSql() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void unpackResultSet(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean InsertUpdate(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<?> Select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object SelectFirstOrDefault() {
		// TODO Auto-generated method stub
		return null;
	}

}
