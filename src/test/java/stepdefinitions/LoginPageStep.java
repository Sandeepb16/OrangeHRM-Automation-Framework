package stepdefinitions;

import org.testng.Assert;

//import base.ConfigLoader;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStep {
	
	LoginPage login ;
	
	@Given("user launches browser")
	public void user_launches_browser() {
	    
		login = new LoginPage(Hooks.driver);
		System.out.println("browser launched");
	    
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	   
		login.enterUsername("Admin");
		login.enterPassword("admin123");
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	    
		login.clickLoginBtn();
	}

	@Then("user should navigate to dashboard")
	public void user_should_navigate_to_dashboard() {
	   
		Assert.assertTrue(login.isdashBoardDisplayed());
		
	}

	@When("user enters invalid username and valid password")
	public void user_enters_invalid_username_and_valid_password() {
	   
		login.enterUsername("abcd");
		login.enterPassword("admin123");
	
	}

	@Then("error message should be displayed")
	public void error_message_should_be_displayed() {
	   
		Assert.assertTrue(login.geterrorMessage().contains("Invalid"));
	}

	@When("user enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() {
	    
		login.enterUsername("Admin");
		login.enterPassword("adbxvxf");
	
	}
	@Then("error message required should be displayed")
	public void error_message_required_should_be_displayed() {
	    
		Assert.assertTrue(login.getRequiredMsg().contains("Required"));
	}


	
}
