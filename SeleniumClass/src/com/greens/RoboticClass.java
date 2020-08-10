package com.greens;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RoboticClass {
	public static void main(String[] args) throws AWTException, Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

		WebDriver DRIVER = new ChromeDriver();

		DRIVER.manage().window().maximize();
		DRIVER.get("https://www.facebook.com/");

		Thread.sleep(2000);

		WebElement emi = DRIVER.findElement(By.id("email"));
		emi.sendKeys("9003052406");
		Thread.sleep(2000);
		emi.sendKeys(Keys.chord(Keys.COMMAND, "c"));
		Thread.sleep(2000);

		WebElement pass = DRIVER.findElement(By.id("pass"));
		pass.sendKeys(Keys.chord(Keys.COMMAND, "v"));

		//WebElement findElement = DRIVER.findElement(By.id("u_0_b"));
		//findElement.click();
		Robot r =new Robot(); Thread.sleep(3000);
		//KeyStroke.getKeyStroke(KeyEvent.VK_C);

	}
}

/*
 * WebElement img = DRIVER.findElement(By.xpath(
 * "//img[@src='https://n2.sdlcdn.com/image/upload/h_258,w_220/Hot-Sale-Unique-Alloy-Key-SDL776195715-1-d5632.jpg']"
 * )); Actions ac =new Actions(DRIVER); ac.contextClick(img).build().perform();
 * Thread.sleep(6000); 
 * r.keyPress(KeyEvent.VK_DOWN); System.out.println("a");
 * r.keyRelease(KeyEvent.VK_DOWN); System.out.println("b"); Thread.sleep(2000);
 * r.keyPress(KeyEvent.VK_DOWN); System.out.println("c");
 * r.keyRelease(KeyEvent.VK_DOWN); System.out.println("d"); Thread.sleep(2000);
 * r.keyPress(KeyEvent.VK_ENTER); System.out.println("e");
 * r.keyRelease(KeyEvent.VK_ENTER); } }
 */
//
//WebElement con = DRIVER.findElement(By.xpath("//a[text()='CONTACT US']"));
//ac.moveToElement(con).build().perform();
//ac.contextClick().build().perform();
//Robot r = new Robot();
//r.keyPress(KeyEvent.VK_DOWN);
//Thread.sleep(5000); 
//  r.keyRelease(KeyEvent.VK_DOWN);
//Thread.sleep(5000);
//r.keyPress(KeyEvent.VK_DOWN);
//Thread.sleep(5000); 
//r.keyRelease(KeyEvent.VK_DOWN);
//Thread.sleep(5000); 
//r.keyPress(KeyEvent.VK_ENTER);
//Thread.sleep(5000); 
///r.keyRelease(KeyEvent.VK_ENTER);
//Thread.sleep(5000); 