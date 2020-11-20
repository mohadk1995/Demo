package Academymmk.MavenTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class HomePage extends base {

	@BeforeTest
	public void intialise() throws Exception
	{
		driver = IntialiseDriver();
		//driver.get(prob.getProperty("URL"));	
	}
	
	@Test(dataProvider="getdata")
	public void BaseIntialization(String username,String password,String text) throws Exception {
		//driver = IntialiseDriver();
		driver.get(prob.getProperty("URL"));
		LandingPage lp = new LandingPage(driver);
		lp.Signin().click();
		LoginPage lo = new LoginPage(driver);
		lo.Email().sendKeys(username);
		lo.Password().sendKeys(password);
		System.out.println(text);
		lo.LogIn().click();

	}
	
	@AfterTest
	public void Close()
	{
		driver.close();
		driver=null;
	}
	
	
			@DataProvider
			public Object[][] getdata() 
			{
				Object[][] data=new Object [2][3];
				data[0][0]="Non restrictedUser@dataprovider.com";
				data[0][1]="12345";
				data[0][2]="Non Restricted Users";
				
			data[1][0]="restrictedUser@dataprovider.com";
				data[1][1]="123456";
				data[1][2]="Restricted User";
				
				return data;
				
				
			}
}