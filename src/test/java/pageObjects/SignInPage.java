package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
	
	WebDriver driver;
	WebDriverWait wait;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    //Locators
    By txtEmailAddress = By.xpath("//input[@id='email']");
    By txtPassword = By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']");
    By btnSignIn = By.xpath("//fieldset[@class='fieldset login']//button[@id='send2']");
    
    //Action
    public void enterEmail(String emailValue) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtEmailAddress)).sendKeys(emailValue);
    }

    public void enterPassword(String pwdValue) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtPassword)).sendKeys(pwdValue);
    }

    public void clickSignIn() {
        wait.until(ExpectedConditions.elementToBeClickable(btnSignIn)).click();
    }
    

}
