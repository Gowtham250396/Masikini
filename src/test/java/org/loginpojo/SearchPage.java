package org.loginpojo;

import java.util.List;

import org.baseclass.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends LibGlobal {
	
	public SearchPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@placeholder='Search products...'])[1]")
	private WebElement txtSearchBox;
	
	@FindBy(id="searchBtn")
	private WebElement btnSearch;
	
	@FindBy(xpath="//div[@class=\"title\"]")
	private List<WebElement> searchResults;
	
	@FindBy(tagName="price")
	private List<WebElement> price;
	
	@FindBy(xpath="//a[@onclick='addToCart()']")
	private WebElement btnAddToCart;
	
	@FindBy(xpath="//button[text()='CONTINUE SHOPPING']")
	private WebElement btnContinueShopping;
	
	public WebElement getBtnContinueShopping() {
		return btnContinueShopping;
	}

	public WebElement getBtnAddToCart() {
		return btnAddToCart;
	}

	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public List<WebElement> getSearchResults() {
		return searchResults;
	}

	public List<WebElement> getPrice() {
		return price;
	}
	
	

}
