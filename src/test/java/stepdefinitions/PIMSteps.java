package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PIMPage;

public class PIMSteps {
	
	PIMPage pim = new PIMPage(Hooks.driver);

	
	@When("user clicks PIM menu")
	public void user_clicks_pim_menu() {
		pim.clickPIMmenu();
	}

	@When("user clicks add employee button")
	public void user_clicks_add_employee_button() {
		pim.clickAddNewEmployeeBtn();
	}

	@When("user enters employee details")
	public void user_enters_employee_details() {
		pim.enterFirstName("Srilu");
		pim.enterMiddleName("reddy");
		pim.enterLastName("konda");
		pim.enterEmployeeId("3456");
	}

	@When("user clicks save employee button")
	public void user_clicks_save_employee_button() {
		pim.clickSaveBtn();
	}

	@Then("employee should be added successfully")
	public void employee_should_be_added_successfully() {
		System.out.println("Employee added successful");
	}

	@When("user searches employee by ID {string}")
	public void user_searches_employee_by_id(String string) {
		pim.searchNewEmployeeById(string);
	}

	@When("user clicks employee search button")
	public void user_clicks_employee_search_button() {
	    pim.clickSearchBtn();		
	}

	@Then("matching employee record should display")
	public void matching_employee_record_should_display() {
		System.out.println("Employee Records displayed");
	}

	@When("user edits employee details")
	public void user_edits_employee_details() {
	    pim.clickEditEmployee();
	    pim.enterMiddleName("sunny");
	}

	@Then("employee details should update successfully")
	public void employee_details_should_update_successfully() {
	    pim.clickEditSaveBtn();
	    System.out.println("Updated successfuly");
	}

	@When("user uploads employee profile picture")
	public void user_uploads_employee_profile_picture() {
//		pim.clickPhothBtn();
		
	    pim.uploadEmployeePicture("C:\\Users\\4sand\\Downloads\\iimm.jpg");
	}

	@Then("profile picture should upload successfully")
	public void profile_picture_should_upload_successfully() {
	   System.out.println("Upload success");
	}

	@When("user deletes employee record")
	public void user_deletes_employee_record() {
	    pim.clickDeleteBtn();
	    pim.clickDeleteConfirmBtn();
	}

	@Then("employee record should be deleted successfully")
	public void employee_record_should_be_deleted_successfully() {
	    System.out.println("deleted success");
	}


	
	
}
