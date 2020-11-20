package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;


public class stepDefination extends base {
	
//@RunWith(Cucumber.class)

	


    @Given("^ Initialise the browser with chrome$")
    public void initialise_the_browser_with_chrome() throws Throwable {
    	
    	driver = IntialiseDriver();
        
    }

    @When("^User enter \"([^\"]*)\" and \"([^\"]*)\" to login $")
    public void user_enter_something_and_something_to_login(String strArg1, String strArg2) throws Throwable {
    	LoginPage lo = new LoginPage(driver);
		lo.Email().sendKeys(strArg1);
		lo.Password().sendKeys(strArg2);
       
    }

    @Then("^ user is succesfully login$")
    public void user_is_succesfully_login() throws Throwable {
    	LoginPage lo = new LoginPage(driver);
    	lo.LogIn().click();
        
    }

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
    }

    @And("^Click on Login Link in to land on secure login page$")
    public void click_on_login_link_in_to_land_on_secure_login_page() throws Throwable {
    	
    	LandingPage lp = new LandingPage(driver);
		lp.Signin().click();
       
    }

}


