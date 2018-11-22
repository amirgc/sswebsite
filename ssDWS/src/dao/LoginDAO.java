package dao;


import java.util.HashMap;

import model.Login;

public class LoginDAO {
	HashMap<String, Login> Users = new HashMap<>();

	{
		Users.put("gcamir15@gmail.com", new Login("gcamir15@gmail.com", "test123"));
		Users.put("ujjwol@gmail.com", new Login("ujjwol@gmail.com", "test123"));
		Users.put("j", new Login("j", "b"));
	}

	public void addUser(Login fb) {
		Users.put(fb.getUserName(), fb);
	}

	public boolean isAthenticated(Login log) {
		if (Users.get(log.getUserName()).getPassword().equals(log.getPassword()))
			return true;
		else
			return false;
	}

}
