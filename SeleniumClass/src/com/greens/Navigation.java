package com.greens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

		WebDriver DRIVER = new ChromeDriver();

		DRIVER.manage().window().maximize();
		DRIVER.get("https://www.google.com/");
		Thread.sleep(1000);
		DRIVER.navigate().to("https://www.facebook.com/");
		Thread.sleep(1000);
		DRIVER.navigate().back();
		Thread.sleep(2000);
		DRIVER.navigate().refresh();
		Thread.sleep(1000);
		DRIVER.navigate().forward();
		Thread.sleep(1000);
		DRIVER.navigate().refresh();
		String t = DRIVER.getTitle();
		System.out.println(t);
		String url = DRIVER.getCurrentUrl();
		System.out.println(url);
	}
}
