package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'vijay kumar')]")
	WebElement name;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//actions
	
	public String validateuserTitle()
	{
		return name.getText();
	}
	

}
