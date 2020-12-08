package org.logincredentials;

import org.baseclass.LibGlobal;
import org.junit.Assert;
import org.loginpojo.Login;
import org.projectobjectmodel.POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserName extends LibGlobal {

	POM pom;
	Login login;

	@Given("To launch the browser and enter the url")
	public void to_launch_the_browser_and_enter_the_url() {
		chromeBrowser();
		maxBrowser();
		launchURL("https://www.masikini.com/");
		implicitWait();

	}

	@Given("Click login button")
	public void click_login_button() {
		 pom = POM.getInstance();
		 login = pom.getLogin();
	}

	@When("To enter the valid username and password")
	public void to_enter_the_valid_username_and_password() {
		login.getTxtUserName().sendKeys("mgowthamnithish@gmail.com");
		login.getTxtPassword().sendKeys("Gowtham@25");
	}

	@When("TO click the login button")
	public void to_click_the_login_button() {
		login.getBtnLoginPopUp().click();
	}

	@Then("verify whether the home page is displayed")
	public void verify_whether_the_home_page_is_displayed() {
		Assert.assertEquals("Invalid Credentials", "https://www.masikini.com/", driver.getCurrentUrl());
		
	}

}
