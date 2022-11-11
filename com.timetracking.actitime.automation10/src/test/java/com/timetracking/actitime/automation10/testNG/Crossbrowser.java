package com.timetracking.actitime.automation10.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowser {
	@Parameters("browser")
	@Test
	public void demo(String browser) {
		if(browser.equals("chrome")) {
	    WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		}
		
		if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FireFoxDriver();
			driver.get("https://www.facebook.com/");
		}
		
	}

}
