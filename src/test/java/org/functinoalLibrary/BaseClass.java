package org.functinoalLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Mano\\My WorkSpace\\JUnit\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void launchFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\Mano\\My WorkSpace\\JUnit\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	public static void launchieBrowser() {
		System.setProperty("webdriver.ie.driver", "E:\\Mano\\My WorkSpace\\JUnit\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void quit() {
		driver.quit();
	}

	public static void fill(WebElement e, String s) {
		e.sendKeys(s);
	}

	public static void btnClick(WebElement e) {
		e.click();
	}

	public static void sbv(WebElement e, String name) {
		new Select(e).selectByValue(name);
	}

}
