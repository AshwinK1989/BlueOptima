package com.pagedefinitions;

import org.openqa.selenium.WebDriver;

import com.pageobjects.HomePage;
import com.pageobjects.InsurancePlanPage;
import com.setup.GenericMethods;
import com.setup.WebSetup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class InsurancePageStepDefinition extends WebSetup {
	
	InsurancePlanPage lp;

	
	 @Given("^You are on Insurance plan \"([^\"]*)\"$")
	  public void you_are_on_InsurancePlanPage(String page) {
	    
	    lp=new InsurancePlanPage(getDriver());
	    lp.navigateToInsuranePlanPage(page);
	    
	  }
	
	 @And("^You fill personal details$")
	  public void you_fill_personal_details() {
	    
	    lp.fillPersonalDetails();
	    
	  }
	 
	 @And("^You choose the plan$")
	  public void you_choose_the_plan() {
	    
	    lp.choosePlan();
	    
	  }
	 
	 @And("^You fill proposal form details$")
	  public void you_fill_proposal_form_details() throws Exception {
	    
	    lp.fillProposalForm();
	    
	  }
	 
	
}
