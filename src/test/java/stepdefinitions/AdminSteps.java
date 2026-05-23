package stepdefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminPage;
import pages.LoginPage;

public class AdminSteps {
	
	LoginPage login;
	AdminPage admin;
	
	@Given("user logged into application")
	public void user_logged_into_application() {  
		admin = new AdminPage(Hooks.driver);
		login = new LoginPage(Hooks.driver);
		
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickLoginBtn();
		
	}

	@When("user clicks Admin menu")
	public void user_clicks_admin_menu() {
	    admin.clickAdminMenu();	
	}

	@Then("Admin page should display")
	public void admin_page_should_display() {
		Assert.assertTrue(admin.isAdminPageDisplayed());
	}

	@When("user searches username {string}")
	public void user_searches_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		admin.searchUser(string);
	}

	@When("user clicks search button")
	public void user_clicks_search_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		admin.clickSearch();
	}

	@Then("matching user records should display")
	public void matching_user_records_should_display() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("user displayed");
		
	}

	@When("user clicks add button")
	public void user_clicks_add_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		admin.clickAddBtn();
	}

	@When("user enters new user details")
	public void user_enters_new_user_details() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		admin.selectUserRole("ESS");
		admin.enterEmployeeName("sandeep");
		admin.selectStatus("Enabled");
		admin.enterUsername("sandy");
		admin.enterPassword("sun123");
		admin.enterConfirmPassword("sun123");
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		admin.clickSaveBtn();
	}

	@Then("user should be added successfully")
	public void user_should_be_added_successfully() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("user added succfully");
	}

	@When("user edits existing user")
	public void user_edits_existing_user() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		admin.clickEditBtn();
	}

	@Then("user details should update successfully")
	public void user_details_should_update_successfully() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("updated successfuly");
	}

	@When("user deletes existing user")
	public void user_deletes_existing_user() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		admin.clickDeleteBtn();
		admin.confirmDeletBtn();
	}

	@Then("user should be deleted successfully")
	public void user_should_be_deleted_successfully() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("delete successful");
	}


	
	
}
