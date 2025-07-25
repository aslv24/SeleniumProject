package com.selenium.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement createNewbutton = driver.findElement(By.partialLinkText("Crea"));
		createNewbutton.click();
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='2']"));
		System.out.println(maleRadioButton.isDisplayed());
		System.out.println(maleRadioButton.isEnabled());
		System.out.println(maleRadioButton.isSelected());
		maleRadioButton.click();
		System.out.println(maleRadioButton.isSelected());
	}

}
