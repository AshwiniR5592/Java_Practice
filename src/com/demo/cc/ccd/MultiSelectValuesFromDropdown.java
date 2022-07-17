package com.demo.cc.ccd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectValuesFromDropdown {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "E://Drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://demoqa.com/select-menu");
	      driver.manage().window().maximize();
	      
	      Select sel=new Select(driver.findElement(By.id("cars")));
	      
	      System.out.println("Dropdown options are --");
	      
	    List<WebElement> options = sel.getAllSelectedOptions();
	    
	    for(WebElement option : options)
	    {
	    	
	    	System.out.println(option.getText());
	    	
	    }
	      
	      

	}

}
