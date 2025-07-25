package com.selenium.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement emailField = driver.findElement(By.id("email"));

		emailField.sendKeys("admin@mail.com");

		WebElement passwordField = driver.findElement(By.id("pass"));

		passwordField.sendKeys("Admin@123");

		WebElement loginButton = driver.findElement(By.className("_42ft"));

		loginButton.click();

	}

}
