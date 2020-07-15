package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail 
{
	@FindBy(id="identifierId")
	private WebElement uname;
	
	@FindBy(xpath="(//span[.='Next'])[1]")
	private WebElement click1;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	public Gmail(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Uname(String s1)
	{
		uname.sendKeys(s1);
	}
	
	public void Click()
	{
		click1.click();
	}
	
	public void Pwd(String s1)
	{
		pwd.sendKeys(s1);
	}
}
