package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	
	//page factory  or OR
	
	@FindBy (id="email")
	WebElement username;
	
	@FindBy(id="passwd")
	WebElement password;
	@FindBy(id="SubmitLogin")
	WebElement loginbutton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validatePageTitle()
	{
		return driver.getTitle();
	}
	

	
	public HomePage validateLogin(String uname,String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click", loginbutton);*/
		loginbutton.click();
		return new HomePage();
	}
}
