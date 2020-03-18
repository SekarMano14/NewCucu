package org.Locators;

import org.functinoalLibrary.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJOClass extends BaseClass {
	public LoginPOJOClass() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement user;

	@FindBy(id = "pass")
	private WebElement pass;

	@FindBy(id = "loginbutton")
	private WebElement btnLogin;

	@FindBy(name = "firstname")
	private WebElement fName;

	@FindBy(name = "lastname")
	private WebElement lName;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	
}
