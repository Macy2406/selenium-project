package com.greens;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

		WebDriver DRIVER = new ChromeDriver();

		DRIVER.manage().window().maximize();
		DRIVER.get("http://www.leafground.com/pages/Edit.html");
		Thread.sleep(2000);
		String currentUrl = DRIVER.getCurrentUrl();
		System.out.println(currentUrl);
		/*
		//WebElement append = DRIVER.findElement(By.xpath("(//input[@type='text'])[2]"));
		//append.sendKeys("text");
		//WebElement nam = DRIVER.findElement(By.name("username"));
		//String attribute = nam.getAttribute("value");
		//System.out.println(attribute);
		//DRIVER.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		//boolean enabled = DRIVER.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
		//System.out.println(enabled);*/
	}

}
