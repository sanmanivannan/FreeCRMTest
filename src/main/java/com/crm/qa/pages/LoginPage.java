package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory - OR //@FindBy annotations
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//INPUT[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//BUTTON[@type='button'][text()='Sign Up']")
	WebElement signUpBtn;

	@FindBy(xpath = "//IMG[@class='img-responsive'])[1]")
	WebElement crmLogo;

	// Initializing the Page Object using the PageFactory
	// class//********IMPORTANT STEP*********
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();

	}

	public HomePage login(String un, String pw) {

		username.sendKeys(un);
		password.sendKeys(pw);
		loginBtn.click();

		return new HomePage();

	}
}
