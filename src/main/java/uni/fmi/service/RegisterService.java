package uni.fmi.service;

import uni.fmi.models.User;

public class RegisterService {

	public static String register(String name, String email, String pass1, String pass2) {
		if (pass1 == null || pass1.length() < 3) {
			return "Въведете валидна парола";
		} else if (pass1.length() > 16) {
			return "Паролата трябва да е максимум 16 синвола";
		} else if (!pass1.equals(pass2)) {
			return "Въведете еднакви пароли";
		}

		if(name==null || name.length()<3) {
			return "Въведете име с минимум три букви!";
		}

		User user = new User(name, pass1, email);
		UserService.getUsers().add(user);

		return "Успешно се регистрирахте!";
	}

}
