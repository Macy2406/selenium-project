package script.flip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.flip.BaseClass;

public class script extends BaseClass {

	@Test
	public void test() throws Throwable {
		launchBroswer("chrome");
		Implisit();
		launchUrl("https://www.flipkart.com/");
		WebElement find = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		Explisit(find);
		find.click();
		Header("men");
		SubHeader("casual shoes");
		screenShot("last");

	}

}
//GetData("test", 0, 0);
// WriteData("mine", 0, 0, "minesheet");
// UpdateData("mine", 0, 0, "eeeee");
// GetAllData("test");
/*
 * // Assert.assertEquals(find.getText(),"welcome");
 * 
 * @Test public void broswer() {
 * 
 * launchBroswer("chrome"); Implisit(); launchUrl("https://www.flipkart.com/");
 * WebElement find =
 * driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
 * Explisit(find); find.click(); Header("men"); SubHeader("casual shoes");
 * screenShot("last"); //Assert.assertEquals(find.getText(),"welcome");
 * //Assert.assertTrue(find.isEnabled());
 * //Assert.assertFalse(find.isEnabled()); Quit();
 * 
 * }
 */