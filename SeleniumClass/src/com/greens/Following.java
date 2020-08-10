package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Following {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

		WebDriver DRIVER = new ChromeDriver();

		DRIVER.manage().window().maximize();
		DRIVER.get("https://www.ally.io/careers/chennai");
		Thread.sleep(2000);
		DRIVER.findElement(By.xpath("((//section[@class='level-0'])[1]//following-sibling::div//child::a)[1]")).click();
	}
}
