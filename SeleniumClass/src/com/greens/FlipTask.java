package com.greens;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipTask {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement mouse = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(mouse).build().perform();
		WebDriverWait wb = new WebDriverWait(driver, 60);
		wb.until(ExpectedConditions.visibilityOf(mouse));
		List<WebElement> ele = driver
				.findElements(By.xpath("//span[text()='Electronics']//following-sibling::ul//ul//li//ul//li//a"));
		System.out.println(ele.size());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		for (WebElement x : ele) {
			if (x.getAttribute("title").equalsIgnoreCase("apple")) {
				System.out.println(x.getAttribute("title"));
				x.click();
				break;
			}

		}
	}
}