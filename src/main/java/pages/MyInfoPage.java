package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WaitUtils;

public class MyInfoPage {
	
	WebDriver driver;
	WaitUtils wait;
	
	public MyInfoPage(WebDriver driver) {
		this.driver = driver;
		wait = new WaitUtils(driver);
	}
	
//	personal info
	By myInfoMenu = By.xpath("//span[text()='My Info']");
	By myInfoHeader = By.xpath("//h6[text()='Personal Details']");
	By firstName = By.xpath("//input[@name='firstName']");
	By middleName = By.xpath("//input[@name='middleName']");
	By lastName = By.xpath("//input[@name='lastName']");
	
	By employeeId = By.xpath("(//input[contains(@class,'oxd-input')])[5]");

	By personalSaveBtn = By.xpath("//h6[text()='Personal Details']/following::button[@type='submit'][1]");
//	By genderMale = By.xpath("(//div[@class=\"oxd-radio-wrapper\"])[1]");

//	contact details
	By contackDetailsTab = By.linkText("Contact Details");
//	By street1 = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");

	By street1 = By.xpath("//label[text()='Street 1']/ancestor::div[contains(@class,'oxd-input-group')]//input");
	By city = By.xpath("//label[text()='City']/ancestor::div[contains(@class,'oxd-input-group')]//input");
	By zipCode = By.xpath("//label[text()='Zip/Postal Code']/ancestor::div[contains(@class,'oxd-input-group')]//input");
	By email = By.xpath("//label[text()='Work Email']/ancestor::div[contains(@class,'oxd-input-group')]//input");
//	By contactSaveBtn = By.xpath("(//button[@type='submit'])[1]");
	By contactSaveBtn = By.xpath("//h6[text()='Contact Details']/following::button[@type='submit'][1]");
	
	public void clickMyInfoMenu() {
		wait.waitForElement(myInfoMenu).click();
	}
	
	public boolean isMyPageDisplayed() {
		return wait.waitForElement(myInfoHeader).isDisplayed();
	}
	
	public void updateFirstname(String fname) throws InterruptedException {

		Thread.sleep(2000);
	    WebElement element = wait.waitForElement(firstName);
	    element.click();
	    element.sendKeys(Keys.CONTROL + "a");
	    element.sendKeys(Keys.DELETE);
	    element.sendKeys(fname);

		
	}
	
    public void updateMiddleName(String mname) throws InterruptedException {

    	Thread.sleep(2000);
        WebElement element = wait.waitForElement(middleName);
	    element.click();
	    element.sendKeys(Keys.CONTROL + "a");
	    element.sendKeys(Keys.DELETE);
	    element.sendKeys(mname);

    }

    public void updateLastName(String lname) throws InterruptedException {

    	Thread.sleep(2000);
    	WebElement element = wait.waitForElement(lastName);
	    element.click();
	    element.sendKeys(Keys.CONTROL + "a");
	    element.sendKeys(Keys.DELETE);
	    element.sendKeys(lname);

    }
    
    public void updateEmployeeId(String empid) {
    	wait.waitForElement(employeeId).clear();
    	wait.waitForElement(employeeId).sendKeys(empid);
    }

    
    public void clickPersonalSaveBtn() {

    	 WebElement saveBtn = wait.waitForClickable(personalSaveBtn);
    	    JavascriptExecutor js = (JavascriptExecutor) driver;
    	    js.executeScript("arguments[0].scrollIntoView(true);", saveBtn);
    	    js.executeScript("arguments[0].click();", saveBtn);

    	    try {
    	        Thread.sleep(3000);
    	    } catch (InterruptedException e) {
    	        e.printStackTrace();
    	    }
    }
    
    public void cliclContactDetailsTab() {

    	WebElement tab = wait.waitForClickable(contackDetailsTab);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", tab);
        js.executeScript("arguments[0].click();", tab);

    }
    
    public void updateStreet(String street) {
    	wait.waitForElement(street1).clear();
    	wait.waitForElement(street1).sendKeys(street);
    }
    
    public void updateCity(String cty) {
    	 WebElement element = wait.waitForElement(city);

    	    element.click();

    	    // Clear field properly
    	    element.sendKeys(Keys.CONTROL + "a");
    	    element.sendKeys(Keys.BACK_SPACE);

    	    // Extra clear using JS
    	    JavascriptExecutor js = (JavascriptExecutor) driver;
    	    js.executeScript("arguments[0].value='';", element);

    	    // Type new value
    	    element.sendKeys(cty);

    	    // Trigger blur event
    	    element.sendKeys(Keys.TAB);

    	    System.out.println("City Entered: "
    	            + element.getAttribute("value"));
    	
    }
    
    public void updateZipcode(String zipc) {
    	wait.waitForElement(zipCode).clear();
    	wait.waitForElement(zipCode).sendKeys(zipc);
    }
    
    public void updateEmail(String mail) {
    	wait.waitForElement(email).clear();
    	wait.waitForElement(email).sendKeys(mail);
    }
    
    
    public void clickContactSaveBtn() {
    	WebElement saveBtn = wait.waitForClickable(contactSaveBtn);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", saveBtn);

        js.executeScript("arguments[0].click();", saveBtn);
    	  try {
    	        Thread.sleep(2000);
    	    } catch (InterruptedException e) {
    	        e.printStackTrace();
    	    }
    }
    
    public String getFirtName() {
    	return wait.waitForElement(firstName).getAttribute("value");
    }
    


}
