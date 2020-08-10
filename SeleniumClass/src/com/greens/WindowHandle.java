package com.greens;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

		WebDriver DRIVER = new ChromeDriver();

		DRIVER.manage().window().maximize();
		DRIVER.get("https://www.snapdeal.com/");
		Thread.sleep(2000);
		//String parent = DRIVER.getWindowHandle();
		WebElement sear = DRIVER.findElement(By.id("inputValEnter"));
		sear.sendKeys("iphone");
		Thread.sleep(2000);
		WebElement searc = DRIVER.findElement(By.className("searchTextSpan"));
		searc.click();
		WebElement pho = DRIVER.findElement(By.xpath("(//img[@class='product-image '])[1]"));
		pho.click();
		Set<String> all = DRIVER.getWindowHandles();
		List<String> l =new ArrayList<String>(all);
		DRIVER.switchTo().window(l.get(1));
		//for(String x : all) {
		//	if(!parent.equals(x)) {
		//		DRIVER.switchTo().window(x);
		//	}
		//}
		Thread.sleep(2000);
		WebElement cli = DRIVER.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		cli.click();
	}

}
