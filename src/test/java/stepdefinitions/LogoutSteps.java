package stepdefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LogoutPage;

public class LogoutSteps {
	LogoutPage logout = new LogoutPage(Hooks.driver);
	
	@When("user clicks profile dropdown")
	public void user_clicks_profile_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		logout.clickProfileDropdown();
		
	}

	@When("user clicks logout option")
	public void user_clicks_logout_option() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		logout.clickLogoutBtn();
	}

	@Then("user should navigate to login page")
	public void user_should_navigate_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Assert.assertTrue(logout.isLoginPageHeaderDisplayed());
	}

	@When("user clicks browser back button")
	public void user_clicks_browser_back_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		logout.clickBrowserBackButton();
	}

	@Then("user should not access application pages")
	public void user_should_not_access_application_pages() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		String actualURL = logout.getCurrentURL();
		Assert.assertFalse(actualURL.contains("login"));
//		Assert.assertFalse(logout.isLoginPageHeaderDisplayed());
		System.out.println("Session Terminated Successfully");
	}



}
