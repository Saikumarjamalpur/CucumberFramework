package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

// step defination file
public class AmazonUid extends Page
{
	public static boolean flag;
	public  static WebElement pwd;
	
	public static WebDriver driver;
	
	@Given("browser {string} is open url is {string}")
	public void browser_is_open_url_is(String browser, String url) 
	{
	    openBrowser(browser,url);
	    this.driver = super.driver;
	}
	@Given("click on signin")
	public void click_on_signin()
	{
	    driver.findElement(By.xpath("//*[text() = 'Hello, sign in']")).click();
	}
	@When("enter valid userid {string}")
	public void enter_valid_userid(String uid) 
	{
	    driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(uid);
	}
	@When("click continue button")
	public void click_continue_button() 
	{
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	 }
	
	@Then("password textbox must come")
	public void password_textbox_must_come() 
	{
		
	  pwd =  driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
	
	  if(pwd != null)
	  {
		  flag = true;
		  System.out.println("pass");
	  }
	  else
	  {
		  flag = false;
		  System.out.println("fail");
	  }
	}

}
