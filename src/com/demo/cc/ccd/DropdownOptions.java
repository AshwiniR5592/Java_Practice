package com.demo.cc.ccd;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownOptions{
		   public static void main(String[] args) throws InterruptedException {
		      System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		      driver.manage().window().maximize();
		     String url = "https://www.flipkart.com";
		      driver.get(url);
		      Thread.sleep(3000);
		      WebElement more=driver.findElement(By.xpath("//*[@class='exehdJ'][text()='More']"));
		     
		     
		      List<WebElement> allOptions = driver.findElements(By.xpath("//*[@class='exehdJ'][text()='More']"));
		        System.out.println(allOptions.size());
		        
		   //  Actions action=new Actions(driver);
		   //  action.moveToElement(more).build().perform();
		     
		        for(int i = 0; i<=allOptions.size()-1; i++) {
		             
		             
		        
		                 
		            System.out.println(allOptions.get(i).getText());    
		                
		             
		        
		         
		  }
		       
		     Thread.sleep(3000);
		      System.out.println("successfully ");
		      
			}
		   }
		

		  

