package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrapDrop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

		WebDriver DRIVER = new ChromeDriver();

		DRIVER.manage().window().maximize();
		DRIVER.get("http://demo.guru99.com/test/drag_drop.html ");
		Thread.sleep(2000);
		Actions ac =new Actions(DRIVER);
		WebElement drag1 = DRIVER.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement DROP1   = DRIVER.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		ac.dragAndDrop(drag1, DROP1).build().perform();
		Thread.sleep(5000);
		WebElement drag2 = DRIVER.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement drop2 = DRIVER.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		ac.dragAndDrop(drag2, drop2).build().perform();
		
	}

}
