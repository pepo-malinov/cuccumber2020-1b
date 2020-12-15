package uni.fmi.test.models;

import uni.fmi.service.UserService;

public class LoginFormModel {

	private String username;
	private String pass;
	private String message;

	public void open() {
		username = null;
		pass = null;
		message = null;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public void setPassword(String pass) {
		this.pass = pass;

	}

	public void clickLoginButton() {
		message = UserService.login(username, pass);

	}

	public String getMessage() {
		return message;
	}

}
