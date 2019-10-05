package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class MyHomePage extends SeleniumBase {
	
	public Myleads clickLeads() {
		click(locateElement("link","Leads"));
		return new Myleads();
	}
}
