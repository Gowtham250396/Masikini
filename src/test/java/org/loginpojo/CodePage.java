package org.loginpojo;

import java.util.List;

import org.baseclass.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CodePage extends LibGlobal {

	public CodePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Vemail")
	private WebElement radioBtnEmail;

	@FindBy(id = "Vphone")
	private WebElement radioBtnPhone;

	@FindBy(id = "getCode")
	private WebElement btnGetCode;
	
	@FindBy(id = "Vphonenumber")
	private WebElement txtPhoneNumber;

	@FindBy(xpath = "//div[@role='combobox']")
	private WebElement btnCountryCode;

	@FindBy(id = "//span[@class='country-name']")
	private List<WebElement> selectCountry;

	@FindBy(id = "pin1")
	private WebElement txtPin1;

	@FindBy(id = "pin2")
	private WebElement txtPin2;

	@FindBy(id = "pin3")
	private WebElement txtPin3;

	@FindBy(id = "pin4")
	private WebElement txtPin4;

	@FindBy(id = "pin5")
	private WebElement txtPin5;

	@FindBy(id = "pin6")
	private WebElement txtPin6;

	@FindBy(id = "pinDone")
	private WebElement btnDone;

	public WebElement getRadioBtnEmail() {
		return radioBtnEmail;
	}

	public WebElement getRadioBtnPhone() {
		return radioBtnPhone;
	}
	
	public WebElement getTxtPhoneNumber() {
		return txtPhoneNumber;
	}

	public WebElement getBtnGetCode() {
		return btnGetCode;
	}

	public WebElement getBtnCountryCode() {
		return btnCountryCode;
	}

	public List<WebElement> getSelectCountry() {
		return selectCountry;
	}

	public WebElement getTxtPin1() {
		return txtPin1;
	}

	public WebElement getTxtPin2() {
		return txtPin2;
	}

	public WebElement getTxtPin3() {
		return txtPin3;
	}

	public WebElement getTxtPin4() {
		return txtPin4;
	}

	public WebElement getTxtPin5() {
		return txtPin5;
	}

	public WebElement getTxtPin6() {
		return txtPin6;
	}

	public WebElement getBtnDone() {
		return btnDone;
	}

}
