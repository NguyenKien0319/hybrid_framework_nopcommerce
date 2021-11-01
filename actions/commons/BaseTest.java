package commons;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	private WebDriver driver;
	
	private enum BROWSER{
		CHROME, FIREFOX, EDGE_LEGACY, EDGE_CHROMIUM, H_CHROME, H_FIREFOX
	}
	
	protected WebDriver getBrowserDriver(String browserName, String appUrl) {
		BROWSER browser = BROWSER.valueOf(browserName.toUpperCase());
		if(browser.equals(BROWSER.CHROME)){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals(BROWSER.FIREFOX)){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equals(BROWSER.EDGE_CHROMIUM)){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			throw new RuntimeException("Please enter correct browser name");
		}
		driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;
	}
	
	protected String getRandomEmail() {
		Random rand = new Random();
		return "testing" + rand.nextInt(999999) + "@hotmail.com";
	}
}
