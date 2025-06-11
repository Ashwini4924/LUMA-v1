package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAnAccountPage {

	    WebDriver driver;
	    WebDriverWait wait;
	
	    public CreateAnAccountPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }
	    
	    //Locators
	    By txtFirstname = By.xpath("//input[@id='firstname']");
	    By txtLastname = By.xpath("//input[@id='lastname']");
	    By txtEmail = By.xpath("//input[@id='email_address']");
	    By txtPassword = By.xpath("//input[@id='password']");
	    By txtConfirmPassword = By.xpath("//input[@id='password-confirmation']");
	    By btnCreateanAccount = By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]");
	    
	    //Actions
	    public void enterFirstName(String fname) {
	       wait.until(ExpectedConditions.visibilityOfElementLocated(txtFirstname)).sendKeys(fname);
	    }

	    public void enterLastName(String lname) {
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(txtLastname)).sendKeys(lname);
	    }

	    public void enterEmail(String email) {
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(txtEmail)).sendKeys(email);
	    }

	    public void enterPassword(String pwd) {
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(txtPassword)).sendKeys(pwd);
	    }

	    public void enterConfirmPassword(String pwd) {
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(txtConfirmPassword)).sendKeys(pwd);
	    }

	    public void clickCreateAccount() {
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(btnCreateanAccount)).click();
	    }
	    
}
