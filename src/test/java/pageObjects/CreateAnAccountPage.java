package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountPage {
	
	public class RegisterPage {
	    WebDriver driver;
	
	    public RegisterPage(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    @FindBy(xpath="//input[@id='firstname']") WebElement txtFirstname;
	    @FindBy(xpath="//input[@id='lastname']") WebElement txtLastname;
	    @FindBy(xpath="//input[@id='email_address']") WebElement txtEmail;
	    @FindBy(xpath="//input[@id='password']") WebElement txtPassword;
	    @FindBy(xpath="//input[@id='password-confirmation']") WebElement txtConfirmPassword;
	    @FindBy(xpath="//button[@title='Create an Account']//span[contains(text(),'Create an Account')]") WebElement btnCreateanAccount;
	    
	    public void enterFirstName(String fname) {
	       txtFirstname.sendKeys(fname);
	    }

	    public void enterLastName(String lname) {
	        txtLastname.sendKeys(lname);
	    }

	    public void enterEmail(String email) {
	        txtEmail.sendKeys(email);
	    }

	    public void enterPassword(String pwd) {
	        txtPassword.sendKeys(pwd);
	    }

	    public void enterConfirmPassword(String pwd) {
	    	txtConfirmPassword.sendKeys(pwd);
	    }

	    public void clickCreateAccount() {
	    	btnCreateanAccount.click();
	    }
	    
	}
}
