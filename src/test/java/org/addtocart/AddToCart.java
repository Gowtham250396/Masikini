package org.addtocart;

import java.util.concurrent.TimeUnit;

import org.baseclass.LibGlobal;
import org.loginpojo.Login;
import org.loginpojo.SearchPage;
import org.projectobjectmodel.POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCart extends LibGlobal {
	POM pom;
	Login login;
	SearchPage searchPage;

	@Given("To Launch a browser and login in to a product")
	public void to_Launch_a_browser_and_login_in_to_a_product() {
		chromeBrowser();

		launchURL("https://www.masikini.com/");
		//maxBrowser();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		pom = POM.getInstance();
		login = pom.getLogin();
		searchPage = pom.getSearchPage();
		login.getBtnLogin().click();
		login.getTxtUserName().sendKeys("mgowthamnithish@gmail.com");
		login.getTxtPassword().sendKeys("Gowtham@25");
		login.getBtnLoginPopUp().click();

	}

	@When("To Search a {string} and add the {int}product to the cart")
	public void to_Search_a_and_add_the_product_to_the_cart(String string, Integer i) throws InterruptedException {
		Thread.sleep(7000);
		searchPage.getTxtSearchBox().sendKeys(string);
		searchPage.getBtnSearch().click();
		searchPage.getSearchResults().get(i).click();
		// System.out.println(searchPage.getPrice().get(i).getText());
		Thread.sleep(15000);
		searchPage.getBtnAddToCart().click();

	}

	@Then("To verify whether the product is added to the cart")
	public void to_verify_whether_the_product_is_added_to_the_cart() throws InterruptedException {
		try {
			Thread.sleep(3000);
			searchPage.getBtnContinueShopping().click();
		} finally {
			logout();
		}

	}
}
