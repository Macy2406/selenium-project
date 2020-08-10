package com.greens;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		Thread.sleep(2000);
		WebElement promt = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		promt.click();
		Thread.sleep(2000);
		//Alert a = driver.switchTo().alert();
		//a.accept();
		//WebElement fr = DRIVER.findElement(By.xpath("//frame[@name='login_page']"));
		//DRIVER.switchTo().frame(fr);
		//WebElement fi = DRIVER.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		//fi.sendKeys("09876");
		//Thread.sleep(2000);
		//DRIVER.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
		//Thread.sleep(2000);
		//DRIVER.findElement(By.xpath("(//input[@class='input_password'])[2]")).sendKeys("09876");
	/*	WebElement tab = DRIVER.findElement(By.xpath("//iframe[@src='http://www.youtube.com/embed/ytqbpfoqGSA?wmode=transparent']"));
		DRIVER.switchTo().frame(tab);
		DRIVER.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
		Alert c = DRIVER.switchTo().alert();
		c.sendKeys("Kumar.M");
		Thread.sleep(4000);
		c.accept();*/
	}

}

//Thread.sleep(2000);
//WebElement con = DRIVER.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//con.click();
//Thread.sleep(2000);
//DRIVER.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//Thread.sleep(2000);
//Alert b = DRIVER.switchTo().alert();
//b.dismiss();
//Thread.sleep(2000);
//DRIVER.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
//Thread.sleep(2000);
//DRIVER.findElement(By.xpath("//button[@class='btn btn-info']")).click();
//Thread.sleep(2000);
//