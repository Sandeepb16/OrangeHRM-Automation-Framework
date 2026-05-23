package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class LoginPage {
	
	WebDriver driver;
	WaitUtils wait;
	
	By username = By.name("username");
	By password = By.name("password");
	By loginBtn = By.xpath("//button[@type = 'submit']");
	By errorMsg = By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']");
	By dashBoardText = By.xpath("//span[text()='Dashboard']");
	By requiredMsg = By.xpath("(//span[text()='Required'])[1]");
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		wait = new WaitUtils(driver);
		
	}
	
	public void enterUsername(String uname) {
//		driver.findElement(username).sendKeys(uname);
		wait.waitForElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pass) {
//		driver.findElement(password).sendKeys(pass);
		wait.waitForElement(password).sendKeys(pass);
	}
	
	public void clickLoginBtn() {
//		driver.findElement(loginBtn).click();
		wait.waitForElement(loginBtn).click();
	}
	
	public String geterrorMessage() {
//		return driver.findElement(errorMsg).getText();
		return wait.waitForElement(errorMsg).getText();
	}
	
	public String getRequiredMsg() {
		
		return driver.findElement(requiredMsg).getText();
	}
	
	public Boolean isdashBoardDisplayed() {
//		return driver.findElement(dashBoardText).isDisplayed();
		return wait.waitForElement(dashBoardText).isDisplayed();
	}
	
}
