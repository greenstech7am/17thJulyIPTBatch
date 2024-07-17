package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

import io.cucumber.java.en.*;

public class LoginStepDefinition extends BaseClass{
	
	@Given("User should open the browser and lauch the url")
	public void user_should_open_the_browser_and_lauch_the_url() {
		launchChrome();
		winMax();
		loadUrl("https://www.facebook.com");   
	}
	@When("User should enter invalid username and invalid password")
	public void user_should_enter_invalid_username_and_invalid_password() {
		
		
		LoginPojo l = new LoginPojo();
		WebElement txtUser = l.getTxtUser();
		txtUser.sendKeys("Smart");
		
		WebElement txtPass = l.getTxtPass();
		txtPass.sendKeys("Smart@123");
	
	}
	
	@When("User should click login button")
	public void user_should_click_login_button() throws InterruptedException {
		
		
		LoginPojo l = new LoginPojo();
		WebElement btnLogin = l.getBtnLogin();
		btnLogin.click();
		Thread.sleep(4000);
	
	}
	@Then("Validate user should navigate to incorrect credential page")
	public void validate_user_should_navigate_to_incorrect_credential_page() {
	
		String actualUrl = driver.getCurrentUrl();
		
		
		Assert.assertTrue(actualUrl.contains("privacy"));  // True --Pass, False ---> Fail
		
		
	}
	
	@When("User should get the title of the page")
	public void user_should_get_the_title_of_the_page() {
		
		System.out.println(driver.getTitle());
	
	}
	
	@When("User should get the current url of the page")
	public void userShouldGetTheCurrentUrlOfThePage() {
		System.out.println(driver.getCurrentUrl());
	}
	
	
	@When("User should enter valid username and invalid password")
	public void userShouldEnterValidUsernameAndInvalidPassword() {
		
		
		LoginPojo l = new LoginPojo();
		WebElement txtUser = l.getTxtUser();
		txtUser.sendKeys("Greens");
		
		WebElement txtPass = l.getTxtPass();
		txtPass.sendKeys("Greens@123");
	    
	}
	
	@When("User should enter valid username {string} and invalid password {string}")
	public void userShouldEnterValidUsernameAndInvalidPassword(String s1, String s2) {
		
		
		LoginPojo l = new LoginPojo();
		WebElement txtUser = l.getTxtUser();
		txtUser.sendKeys(s1);
		
		WebElement txtPass = l.getTxtPass();
		txtPass.sendKeys(s2);
	    
	}
	
	@When("User should enter invalid username and invalid Password")
	public void userShouldEnterInvalidUsernameAndInvalidPassword(io.cucumber.datatable.DataTable d) {
		
		
		//2D map ---> With Header
			List<Map<String, String>> li = d.asMaps();
			String userName = li.get(0).get("Movie");
			String password = li.get(2).get("Comedy");
			
			
		
			
		LoginPojo l = new LoginPojo();
		WebElement txtUser = l.getTxtUser();
		txtUser.sendKeys(userName);
		
		WebElement txtPass = l.getTxtPass();
		txtPass.sendKeys(password);
	}

	

	





}
