package stepdefinations;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinations {
	private static String title;
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	DriverFactory.getDriver().get("https://www.amazon.in");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title =   lp.getLoginPageTitle();
		System.out.println("Loginpage title is:"+title);
	}
	
	   

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedtitle) {
	  Assert.assertTrue(title.contains(expectedtitle));
	}

	@Given("user clicks on Signinbtn")
	public void user_clicks_on_Signinbtn() {
	  lp.clickonsign();
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	lp.enterUserName(username);
	}
	@When("user clicks on continuebtn")
public void user_clicks_on_continuebtn() {
		lp.clickoncontinue();
	}
	@When("user enters password {string}")
	public void user_enters_password(String password) {
	   lp.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	 lp.clickOnLogin();
	}

	


}
 