package rediff;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Login_StepDef {
	
	//in the same step either Cucumber Expression can be use or Regular Expression. Both cannot be used in the same step

	@Given("I open a {word} browser")
	public void i_open_a_chrome_browser(String browserName) {

	}

	@And("I enter the url {string}")
	public void i_enter_the_url(String urlName) {

	}

	@And("^I click on the ([a-zA-Z]{1,}) link$")
	public void i_click_on_the_signin_link(String authenticate) {

	}

	@Then("I am redirected to the login page")
	public void i_am_redirected_to_the_login_page() {

	}

	@And("I enter the correct username {string}")
	public void i_enter_the_correct_username_seleniumpandagmailcom(String usernamecred) {

	}

	@And("I enter the correct password {string}")
	public void i_enter_the_correct_password_selenium123(String passwordcred) {

	}

	@When("I click on the SignIn button")
	public void i_click_on_the_signin_button() {

	}

	@Then("I am logged into my rediffmail inbox")
	public void i_am_logged_into_my_rediffmail_inbox() {

	}

	@But("I see there is always a lag of {int} to {int} seconds")
	public void i_see_there_is_always_a_lag_of_4_to_5_seconds(int lagVal1, int lagVal2) {

	}
	
	@And("I can see my profile name on top right")
		public void i_can_see_my_profile_name_on_top_right() {
			
		}
	
    @And("I see the Logout link under my profile name")
    public void i_see_the_Logout_link_under_my_profile_name() {
    	
    }

}