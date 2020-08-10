package com.greens;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

		WebDriver DRIVER = new ChromeDriver();

		DRIVER.manage().window().maximize();
		DRIVER.get("http://toolsqa.com/");
		Thread.sleep(2000);
		WebElement se = DRIVER.findElement(By.xpath("//a[text()='Selenium - Java']"));
		JavascriptExecutor js = (JavascriptExecutor) DRIVER;
		js.executeScript("arguments[0].scrollIntoView(true)", se);
		Thread.sleep(2000);
		WebElement up = DRIVER.findElement(By.xpath("//div[@class='branding']"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);
		js.executeScript("arguments[0].click()", up);
		TakesScreenshot t = (TakesScreenshot) DRIVER;
		File sou = t.getScreenshotAs(OutputType.FILE);
		File des = new File("/Users/macbook/Desktop/untitled\\ folder \\\name.png");
		FileUtils.copyFile(sou, des);
		WebElement user = DRIVER.findElement(By.id("email"));
		JavascriptExecutor j = (JavascriptExecutor) DRIVER;
		j.executeScript("arguments[0].setAttribute('value','9003052406')", user);
		Thread.sleep(2000);
		
	}
}
//
	//WebElement pass = DRIVER.findElement(By.id("pass"));
		//js.executeScript("arguments[0].setAttribute('value','kjhgvbnm')", pass);
		//WebElement se = DRIVER.findElement(By.xpath("(//strong[contains(text(),'1st Floor, ')])[2]"));
//String text = se.getText();
//System.out.println(text);