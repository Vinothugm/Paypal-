package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class PaypalLandingPage extends ProjectMethods {
	public PaypalLandingPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="signup-button")
	private WebElement elesignUp;
	//@Given("enter the userName as (.*)")
	public PaypalType clickSignUp() {
		click(elesignUp);
		return new PaypalType();
	}
	
	
	
}
