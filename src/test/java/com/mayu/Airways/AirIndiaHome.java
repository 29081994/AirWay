package com.mayu.Airways;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;



public class AirIndiaHome extends base{

	WebDriver driver;
	
	public AirIndiaHome(WebDriver driver) {
		
		this.driver=driver;
	}
		
	 By Oneway=By.cssSelector("input[value='OneWay']");
	 By from=By.cssSelector("input#from");
	
	
	
	public WebElement OneWay1() {
		
		
		return driver.findElement(Oneway);
		
	}	
        @BeforeSuite
		public WebElement Textbox1() {
			
			return driver.findElement(from);
		}
		
        @AfterClass
        public void Printsample() {
        	
        	System.out.println("pp");
        }
	}
		
		
	
