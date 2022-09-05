package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.mysql.jdbc.Driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.ExamPage;
import pages.ExamTestBase;

public class ExamStep_Defenition extends ExamTestBase {

	ExamPage examPage;

	@Before
	public void beforeEachMethod() {
		initDriver();
		examPage = PageFactory.initElements(driver, ExamPage.class);
	}

	@Given("^background color change in the provided url page$")
	public void set_SkyBlue_Background_button_exists() {
		driver.get("https://techfios.com/test/101/");

	}

	@When("^Set SkyBlue Background button exists$")
	public void set_skyBlue_background_button_exists() {
	}

	@When("^I click on the button$")
	public void i_click_on_the_button() throws InterruptedException {
		examPage.changeBackground();

	}

	@Then("^The background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {

	}

	@When("^Set SkyWhite Background button exists$")
	public void set_skyWhite_background_button_exists() throws InterruptedException {

	}
//
//	@When("^I click on the button$")
//	public void i_click_the_button() throws InterruptedException {
//		examPage.changeBackgroundToSkyBlue();
//		Thread.sleep(2000);
//		examPage.changeBackgroundToWhite();
//
//	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {

	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
