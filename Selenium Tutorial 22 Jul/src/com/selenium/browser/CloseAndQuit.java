package com.selenium.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().newWindow(WindowType.TAB).navigate().to("https://www.google.co.in");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	//	driver.close();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
