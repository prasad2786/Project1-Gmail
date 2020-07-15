package Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import POM.Gmail;

public class TestGmaillogin 
{
	@Test
	public void logintest()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		Gmail g1=new Gmail(driver);
		
		g1.Uname("amaze123");
		g1.Click();
		g1.Pwd("12345");
		g1.Click();
	}
}
