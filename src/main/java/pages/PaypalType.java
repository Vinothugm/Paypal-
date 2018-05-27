package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class PaypalType extends ProjectMethods {
	public PaypalType() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="radio-personal")
	private WebElement eleradioselection;
	
	public PaypalType isSelectedRadio()
	{
	boolean verifySelected = verifySelected(eleradioselection);
	if (!verifySelected) {
		WebElement radioclick = locateElement("id", "radio-personal");
		click(radioclick);
	}	
	return this;
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement eleNext;

	public accountSignup clickNextButton()
	{
		click(eleNext);
		return new accountSignup();
	}
}