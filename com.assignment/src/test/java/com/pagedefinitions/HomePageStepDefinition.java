package com.pagedefinitions;

import com.pageobjects.HomePage;
import com.setup.ConstantLocators;
import com.setup.GenericMethods;
import com.setup.WebSetup;

import cucumber.api.java.en.*;

public class HomePageStepDefinition extends WebSetup {
  
  HomePage hp;
  
  @Given("^You are on Home \"([^\"]*)\" of lifexclusiv$")
  public void you_are_on_Home_page(String page) {
    
    hp=new HomePage(getDriver());
    hp.navigateToHomePage (page);
    
  }
  
  @Then("^Check whether links are broken$")
  public void check_whether_links_are_broken() throws Throwable {

    hp.verifyBrokenLinks();
	  
  }

}
