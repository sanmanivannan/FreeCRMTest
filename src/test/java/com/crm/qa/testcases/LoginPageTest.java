package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homePage;
	

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
	}

	@Test(priority=1)
	public void loginPageTitleTest() {
		String loginpagetitle = loginpage.validateLoginPageTitle();
	    Assert.assertEquals(loginpagetitle, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	       
	}
		
	@Test(priority=2)
	public void crmLogoImageTest() {
		boolean loginpagetitle = loginpage.validateCRMImage();
	    Assert.assertTrue(loginpagetitle);
	    
	  
	}
	
	@Test(priority=3)
	public void loginTest() {
		homePage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	  
	}
			

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
