package com.hover.details.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hover.details.config.Config;
import com.hover.details.pages.HoversPage;
import com.hover.details.tests.SetUpBrowser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HoverAndReadSteps {

	WebDriver driver;
	HoversPage hoversPage;
	SetUpBrowser setUp = new SetUpBrowser();

	@Given("^User launch the hover application$")
	public void user_launch_the_hover_application() throws Throwable {
		System.setProperty(Config.CHROME_DRIVER_KEY, Config.Chrome_Driver_Path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.AppUrl);
		hoversPage = new HoversPage(driver);
	}

	@When("^The page is loaded successfully$")
	public void the_page_is_loaded_successfully() throws Throwable {
		// ((SetUpBrowser) driver).launchedPageSuccessFully();
	}

	@Then("^User verify the hovers header text as (.*)$")
	public void user_verify_the_hovers_header_text(String hoverHeader) throws Throwable {
		hoversPage.verifyHeaderText(hoverHeader);
	}

	@Then("^User Verify the hovers description text as (.*)$")
	public void user_Verify_the_hovers_description_text(String descriptionText) throws Throwable {
		hoversPage.verifyHeaderDescriptionText(descriptionText);
	}

	@Then("^User hovers the mouse on image one$")
	public void user_hovers_the_mouse_on_image_one() throws Throwable {
		hoversPage.hoverOnImageOne();
	}

	@Then("^User Verify the user one name as (.*)$")
	public void user_Verify_the_user_one_name(String userNameOne) throws Throwable {
		hoversPage.verifyFirstImageUserName(userNameOne);
	}

	@Then("^User hovers the mouse on image two$")
	public void user_hovers_the_mouse_on_image_two() throws Throwable {
		hoversPage.hoverOnImageTwo();
	}

	@Then("^User Verify the user two name as (.*)$")
	public void user_Verify_the_user_two_name(String userNameTwo) throws Throwable {
		hoversPage.verifySecondImageUserName(userNameTwo);
	}

	@Then("^User hovers the mouse on image three$")
	public void user_hovers_the_mouse_on_image_three() throws Throwable {
		hoversPage.hoverOnImageThree();
	}

	@Then("^User Verify the user three  name as (.*)$")
	public void user_Verify_the_user_three_name(String userNameThree) throws Throwable {
		hoversPage.verifyThirdImageUserName(userNameThree);
	}

	@Then("^User Verify powered by text as (.*) below the images section$")
	public void user_Verify_powered_by_text_below_the_images_section(String poweredByText) throws Throwable {
		hoversPage.verifyPoweredByText(poweredByText);
	}

}
