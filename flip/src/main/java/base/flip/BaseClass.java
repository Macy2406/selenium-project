package base.flip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBroswer(String broswer) {
		try {
			if (broswer.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"/Users/macbook/eclipse-workspace/flip/Driver/chromedriver");
				driver = new ChromeDriver();

			} else if (broswer.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");

				driver = new ChromeDriver();

			} else {
				System.setProperty("webdriver.safari.driver",
						"/Users/macbook/eclipse-workspace/Sele3/Driver/Safari.app");

				driver = new SafariDriver();

			}
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void launchUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void Sendkeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void click(WebElement element) {
		try {
			Explisit(element);
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void screenShot(String name) {
		try {
			TakesScreenshot tk = (TakesScreenshot) driver;
			File Sour = tk.getScreenshotAs(OutputType.FILE);
			File Des = new File("/Users/macbook/eclipse-workspace/flip/Results" + name + ".png");
			FileUtils.copyFile(Sour, Des);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sleep() throws Exception {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void Mouseover(WebElement element) {
		try {
			Actions a = new Actions(driver);
			a.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void MouseClick(WebElement element) {
		try {
			Actions a = new Actions(driver);
			a.click(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void DoubleClick(WebElement element) {
		try {
			Actions a = new Actions(driver);
			a.doubleClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void RightClick(WebElement element) {
		try {
			Actions a = new Actions(driver);
			a.contextClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void Drag(WebElement drag, WebElement drop) {
		try {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(drag, drop).build().perform();
			// ac.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void MouseSendKey(WebElement element, String value) {
		try {
			Actions act = new Actions(driver);
			act.sendKeys(element, value).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void SigleAlert() {
		try {
			Alert a = driver.switchTo().alert();
			a.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void ConfirmAlert(String name) {
		try {
			Alert a = driver.switchTo().alert();
			if (name.equalsIgnoreCase("accept")) {
				a.accept();
			} else if (name.equalsIgnoreCase("dismiss")) {
				a.dismiss();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void PromtAlert(String name, String value) {
		try {
			Alert alert = driver.switchTo().alert();
			if (name.equals("accept")) {
				alert.sendKeys(value);
				alert.accept();
			} else if (name.equals("dismiss")) {
				alert.sendKeys(value);
				alert.dismiss();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void SelectBy(WebElement element, String option, String value) {
		try {
			Select s = new Select(element);
			if (option.equalsIgnoreCase("index")) {
				int x = Integer.parseInt(value);
				s.selectByIndex(x);
			} else if (option.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			} else if (option.equalsIgnoreCase("text")) {
				s.selectByVisibleText(value);
			} else if (option.equalsIgnoreCase("deindex")) {
				int y = Integer.parseInt(value);
				s.deselectByIndex(y);
			} else if (option.equalsIgnoreCase("devalue")) {
				s.deselectByValue(value);
			} else if (option.equalsIgnoreCase("detext")) {
				s.deselectByVisibleText(value);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getoption(WebElement element, String option) {
		try {
			Select s2 = new Select(element);
			if (option.equalsIgnoreCase("getoption")) {
				List<WebElement> options = s2.getOptions();
				for (WebElement all : options) {
					System.out.println(all.getText());
				}
			} else if (option.equalsIgnoreCase("getfirst")) {
				WebElement firstSelectedOption = s2.getFirstSelectedOption();
				System.out.println(firstSelectedOption.getText());
			} else if (option.equalsIgnoreCase("getall")) {
				List<WebElement> allSelectedOptions = s2.getAllSelectedOptions();
				for (WebElement x : allSelectedOptions) {
					System.out.println(x.getText());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void Deselectall(WebElement element) {
		try {
			Select s3 = new Select(element);
			s3.deselectAll();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void IsMultiple(WebElement element) {
		try {
			Select s4 = new Select(element);
			boolean multiple = s4.isMultiple();
			System.out.println(multiple);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void Scroll(WebElement element, String name) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			if (name.equalsIgnoreCase("down")) {
				js.executeScript("arguments[0].scrollIntoView(true)", element);
			} else if (name.equalsIgnoreCase("up")) {
				js.executeScript("arguments[0].scrollIntoView(false)", element);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void javaScriptClick(WebElement element) {
		try {
			JavascriptExecutor ja = (JavascriptExecutor) driver;
			ja.executeScript("arguments[0].click()", element);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void Navigate(String name) {
		try {
			if (name.equalsIgnoreCase("back")) {
				driver.navigate().back();
			} else if (name.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			} else if (name.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void NavigateTo(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void parentWindow() {
		try {

			String parents = driver.getWindowHandle();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void childWindow() {
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String string : windowHandles) {
				driver.switchTo().window(string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void multiWindow(String index) {
		try {
			int parseInt = Integer.parseInt(index);
			Set<String> multi = driver.getWindowHandles();
			List<String> l = new ArrayList<String>(multi);
			driver.switchTo().window(l.get(parseInt));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void windowsize() {
		try {
			int size = driver.getWindowHandles().size();
			System.out.println(size);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getUrl() {
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getTitle() {
		try {
			String title = driver.getTitle();
			System.out.println(title);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void Quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void defaultWindow() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getLocation(WebElement element) {
		try {
			Point xyaxis = element.getLocation();
			int x = xyaxis.getX();
			int y = xyaxis.getY();
			System.out.println("X axis is : " + x);
			System.out.println("Y axis is : " + y);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getSize(WebElement element) {
		try {
			Dimension size = element.getSize();
			int height = size.getHeight();
			int width = size.getWidth();
			System.out.println("Height is  : " + height);
			System.out.println("Width is : " + width);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void Header(String s) {
		try {
			List<WebElement> xy = driver.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
			for (WebElement y : xy) {
				if (s.equalsIgnoreCase(y.getText())) {
					Mouseover(y);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void SubHeader(String s1) {
		try {

			List<WebElement> findElements = driver.findElements(
					By.xpath("//span[@class='_1QZ6fC _3Lgyp8']//following::ul[@class='_2OZ78M _1fj2FQ']"));
			for (WebElement x : findElements) {
				if (s1.equalsIgnoreCase(x.getText())) {
					x.click();
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void Implisit() {
		try {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void Explisit(WebElement element) {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 60);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String GetData(String sheetname, int row, int cell) throws Throwable {

		File f = new File("/Users/macbook/eclipse-workspace/flip/Data/Book1.xlsx");

		FileInputStream f1 = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(f1);

		Sheet s = w.getSheet(sheetname);

		Row r = s.getRow(row);

		Cell c = r.getCell(cell);

		CellType ct = c.getCellType();

		String value = null;

		switch (ct) {

		case NUMERIC:

			double x = c.getNumericCellValue();

			long l = (long) x;

			value = String.valueOf(l);

			System.out.println(value);

			break;

		case STRING:

			value = c.getStringCellValue();

			System.out.println(value);

			break;

		}
		return value;

	}

	public static String WriteData(String sheetname, int row, int cell, String setvalue) throws Throwable {

		File f = new File("/Users/macbook/eclipse-workspace/flip/Data/Book1.xlsx");

		FileInputStream f1 = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(f1);

		Sheet s = w.createSheet(sheetname);

		Row r = s.createRow(row);

		Cell c = r.createCell(cell);

		c.setCellValue(setvalue);

		FileOutputStream f2 = new FileOutputStream(f);

		w.write(f2);

		w.close();

		System.out.println(setvalue);

		return setvalue;

	}

	public static String UpdateData(String sheetname, int row, int cell, String value) throws Throwable {

		File f = new File("/Users/macbook/eclipse-workspace/flip/Data/Book1.xlsx");

		FileInputStream f1 = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(f1);

		Sheet s = w.getSheet(sheetname);

		Row r = s.getRow(row);

		Cell c = r.getCell(cell);

		c.setCellValue(value);

		FileOutputStream f2 = new FileOutputStream(f);

		w.write(f2);

		w.close();

		System.out.println(value);

		return value;

	}

	public static void GetAllData(String sheetname) throws Throwable {

		File f = new File("/Users/macbook/eclipse-workspace/flip/Data/Book1.xlsx");

		FileInputStream f1 = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(f1);

		Sheet s = w.getSheet(sheetname);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {

				Cell c = r.getCell(j);

				CellType c1 = c.getCellType();

				String value = null;

				switch (c1) {

				case STRING:

					value = c.getStringCellValue();

					System.out.println(value);

					break;

				case NUMERIC:

					double n = c.getNumericCellValue();

					long l = (long) n;

					value = String.valueOf(l);

					System.out.println(value);

					break;
				}
			}
		}

	}

}
