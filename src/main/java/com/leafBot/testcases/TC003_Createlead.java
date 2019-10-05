package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC003_Createlead extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		excelFileName="TC003";
		testcaseName="CreateLead";
		testcaseDec = "Creates A lead";
		author="Nithin";
		category="smoke";
		
	}
	@Test
	public void createLeads(){
		new LoginPage().enterUsername("demosalesmanager").enterPassword("crmsfa").clickLogin().clickCrmsfa()
		.clickLeads().clickCreateLeads().enterCompanyName("Cognizant").enterFirstName("Nithin").enterLastName("Karthik")
		.clickSubmit().verifyUserFirstName();
		
	}
}
