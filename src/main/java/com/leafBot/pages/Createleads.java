package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;


public class Createleads extends SeleniumBase {
	
	public Createleads enterCompanyName(String enterCompanyName) {
		clearAndType(locateElement("Id","createLeadForm_companyName"),enterCompanyName);
		/*driver.findElementById("").sendKeys(enterCompanyName);*/
		return this;
	}
	public Createleads enterFirstName(String FirstName) {
		clearAndType(locateElement("Id","createLeadForm_firstName"), FirstName);
		return this;
	}
	public Createleads enterLastName(String LastName) {
		clearAndType(locateElement("Id","createLeadForm_lastName"), LastName);
		return this;
	}
	public MyViewPage clickSubmit() {
		click(locateElement("Name","submitButton"));
		/*driver.findElementByName("submitButton").click();*/
		return new MyViewPage();
	}

	

}
