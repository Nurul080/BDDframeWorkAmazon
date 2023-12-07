package com.amazon.stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	WebDriver driver;

	@Given("I open amazon application")
	public void iOpenAmazonApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}

	@Given("I click accountandlist button")
	public void iClickAccountandlistButton() {
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	}

	@When("I enter my valid email")
	public void iEnterMyValidEmail() {
		driver.findElement(By.name("email")).sendKeys("suvo@gamil.com");
	}

	@When("I click countinue button")
	public void iClickCountinueButton() {
		driver.findElement(By.id("continue")).click();
	}

	@When("I enter my valid password")
	public void iEnterMyValidPassword() {
		driver.findElement(By.id("ap_password")).sendKeys("s12345678");
	}

	@When("I click sing in button")
	public void iClickSingInButton() {
		driver.findElement(By.id("signInSubmit")).click();
	}

	@Then("I can loged in")
	public void iCanLogedIn() {
		driver.close();
	}

}
