package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.functinoalLibrary.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	@Before
	public void before() {
		launchChromeBrowser();
		loadUrl("http:\\www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}
	@Before("@Smoke")
	public void before2() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


	}

	@After
	public void after() {
		driver.quit();

	}

}
