package org.maventask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BaseClass {

			
		@FindBy(id="twotabsearchtextbox")
		private WebElement SearchTxt;
		
		@FindBy(id="nav-search-submit-button")
		private WebElement SearchBtn;

		public WebElement getSearchTxt() {
			return SearchTxt;
		}

		public WebElement getSearchBtn() {
			return SearchBtn;
		}
		
	
		
//		@FindBy(className="a-size-medium a-color-base a-text-normal")
//		private WebElement 
//		
		
		
	
		
	}

	
	
	
	
}
