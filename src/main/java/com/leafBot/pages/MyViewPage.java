package com.leafBot.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.leafBot.selenium.api.base.SeleniumBase;


public class MyViewPage extends SeleniumBase {
	
	public void verifyUserFirstName() {
		String value =getElementText(locateElement("xpath","//*[@id='viewLead_firstName_sp']"));
		String text = "Nithin";
		
	Assert.assertEquals(value, text);
	System.out.println("assertion done");
	}
	

}
