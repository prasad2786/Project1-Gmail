package GENERIC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action 
{
	
	public void rightclick(WebElement ele,WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void doubleclick(WebElement ele,WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void click(WebElement ele,WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
}
