package com.greens;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement axis = driver.findElement(By.id("position"));
		Point xyaxis = axis.getLocation();
		int x = xyaxis.getX();
		int y = xyaxis.getY();
		System.out.println("X axis is  : " + x + " & Y axis is : " + y);
		WebElement color = driver.findElement(By.id("color"));
		String cssValue = color.getCssValue("background-color");
		System.out.println("Button Color is : " + cssValue);
		WebElement size = driver.findElement(By.id("size"));
		Dimension size2 = size.getSize();
        int height = size2.getHeight();
        int width = size2.getWidth();
        System.out.println("Height is : " +height +"  &  Width is  :" + width);
        driver.findElement(By.id("home")).click();
	}

}

