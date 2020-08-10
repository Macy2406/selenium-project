package com.greens;

import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

		WebDriver DRIVER = new ChromeDriver();

		DRIVER.manage().window().maximize();
		DRIVER.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Thread.sleep(2000);
		//WebElement se = DRIVER.findElement(By.id("select-demo"));
		//Select s =new Select(se);
		//s.selectByIndex(4);
		//Thread.sleep(2000);
		//s.selectByIndex(3);
		//s.selectByValue("Wednesday");
		//s.selectByVisibleText("Wednesday");
		//List<WebElement> options = s.getOptions();
		//for(WebElement x : options) {
		//	System.out.println(x.getText());
		//for(int i=0;i<options.size();i++) {
		//	System.out.println(options.get(i).getText());
		//}
		DRIVER.close();
		DRIVER.quit();
		WebElement multi = DRIVER.findElement(By.id("multi-select"));
		Select s=new Select(multi);
		s.selectByIndex(1);
		s.selectByIndex(3);
		s.selectByIndex(5);
		Thread.sleep(2000);
		//WebElement f = s.getFirstSelectedOption();
		//System.out.println(f.getText());
		List<WebElement> all = s.getAllSelectedOptions();
		//for(WebElement x : all) {
		//	System.out.println(x.getText());
		//}
		//for(int i=0;i<all.size();i++) {
		//	System.out.println(all.get(i).getText());
		//}
		//boolean multiple = s.isMultiple();
		//System.out.println(multiple);
		//s.deselectByIndex(1);
		//s.deselectByValue("New York");
		//s.deselectByVisibleText("Texas");
		s.deselectAll();
	}
}
