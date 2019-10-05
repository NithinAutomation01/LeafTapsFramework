package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC002_testsample extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName="TC002";
		testcaseName="Test ";
		testcaseDec = "click CRMSFA";
		author="Nithin";
		category="smoke";
	}
		@Test
		public void testingcrmsfa(){
			new LoginPage().enterUsername("demosalesmanager").enterPassword("crmsfa").clickLogin().clickCrmsfa();
			System.out.println("entered into CRMSFA");
		}
		
}


