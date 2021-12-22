package com.mayu.Airways;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class CheckBooking {
	
	

	@Test
	public void BrowserInitializatipon()  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayur\\Downloads\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	/*driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);*/
	driver.get("https://www.airindia.in/index.htm");
	System.out.println(driver.getTitle());
    WebDriverWait w1=new WebDriverWait(driver,30);
	w1.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[value='OneWay']"))); 
	/*JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", "input[value='OneWay");*/
	
	AirIndiaHome h1=new AirIndiaHome(driver); 
	h1.Textbox1().sendKeys("pune");
	h1.Printsample();
	
	
	AirIndiaBaggage b1=new AirIndiaBaggage(driver);
	b1.Linkscount(); 
	

	}
}