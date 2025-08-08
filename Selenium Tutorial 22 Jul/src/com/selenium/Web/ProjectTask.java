package com.selenium.Web;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProjectTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://localhost/hmsci/");

		WebElement roleDropdownField = driver.findElement(By.name("login_type"));
		
		Select role=new Select(roleDropdownField);
		
		role.selectByIndex(1);
		
		WebElement emailField = driver.findElement(By.name("email"));
		
		WebElement passwordField = driver.findElement(By.name("password"));
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		emailField.sendKeys("admin@mail.com");
		
		passwordField.sendKeys("12345678");
		
		loginButton.click();
		
		List<WebElement> dashboardTableRow = driver.findElements(By.xpath("//div[@class='action-nav-normal']/div/div"));
		
		int dashboardTableRowCount = dashboardTableRow.size();
		
		System.out.println(dashboardTableRowCount);
		
		for(int i=1; i<=dashboardTableRowCount;i++)//1 2 3
		{
			List<WebElement> dashboardTableColumn = driver.findElements(By.xpath("//div[@class='action-nav-normal']/div["+i+"]/div"));//6 6  6
			
			int dashboardTableColumnCount = dashboardTableColumn.size();
			
			for(int j=1; j<=dashboardTableColumnCount;j++)
			{
				WebElement dashboardTable = driver.findElement(By.xpath("//div[@class='action-nav-normal']/div["+i+"]/div["+j+"]"));// 1 1 2 3 4 5 6 2 1 2 3 4 5 6 3 1 2 3 4 5 6
				
				System.out.println(dashboardTable.getText());
			}
		}
		
		
		for(int i=1; i<=dashboardTableRowCount;i++)
		{
			List<WebElement> dashboardTableColumn = driver.findElements(By.xpath("//div[@class='action-nav-normal']/div["+i+"]/div"));
			
			int dashboardTableColumnCount = dashboardTableColumn.size();
			
			for(int j=1; j<=dashboardTableColumnCount;j++)
			{
				WebElement dashboardTable = driver.findElement(By.xpath("//div[@class='action-nav-normal']/div["+i+"]/div["+j+"]"));
				if(dashboardTable.getText().equalsIgnoreCase("Doctor"))
				{
					dashboardTable.click();
					break;
				}
			}
		}
		
		
	}

}
