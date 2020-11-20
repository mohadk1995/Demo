package Academymmk.MavenTest;

import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import Alpa.Demo;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class URL extends base {
	
	private static org.apache.logging.log4j.Logger log=LogManager.getLogger(URL.class.getName());

	@BeforeTest
	public void intialise() throws Exception
	{
		driver = IntialiseDriver();
		log.info("Driver intialise");
		driver.get(prob.getProperty("URL"));
		log.info("Url is triggered");
	}
	
	@Test()
	public void BaseIntialization() throws Exception {
		
		LandingPage lp = new LandingPage(driver);
		Assert.assertTrue(lp.navigationBar().isDisplayed());
		log.info("Successfully validated");
		
	}
	
	@AfterTest
	public void Close()
	{
		driver.close();
		driver=null;
	}	
				
				
			
}