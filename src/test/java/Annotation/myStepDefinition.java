package Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class myStepDefinition {
	
	WebDriver driver;
	
	@Given("^I navigate to TheTestRoom\\.com$")
	public void i_navigate_to_TheTestRoom_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Going to TheTestRoom.com");
		System.setProperty("webdriver.gecko.driver", "C:/Program Files/geckodriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.guru99.com/");
	  //  throw new PendingException();
	}

	@When("^I navigate to Cucumber Tutorial page$")
	public void i_navigate_to_Cucumber_Tutorial_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Clicking on the Cucumber Tutorial Page");
		driver.findElement(By.id("rt-logo")).click();
	    //throw new PendingException();
	}

	@Then("^the page title should be visible$")
	public void the_page_title_should_be_visible() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Checking page title");
		System.out.println(driver.getTitle());
		driver.quit();
	    //throw new PendingException();
	}



}
