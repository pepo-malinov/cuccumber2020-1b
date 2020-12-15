package uni.fmi.test.models;

import uni.fmi.service.RegisterService;

public class RegisterFormModel {

	private String name;
	private String message;
	private String email;
	private String pass1;
	private String pass2;

	public void open() {
		// TODO Auto-generated method stub

	}

	public void setName(String name) {
		this.name = name;

	}

	public String getMessage() {
		return message;
	}

	public void clickRegisterButton() {
		message = RegisterService.register(name, email, pass1, pass2);

	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}

	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}

}
