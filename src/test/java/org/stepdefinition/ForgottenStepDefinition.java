package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;

public class ForgottenStepDefinition extends BaseClass{

	
	@Given("User should launch chrome and open url")
	public void userShouldLaunchChromeAndOpenUrl() {
		launchChrome();
		winMax();
		loadUrl("https://www.facebook.com");   
	}

	@When("User should click the forgotten password link")
	public void userShouldClickTheForgottenPasswordLink() {
	    driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

	@When("User should enter invalid mobile number")
	public void userShouldEnterInvalidMobileNumber() {
	  driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("1234567890");
	}

	@When("User should click the search button")
	public void userShouldClickTheSearchButton() {
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User should navigate to password reset page")
	public void userShouldNavigateToPasswordResetPage() {
	String actual = driver.getTitle();
	
	
	Assert.assertTrue(actual.contains("Forgotten"));
	
	System.out.println("Pass");
	}

	
}
