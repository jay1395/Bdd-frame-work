package runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA\\Selenium_WorkSpace\\BddFrameWork\\src\\test\\resources\\featuresfile\\AppFeature"},
		glue = {"stepdefinations", "application"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
				
		}
		
		)

public class MyTestRunner {

}