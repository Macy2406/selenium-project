package com.greens;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBroswer(String broswer) {
		try {
			if (broswer.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"/Users/macbook/eclipse-workspace/SeleniumClass/Driver/chromedriver");
				driver = new ChromeDriver();

			} else if (broswer.equals("firefix")) {
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

	public static void enterText(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void screenShot(String name) {
		try {
			TakesScreenshot tk = (TakesScreenshot) driver;
			File Sour = tk.getScreenshotAs(OutputType.FILE);
			File Des = new File("/Users/macbook/eclipse-workspace/SeleniumClass/Result" + name + ".png");
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

	public static void Mouse(WebElement element, String name) {
		try {
			Actions a = new Actions(driver);
			if (name.equals("move")) {
				a.moveToElement(element).build().perform();
			} else if (name.equals("click")) {
				a.click(element).build().perform();
			} else if (name.equals("Double")) {
				a.doubleClick(element).build().perform();
			} else if (name.equals("right")) {
				a.contextClick(element).build().perform();
			}
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

	public static void Alert(String name) {
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

	public static void javaScriptSend(WebElement element, String sendkey) {
		try {
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].setAttribute('value','sendkey')", element);
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
			String parent = driver.getWindowHandle();

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
}
