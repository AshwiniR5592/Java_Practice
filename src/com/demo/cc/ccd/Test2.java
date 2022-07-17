package com.demo.cc.ccd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gslab.com/");
		System.out.println("launch browser successfully ");
		driver.manage().deleteAllCookies();
	//	Thread.sleep(3000);
	
	
		WebElement case1=driver.findElement(By.xpath("//button[@class='btn btn-default btn-md success_story_first_col']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", case1);
	}

}
