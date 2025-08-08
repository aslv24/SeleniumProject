package com.selenium.Web;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.rediff.com/");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.switchTo().frame(0);index
		
		//driver.switchTo().frame("moneyiframe");//string -> name or id
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='Rediff Money Widget']"));
		
		driver.switchTo().frame(frame);
		
		WebElement element = driver.findElement(By.xpath("//span[@id='nseindex']"));
		
		String text = element.getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();
	}

}
