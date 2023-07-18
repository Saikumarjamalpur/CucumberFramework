package testcases;

import org.openqa.selenium.By;

import core.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleTest extends Page
{
	@Given("^I went to (.*)")
	public void i_went_to(String url) 
	{
	    openBrowser("chrome",url);
	}
	@When("^I search the (.*)")
	public void i_search_the(String product) 
	{
		driver.findElement(By.name("q")).sendKeys(product);
	    	}
	@Then("result must come")
	public void result_must_come() 
	{
	    System.out.println("ok");
	}




}
