package com.selenium.Web;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/droppable/");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().frame(0);
		
		WebElement fromPlace = driver.findElement(By.cssSelector("div#draggable"));
		
		WebElement toPlace = driver.findElement(By.cssSelector("div#droppable"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(fromPlace, toPlace).perform();
		
	}

}
