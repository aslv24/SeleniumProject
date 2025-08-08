package com.selenium.Web;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.omtamilcalendar.com/");

		WebElement headling = driver.findElement(By.xpath("//div[@id='section-head']/h2"));
		
		JavascriptExecutor script=(JavascriptExecutor)driver;
		script.executeScript("arguments[0].scrollIntoView();",headling);
		
		List<WebElement> calendarTableRow = driver.findElements(By.xpath("//table[@class='calendar-table']/tbody/tr[@class='calendar-body ']"));
		
		int calendarTableRowCount = calendarTableRow.size();
		
		for(int i=1; i<=calendarTableRowCount;i++)
		{
			List<WebElement> calendarTableColumn = driver.findElements(By.xpath("//table[@class='calendar-table']/tbody/tr[@class='calendar-body ']["+i+"]/td[starts-with(@class,'ca')]"));
			
			int calendarTableColumnCount = calendarTableColumn.size();
			
			for(int j=1; j<=calendarTableColumnCount;j++)
			{
				WebElement date = driver.findElement(By.xpath("//table[@class='calendar-table']/tbody/tr[@class='calendar-body ']["+i+"]/td[starts-with(@class,'ca')]["+j+"]"));
				
				System.out.println(date.getText());
			}
		}
		
		
		for(int i=1; i<=calendarTableRowCount;i++)
		{
			List<WebElement> calendarTableColumn = driver.findElements(By.xpath("//table[@class='calendar-table']/tbody/tr[@class='calendar-body ']["+i+"]/td[starts-with(@class,'ca')]"));
			
			int calendarTableColumnCount = calendarTableColumn.size();
			
			for(int j=1; j<=calendarTableColumnCount;j++)
			{
				WebElement date = driver.findElement(By.xpath("//table[@class='calendar-table']/tbody/tr[@class='calendar-body ']["+i+"]/td[starts-with(@class,'ca')]["+j+"]"));
				if(date.getText().equalsIgnoreCase("24"))
				{
					date.click();
					break;
				}
			}
		}
		
		
	}

}
