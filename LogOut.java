package com.bp.swo.web;

import org.openqa.selenium.By;

public class LogOut extends BaseClass{

	public void logOutSWO() {
			
		  System.out.println("About to logout");
		  wait(2);
		  driver.findElement(By.xpath("//a[@id='meAreaHeaderButton']")).click();
		  wait(3);
		  driver.findElement(By.xpath("//bdi[contains(text(),'Sign Out')]")).click();
		  wait(5);
		  driver.findElement(By.xpath("//bdi[contains(text(),'OK')]")).click();
		  System.out.println("Log out Successful");
		 
		  driver.close(); 
		  driver.quit();
		  System.out.println("Bowser closed and driver quited");
			
	}

}
