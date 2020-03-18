package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.Locators.LoginPOJOClass;
import org.functinoalLibrary.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {
	LoginPOJOClass l;

	@Given("The user in FB page")
	public void the_user_in_FB_page() {
		
	}

	@When("The user enter the {string} and {string} datas")
	public void the_user_enter_the_and_datas(String s1, String s2) {
		l = new LoginPOJOClass();
		fill(l.getUser(), s1);
		fill(l.getPass(), s2);

	}

	@When("The user click the login button")
	public void the_user_click_the_login_button() {
		btnClick(l.getBtnLogin());
	}

	@Then("The user  navigate to next page")
	public void the_user_navigate_to_next_page() {
		System.out.println("User navigate to next page succesfully");
	}

	@When("The user enter the {string} and {string} details")
	public void the_user_enter_the_and_details(String s3, String s4) {
		l = new LoginPOJOClass();
		fill(l.getfName(), s3);
		fill(l.getlName(), s4);

	}

	@Then("the user Registered successfully")
	public void the_user_Registered_successfully() {
		System.out.println("User register succesfully");
	}
}
 