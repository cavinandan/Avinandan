package com.bp.swo.web;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	public DateFormat dateFormat;
	public Date date;
	
	BaseClass() {
	
	// Create object of SimpleDateFormat class and decide the format
	dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

	 //get current date time with Date()
	 date = new Date();

	 }
	public void initDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Avinandan_IBM\\eclipse\\Driver\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	
	public void wait(int waitSeconds) {
		int waitTime= waitSeconds * 1000;
		  try {
				Thread.sleep(waitTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}
	 
}
