package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerDetailsPage {
	CustomerDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='abc']")
	private WebElement clickButton;

	public WebElement getClickButton() {
		return clickButton;
	}
	
	public void customerDetails()
	{
		clickButton.click();
	}

}
