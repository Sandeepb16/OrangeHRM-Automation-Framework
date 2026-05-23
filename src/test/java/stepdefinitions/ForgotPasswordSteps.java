package stepdefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForgotPasswordPage;

public class ForgotPasswordSteps {
	
	ForgotPasswordPage forgot;

	@Given("user is on login page")
	public void user_is_on_login_page() {
	    
		forgot = new ForgotPasswordPage(Hooks.driver);
		
	}

	@When("user clicks forgot password link")
	public void user_clicks_forgot_password_link() {
	   
		forgot.clickForgotPassword();
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
	    
		forgot.enterUsername("Sandeep");
	}

	@When("user clicks reset button")
	public void user_clicks_reset_button() {
	   
		forgot.clickResetBtn();
	}

	@Then("reset success message should display")
	public void reset_success_message_should_display() {
	    
		Assert.assertTrue(forgot.isSuccessMsgDisplayed());
	}


}
