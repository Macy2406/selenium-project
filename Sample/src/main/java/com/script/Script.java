package com.script;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import functionallibrary.BaseClass;
import pom.Homepage;

public class Script extends BaseClass {

	@Test
	public void launch() throws Exception {

		launchBroswer("chrome");
		launchUrl("https://www.facebook.com/");
		sleep();
		PageFactory.initElements(driver, Homepage.class);
		Homepage.id(driver).sendKeys("987654");
	}

	@Test
	public void second() throws Exception {
		Homepage.pass.sendKeys("098765432");
		sleep();
	}

	@AfterClass
	public static void clos() {
		Quit();

	}
}
