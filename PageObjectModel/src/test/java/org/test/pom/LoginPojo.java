package org.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtEmail;
	@FindBy(id = "pass")
	private WebElement txtPass;
	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement btnClick;
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnClick() {
		return btnClick;
	}

}
