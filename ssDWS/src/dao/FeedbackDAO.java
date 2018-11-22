package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dal.Dao;
import dal.DataAccess;
import dal.DataAccessFactory;
import model.Feedback;
import model.Login;

public class FeedbackDAO implements Dao {

	DataAccess da = DataAccessFactory.getDataAccess();
	private ArrayList<Feedback> feedbacks;
	HashMap<String, Feedback> feedbacksDB = new HashMap<>();
	{
		feedbacksDB.put("gcamir15@gmail.com", new Feedback("AmirGC", "GC", "gcamir15@gmail.com", "9841639655", "Nepal",
				"Bag", "400", "I want to buy your software"));
		feedbacksDB.put("ujjwol@gmail.com", new Feedback("AmirGC", "GC", "gcamir15@gmail.com", "9841639655", "Nepal",
				"Bag", "400", "I want to buy your software BillSoft"));

	}
	private String sql;

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
		return this.sql;
	}

	@Override
	public void unpackResultSet(ResultSet rs) throws SQLException {
		feedbacks = new ArrayList<Feedback>();
		while (rs.next()) {
			feedbacks.add(new Feedback(rs.getString("fname"), rs.getString("lname"), rs.getString("email"),
					rs.getString("phone"), rs.getString("country"), rs.getString("state"), rs.getString("zip"),
					rs.getString("feedbackText")));
		}

	}

	@Override
	public boolean InsertUpdate(Object o) {
		Feedback fed = (Feedback) o;
		this.sql = "Insert into Feedback(fname,lname,email,phone,country,state,zip,feedbackText)" + " values('"
				+ fed.getFname() + "','" + fed.getLname() + "','" + fed.getEmail() + "','" + fed.getPhone() + "'," + "'"
				+ fed.getCountry() + "','" + fed.getState() + "','" + fed.getZip() + "','" + fed.getFeedbackText() + "')";
		try {
			da.write(this);
			return true;
		} catch (SQLException e) {

		}
		return false;
	}

	@Override
	public List<Feedback> Select() {
		this.sql = "Select * from Feedback";
		try {
			da.read(this);
		} catch (SQLException e) {

		}
		return feedbacks;
	}

	@Override
	public Object SelectFirstOrDefault() {
		// TODO Auto-generated method stub
		return null;
	}

}
