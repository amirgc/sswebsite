package model;

public class News {
	String title;
	String description;
	
	
	public News(String title, String description) {
 		this.title = title;
		this.description = description;
	}
	

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title+" - "+description;
	}
	
}
