package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	
	public static WebDriver driver;
	
	@Before
	public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
    }
	
	@After
	public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
