package pages;


import org.junit.Test;
import org.openqa.selenium.WebElement;
import wdMethods.SeMethods2;

public class PayPal_SeMethods extends SeMethods2 {

	@Test
	public void main() {
		// TODO Auto-generated method stub
		startResult();
		startTestModule("TC006", "Paypal using SE Methods");	
		test = startTestCase("PayPal Signin");
		test.assignCategory("Smoke");
		test.assignAuthor("Vinoth");
		
		startApp("chrome", "https://www.paypal.com/in/home");
		WebElement signUp = locateElement("id", "signup-button");
		signUp.click();
			
		WebElement radioButton = locateElement("id", "radio-personal");
		boolean verifySelected = verifySelected(radioButton);
		if (!verifySelected) {
			WebElement radioclick = locateElement("id", "radio-personal");
			click(radioclick);
		}
		WebElement NextB = locateElement("link", "Next");
		NextB.click();
		WebElement countryDD = locateElement("id", "country");
		selectDropDownUsingText(countryDD, "Australia");
		
		WebElement email = locateElement("id", "email");
		type(email, "abc@gmail.com");
		
		WebElement pass = locateElement("id", "password");
		type(pass, "Password@123");
		
		WebElement cPass = locateElement("id", "confirmPassword");
		type(cPass, "Password@123");

		WebElement continueB = locateElement("id", "_eventId_personal");
		continueB.click();
		
		endResult();




	}

}
