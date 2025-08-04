package com.selenium.Web;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionBox {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.co.in");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement searchbarField = driver.findElement(By.name("q"));
		
		searchbarField.sendKeys("infomats");
		
		List<WebElement> list = driver.findElements(By.xpath("(//div[@role='presentation']/ul[@role='listbox'])[1]/li"));
		
		System.out.println(list.size());
		
		//printing
		for (WebElement aa : list) {
			System.out.println(aa.getText());
		}
		
		//choosing
		for (WebElement aa : list) {
			if(aa.getText().endsWith("by owner"))
			{
				aa.click();
				break;
			}
		}
	}

}
