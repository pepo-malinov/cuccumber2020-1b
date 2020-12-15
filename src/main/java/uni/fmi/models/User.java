package uni.fmi.models;

import java.util.Set;

/**
 * 
 */
public class User {

	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}

	/**
	 * Default constructor
	 */
	public User() {
	}

	/**
	 * 
	 */
	private String username;

	/**
	 * 
	 */
	private String password;

	/**
	 * 
	 */
	private String email;

	/**
	 * 
	 */
	private String firstName;

	/**
	 * 
	 */
	private String lastName;

	/**
	 * 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 */
	public Set<Order> orders;

	/**
	 * @return
	 */
	public String getUsername() {

		return username;
	}

	/**
	 * @param username
	 * @return
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPass() {
		return password;
	}

}