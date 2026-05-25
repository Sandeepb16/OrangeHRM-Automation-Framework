package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class AdminPage {
	public WebDriver driver;
	WaitUtils wait ; 
	//Admin Menu WebElements
	By adminMenu = By.xpath("//span[text()='Admin']");
	By usernameSearch = By.xpath("(//input[contains(@class,'oxd-input ')])[2]");
	By searchBtn = By.xpath("//button[@type='submit']");
	
	//Add User WebElements
	By addBtn = By.xpath("//div[@class='orangehrm-header-container']//button[@type='button']");
	By userRoleDropdown = By.xpath("(//div[contains(@class,'oxd-select-text')])[1]");
	By abminRole = By.xpath("(//div[contains(@class,'oxd-select-text')])[1]//div[text()='Admin']");
	By userStatusDropdown = By.xpath("(//div[contains(@class,'oxd-select-text')])[4]");
	By enabledStatus = By.xpath("//div[contains(@class,'oxd-select-text')][1]//div[text()='Enabled']");
	By essRole = By.xpath("//div[text()='ESS']");
	By employeeName = By.xpath("//input[@placeholder=\"Type for hints...\"]");
	By newUsername = By.xpath("(//input[contains(@class,'oxd-input')])[2]");
	By password = By.xpath("(//input[@type='password'])[1]");
	By confirmPassword = By.xpath("(//input[@type='password'])[2]");
	By saveBtn = By.xpath("//button[@type=\"submit\"]");
	//edit
	By editBtn = By.xpath("(//button[contains(@class,'oxd-icon-button')])[4]");
	//Delete
	By deleteBtn = By.xpath("(//button[contains(@class,'oxd-icon-button')])[14]");
	By deleteConfirm = By.xpath("//button[normalize-space()='Yes, Delete']");
	//adminpage chcek
	 By adminHeader = By.xpath("//h6[text()='Admin']");
	
	public AdminPage(WebDriver driver) {
		
		this.driver = driver;
		wait = new WaitUtils(driver);
	}
	
	public void clickAdminMenu() {
		wait.waitForElement(adminMenu).click();
	}
	
	public boolean isAdminPageDisplayed() {
		
		return wait.waitForElement(adminHeader).isDisplayed();
	}
	
	public void searchUser(String user) throws InterruptedException {
		Thread.sleep(2000);
		wait.waitForElement(usernameSearch).sendKeys(user);
	}
	
	public void clickSearch() {
		driver.findElement(searchBtn).click();
//		wait.waitForElement(searchBtn).click();
	}
	
	public void clickAddBtn() {
		wait.waitForElement(addBtn).click();
	}
	
	public void selectUserRole(String role) {
		
		wait.waitForElement(userRoleDropdown).click();
		 driver.findElement(By.xpath("//span[text()='"+ role +"']")).click();
	}	
	
	public void selectStatus(String Status) {
		
		wait.waitForElement(userStatusDropdown).click();
		driver.findElement(By.xpath("//span[text()='"+ Status +"']")).click();
	}
	
	public void enterEmployeeName(String empName) {
		
		wait.waitForElement(employeeName).sendKeys(empName);
	}
	
	public void enterUsername(String uname) {
		wait.waitForElement(newUsername).sendKeys(uname);
	}	
	
	public void enterPassword(String pass) {
		wait.waitForElement(password).sendKeys(pass);
	}
	
	public void enterConfirmPassword(String confpass) {
		wait.waitForElement(confirmPassword).sendKeys(confpass);
	}
	
	public void clickSaveBtn() {
		wait.waitForElement(saveBtn).click();
	}
	
	public void clickEditBtn() {
		wait.waitForElement(editBtn).click();
	}
	
	public void clickDeleteBtn() {
		wait.waitForElement(deleteBtn).click();
	}
	
	public void confirmDeletBtn() {
		wait.waitForElement(deleteConfirm).click();
	}
	
}
