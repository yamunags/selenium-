package com.selenium.exmaples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrillDay

{
	
	WebDriver driver;
@Test
	public void yamuna() throws InterruptedException 
	{
			// invoke firefox driver 
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
			// wait for webpage to load using implicit wait 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
				//open url 
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		
				// login website using the login credentials 
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement login= driver. findElement(By.cssSelector("#login-button"));
		login.click();	
		Thread.sleep(2000);
		
					//To check Visible text SWAGLABS in webpage 
			if( driver.findElement(By.xpath("//div[@id='']")).isDisplayed())
			{

			System.out.println("Element is Visible");

			}
			else
			{

			System.out.println("Element is InVisible");

			}	
					// clicking on add to cart 
			WebElement Addtocart= driver. findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"));
			Addtocart.click();	
						//clicking on your cart 
			
			WebElement Yourcart= driver. findElement(By.xpath("//span[contains(text(),'1')]"));
			Yourcart.click();		
			
					// clicking on check out 
			
			
			WebElement checkout= driver. findElement(By.cssSelector("#checkout"));
			checkout.click();		
			
					// adding details in checkout option
			WebElement firstname = driver.findElement(By.id("first-name"));
			firstname.sendKeys("Vayu");
			WebElement lastname = driver.findElement(By.name("lastName"));
			lastname.sendKeys("Tent");
			Thread.sleep(2000);
			WebElement postalcode= driver. findElement(By.name("postalCode"));
			postalcode.sendKeys("603103");	
		
			 		//scrolling page down using javasript executor  and click on continue 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400)", "");
			Thread.sleep(3000);
			
			
			
		WebElement continue1 = driver.findElement(By.xpath("//input[@id='continue']"));
		continue1.click();
			
			   			// scrolling page down and click on finish 
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(3000);
			
			WebElement finish= driver. findElement(By.cssSelector("#finish"));
			finish.click();		
			
						// click on backhome 
			WebElement backhome= driver. findElement(By.id("back-to-products"));
			backhome.click();		
			
			
			   			// logging out from top left menu in homepage 
			  WebElement menu=driver.findElement(By.id("react-burger-menu-btn"));
	          menu.click();	          
	          Thread.sleep(3000);
	          
	          WebElement Logout=driver.findElement(By.id("logout_sidebar_link"));
	          Logout.click();
	          
	          Thread.sleep(3000);
			
	          driver.quit();
				
}

}

	

