package com.greens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAutoCompletion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		WebElement se = driver.findElement(By.id("tags"));
		se.sendKeys("s");
		Thread.sleep(2000);
		List<WebElement> xy = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		System.out.println(xy.size());
		//xy.get(0).click();
		for(WebElement s : xy) {
			if(s.getText().equals("Selenium")) {
				s.click();
				break;
			}
		}
	/*	WebElement sear = driver.findElement(By.name("q"));
		sear.sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> sel = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(sel.size());
		for (WebElement webElement : sel) {
			System.out.println(webElement.getText());
		}
	//	sel.get(2).click();
		for (WebElement text : sel) {
			if(text.getText().equals("selenium")) {
				System.out.println(text.getText());
				text.click();
				break;
			}
		}*/
	}

}
