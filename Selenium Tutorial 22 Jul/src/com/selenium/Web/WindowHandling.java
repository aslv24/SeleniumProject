package com.selenium.Web;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	
	//selenium 4  //3.141.59
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.makemytrip.com");


		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Set<String> windows = driver.getWindowHandles();
		
		
		System.out.println(windows.size());//2
		
		List<String> list=new ArrayList<String>(windows);
		
		System.out.println(list.size());//2
		
		driver.switchTo().window(list.get(0));
		
		driver.findElement(By.id("email")).sendKeys("email@mail.com");
		
		driver.close();
		
		driver.switchTo().window(list.get(1));
		
		driver.findElement(By.cssSelector("span.commonModal__close")).click();
	

	}

}
