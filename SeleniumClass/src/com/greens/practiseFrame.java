package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiseFrame {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement a = driver.findElement(By.id("Click"));
		a.click();
		String text = a.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
	}
}
