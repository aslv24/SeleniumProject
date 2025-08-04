package com.selenium.Web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NonSelectTagDropdownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement mobileNumber = driver
				.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[17]/div/div/div[2]/div[2]"));

		mobileNumber.click();

		List<WebElement> mobileNumberList = driver.findElements(By.xpath("//div[@id='country_id']/ul/li"));

		System.out.println(mobileNumberList.size());

		for (WebElement aa : mobileNumberList) {
			System.out.println(aa.getText());
		}
		
		JavascriptExecutor script=(JavascriptExecutor)driver;
		script.executeScript("window.scrollBy(0,1000)");

		// choosing
		for (WebElement aa : mobileNumberList) {
			if (aa.getText().endsWith("(+992)")) {
				aa.click();
				break;
			}
		}

	}

}
