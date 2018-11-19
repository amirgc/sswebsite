package model;

public class Feedback {
	User user;
	String feedbackText;
	
	public Feedback(User user, String feedbackText) {
		this.user = user;
		this.feedbackText = feedbackText;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getFeedbackText() {
		return feedbackText;
	}

	public void setFeedbackText(String feedbackText) {
		this.feedbackText = feedbackText;
	}
}
