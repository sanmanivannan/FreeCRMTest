package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;



public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test 
	
	public void verifyHomePageTitleTest() {
		String hometitle = homepage.verifyHomePageTitle();
	
	Assert.assertEquals(hometitle, "CRMPRO", "Home pagetitle not matched");	
			
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
}
