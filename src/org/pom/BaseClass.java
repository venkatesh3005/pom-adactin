package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver  launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-11\\Desktop\\Sabari\\POM\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		return driver;
		
		
	}
	public static void type( WebElement e,String name) {
		e.sendKeys(name);
		
	}
	public static  void click(WebElement e) {
		e.click();
	}
	
	public static  void dropDown(WebElement e,int a) {
		Select s =new Select(e);
		s.selectByIndex(a);
	}
	public static void attribute(WebElement e,String name) {
		String text = e.getAttribute(name);
		System.out.println(text);
		
	}

}
