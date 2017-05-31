package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.setup.ConstantLocators;
import com.setup.GenericMethods;

public class LoginPage {

	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
   public void navigateToLoginPage(String url) {
		
		GenericMethods.navigate(driver, url);

	}
   
   public void enterLoginDetails(String userName, String password) {
		
		GenericMethods.input(driver, ConstantLocators.userName, ConstantLocators.Xpath, userName);
		GenericMethods.input(driver, ConstantLocators.password, ConstantLocators.Xpath, password);
        GenericMethods.click(driver, ConstantLocators.loginButton, ConstantLocators.Xpath);
	}
   
      public void clickOnLoginButton() {
		
	   GenericMethods.click(driver, ConstantLocators.loginButton, ConstantLocators.Xpath);
	 }
 
      public void verifyLogin()  {
          Assert.assertEquals(GenericMethods.getText(driver, ConstantLocators.loginErrorMessage, ConstantLocators.Xpath), "Incorrect User-ID password. You have");

      }
      
      public void closeApplication()  {
 		 
 		 driver.quit();
 	 
 	 }
   
   
}
