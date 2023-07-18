package testcases;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonPwdTest 
{
	public boolean m;
	@Given("userid is correct")
	public void userid_is_correct() 
	{
	   if(AmazonUid.flag == true )
	   {
		   m = true;
	   }
	   else
	   {
		   m = false;
	   }
	}
	@When("i enter valid password {string}")
	public void i_enter_valid_password(String pwd) 
	{
	    if(m == true)
	    {
	    	AmazonUid.pwd.sendKeys(pwd);
	    	AmazonUid.driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	    }
	    else
	    {
	    	System.out.println("cannot type pwd uid is invalid");
	    }
	}
	@Then("i should login")
	public void i_should_login() 
	{
	    System.out.println("loged in..");
	}


}
