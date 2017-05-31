package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.setup.ConstantLocators;
import com.setup.GenericMethods;

public class InsurancePlanPage {


	WebDriver driver;

	public InsurancePlanPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	 public void navigateToInsuranePlanPage(String url) {
			
			GenericMethods.navigate(driver, url);

	}
	 
	 public void fillPersonalDetails()  {
		 
		 GenericMethods.click(driver, ConstantLocators.buyOnlineButton, ConstantLocators.Xpath);
		 GenericMethods.switchToWindow(driver);
		 GenericMethods.input(driver, ConstantLocators.firstName, ConstantLocators.Xpath, "Ashwin");
		 GenericMethods.input(driver, ConstantLocators.lastName, ConstantLocators.Xpath, "Karangutkar");
		 GenericMethods.input(driver, ConstantLocators.mobileNumber, ConstantLocators.Xpath, "9820985636");
		 GenericMethods.input(driver, ConstantLocators.emailID, ConstantLocators.Xpath, "ashu271989@gmail.com");
		 GenericMethods.click(driver, ConstantLocators.dob, ConstantLocators.Xpath);
		 GenericMethods.click(driver, ConstantLocators.date, ConstantLocators.Xpath);
		 GenericMethods.click(driver, ConstantLocators.city, ConstantLocators.Xpath);
		 GenericMethods.input(driver, ConstantLocators.city, ConstantLocators.Xpath, "Mumbai");
		 GenericMethods.waitFor(3000);
		 GenericMethods.click(driver, ConstantLocators.proceedButton, ConstantLocators.Xpath);


	 }
	 
	 public void choosePlan()  {
		 
		 GenericMethods.scrollDown(driver);
		 GenericMethods.click(driver, ConstantLocators.choosePlanButton, ConstantLocators.Xpath);
	     GenericMethods.waitFor(3000);
		 GenericMethods.click(driver, ConstantLocators.choosePlanproceedButton, ConstantLocators.Xpath);
	     GenericMethods.waitFor(3000);
		 GenericMethods.click(driver, ConstantLocators.proceedToBuyButton, ConstantLocators.Xpath);

	 }
	
	 public void fillProposalForm()  {
		 
	     GenericMethods.waitFor(10000);
		
		 GenericMethods.selectFromDropdown(driver, ConstantLocators.maritalStatus, ConstantLocators.Xpath, "MAR_SIN");
		 GenericMethods.input(driver, ConstantLocators.fatherName, ConstantLocators.Xpath, "Arun");
		 GenericMethods.selectFromDropdown(driver, ConstantLocators.educationalQualification, ConstantLocators.Xpath, "EDU_QUAL_BE");
		 GenericMethods.input(driver, ConstantLocators.placeOfBirth, ConstantLocators.Xpath, "Mumbai");
		 GenericMethods.click(driver, ConstantLocators.nri, ConstantLocators.Xpath);
		 GenericMethods.click(driver, ConstantLocators.political, ConstantLocators.Xpath);
		 GenericMethods.click(driver, ConstantLocators.history, ConstantLocators.Xpath);
		 GenericMethods.click(driver, ConstantLocators.nextButton1, ConstantLocators.Xpath);
		 GenericMethods.click(driver, ConstantLocators.manualAddress, ConstantLocators.Xpath);
		 GenericMethods.input(driver, ConstantLocators.flatNumber, ConstantLocators.Xpath, "505");
		 GenericMethods.input(driver, ConstantLocators.streetName, ConstantLocators.Xpath, "DSP Road");
		 GenericMethods.input(driver, ConstantLocators.area, ConstantLocators.Xpath, "Dadar");
		 GenericMethods.input(driver, ConstantLocators.pincode, ConstantLocators.Xpath, "400014");
		 GenericMethods.click(driver, ConstantLocators.permAddress, ConstantLocators.Xpath);
		 GenericMethods.click(driver, ConstantLocators.nextButton1, ConstantLocators.Xpath);
		 GenericMethods.selectFromDropdown(driver, ConstantLocators.occupationDetail, ConstantLocators.Xpath, "OCCT_STUD");
		 GenericMethods.click(driver, ConstantLocators.nextButton2, ConstantLocators.Xpath);
		 GenericMethods.input(driver, ConstantLocators.firstName1, ConstantLocators.Xpath, "Akshay");
		 GenericMethods.input(driver, ConstantLocators.lastName1, ConstantLocators.Xpath, "Karangutkar");
		 GenericMethods.click(driver, ConstantLocators.dob1, ConstantLocators.Xpath);
		 GenericMethods.click(driver, ConstantLocators.date1, ConstantLocators.Xpath);
		 GenericMethods.click(driver, ConstantLocators.gender, ConstantLocators.Xpath);
		 GenericMethods.selectFromDropdown(driver, ConstantLocators.maritalStatus1, ConstantLocators.Xpath, "MAR_SIN");
		 GenericMethods.selectFromDropdown(driver, ConstantLocators.relation, ConstantLocators.Xpath, "RNMLA_BRTR_CD");
		 GenericMethods.click(driver, ConstantLocators.nomineeAddress, ConstantLocators.Xpath);
		 GenericMethods.input(driver, ConstantLocators.allocation, ConstantLocators.Xpath, "100");
		 GenericMethods.click(driver, ConstantLocators.nextButton4, ConstantLocators.Xpath);
		 GenericMethods.selectFromDropdown(driver, ConstantLocators.ageProof, ConstantLocators.Xpath, "DOC_0238");
		 GenericMethods.click(driver, ConstantLocators.ageProofDoc, ConstantLocators.Xpath);
		 GenericMethods.selectFromDropdown(driver, ConstantLocators.incomeProof, ConstantLocators.Xpath, "DOC_0060");
		 GenericMethods.click(driver, ConstantLocators.incomeProofDoc, ConstantLocators.Xpath);
		 GenericMethods.selectFromDropdown(driver, ConstantLocators.addressProof, ConstantLocators.Xpath, "DOC_0135");
		 GenericMethods.click(driver, ConstantLocators.addressProofDoc, ConstantLocators.Xpath);
		 GenericMethods.selectFromDropdown(driver, ConstantLocators.idProof, ConstantLocators.Xpath, "DOC_0135");
		 GenericMethods.click(driver, ConstantLocators.idProofDoc, ConstantLocators.Xpath);
		 GenericMethods.selectFromDropdown(driver, ConstantLocators.photoProof, ConstantLocators.Xpath, "DOC_0787");
		 GenericMethods.click(driver, ConstantLocators.photoProofDoc, ConstantLocators.Xpath);
		 GenericMethods.doubleClick(driver, ConstantLocators.nextButton3, ConstantLocators.Xpath);
		 GenericMethods.scrollDown(driver);
		 GenericMethods.scrollDown(driver);
		 GenericMethods.click(driver, ConstantLocators.dematAccount, ConstantLocators.Xpath);
		 GenericMethods.click(driver, ConstantLocators.nextButton3, ConstantLocators.Xpath);
		 GenericMethods.click(driver, ConstantLocators.submitButton, ConstantLocators.Xpath);

	 }
	 
	 public void closeApplication()  {
		 
		 driver.quit();
	 
	 }
}
