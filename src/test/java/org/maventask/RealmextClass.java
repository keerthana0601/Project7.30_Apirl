package org.maventask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class RealmextClass extends BaseClass {

	public static void main(String[] args) {
	
			
			WebDriver driver=chromeBrowser();
			
			urlLaunch("https://www.amazon.in/");
			
			implicitWait(20);

			SearchPage s=new SearchPage();
			
			sendKeys(s.getSearchTxt(),"realmext");
			
			click(s.getSearchBtn());
			
			
	
	}

}

