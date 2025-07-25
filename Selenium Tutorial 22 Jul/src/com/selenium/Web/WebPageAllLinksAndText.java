package com.selenium.Web;

import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageAllLinksAndText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.axisbank.com");
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		List<WebElement> aTag = driver.findElements(By.tagName("a"));
		
		for (WebElement aa : aTag) {
			System.out.println(aa.getText()+" ----> "+aa.getAttribute("href"));
		}
		

	}

}
