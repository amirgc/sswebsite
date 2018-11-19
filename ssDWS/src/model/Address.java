package model;

public class Address {
	private String country;
	private String state;
	private String zip;
	
	public Address(String country, String state) {
		this(country, state, "0");
	}
	
	public Address(String country, String state, Object zip) {
		this.country = country;
		this.state = state;
		if(zip == null) this.zip = "0";
		else this.zip = (String)zip;
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
		this.zip = zip;
	}
	
	
}
