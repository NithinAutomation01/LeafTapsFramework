package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class Myleads extends SeleniumBase {

	public Createleads clickCreateLeads() {
		click(locateElement("link", "Create lead"));
		return new Createleads();
		
		
	}
}
