package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.sql.rowset.WebRowSet;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base {
	
public static WebDriver driver;
public Properties prob;
	
	public WebDriver IntialiseDriver() throws Exception
	{
		 prob= new Properties();
		// System.getProperty("user.dir");
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\browser.properties");
		prob.load(fis);
		String BrowserName=	System.getProperty("Browser");
	//String BrowserName=	prob.getProperty("Browser");
	if(BrowserName.contains("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaprogram\\Chrome-WebDriver\\Chrome85\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions(); 
		if(BrowserName.contains("headless"))
		{
			options.addArguments("headless");
		}
		options.addArguments("headless");
		 driver = new ChromeDriver(options);
	}
	else if(BrowserName.equals("Firefox"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaprogram\\Chrome-WebDriver\\Chrome85\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	else if(BrowserName.equals("IE"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaprogram\\Chrome-WebDriver\\Chrome85\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
	return driver;
		
	}
	
	public void getScreenshots(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.getFileUtils().copyFile(src, new File("D:\\\\udemey\\\\Maven\\\\screenshot\\"+result+"screenshot.png"));
	
	
	}

}
