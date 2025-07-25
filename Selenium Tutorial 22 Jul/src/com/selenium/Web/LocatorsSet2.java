package com.selenium.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//WebElement forgotPassword = driver.findElement(By.linkText("Forgotten password?"));
		
		WebElement forgotPassword = driver.findElement(By.partialLinkText("?"));
		
		System.out.println(forgotPassword.getText());
		
		System.out.println(forgotPassword.getAttribute("href"));
		
		forgotPassword.click();
		
		
		
	}

}
