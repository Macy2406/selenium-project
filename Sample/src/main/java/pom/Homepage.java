package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionallibrary.BaseClass;

public class Homepage extends BaseClass {

	

	@FindBy(id = "pass")
	public static WebElement pass;

	public static WebElement id(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}

}