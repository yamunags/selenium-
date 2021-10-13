package com.selenium.exmaples;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.apache.log4j.LogManager;
	import org.apache.log4j.Logger;

	public class ParallelTesting {
	private WebDriver driver;
	String baseURL = "http://www.google.com/";
	private static final Logger logger = LogManager.getLogger(ParallelTesting.class);

	@Parameters({ "browser" })
	@BeforeTest
	public void openBrowser(String browser) {
	try {
	if (browser.equalsIgnoreCase("Firefox")) {
	WebDriverManager.firefoxdriver().setup();
	//System.setProperty("webdriver.gecko.driver","C:/Users/sanjayp/eclipse-workspace-PicnicSelenium/SeleniumProject/drivers/geckodriver.exe");
	driver = new FirefoxDriver();
	} else if (browser.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver","C:/Users/sanjayp/eclipse-workspace-PicnicSelenium/SeleniumProject/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	}

	} catch (WebDriverException e) {
	System.out.println(e.getMessage());
	}
	}
	
	@Test
	public void login_TestCase() {
	driver.navigate().to(baseURL);

	logger.info("Inside login test case");
	logger.info("navigating to page");
	//do something
	}
	
	@Test
	public void search_TestCase() {
	driver.navigate().to(baseURL);
	//do something
	}

	@AfterTest
	public void closeBrowser() {
	driver.quit();
	}
	}

