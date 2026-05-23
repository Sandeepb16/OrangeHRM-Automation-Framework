package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class PIMPage {
	WebDriver driver;
	WaitUtils wait;
	
	public PIMPage(WebDriver driver) {
		this.driver = driver;
		wait = new WaitUtils(driver);
	}
	
	By pimMenu = By.xpath("//span[text()='PIM']");
//	By employeeName = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
	By employeeIDSSearch = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By employeeID = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By addEmployeeBtn = By.xpath("//a[text()='Add Employee']");
    By firstName = By.name("firstName");
    By middleName = By.name("middleName");
    By lastName = By.name("lastName");
    By saveBtn = By.xpath("//button[@type='submit']");
    By editSaveBtn = By.xpath("(//button[@type='submit'])[1]");
    By searchBtn = By.xpath("//button[@type='submit']");
    By editBtn = By.xpath("(//button[@type='button'])[6]");
    By deleteBtn = By.xpath("(//button[@type='button'])[7]");
    By confirmDeleteBtn = By.xpath("//button[normalize-space()='Yes, Delete']");
//    By photoBtn = By.xpath("//div[@class=\"orangehrm-edit-employee-image-wrapper\"]");
    By uploadPhoto = By.cssSelector("input[type='file']");

    public void clickPIMmenu() {
    	wait.waitForElement(pimMenu).click();
    }
    
    public void clickAddNewEmployeeBtn() {
    	wait.waitForElement(addEmployeeBtn).click();
    }
    
    public void enterFirstName(String fname) {
    	wait.waitForElement(firstName).sendKeys(fname);
    }
    
    public void enterMiddleName(String mname) {
        wait.waitForElement(middleName).sendKeys(mname);
    }

    public void enterLastName(String lname) {
        wait.waitForElement(lastName).sendKeys(lname);
    }
    
    public void enterEmployeeId(String empId) {
    	wait.waitForElement(employeeID).clear();
    	wait.waitForElement(employeeID).sendKeys(empId);
    }
    
    public void clickSaveBtn() {
    	wait.waitForElement(saveBtn).click();
    }
    
    public void searchNewEmployeeById(String empid) {
    	wait.waitForElement(employeeIDSSearch).sendKeys(empid);
    }
    
    public void clickSearchBtn() {
    	wait.waitForElement(searchBtn).click();
    }
    
    public void clickEditEmployee() {
    	wait.waitForElement(editBtn).click();
    }
    
    public void clickEditSaveBtn() {
    	wait.waitForElement(editSaveBtn).click();
    }
    
    
    public void uploadEmployeePicture(String imgPath) {
    	
//    	wait.waitForElement(uploadPhoto);
    	driver.findElement(uploadPhoto).sendKeys(imgPath);
    }
    
    public void clickDeleteBtn() {
    	wait.waitForElement(deleteBtn).click();
    }
    
    public void clickDeleteConfirmBtn() {
    	wait.waitForElement(confirmDeleteBtn).click();
    }
    
}
