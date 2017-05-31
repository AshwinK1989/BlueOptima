package com.pagedefinitions;

import com.pageobjects.LoginPage;
import com.setup.WebSetup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LoginPageStepDefinition extends WebSetup {

	LoginPage lp;
	
	
	@And("^you enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enterLoginDetails(String userName, String password) throws Throwable {

		lp=new LoginPage(getDriver());
		lp.enterLoginDetails(userName, password);

	}
	
	@And("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
	   
		lp.clickOnLoginButton();
	}

	@Then("^Check whether Login Details are Correct$")
	public void check_whether_Login_Details_are_Correct() throws Throwable {
	   
		lp.verifyLogin();
	}
}
