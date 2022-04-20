package org.seltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;

public class AmazonClass extends BaseClass {

	public static void main(String[] args) {
		
		WebDriver driver=chromeBrowser();
		
		urlLaunch("https://www.amazon.in/");
		
		implicitWait(20);
		
		//WebElement SearchElement = driver.findElement(By.id("twotabsearchtextbox"));		
//		sendkeys(SearchElement,"realmeXt");
//		
//		WebElement Submit = driver.findElement(By.id("nav-search-submit-button"));
//		click(Submit);
		
	}

	
	
	
	
}
