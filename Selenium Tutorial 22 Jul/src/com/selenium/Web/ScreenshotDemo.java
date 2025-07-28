package com.selenium.Web;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
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
		
		TakesScreenshot screen=(TakesScreenshot)driver;//typecasting
		
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);//capturing screenshot
		
		File screenshotTo=new File("C:\\Users\\WELCOME234\\Desktop\\Screenshot\\screen.png");//updating location path to save the screenshot
		
		FileHandler.copy(screenshotAs, screenshotTo);//to save the screenshot
	}

}
