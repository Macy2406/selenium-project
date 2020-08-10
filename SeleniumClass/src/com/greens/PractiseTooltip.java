package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseTooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();
		WebElement tool = driver.findElement(By.id("age"));
		String text = tool.getAttribute("title");
        System.out.println(text);
	}

}
