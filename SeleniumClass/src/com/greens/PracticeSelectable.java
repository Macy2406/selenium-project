package com.greens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeSelectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.xpath("//ol[@id='selectable']//following::li"));
		Actions ac =new Actions(driver);
		//ac.keyDown(Keys.CONTROL).click(list.get(0)).click(list.get(1)).click(list.get(2)).build().perform();
		ac.clickAndHold(list.get(0)).clickAndHold(list.get(1)).clickAndHold(list.get(2)).build().perform();
	}

}
