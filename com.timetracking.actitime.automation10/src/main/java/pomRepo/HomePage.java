package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="container_tasks")
	private WebElement clickTaskButton;
	
	@FindBy(id="logoutLink")
	private WebElement clickLogoutButton;

	public WebElement getClickTaskButton() {
		return clickTaskButton;
	}

	public WebElement getClickLogoutButton() {
		return clickLogoutButton;
	}
	
	public void homePage()
	{
		clickTaskButton.click();
		clickLogoutButton.click();
	}
	
	

}
