package com.amazon.stepDefinations;

import com.amazon.Base.BaseStep;
import com.amazon.registrationPage.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStep extends BaseStep {
	RegistrationPage rp;

	@Given("user open browser {string} and give url {string} to open application")
	public void userOpenBrowserAndGiveUrlToOpenApplication(String browser, String url) {
		openApp(browser, url);
	}
	@Given("user click <account button> and <carteaccount button> to put valid information")
	public void userClickAccountButtonAndCarteaccountButtonToPutValidInformation() {
		rp = new RegistrationPage(driver);
		rp.accountMethod();
		rp.createAccountMethod();
	}
	@When("user enter {string} in yournamefield")
	public void userEnterInYournamefield(String enterName) {
		rp.nameMethod(enterName);
	}
	@When("user enter {string} in emailfield")
	public void userEnterInEmailfield(String enterEmail) {
		rp.emailMethod(enterEmail);
	}
	@When("user enter {string} in passwordfield")
	public void userEnterInPasswordfield(String enterPassword) {
		rp.passwordMethpd(enterPassword);
	}
	@When("user enter {string} in confirmpasswordfield")
	public void userEnterInConfirmpasswordfield(String reenterpassword) {
		rp.reenterpasswordMethpd(reenterpassword);
	}
	@When("user click the create account button")
	public void userClickTheCreateAccountButton() {
		//rp.continueButtonMethod();
	}
	@Then("user close the application")
	public void userCloseTheApplication() {
		closeApp();
	}




}
