package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass  {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

		WebDriver DRIVER = new ChromeDriver();

		DRIVER.manage().window().maximize();
		DRIVER.get("https://www.amazon.in/");
		Thread.sleep(2000);
	
		WebElement findElement = DRIVER.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		Actions ac = new Actions(DRIVER);
		ac.moveToElement(findElement).build().perform();
		Thread.sleep(2000);/*
		WebElement star = DRIVER.			;
		ac.click(star).build().perform();
		Thread.sleep(2000);
		WebElement sign = DRIVER.findElement(By.xpath("(//a[@class='a-link-emphasis'])[1]"));
		ac.click(sign).build().perform();
		Thread.sleep(2000);
		WebElement user = DRIVER.findElement(By.id("ap_email"));
		ac.sendKeys(user,"9003052406").build().perform();
		Thread.sleep(2000);
		WebElement con = DRIVER.findElement(By.id("continue"));
		ac.click(con).build().perform();*/
		
	
	}

}
				