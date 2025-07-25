package com.selenium.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementHandling {

	@SuppressWarnings({"deprecation"})
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
 
		WebElement emailField = driver.findElement(By.id("email"));

		System.out.println(emailField.isDisplayed());
		
		System.out.println(emailField.isEnabled());
		
		System.out.println(emailField.getAttribute("data-testid"));
		
		System.out.println(emailField.getAttribute("placeholder"));
		
		System.out.println(emailField.getTagName());
		
		emailField.sendKeys("admin@mail.com");
		
		System.out.println(emailField.getAttribute("value"));
	

	}

}
