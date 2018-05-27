package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PayPal_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.paypal.com/in/home");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("signup-button").click();
		boolean selected = driver.findElementById("radio-personal").isSelected();
		if (selected) {
			System.out.println("Radio button is selected");

		} else {
			driver.findElementById("radio-personal").click();
		}
		driver.findElementByLinkText("Next").click();
		WebElement countryDD = driver.findElementById("country");
		Select dd = new Select(countryDD);
		dd.selectByVisibleText("Australia");
		driver.findElementById("email").sendKeys("abc@gmail.com");
		driver.findElementById("password").sendKeys("Password@123");
		driver.findElementById("confirmPassword").sendKeys("Password@123");
		driver.findElementById("_eventId_personal").click();
		driver.close();
		
		




	}

}
