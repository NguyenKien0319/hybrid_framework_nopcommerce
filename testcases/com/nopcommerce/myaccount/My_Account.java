package com.nopcommerce.myaccount;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nomcommerce.common.Common_01_Login;

import commons.BaseTest;
import pageObjects.user.nopCommerce.HomePagePO;
import pageObjects.user.nopCommerce.LoginPO;
import pageObjects.user.nopCommerce.PageGeneratorManager;

public class My_Account extends BaseTest{
	private WebDriver driver;
	HomePagePO homePage;
	LoginPO loginPage;
	
	@Parameters({"browser","url"})
	@BeforeClass
	public void BeforeClass(String browserName, String appUrl) {
		log.info("Pre-condition: Open browser '" + browserName + "' with URL: '" + appUrl + "'");
		driver = getBrowserDriver(browserName, appUrl);
		
		log.info("Pre-condition - 01: Open Home Page");
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("Pre-condition - 02: Navigate to Login Page");
		homePage.clickToHeaderTextLinkByName(driver, "Log in");
		
		log.info("Pre-condition - 03: Open LoginPage");
		loginPage = PageGeneratorManager.getLoginPage(driver);
		
		log.info("Pre-condition - 04: Set Login page cookie");
		loginPage.setAllCookies(driver, Common_01_Login.loginCookiePage);
		sleepInSecond(1);
		loginPage.getRefreshPage(driver);
		
		log.info("Pre-condition - 05: Open Home Page");
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("Pre-condition - 06: Verify Logout button displayed");
		verifyTrue(homePage.isLogoutButtonDisplayed("Log out"));
		
	}
	
	@Test
	public void My_Account_01_Update_Customer_Info() {
		
	}
}
