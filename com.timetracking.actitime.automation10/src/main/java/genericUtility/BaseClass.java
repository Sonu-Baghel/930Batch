package genericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	FileUtility futy=new FileUtility();
@BeforeSuite
public void bsuitConfig() {
	System.out.println("database connection is established");
	
}

@BeforeClass
public void bClass() throws IOException {
	String url=futy.fetchDataFromPropertyFile("url");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url); 
}

@BeforeMethod
public void bMethod() throws IOException {
	String username=futy.fetchDataFromPropertyFile("username");
	String password=futy.fetchDataFromPropertyFile("password");
	
	
	
	
}



}
