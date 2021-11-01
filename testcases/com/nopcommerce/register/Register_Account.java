package com.nopcommerce.register;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;

public class Register_Account extends BaseTest{
	private WebDriver driver;
	
	
	@Parameters({"browser", "url"})
	@BeforeTest
	public void BeforeTest(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
	}
	
	@Test
	public void Register_01_Leave_All_Fields_Blank() {
		
	}
}
