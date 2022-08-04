package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reusableComponents.Base;

public class TideClass extends Base{
	
	@Before
	public WebDriver connection() {
		return driver = connection();
	}
	
	@After
	public void closer() {
		driver.quit();
	}

	// Scenario 1
	@Given("^I have given with Bounce Logo on Home page$")
	public void i_have_given_with_bounce_logo_on_home_page() {
		System.out.println("logo");
	}

	@When("^I click on Bounce logo$")
	public void i_click_on_bounce_logo() {
		System.out.println("bounce");
	}

	@Then("^click on Drying on new page$")
	public void click_on_drying_on_new_page() {
		System.out.println("drying");
	}

	// Scenario 2
	@Given("^I have given with contact us on home page$")
	public void i_have_given_with_contact_us_on_home_page() {
		System.out.println("contact");
	}

	@When("^I click on contact us$")
	public void i_click_on_contact_us() {
		System.out.println("contact us");
	}

	@Then("^click on Where to buy on new page$")
	public void click_on_where_to_buy_on_new_page() {
		System.out.println("where to buy");
	}

	// Scenario 3
	@Given("^I have given with Live Chat on home page$")
	public void i_have_given_with_live_chat_on_home_page() {
		System.out.println("live chat");
	}

	@When("^I click on Live Chat$")
	public void i_click_on_live_chat() {
		System.out.println("click on livechat");
	}

	@When("^click on Read more under Loads of Hope$")
	public void click_on_read_more_under_loads_of_hope() {
		System.out.println("read more");
	}

	@Then("^I should be navigated to new page$")
	public void i_should_be_navigated_to_new_page() {
		System.out.println("new page");
	}

	// Scenario 4
	@Given("^I have given with tide page (.+)$")
	public void i_have_given_with_tide_page_https_tide_com_en_us(String url) {
		System.out.println(url);
	}

	@When("^I hover on shop products$")
	public void i_hover_on_shop_products() {
		System.out.println("shop products");
	}

	@When("^click on powder under shop products$")
	public void click_on_powder_under_shop_products() {
		System.out.println("powder");
	}

	@Then("^I should be navigated to Powder page$")
	public void i_should_be_navigated_to_powder_page() {
		System.out.println("powder page");
	}

	// Scenario 5
	@Given("^I have given with shop product on home page$")
	public void i_have_given_with_shop_product_on_home_page() {
	}

	@When("^I mouse hover on shop product$")
	public void i_mouse_hover_on_shop_product() {
	}

	@When("^click on Fabric Care under it$")
	public void click_on_fabric_care_under_it() {
	}

	@Then("^I should see new page$")
	public void i_should_see_new_page() {
	}

	@When("^I click on sensitive on new page$")
	public void i_click_on_sensitive_on_new_page() {
	}

	@Then("^i should be navigated to new loaded page$")
	public void i_should_be_navigated_to_new_loaded_page() {
	}

}
