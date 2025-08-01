package com.selenium.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().newWindow(WindowType.WINDOW).navigate().to("https://www.google.co.in");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
