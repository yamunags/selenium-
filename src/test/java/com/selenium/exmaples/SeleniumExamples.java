package com.selenium.exmaples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;

public class SeleniumExamples{
	@Test
	public void alertshandling() throws InterruptedException {
	
	// public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		
        
        // Alert Message handling
                    		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
    	driver.close();
	}
	
    
}