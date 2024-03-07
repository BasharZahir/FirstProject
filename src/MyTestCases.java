import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {

	WebDriver driver = new ChromeDriver();

	@BeforeTest

	public void mySetup() throws InterruptedException {
		String myURL = "https://www.saucedemo.com/";

		driver.get(myURL);

	}

	@Test
	public void Login() throws InterruptedException {

		WebElement UserName = driver.findElement(By.id("user-name"));
		WebElement PasswordInputField = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));

		UserName.sendKeys("standard_user");
		PasswordInputField.sendKeys("secret_sauce");
		LoginButton.click();

		
		List<WebElement> addtocartButtons = driver.findElements(By.className("btn"));

	
		for(int i=0; i < addtocartButtons.size(); i++) {
			
			addtocartButtons.get(i).click();
			
		}
	
	
	
	}

	@AfterTest
	public void AfterTesting() {

	}

}
