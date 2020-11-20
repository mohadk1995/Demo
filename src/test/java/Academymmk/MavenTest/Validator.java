package Academymmk.MavenTest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class Validator extends base {
	LandingPage lp;

	@BeforeTest
	public void intialise() throws Exception
	{
		driver = IntialiseDriver();
		driver.get(prob.getProperty("URL"));	
	}
	
	
	@Test()
	public void BaseIntialization() throws Exception {
		
		 lp = new LandingPage(driver);
		Assert.assertEquals(lp.title().getText(), "Featured Courses");

	}
	
	@Test()
	public void headervalidation() throws Exception {
		
		 lp = new LandingPage(driver);
		Assert.assertEquals(lp.header().getText(), "An Academy to learn Everything about Testing");

	}
	
	
	
	
	@AfterTest
	public void Close()
	{
		driver.close();
		driver=null;
	}
			
				
				
			
}