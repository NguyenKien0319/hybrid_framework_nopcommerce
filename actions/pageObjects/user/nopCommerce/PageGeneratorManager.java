package pageObjects.user.nopCommerce;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	private static HomePagePO homePage;
	private static RegisterPO registerPage;
	
	public PageGeneratorManager() {
		
	}
	public static HomePagePO getHomePage(WebDriver driver) {
		homePage = new HomePagePO(driver); 
		return homePage;
	}
	
	public static RegisterPO getRegisterPage(WebDriver driver) {
		registerPage = new RegisterPO(driver);
		return registerPage;
	}
}