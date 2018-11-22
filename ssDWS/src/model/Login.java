package model;

public class Login {

	String userName;
	String password;

	public Login()
	{
		
	}
	
	public Login(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public String getUserName()
	{
		return this.userName;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public void  setPassword(String password)
	{
		this.password = password;
	}
	
	@Override
	public String toString() {
		return this.getUserName() +" "+ this.getPassword();
	}
}
