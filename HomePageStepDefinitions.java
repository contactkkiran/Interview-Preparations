package com.tcm.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinitions {

	public WebDriver driver;

	@Given("^User navigates to SocVue Portal and logins with \"([^\"]*)\"$")
	public void User_navigates_to_SocVue_Portal_and_logins_with(String url)
			throws Throwable {
		System.out.println("#######r" + url);
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	@When("^User enters userEntersSearchCriteria \"([^\"]*)\"$")
	public void User_enters_userEntersSearchCriteria(String searchProduct)
			throws Throwable {
		driver.findElement(By.name("q")).sendKeys(searchProduct);
		Thread.sleep(1000);
	}

	@Then("^Clicks on OK button$")
	public void Clicks_on_OK_button() throws Throwable {

	}

	@When("^User selects the value from the suggestion dropdown$")
	public void User_selects_the_value_from_the_suggestion_dropdown()
			throws Throwable {
		String actualValue = driver.findElement(By.name("q")).getAttribute("value");
		Assert.assertEquals("Iphone5S", actualValue);
		driver.quit();

	}

}
