package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	
		public HomePage(WebDriver driver) {
			super(driver);
		}
		
		//Locators
		By linkCreateAccount = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");
		By linkSignIn = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
		//Action
		public void clickCreateAccount() {
			driver.findElement(linkCreateAccount).click();
		}
		
		public void clickSignIn() {
			driver.findElement(linkSignIn).click();
		}
}
