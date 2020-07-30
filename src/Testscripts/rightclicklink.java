package Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import GENERIC.*;

public class rightclicklink extends openappandclose
{
	@Test
	public void test2() 
	{
		WebElement ele=driver.findElement(By.xpath("//a[.='Forgotten account?']"));
		Action a=new Action();
		a.rightclick(ele, driver);

	}
}
