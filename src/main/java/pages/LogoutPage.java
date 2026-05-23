package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class LogoutPage {
	
	WebDriver driver;
	WaitUtils wait;
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		wait= new WaitUtils(driver);
	}
	
	By profileDropdown = By.xpath("//span[@class=\"oxd-userdropdown-tab\"]");
	By logoutBtn = By.xpath("//a[text()='Logout']");
	By loginpageHeader = By.xpath("//h5[text()='Login']");
	
	public void clickProfileDropdown() {
		wait.waitForClickable(profileDropdown).click();
	}
	
	public void clickLogoutBtn() {
		wait.waitForClickable(logoutBtn).click();
	}
	
	public boolean isLoginPageHeaderDisplayed() {
		return wait.waitForElement(loginpageHeader).isDisplayed();
	}
	
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	public void clickBrowserBackButton() {
		driver.navigate().back();
	}
	

}
