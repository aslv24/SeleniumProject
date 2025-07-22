package com.selenium.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");

		WebDriver driver=new ChromeDriver(opt);

		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
