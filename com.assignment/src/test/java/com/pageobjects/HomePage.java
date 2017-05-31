package com.pageobjects;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.setup.GenericMethods;


public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToHomePage(String url) {
		
		GenericMethods.navigate(driver, url);

	}

	public HomePage verifyBrokenLinks() {

		try {

			Thread.sleep(3000);

			List<String> hrefs = new ArrayList<String>();
			List<WebElement> anchors = driver.findElements(By.tagName("a"));
			anchors.addAll(driver.findElements(By.tagName("img")));

			for (WebElement anchor : anchors) {
				try {
					
					if (anchor.getAttribute("href") != null)
						hrefs.add(anchor.getAttribute("href"));
				} catch (StaleElementReferenceException e) {
					System.out.println("---------Was Stale----------");
				}
			}

			for (String href : hrefs) {

			  Assert.assertEquals(GenericMethods.isLinkBroken(new URL(href)), "OK");
			  System.out.println("URL: " + href + " returned " + GenericMethods.isLinkBroken(new URL(href)));

				}

			}

		 catch (Exception e) {
			 System.out.println("Failed to check all the links " + e.getMessage());
		}
		
		return this;
	}
	
	
   
}
