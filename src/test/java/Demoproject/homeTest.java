package Demoproject;

import java.io.IOException;

import org.testng.annotations.Test;



public class homeTest extends webdriverinit{
	@Test
	public void home_data() throws IOException
	{
		driver=webdrive();
		driver.get("https://online.msbte.co.in/msbte21/index.php?act=inst_login");
		
		homedata hm=new homedata(driver);
		hm.getLogin().sendKeys("abc");
	}

}
