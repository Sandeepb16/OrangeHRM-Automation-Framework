package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class ForgotPasswordPage {
	public WebDriver driver;
	WaitUtils waitU;
	
	By forgotPasswordLink = By.xpath("//p[text()='Forgot your password? ']");
	By username = By.name("username");
	By resetPasswordBtn = By.xpath("//button[@type = 'submit']");
	By successMessage = By.tagName("h6");
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
		waitU = new WaitUtils(driver);
	}
	
	public void clickForgotPassword() {
//		driver.findElement(forgotPasswordLink).click();
		waitU.waitForElement(forgotPasswordLink).click();
	}
	
	public void enterUsername(String uname) {
//		driver.findElement(username).sendKeys(uname);
		waitU.waitForElement(username).sendKeys(uname);
	}
	
	public void clickResetBtn() {
		driver.findElement(resetPasswordBtn).click();
	}
	
	public boolean isSuccessMsgDisplayed() {
//		return driver.findElement(successMessage).isDisplayed();
		return waitU.waitForElement(successMessage).isDisplayed();
	}

	
}
