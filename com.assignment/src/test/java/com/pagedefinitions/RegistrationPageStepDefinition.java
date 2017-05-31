package com.pagedefinitions;

import org.openqa.selenium.WebDriver;

import com.pageobjects.RegistrationPage;
import com.setup.WebSetup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegistrationPageStepDefinition extends WebSetup {
     
	RegistrationPage rp;
	
	
	@Given("^You are on Login \"([^\"]*)\" of hdfclife$")
	public void you_are_on_Login_of_hdfclife(String url)  {
	    rp= new RegistrationPage(getDriver());
		rp.navigateToLoginPage(url);
	}

	@Then("^Go to registration page$")
	public void go_to_registration_page() {
	   rp.verifySignup();
	}
	
	
}
