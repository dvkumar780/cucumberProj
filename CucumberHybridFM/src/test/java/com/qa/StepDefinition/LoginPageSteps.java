package com.qa.StepDefinition;

import java.util.Properties;

import org.testng.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.PropertiesReader;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginPageSteps extends TestBase {
	
	LoginPage loginpage=new LoginPage();
	String title;
	HomePage homepage;
	Properties prop;
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		PropertiesReader pr=new PropertiesReader();
	
		TestBase.getDriver().get(prop.getProperty("url"));
	   
	}

	@When("^user gets the title page$")
	public void user_gets_the_title_page() throws Throwable {
	    title=loginpage.validatePageTitle();
	    Assert.assertEquals("Login - My Store", title);
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String arg1) throws Throwable {
		
		System.out.println(title);
	    
	}

	@When("^user login to the app$")
	public void user_login_to_the_app() throws Throwable {
		PropertiesReader pr=new PropertiesReader();

		homepage=loginpage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));

	    
	}
	@Then("^validate logged in user$")
	public void validate_logged_in_user() throws Throwable {
		homepage=new HomePage();
		String nameOfUser=homepage.validateuserTitle();
		Assert.assertEquals("vijay kumar", nameOfUser);
		System.out.println(nameOfUser);
	    
	}
	

	



}
