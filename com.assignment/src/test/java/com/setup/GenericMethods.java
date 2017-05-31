package com.setup;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class GenericMethods {

	public static void navigate(WebDriver driver, String url) {

		driver.navigate().to(url);
	}
	
	public static void refresh(WebDriver driver)  {
		driver.navigate().refresh();
	}

	public static void click(WebDriver driver, String sLocator, String locatorType) {

		waitToClickMethod(driver, sLocator, locatorType);

		if (locatorType.equals("xpath")) {

			driver.findElement(By.xpath(sLocator)).click();

		} else {

			driver.findElement(By.cssSelector(sLocator)).click();

		}
	}
	
	public static void doubleClick(WebDriver driver, String sLocator, String locatorType) {

		
			waitToClickMethod(driver, sLocator, locatorType);

			Actions action = new Actions(driver);

			WebElement element = driver.findElement(By.xpath(sLocator));
			action.doubleClick(element).build().perform();

		
	}
	
	public static void selectFromDropdown(WebDriver driver, String sLocator, String locatorType,String sValue) {

	
			waitMethod(driver,sLocator,locatorType);

			Select oSelect = new Select(driver.findElement(By.xpath(sLocator)));
			oSelect.selectByValue(sValue);

		

	}
	
	public static Alert  getAlert(WebDriver driver) {

	 Alert alt = driver.switchTo().alert();
	 return alt;
		
	}
	
	public static String  getText(WebDriver driver,String sLocator, String locatorType) {

		waitMethod(driver, sLocator, locatorType);

		if (locatorType.equals("xpath")) {

			return driver.findElement(By.xpath(sLocator)).getText();

		} else {

			return driver.findElement(By.cssSelector(sLocator)).getText();

		}
			
		}


	public static void input(WebDriver driver, String sLocator, String locatorType, String inputValue) {

		waitMethod(driver, sLocator, locatorType);

		if (locatorType.equals("xpath")) {

			driver.findElement(By.xpath(sLocator)).sendKeys(inputValue);

		} else {

			driver.findElement(By.cssSelector(sLocator)).sendKeys(inputValue);

		}
	}

	
	public static void waitMethod(WebDriver driver, String sLocators, String locatorType) {

		WebDriverWait wait = new WebDriverWait(driver, 60);

		if (locatorType.equals("xpath")) {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sLocators)));

			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sLocators)));

		} else {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(sLocators)));

			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(sLocators)));

		}
	}
	
	public static void waitTillPageLoad(WebDriver driver) {

		try  {
		WebDriverWait wait = new WebDriverWait(driver, 120);

		   wait.until(ExpectedConditions.urlContains("Proposal-Form"));
		}
		catch(Exception e)  {
			System.out.println("The page keeps loading");
		}
	} 


	public static void scrollDown(WebDriver driver) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,250)", "");
	}

	public static void switchToWindow(WebDriver driver) throws InterruptedException  {
		
		String handle = driver.getWindowHandle();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		tabs.remove(handle);
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(0));
	}

	public static void waitFor(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public static void waitToClickMethod(WebDriver driver, String sLocators, String locatorType) {

		WebDriverWait wait = new WebDriverWait(driver, 60);

		if (locatorType.equals("xpath")) {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sLocators)));

			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sLocators)));

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sLocators)));
		} else {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(sLocators)));

			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(sLocators)));

			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(sLocators)));

		}

	}
	
	public static String isLinkBroken (URL url) throws Exception {

	    String response = "";

	    HttpURLConnection connection = (HttpURLConnection) url.openConnection ();

	    try  {

	      
	      connection.connect ();
	      response = connection.getResponseMessage ();
	      connection.disconnect ();
	      return response;
	    }

	    catch (Exception exp)  {

	      return exp.getMessage ();

	    }

}
}