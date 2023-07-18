package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page 
{
	public WebDriver driver = null;
	

	// user defined method,,
	public void openBrowser(String browser,String url)  // define
	{
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver(); // launch chrome
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver(); // launch EdgeDriver
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver(); // launch firefox
		}
		
	//	driver.get(url); // not prefer -> cannot go back, forward, refesh
		    
		       // or......
		
		     // long way......
		//WebDriver.Navigation nav =  driver.navigate();
		//nav.to(url);
		    // Short way.......
		driver.navigate().to(url);  // prefer -> can go back, forward, refresh
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	


}
