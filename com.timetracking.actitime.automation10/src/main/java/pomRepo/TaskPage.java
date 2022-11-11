package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement clickAddNewButton;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement clickNewCustomerButton;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerNameTextField;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptionTextArea;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement clickCreateCustomer;
	
	
	
	public WebElement getClickAddNewButton() {
		return clickAddNewButton;
	}



	public WebElement getClickNewCustomerButton() {
		return clickNewCustomerButton;
	}



	public WebElement getCustomerNameTextField() {
		return customerNameTextField;
	}



	public WebElement getDescriptionTextArea() {
		return descriptionTextArea;
	}

	public WebElement getClickCreateCustomer() {
		return clickCreateCustomer;
	}



	public void taskpage(String customerName, String description)
	{
	clickAddNewButton.click();
	clickNewCustomerButton.click();
	customerNameTextField.sendKeys(customerName);
	descriptionTextArea.sendKeys(description);
	clickCreateCustomer.click();
	
}

}
