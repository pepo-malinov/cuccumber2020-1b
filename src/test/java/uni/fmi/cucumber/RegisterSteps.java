package uni.fmi.cucumber;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.test.models.RegisterFormModel;

public class RegisterSteps {
	
	final RegisterFormModel register = new RegisterFormModel();
	
	@Given("^Потребиля отваря формата за регистрация\\.$")
	public void openRegisterForm() throws Throwable {
		register.open();
	}

	@When("^Въвежда име \"([^\"]*)\"$")
	public void addName(String arg1) throws Throwable {
		register.setName(arg1);
	}

	@When("^Въвежда парола \"([^\"]*)\"$")
	public void addPass1(String arg1) throws Throwable {
		register.setPass1(arg1);
	}

	@When("^Въвежда втора парола \"([^\"]*)\"$")
	public void addPass2(String arg1) throws Throwable {
		register.setPass2(arg1);
	}

	@When("^Въвежда email \"([^\"]*)\"$")
	public void addEmail(String arg1) throws Throwable {
		register.setEmail(arg1);
	}

	@When("^Натиска върху бутона регистрирай$")
	public void clickRegisterButton() throws Throwable {
		register.clickRegisterButton();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void checkMessage(String arg1) throws Throwable {
		assertEquals(arg1, register.getMessage());
	}

}
