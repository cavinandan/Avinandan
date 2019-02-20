package com.bp.swo.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Login extends BaseClass{
	
	public void Login(String URL, String UserName, String Password) {
		// TODO Auto-generated method stub
		super.initDriver();
		
		driver.get(URL);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//*[contains(text(),'Login')]")).click();
		String date1= dateFormat.format(date);	  
		System.out.println(date1);
		  
		//Comment removed
		  boolean result = true; 
		  while (result) { try {
			  String date2= dateFormat.format(date);	  
			  System.out.println(date2);
			  
			  driver.findElement(By.xpath("//*[contains(text(),'My Inbox')]"));
			  result = false; 
			  
			  String date3= dateFormat.format(date);	  
			  System.out.println(date3);
			  
			  
			  System.out.println("Login successful");
		  } 
		  catch (Exception e) { // TODO: handle exception }
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  System.out.println("Waiting for My Inbox tab to appear");
			  
		   }
		  
		  }
		


	}
}



/* wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'My Inbox')]"))); */
