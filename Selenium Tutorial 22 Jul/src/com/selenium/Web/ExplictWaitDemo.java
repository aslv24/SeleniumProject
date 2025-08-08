package com.selenium.Web;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://tnpsc.gov.in/home.aspx");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement registerUserButton = driver.findElement(By.xpath("//h3[text()='Registered User']"));
		registerUserButton.click();

		Alert alt = driver.switchTo().alert();

		System.out.println(alt.getText());

		alt.accept();

		Set<String> windows = driver.getWindowHandles();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		System.out.println(windows.size());
		
		wait.until(ExpectedConditions.alertIsPresent());
	}

}
