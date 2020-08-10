package com.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PractiseImage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		WebElement img = driver.findElement(By.xpath("//img[@src='../images/home.png']"));
		img.click();
		WebElement lin = driver.findElement(By.linkText("Image"));
		lin.click();
		WebElement ima2 = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		if(ima2.getAttribute("naturalWidth").equals("0")) {
			System.out.println("This Image Is Broken");
		}else {
			System.out.println("This Image Not Broken");
		}
		Thread.sleep(3000);
		WebElement last = driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
		Actions a =new Actions(driver);
		a.moveToElement(last).build().perform();
		a.click(last).build().perform();
	}

}
