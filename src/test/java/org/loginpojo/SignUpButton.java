package org.loginpojo;

import org.baseclass.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpButton extends LibGlobal{
	
	public SignUpButton() {
		 PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='SIGN UP']")
	private WebElement btnSignUp;
	
	@FindBy(xpath="//button[text()='CREATE MASIKINI ACCOUNT']")
	private WebElement btnCreateAccount;
	
	@FindBy(xpath="//button[@onclick='signUpWithFB()']")
	private WebElement btnSignUpWithFacebook;
	
	@FindBy(xpath="//button[@onclick='sugnUpWithGoogle()']")
	private WebElement btnSignUpWithGoogle;
	
	@FindBy(xpath="//a[text()='LOGIN NOW']")
	private WebElement btnLoginSignUp;

	public WebElement getBtnSignUp() {
		return btnSignUp;
	}

	public WebElement getBtnCreateAccount() {
		return btnCreateAccount;
	}

	public WebElement getBtnSignUpWithFacebook() {
		return btnSignUpWithFacebook;
	}

	public WebElement getBtnSignUpWithGoogle() {
		return btnSignUpWithGoogle;
	}

	public WebElement getBtnLoginSignUp() {
		return btnLoginSignUp;
	}
	
	

}
