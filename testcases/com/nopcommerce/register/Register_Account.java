package com.nopcommerce.register;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.user.nopCommerce.HomePagePO;
import pageObjects.user.nopCommerce.PageGeneratorManager;
import pageObjects.user.nopCommerce.RegisterPO;

public class Register_Account extends BaseTest{
	private WebDriver driver;
	private HomePagePO homePage;
	private RegisterPO registerPage;
	
	@Parameters({"browser", "url"})
	@BeforeTest
	public void BeforeTest(String browserName, String appUrl) {
		log.info("Pre-condition: Open browser '" + browserName + "' with URL: '" + appUrl + "'");
		driver = getBrowserDriver(browserName, appUrl);
		
		log.info("Pre-condition - 01: Open Home Page");
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("Pre-condition - 02: Navigate to RegisterPage");
		homePage.clickToHeaderTextLinkByName(driver,"Register");
	}
	
	@Test
	public void Register_01_Leave_All_Fields_Blank() {
		log.info("Register_00 - Step_01: Open Register Page");
		registerPage = PageGeneratorManager.getRegisterPage(driver);
		
		log.info("Register_00 - Step_02: Click to Register button");
		registerPage.clickToButtonByName(driver,"Register");
		
		log.info("Register_00 - Step_03: Verify validation error message display");
		assertTrue(registerPage.displayedErrorMessageByText(driver,"First name is required."));
		assertTrue(registerPage.displayedErrorMessageByText(driver,"Last name is required."));
		assertTrue(registerPage.displayedErrorMessageByText(driver,"Email is required."));
		assertFalse(registerPage.displayedErrorMessageByText(driver,"Password is required."));
	}
}
