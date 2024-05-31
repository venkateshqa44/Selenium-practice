package com.tests.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createdatabase {

	private WebDriver driver; // Declare driver as an instance variable
	
	@BeforeTest
	public void openbrowser() {
		WebDriverManager.chromedriver().setup(); // Setup WebDriverManager
		driver = new ChromeDriver(); // Initialize the driver
	}

	
	
	@Test
	public void Launchapp() {
		
		driver.get("https://www.odoo.com/web/login"); // Use the instance variable driver
		driver.manage().window().maximize();
	}



    @Test
	public void login() throws InterruptedException {

		driver.findElement(By.id("login")).sendKeys("venkateshqa44@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Crm@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
    }
    
		
		
  
    	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

