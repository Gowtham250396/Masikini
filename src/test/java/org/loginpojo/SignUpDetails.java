package org.loginpojo;

import org.baseclass.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpDetails extends LibGlobal{
	
	public SignUpDetails() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstname")
	private WebElement  txtFirstName;
	
	@FindBy(id="lastname")
	private WebElement txtLastName;
	
	@FindBy(id="semail")
	private WebElement txtSignUpEmail;
	
	@FindBy(id="spass")
	private WebElement txtSignUpPassword;
	
	@FindBy(id="cspass")
	private WebElement txtConfirmPasword;
	
	@FindBy(id="continueBtn")
	private WebElement btnContinue;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtSignUpEmail() {
		return txtSignUpEmail;
	}

	public WebElement getTxtSignUpPassword() {
		return txtSignUpPassword;
	}

	public WebElement getTxtConfirmPasword() {
		return txtConfirmPasword;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

}
