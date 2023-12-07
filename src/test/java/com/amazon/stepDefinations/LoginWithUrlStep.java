package com.amazon.stepDefinations;

import com.amazon.Base.BaseStep;
import com.amazon.loginpages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithUrlStep extends BaseStep {
	LoginPage lp;

	@Given("user open browser {string} and enter url {string}")
	public void userOpenBrowserAndEnterUrl(String browser, String url) {
		openApp(browser, url);
	}

	@Given("user click accountandlist button")
	public void userClickAccountandlistButton() {
		lp = new LoginPage(driver);
		lp.accountMethod();
	}

	@When("user enter email {string}")
	public void userEnterEmail(String enterEmail) {
		lp.emailMethod(enterEmail);
	}

	@When("user click countinu button")
	public void userClickCountinuButton() {
		lp.continueButtonMethod();
	}

	@When("user enter password {string}")
	public void userEnterPassword(String enterPassword) {
		lp.passwordMethpd(enterPassword);
	}

	@When("user click on sing in button")
	public void userClickOnSingInButton() {
		// lp.signInMethod();

	}

	@Then("user logged in amazon")
	public void userLoggedInAmazon() {
		closeApp();
	}

}
