package org.seltest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	
	public static WebDriver chromeBrowser() {
		
	WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	return driver;
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void implicitWait(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}
	
	public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);
		}
	
	public static void click(WebElement e) {
		e.click();
}
	
	public static String getAttribute(WebElement e) {
String attribute = e.getAttribute("value");
return attribute;	


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
