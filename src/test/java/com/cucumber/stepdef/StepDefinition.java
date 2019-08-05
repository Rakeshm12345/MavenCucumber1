package com.cucumber.stepdef;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.cucumer.baseclass.BaseClass;

public class StepDefinition extends BaseClass {
	
	public WebDriver driver;
	
	
	@Given("^User Launch the AutomationPractice application$")
	public void user_Launch_the_AutomationPractice_application() throws Throwable {
	    driver = getBrowser("chrome");
	    driver.get("http://automationpractice.com/index.php");
	    
	}

	@When("^User Click on Signin Button in the Header$")
	public void user_Click_on_Signin_Button_in_the_Header() throws Throwable {
	    HomePage hp=new HomePage(driver);
	    clickonWebelement(hp.getSignInLink());
	}

	@When("^User Enter email id in signin Page$")
	public void user_Enter_email_id_in_signin_Page() throws Throwable {
	    
	    
	}

	@When("^User Enter Password in signin Page$")
	public void user_Enter_Password_in_signin_Page() throws Throwable {
	    
	    
	}

	@When("^User Click signin button in signin page$")
	public void user_Click_signin_button_in_signin_page() throws Throwable {
	    
	    
	}

	@Then("^User Verify the username displayed in the header$")
	public void user_Verify_the_username_displayed_in_the_header() throws Throwable {
	    
	    
	}

	@Given("^User logged in to Menu Page and view the Product$")
	public void user_logged_in_to_Menu_Page_and_view_the_Product() throws Throwable {
	    
	    
	}

	@When("^User Select the Product selection$")
	public void user_Select_the_Product_selection() throws Throwable {
	    
	    
	}

	@When("^User able to select the quantity,size,color Preference$")
	public void user_able_to_select_the_quantity_size_color_Preference() throws Throwable {
	    
	    
	}

	@When("^User able to select the quantity Preference$")
	public void user_able_to_select_the_quantity_Preference() throws Throwable {
	    
	    
	}

	@When("^user able to add the product to cart$")
	public void user_able_to_add_the_product_to_cart() throws Throwable {
	    
	    
	}

	@Then("^Product added to the cart$")
	public void product_added_to_the_cart() throws Throwable {
	    
	    
	}

	@Given("^User is on the Add to cart screen$")
	public void user_is_on_the_Add_to_cart_screen() throws Throwable {
	    
	    
	}

	@When("^User added the product to card$")
	public void user_added_the_product_to_card() throws Throwable {
	    
	    
	}

	@When("^User able to click the proceed to check out button$")
	public void user_able_to_click_the_proceed_to_check_out_button() throws Throwable {
	    
	    
	}

	@When("^User able to continue Shopping$")
	public void user_able_to_continue_Shopping() throws Throwable {
	    
	    
	}

	@Then("^user is on the Your shopping cart screen$")
	public void user_is_on_the_Your_shopping_cart_screen() throws Throwable {
	    
	    
	}

	@When("^User clicked on Proceed to check out button$")
	public void user_clicked_on_Proceed_to_check_out_button() throws Throwable {
	    
	    
	}

	@When("^User checks all the selected details$")
	public void user_checks_all_the_selected_details() throws Throwable {
	    
	    
	}

	@When("^User checks the Delevery address$")
	public void user_checks_the_Delevery_address() throws Throwable {
	    
	    
	}

	@When("^User checks the invoice addresss$")
	public void user_checks_the_invoice_addresss() throws Throwable {
	    
	    
	}

	@Then("^user able to Proceed to check out$")
	public void user_able_to_Proceed_to_check_out() throws Throwable {
	    
	    
	}

	@When("^user logged in to site$")
	public void user_logged_in_to_site() throws Throwable {
	    
	    
	}

	@When("^User able to click the signout button$")
	public void user_able_to_click_the_signout_button() throws Throwable {
	    
	    
	}

	@Then("^user need to be at sign out screen$")
	public void user_need_to_be_at_sign_out_screen() throws Throwable {
	    
	    
	}



}
