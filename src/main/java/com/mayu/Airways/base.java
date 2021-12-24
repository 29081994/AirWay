package com.mayu.Airways;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class base {
	
	
	public WebDriver driver;
	@Test
	public WebDriver browserInitialization() throws IOException {
		
		
		
		Properties prop=new Properties();
		FileInputStream f1=new FileInputStream("C:\\Users\\Mayur\\Eclipse(new)\\Airways\\src\\main\\java\\com\\mayu\\Airways\\data.properties");
		prop.load(f1);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName=="chrome") {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayur\\Downloads\\driver\\chromedriver.exe");
			 driver=new ChromeDriver();
			 
		
		}
		
		else if(browserName=="Firefox") {
			
		}
		
		else if(browserName=="IE") {
			
			
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
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
