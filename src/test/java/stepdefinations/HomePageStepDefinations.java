package stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.util.List;
import java.util.Map;

import com.factory.DriverFactory;
import com.pages.HomePage;
import com.pages.LoginPage;

public class HomePageStepDefinations {
private WebDriver driver;
    private String title;
    private LoginPage lp = new LoginPage(DriverFactory.getDriver());
    private HomePage hp;

    @Given("user has already logged on")
    public void user_has_already_logged_on(io.cucumber.datatable.DataTable credTable) {
    	List<Map<String, String>> credList = credTable.asMaps();
        String userName = credList.get(0).get("username");
        String password = credList.get(0).get("password");

        DriverFactory.getDriver().get("https://www.amazon.in");
        hp = lp.doLogin(userName, password);
    }
    
    @Given("user is on Homepage")
    public void user_is_on_homepage() {
       hp = new HomePage(DriverFactory.getDriver());
    }
    @When("user gets Homepage title")
    public void user_gets_homepage_title() {
        title =hp.getHomePageTitle();
    }
    @Then("HomePage title shold be {string}")
    public void home_page_title_shold_be(String expectedtitle) {
       Assert.assertTrue(title.contains(expectedtitle));
    }

    @When("user clicks on account name")
    public void user_clicks_on_account_name() {
        System.out.println("Clicks on account name");
    }
    @Given("user is on HomePage")
    public void user_is_on_home_page() {
    	  hp = new HomePage(DriverFactory.getDriver());
    }
    @When("user clicks on searchbar")
    public void user_clicks_on_searchbar() {
      hp.clicksonserchbar();
    }

    @When("user clicks on delivery tab")
    public void user_clicks_on_delivery_tab() {
        hp.clicksondelivarytab();
    }

    @When("user checks all Headerlink")
    public void user_checks_all_headerlink() {
  hp.headrlinkcount();
    }
    @Then("Header link count Should be {string}")
    public void header_link_count_should_be(String string) {
       List<String> headerlink = hp.headrlinkcount();
       headerlink.size();
       for(int i=0;i<headerlink.size();i++) {
    	   System.out.println(headerlink.get(i));
       }
    }
      

    @When("user check all footerlink")
    public void user_check_all_footerlink() {
       hp.footerlinks();
    }
    @Then("footer link count should be {string}")
    public void footer_link_count_should_be(String string) {

List<String>footerlink = hp.footerlinks();
footerlink.size();
for(int j=0;j<footerlink.size();j++) {
	System.out.println(footerlink.get(j));
	
	
	
	
	
	
	
	
	
    }


   
    }
}

