package com.demo.cc.ccd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E://Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung tv");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div[1]/div[1]/ol/li[1]/div/a/div/div")).click();
		
		 System.out.println("Runs program successfully");

	}

}


//ya thats what the jar file 