package com.seleniumgroupactivity;


	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;

public class SelenimExamples
{
	@Test
	public void yamuna() throws InterruptedException 
		{
		

			// System.setProperty("webdriver.gecko.driver", "C:\\Users\\yamunags\\eclipse-workspace\\Myseleniumproject\\drivers\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			
			  	//Implicit wait 
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(3000);
			
					//maximizing window 
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			//login valid credentials
			WebElement username = driver.findElement(By.name("txtUsername"));
			username.sendKeys("Admin");
			WebElement password = driver.findElement(By.id("txtPassword"));
			password.sendKeys("admin123");
			Thread.sleep(2000);
			WebElement login= driver. findElement(By.className ("button"));
			login.click();	
			Thread.sleep(2000);
			
			 			//click on myinfo 
			WebElement Myinfo=driver.findElement(By.linkText("My Info"));
			Myinfo.click();
			Thread.sleep(2000);
			WebElement Immigration=driver.findElement(By.xpath("//a[contains(text(),'Immigration')]"));
			Immigration.click();
			Thread.sleep(2000);
			
					
			WebElement Add=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[3]/div[2]/form[1]/p[1]/input[1]"));
			Add.click();
			Thread.sleep(2000);
			WebElement Number=driver.findElement(By.cssSelector("#immigration_number"));
			Number.sendKeys("9080120");
			Thread.sleep(3000);
			
					//javascriptexecutor using to scroll down webpage 
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400)", "");
			Thread.sleep(3000);
			
			
					    		//isenabled and is displayed method to check for save button 
			
			boolean Savebuttonispresent = driver.findElement(By.id("btnSave")).isDisplayed();
            boolean Savebuttonenabled= driver.findElement(By.id("btnSave")).isEnabled();

            if (Savebuttonispresent==true && Savebuttonenabled==true)
            {
                   // click on the save button
                   WebElement savebutton = driver.findElement(By.id("btnSave"));
                   savebutton.click();
            }
            
            Thread.sleep(3000);
            
            		// logout the webpage 
            WebElement welcome=driver.findElement(By.partialLinkText("Welcome"));
            welcome.click();
            Thread.sleep(3000);
            WebElement Logout=driver.findElement(By.linkText("Logout"));
            Logout.click();
            Thread.sleep(3000);
			driver.quit();	
	
			 
		}
	
}



