package com.selenium.Web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		List<WebElement> inputTag = driver.findElements(By.tagName("input"));
		
		List<WebElement> aTag = driver.findElements(By.tagName("a"));
		
		List<WebElement> divTag = driver.findElements(By.tagName("div"));
		
		List<WebElement> h2Tag = driver.findElements(By.tagName("h2"));
		
		System.out.println(inputTag.size());
		
		System.out.println(aTag.size());
		
		System.out.println(divTag.size());
		
		System.out.println(h2Tag.size());

	}

}
