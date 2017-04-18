package Annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class myStepDefinition {
	
	WebDriver driver;
	
	@When("^I navigate to Guru")
	public void i_navigate_to_TheTestRoom_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Going to Guru99");
		System.setProperty("webdriver.gecko.driver", "C:/Program Files/geckodriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.guru99.com/");
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  //  throw new PendingException();
	}

	/*@When("^I navigate to Learn Software Testing page$")
	public void i_navigate_to_Learn_Software_Tesing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Clicking on the Learn Software Testing Page");
		driver.findElement(By.partialLinkText("Learn Software Testing")).click();
	    //throw new PendingException();
	}

	@When("^I navigate to Learn Cucumber Testing page$")
	public void i_navigate_to_Learn_Cucumber_Tesing_page() throws Throwable {
		System.out.println("Clicking on the Learn Cucumber Testing Page");
		driver.findElement(By.partialLinkText("Learn Cucumber Testing")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}*/
	
	@When("^I navigate to \"([^\"]*)\" page$")
	public void i_navigate_to_page(String link) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Clicking on the Learn Testing Page");
		driver.findElement(By.linkText(link)).click();
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
