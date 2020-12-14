package uni.fmi.cucumber;

import static org.junit.Assert.fail;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	@Given("^Потребителя отваря формата за вход в системата$")
	public void потребителя_отваря_формата_за_вход_в_системата() throws Throwable {

	}

	@When("^Въвежда валидно потребителско име$")
	public void въвежда_валидно_потребителско_име() throws Throwable {

	}

	@When("^Въвежда валидна парола$")
	public void въвежда_валидна_парола() throws Throwable {

	}

	@When("^Натиска бутона Влез$")
	public void натиска_бутона_Влез() throws Throwable {

	}

	@Then("^Вижда съобщение за успех$")
	public void вижда_съобщение_за_успех() throws Throwable {

	}

	@When("^Въвежда невалидно потребителско име$")
	public void въвежда_невалидно_потребителско_име() throws Throwable {
		fail();
	}

	@When("^Въвежда невалидна парола$")
	public void въвежда_невалидна_парола() throws Throwable {
;
	}

	@Then("^Вижда съобщение за невалидни потребителски данни$")
	public void вижда_съобщение_за_невалидни_потребителски_данни() throws Throwable {

	}

	@Then("^Вижда съобщение да въведе валидно потребителско име$")
	public void вижда_съобщение_да_въведе_валидно_потребителско_име() throws Throwable {
		fail();
	}

	@Then("^Вижда съобщение да въведе валидна парола$")
	public void вижда_съобщение_да_въведе_валидна_парола() throws Throwable {
		throw new RuntimeException("системата спря");
	}

}
