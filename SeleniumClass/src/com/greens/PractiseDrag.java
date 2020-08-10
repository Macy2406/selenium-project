package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PractiseDrag {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions ac =new Actions(driver);
		//ac.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		ac.dragAndDrop(drag, drop).build().perform();

	}

}
