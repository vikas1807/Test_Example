package Demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homedata {
	public WebDriver driver;
	By login=By.id("uname");
	public homedata(WebDriver driver)
	{
		this.driver=driver;
	}
public WebElement getLogin()
{
	return driver.findElement(login);
}
}
