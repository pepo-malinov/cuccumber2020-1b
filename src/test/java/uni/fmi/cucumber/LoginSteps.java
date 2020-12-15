package uni.fmi.cucumber;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.test.models.LoginFormModel;

public class LoginSteps {
	final LoginFormModel login = new LoginFormModel();

	@Given("^Потребителя отваря формата за вход в системата$")
	public void потребителя_отваря_формата_за_вход_в_системата() throws Throwable {
		login.open();
	}

	@When("^Въвежда валидно потребителско име$")
	public void въвежда_валидно_потребителско_име() throws Throwable {
		login.setUserName("ValidUserName");
	}

	@When("^Въвежда валидна парола$")
	public void въвежда_валидна_парола() throws Throwable {
		login.setPassword("ValidPass");
	}

	@When("^Натиска бутона Влез$")
	public void натиска_бутона_Влез() throws Throwable {
		login.clickLoginButton();
	}

	@Then("^Вижда съобщение за успех$")
	public void вижда_съобщение_за_успех() throws Throwable {
		assertEquals("Успешно влязохте в системата!", login.getMessage());
	}

	@When("^Въвежда невалидно потребителско име$")
	public void въвежда_невалидно_потребителско_име() throws Throwable {
		login.setUserName("NotValidUserName");
	}

	@When("^Въвежда невалидна парола$")
	public void въвежда_невалидна_парола() throws Throwable {
		login.setPassword("NotValidPass");
	}

	@Then("^Вижда съобщение за невалидни потребителски данни$")
	public void вижда_съобщение_за_невалидни_потребителски_данни() throws Throwable {
		assertEquals("Невалидни потребителски данни!", login.getMessage());
	}

	@Then("^Вижда съобщение да въведе валидно потребителско име$")
	public void вижда_съобщение_да_въведе_валидно_потребителско_име() throws Throwable {
		assertEquals("Невалидно потребителско име!", login.getMessage());
	}

	@Then("^Вижда съобщение да въведе валидна парола$")
	public void вижда_съобщение_да_въведе_валидна_парола() throws Throwable {
		assertEquals("Невалидна парола!", login.getMessage());
	}

}
