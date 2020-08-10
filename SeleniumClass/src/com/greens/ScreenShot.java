package com.greens;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

		WebDriver DRIVER = new ChromeDriver();

		DRIVER.manage().window().maximize();
		DRIVER.get("https://www.amazon.in/");
		Thread.sleep(2000);
	//	String parent = DRIVER.getWindowHandle();
		WebElement sear = DRIVER.findElement(By.id("twotabsearchtextbox"));
		sear.sendKeys("iphone");
		Thread.sleep(2000);
		WebElement cli = DRIVER.findElement(By.className("nav-input"));
		cli.click();
		Thread.sleep(2000);
		WebElement ip = DRIVER.findElement(By.xpath("(//img[@class='s-image'])[6]"));
		ip.click();
		Thread.sleep(2000);
		Set<String> child=DRIVER.getWindowHandles();
		List<String> l =new ArrayList<String>(child);
		DRIVER.switchTo().window(l.get(1));
		Thread.sleep(2000);
		TakesScreenshot t = (TakesScreenshot) DRIVER;
		File sour=t.getScreenshotAs(OutputType.FILE);
		File des = new File("/Users/macbook/Desktop/untitled\\ folder\\name.png");
		FileUtils.copyFile(sour, des);
		DRIVER.findElement(By.xpath("(//span[text()='128 GB'])[2]")).click();
		
		//TakesScreenshot tk =(TakesScreenshot) DRIVER;
		//File so = tk.getScreenshotAs(OutputType.FILE);
		//File des = new File("/Users/macbook/Desktop/untitled\\ folder/untitled\\ folder \\name.png");
		//FileUtils.copyFile(so, des);
		
	}
}
//Users/macbook/Desktop
//Users/macbook/Desktop/untitled\ folder 
//Users/macbook/Desktop/untitled\ folder/untitled\ folder 