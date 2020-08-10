package com.greens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

		WebDriver DRIVER = new ChromeDriver();

		DRIVER.manage().window().maximize();
		DRIVER.get("file:///Users/macbook/Desktop/web.html");
		Thread.sleep(2000);
		//DRIVER.findElement(By.tagName("table")).findElement(By.tagName("tbody")).findElement(By.tagName("tr"));
//	to print table heading only	//List<WebElement> th = DRIVER.findElements(By.tagName("th"));
		//for(WebElement x : th) {
		//	System.out.println(x.getText());
		//}
		List<WebElement> tt = DRIVER.findElements(By.tagName("tr"));
		//for(WebElement x : tt) {
		//	List<WebElement> data = x.findElements(By.tagName("td"));
		//	for(WebElement x1 : data) {
		//		System.out.println(x1.getText());
		//	}
		//}
		//int size = tt.size();
		//System.out.println(size);
		for (int i = 1; i <= 3; i++) {
			List<WebElement> tab = tt.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < 2; j++) {
				System.out.println(tab.get(j).getText()	);
			}
		}
	}

}
