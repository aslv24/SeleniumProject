package com.selenium.Web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement createNewbutton = driver.findElement(By.partialLinkText("Crea"));
		createNewbutton.click();
		
		WebElement dayDropdownList = driver.findElement(By.id("day"));
		
		Select dayDropdown=new Select(dayDropdownList);
		
		dayDropdown.selectByIndex(24);
		
		WebElement monthDropdownList = driver.findElement(By.id("month"));
		
		Select monthDropdown=new Select(monthDropdownList);
		
		monthDropdown.selectByValue("11");
		
		WebElement yearDropdownList = driver.findElement(By.id("year"));
		
		Select yearDropdown=new Select(yearDropdownList);
		
		yearDropdown.selectByVisibleText("2002");
		
		List<WebElement> options = yearDropdown.getOptions();
		
		for (WebElement aa : options) {
			System.out.println(aa.getText());
		}
		
	}

}
