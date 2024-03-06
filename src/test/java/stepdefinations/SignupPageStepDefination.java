package stepdefinations;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.LoginPage;
import com.pages.SignupPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupPageStepDefination {
	
	LoginPage lp;
	 private SignupPage sp =new SignupPage(DriverFactory.getDriver());
	private String title;
	
	
	@Given("user is on the Amazon homepage")
	public void user_is_on_the_amazon_homepage() throws IOException {
		
		DriverFactory.getDriver().get("https://www.amazon.in");
		this.sp =new SignupPage(DriverFactory.getDriver());
		
	}

	@When("user clicks on the {string} button")
	public void user_clicks_on_the_button(String string) throws IOException {
	 sp.clickonstart();
	}

	@Then("user should be on the Amazon signup page")
	public void user_should_be_on_the_amazon_signup_page() {
	   System.out.println("SignUpPage");
	}

	@Given("user is on the Amazon signup page")
	public void user_is_on_the_amazon_signup_page() {
	   title= sp.getSignuppagetitle();
	   String Expected ="\r\n"
	   		+ "Amazon Registration";
	    
	}

@Given ("user is on amazon SignupPage")
public void user_clicks_on_Signinbtn() throws IOException {
	sp.clickonstart();
}
@When("user enters invalid name. {string}")
	public void user_enters_invalid_name(String nm) throws IOException {
	
	   sp.fillname(nm);
	}

	@When("user enters invaild numbrer. {string}")
	public void user_enters_invaild_numbrer(String nu) {
	    sp.fillnumber(nu);
	}

	
	

@When("user enters invalid password {string}")
public void user_enters_invalid_password(String ps) {
    // Write code here that turns the phrase above into concrete actions
   sp.fillpassword(ps);
}


	@When("clicks on the {string} button")
	public void clicks_on_the_button(String string) throws InterruptedException {
	  sp.verifybtn();
	  Thread.sleep(3330);
	}

	@Then("user should see an error message")
	public void user_should_see_an_error_message() {
		
		String errormsg ="\"There was a problem\\r\\n\"\r\n"
				+ "						+ \"Please enter a valid mobile phone number with area code.";
		String Actualerror = sp.errormsg();
		Assert.assertTrue(errormsg.contains(Actualerror));
		
		
	}

}

