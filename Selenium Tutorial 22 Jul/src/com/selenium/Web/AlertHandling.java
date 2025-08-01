package com.selenium.Web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement loginbutton = driver.findElement(By.className("signin-btn"));
		loginbutton.click();
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
	}

}
