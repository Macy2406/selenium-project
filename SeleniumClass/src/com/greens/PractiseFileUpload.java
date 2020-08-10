package com.greens;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseFileUpload {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		driver.manage().window().maximize();
		WebElement down = driver.findElement(By.linkText("Download Excel"));
		down.click();
		Thread.sleep(3000);
		File f =new File("/Users/macbook/Downloads");
		File[] listFile = f.listFiles();
		for (File file : listFile) {
			if(file.getName().equals("testleaf.xlsx")) {
				System.out.println("File Is Downloaded");
				break;
			}
		}

	}

}
