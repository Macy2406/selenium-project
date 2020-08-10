package com.greens;

import org.openqa.selenium.By;

public class BaseClassdropdown extends BaseClass {

	public static void main(String[] args) throws Exception {

		launchBroswer("chrome");
		launchUrl("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		sleep();
		SelectBy(driver.findElement(By.id("select-demo")), "index", "2");
		SelectBy(driver.findElement(By.id("select-demo")),"value","Tuesday");
		SelectBy(driver.findElement(By.id("select-demo")), "text", "Wednesday");
		SelectBy(driver.findElement(By.id("multi-select")), "index", "0");
		SelectBy(driver.findElement(By.id("multi-select")), "index", "1");
		SelectBy(driver.findElement(By.id("multi-select")), "index", "2");
		SelectBy(driver.findElement(By.id("multi-select")), "index", "5");
		//SelectBy(driver.findElement(By.id("multi-select")), "devalue", "Florida");
		getoption(driver.findElement(By.id("multi-select")), "getoption");
		System.out.println("========getfirst=====");
		getoption(driver.findElement(By.id("multi-select")), "getfirst");
		System.out.println("========getall=====");
		getoption(driver.findElement(By.id("multi-select")), "getall");
		IsMultiple(driver.findElement(By.id("multi-select")));
		Deselectall(driver.findElement(By.id("multi-select")));
	}
}
