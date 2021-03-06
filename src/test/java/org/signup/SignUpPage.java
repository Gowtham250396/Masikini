package org.signup;

import java.awt.AWTException;
import java.util.List;

import org.baseclass.LibGlobal;
import org.loginpojo.CodePage;
import org.loginpojo.SignUpButton;
import org.loginpojo.SignUpDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectobjectmodel.POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpPage extends LibGlobal {

	POM pom;
	SignUpButton signUpButton;
	SignUpDetails signUpDetails;
	CodePage codePage;

	@Given("To launch the browser and click signup button")
	public void to_launch_the_browser_and_click_signup_button() {
		chromeBrowser();
		maxBrowser();
		launchURL("https://www.masikini.com/");
		implicitWait();
		POM pom = POM.getInstance();
		signUpButton = pom.getSignUpButton();
		signUpDetails = pom.getSignUpDetails();
		codePage = pom.getCodePage();
	}

	@When("To enter the Details in the Signup page")
	public void to_enter_the_Details_in_the_Signup_page() {
		signUpButton.getBtnSignUp().click();
		signUpButton.getBtnCreateAccount().click();
		signUpDetails.getTxtFirstName().sendKeys("Gowtham");
		signUpDetails.getTxtLastName().sendKeys("Nithish");
		signUpDetails.getTxtSignUpEmail().sendKeys("mgowthamnithish@gmail.com");
		signUpDetails.getTxtSignUpPassword().sendKeys("Gowtham@25");
		signUpDetails.getTxtConfirmPasword().sendKeys("Gowtham@25");
		signUpDetails.getBtnContinue().click();

	}

	@When("To enter the verification code")
	public void to_enter_the_verification_code() throws AWTException, InterruptedException {
		Thread.sleep(5000);
		codePage.getBtnCountryCode().click();
		List<WebElement> Countryname = codePage.getCountry().findElements(By.xpath("//li[@class='country']"));
		for (int i = 0; i < Countryname.size(); i++) {
			String text = Countryname.get(i).getText();
			if (text.contains("+91")) {
				Countryname.get(i).click();
			}
		}
			codePage.getTxtPhoneNumber().sendKeys("8110014035");
			codePage.getBtnGetCode().click();
			Thread.sleep(15000);
			codePage.getTxtPin1().sendKeys("9");
			codePage.getTxtPin2().sendKeys("0");
			codePage.getTxtPin3().sendKeys("5");
			codePage.getTxtPin4().sendKeys("7");
			codePage.getTxtPin5().sendKeys("7");
			codePage.getTxtPin6().sendKeys("3");
			codePage.getBtnDone().click();
		

	}

	@Then("To click the Done button and check the home page is loaded or not")
	public void to_click_the_Done_button_and_check_the_home_page_is_loaded_or_not() {

	}

}
