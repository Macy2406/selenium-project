package com.greens;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiseWindow {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		WebElement fst = driver.findElement(By.id("home"));
		fst.click();
		Set<String> all = driver.getWindowHandles();
		for (String string : all) {
			driver.switchTo().window(string);
		}
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='pages/Edit.html']")).click();
		driver.close();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//button[contains(text(),'Open Multiple')]")).click();
		int size = driver.getWindowHandles().size();
		System.out.println(size);
		driver.findElement(By.id("color")).click();
		Set<String> allwi = driver.getWindowHandles();
		for (String string : allwi) {
			if(!string.equals(parent)) {
				driver.switchTo().window(string);
				driver.close();
			}
		}
		driver.quit();
	}
}
