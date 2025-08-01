package com.selenium.Web;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.naukri.com/");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(element).perform();
		
		WebElement clickElement = driver.findElement(By.xpath("//div[text()='MNC jobs']"));
		
		act.click(clickElement).perform();
		
		act.contextClick().perform();
	}

}
