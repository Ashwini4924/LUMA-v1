package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.SignInPage;
import testBase.BaseClass;

public class TC002_SignInTest {
	
	WebDriver driver = BaseClass.driver;
	SignInPage signInPage;
	
	@Given("user is on the login page")
    public void navigateToLoginPage() {
		HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();
        signInPage = new SignInPage(driver);
    }
	
	@When("user logs in using the registered credentials")
    public void loginWithRegisteredCredentials() {
		signInPage.enterEmail(TC001_CreateAnAccountTest.email);
		signInPage.enterPassword(TC001_CreateAnAccountTest.password);
		signInPage.clickSignIn();
    }
	
	@Then("user should be logged in successfully")
    public void verifyLoginSuccess() {
        Assert.assertTrue(driver.getTitle().contains("Home Page"), "Login failed or wrong page loaded");
    }

}
