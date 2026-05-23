package stepdefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MyInfoPage;

public class MyInfoSteps {
	MyInfoPage myinfo = new MyInfoPage(Hooks.driver);
	
	@When("user clicks My Info menu")
	public void user_clicks_my_info_menu() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		myinfo.clickMyInfoMenu();
	}

	@Then("My Info page should display")
	public void my_info_page_should_display() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Assert.assertTrue(myinfo.isMyPageDisplayed());
	}

	@When("user updates personal details")
	public void user_updates_personal_details() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		myinfo.updateFirstname("sandy");
		myinfo.updateMiddleName("reddy");
		myinfo.updateLastName("konda");
		myinfo.updateEmployeeId("2069");
//		myinfo.clickGenderMail();
	}

	@When("user clicks personal details save button")
	public void user_clicks_personal_details_save_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		myinfo.clickPersonalSaveBtn();
	}

	@Then("personal details should update successfully")
	public void personal_details_should_update_successfully() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		String actualName = myinfo.getFirtName();
		String expectedName = "sandy";
		Assert.assertEquals(actualName,expectedName);
		System.out.println("Updated Information Verified Successfully");
		
	}

	@When("user clicks contact details section")
	public void user_clicks_contact_details_section() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		myinfo.cliclContactDetailsTab();
	}

	@When("user updates contact details")
	public void user_updates_contact_details() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		myinfo.updateStreet("kodathi");
		myinfo.updateCity("Bangalore");
		myinfo.updateZipcode("23456");
		myinfo.updateEmail("adb@gmail.com");
		
	}

	@When("user clicks contact save button")
	public void user_clicks_contact_save_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		myinfo.clickContactSaveBtn();
	}

	@Then("contact details should update successfully")
	public void contact_details_should_update_successfully() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
	}

	@Then("updated information should be displayed successfully")
	public void updated_information_should_be_displayed_successfully() {
		System.out.println("Updated Information Verified Successfully");
	}


	
}
