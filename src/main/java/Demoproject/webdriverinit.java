package Demoproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverinit {
	public WebDriver driver;
	public WebDriver webdrive() throws IOException
	{
Properties pro=new Properties();
FileInputStream fin=new FileInputStream("C:\\Users\\vikas\\eclipse-workspace\\Mavendemo\\src\\main\\java\\resource\\data.properties");
pro.load(fin);
String browsername=pro.getProperty("browser");
if(browsername.equals("firefox"))
{
	System.setProperty("webdriver.gecko.driver", "E:\\chromedriver\\geckodriver.exe");
	 driver = new FirefoxDriver();
}
else if(browsername.equals("chrome"))
{
	
}
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
return driver;
}
}
