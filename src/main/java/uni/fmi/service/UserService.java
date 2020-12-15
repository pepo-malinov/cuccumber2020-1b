package uni.fmi.service;

import java.util.ArrayList;
import java.util.List;

import uni.fmi.models.User;

public class UserService {

	private static List<User> users = new ArrayList<User>();

	public static List<User> getUsers() {
		if (users.isEmpty()) {
			users.add(new User("ValidUserName", "ValidPass", "test@test.com"));
		}
		return users;
	}

	public static String login(String username, String pass) {
		
		  if (username == null) { return "Невалидно потребителско име!"; }
		 
		
		  if (pass == null) { return "Невалидна парола!"; }
		 
		User user = getUsers().stream().filter(u -> u.getUsername().equals(username) && u.getPass().equals(pass))
				.findFirst().orElse(null);
		return user != null ? "Успешно влязохте в системата!" : "Невалидни потребителски данни!";
	}

}
