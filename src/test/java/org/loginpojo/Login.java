package org.loginpojo;

import org.baseclass.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends LibGlobal {
	public Login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='LOGIN']")
	private WebElement btnLogin;

	@FindBy(id = "Lemail")
	private WebElement txtUserName;

	@FindBy(id = "Lpass")
	private WebElement txtPassword;

	@FindBy(xpath = "//a[text()='Reset it']")
	private WebElement btnResetIt;

	@FindBy(xpath = "//button[text()='Login']")
	private WebElement btnLoginPopUp;

	@FindBy(xpath = "//button[text()='FACEBOOK']")
	private WebElement btnOnClickFacebook;

	@FindBy(xpath = "//button[@onclick='sugnInWithGoogle()']")
	private WebElement btnOnClickGoogle;

	@FindBy(xpath = "//button[text()='SIGNUP NOW']")
	private WebElement btnOnClickSignUpNow;

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnResetIt() {
		return btnResetIt;
	}

	public WebElement getBtnLoginPopUp() {
		return btnLoginPopUp;
	}

	public WebElement getBtnOnClickFacebook() {
		return btnOnClickFacebook;
	}

	public WebElement getBtnOnClickGoogle() {
		return btnOnClickGoogle;
	}

	public WebElement getBtnOnClickSignUpNow() {
		return btnOnClickSignUpNow;
	}
}
