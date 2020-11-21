package org.projectobjectmodel;

import org.loginpojo.CodePage;
import org.loginpojo.SignUpButton;
import org.loginpojo.SignUpDetails;

public class POM {

	private static CodePage codePage;
	private static SignUpButton signUpButton;
	private static SignUpDetails signUpDetails;
	private static POM pom;

	private POM() {

	}

	public static POM getInstance() {

		return (pom == null) ? pom = new POM() : pom;

	}

	public static CodePage getCodePage() {
		
		return (codePage==null)? codePage=new CodePage(): codePage;
	}

	public static SignUpButton getSignUpButton() {
		return (signUpButton==null)? signUpButton=new SignUpButton(): signUpButton;
	}

	public static SignUpDetails getSignUpDetails() {
		return (signUpDetails==null)? signUpDetails=new SignUpDetails(): signUpDetails;
	}

}
