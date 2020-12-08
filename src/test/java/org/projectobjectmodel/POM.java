package org.projectobjectmodel;

import org.loginpojo.CodePage;
import org.loginpojo.Login;
import org.loginpojo.SearchPage;
import org.loginpojo.SignUpButton;
import org.loginpojo.SignUpDetails;

public class POM {

	private static CodePage codePage;
	private static SignUpButton signUpButton;
	private static SignUpDetails signUpDetails;
	private static POM pom;
	private static Login login;
	private static SearchPage searchPage;
	
	public Login getLogin() {
		return(login==null)? login=new Login():login;
	}



	public  SearchPage getSearchPage() {
		return(searchPage==null)? searchPage=new SearchPage():searchPage;
	}

	
	
	private POM() {

	}

	

	public static  POM getInstance() {

		return (pom == null) ? pom = new POM() : pom;

	}

	public  CodePage getCodePage() {
		
		return (codePage==null)? codePage=new CodePage(): codePage;
	}

	public SignUpButton getSignUpButton() {
		return (signUpButton==null)? signUpButton=new SignUpButton(): signUpButton;
	}

	public SignUpDetails getSignUpDetails() {
		return (signUpDetails==null)? signUpDetails=new SignUpDetails(): signUpDetails;
	}

}
