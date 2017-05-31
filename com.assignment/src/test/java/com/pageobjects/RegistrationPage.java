package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.setup.ConstantLocators;
import com.setup.GenericMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegistrationPage {

	
	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToLoginPage(String url) {
	   
		GenericMethods.navigate(driver, url);
	}
	
	
    public  RegistrationPage verifySignup()  {
		   
		GenericMethods.click(driver, ConstantLocators.newUserRegister, ConstantLocators.Xpath);
		GenericMethods.click(driver, ConstantLocators.clickHere, ConstantLocators.Xpath);
		GenericMethods.input(driver, ConstantLocators.policyNumber, ConstantLocators.Xpath, "1000");
		GenericMethods.input(driver, ConstantLocators.dateField, ConstantLocators.Xpath, "12");
		GenericMethods.input(driver, ConstantLocators.monthField, ConstantLocators.Xpath, "02");
		GenericMethods.input(driver, ConstantLocators.yearField, ConstantLocators.Xpath, "2012");
		GenericMethods.click(driver, ConstantLocators.nextButton, ConstantLocators.Xpath);
		Assert.assertEquals(GenericMethods.getAlert(driver).getText(), "Enter the Correct Policy No");
		GenericMethods.getAlert(driver).dismiss();    
		return new RegistrationPage(driver);
		     
		     
    }
}
