package model;

public class Feedback {
	private String fname;
	private String lname;
	private String email;
	private String phone;
	private String country;
	private String state;
	private String zip;
	private String feedbackText;
	
	public Feedback(){
		
	}

	public Feedback(String fname, String lname, String email, String phone, 
			String country, String state, String zip, String feedbackText) {
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.country = country;
		this.state = state;
		this.zip = zip;
		this.feedbackText = feedbackText;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getZip() {
		return zip;
	}



	public void setZip(String zip) {
		if(zip.equals("")) 
			this.zip = "0";
		else 
			this.zip = zip;
	}



	public String getFeedbackText() {
		return feedbackText;
	}



	public void setFeedbackText(String feedbackText) {
		this.feedbackText = feedbackText;
	}

	@Override
	public String toString() {
		return "Feedback [fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone=" + phone + ", country="
				+ country + ", state=" + state + ", zip=" + zip + ", feedbackText=" + feedbackText + "]";
	}

	
	
}
