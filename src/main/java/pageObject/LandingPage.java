package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By navigationBar=By.cssSelector("ul[class='nav navbar-nav navbar-right']");
	By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By header=By.cssSelector("div[class*='video-banner'] h3");
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}


	


	public WebElement Signin()
	{
		return driver.findElement(signin);
	}

	public WebElement title()
	{
		return driver.findElement(title);
	}

	public WebElement navigationBar()
	{
		return driver.findElement(navigationBar);
	}
	
	public WebElement header()
	{
		return driver.findElement(header);
	}


}
