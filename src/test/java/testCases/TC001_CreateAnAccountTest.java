package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.CreateAnAccountPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_CreateAnAccountTest {

	WebDriver driver = BaseClass.driver;
	CreateAnAccountPage createAnAccountPage;
	public static String email;
    public static String password = "Test@1234";
    
    @Given("user is on the createAccount page")
    public void navigateToCreateAccountPage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCreateAccount();
        createAnAccountPage = new CreateAnAccountPage(driver);
    }
    
    @When("user enters valid details")
    public void enterUserDetails() {
    	createAnAccountPage.enterFirstName("John");
    	createAnAccountPage.enterLastName("Doe");
        email = "johndoe" + System.currentTimeMillis() + "@test.com";
        createAnAccountPage.enterEmail(email);
        createAnAccountPage.enterPassword(password);
        createAnAccountPage.enterConfirmPassword(password);
    }
    
    @And("submits the registration form")
    public void submitForm() {
    	createAnAccountPage.clickCreateAccount();
    }
    
    @Then("user account should be created successfully")
    public void validateRegistration() {
    	Assert.assertTrue(driver.getTitle().contains("My Account"), "Account Creation failed or wrong page loaded");
    }
    
    
}
