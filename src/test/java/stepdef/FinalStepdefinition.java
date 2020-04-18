package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pf.Finalpf;

public class FinalStepdefinition {
	static WebDriver driver;
	static WebDriverWait wait;
	static Finalpf pf;
	
	@Given("^User url Auomationpractice website$")
	public void user_url_Auomationpractice_website() throws Throwable {
		driver = new ChromeDriver();
		wait= new WebDriverWait (driver,10);
		
		// Open AutomationPractice
		driver.get("http://Automationpractice.com/index.php");
		
		// Maximize Browser
		driver.manage().window().maximize();
		pf= PageFactory.initElements(driver, Finalpf.class);
	}

	@When("^User click on login Button, enter valid credential & submit login$")
	public void user_click_on_login_Button_enter_valid_credential_submit_login() throws Throwable {
	    
	}

	@When("^User get a home page and on that page verify website title$")
	public void user_get_a_home_page_and_on_that_page_verify_website_title() throws Throwable {
	    
	}

	@Then("^User click on upper dresses button$")
	public void user_click_on_upper_dresses_button() throws Throwable {
	   
	}

	@Then("^User print all price values in sorted order\\(descending order\\) on the console$")
	public void user_print_all_price_values_in_sorted_order_descending_order_on_the_console() throws Throwable {
	   
	}

	@Then("^User need to select the second dress on that list$")
	public void user_need_to_select_the_second_dress_on_that_list() throws Throwable {
	    
	}

	@When("^User on the next page click on add to cart$")
	public void user_on_the_next_page_click_on_add_to_cart() throws Throwable {
	    
	}

	@When("^User on the next page, verify there is a total price with shipping, logout & close the window$")
	public void user_on_the_next_page_verify_there_is_a_total_price_with_shipping_logout_close_the_window() throws Throwable {
	   
	}
}
