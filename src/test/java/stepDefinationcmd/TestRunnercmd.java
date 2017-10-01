package stepDefinationcmd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/stepDefinationcmd/",
format = {"pretty", "html:/New folder/CucumberProjectcmd/reports",
		"html:/New folder/CucumberProjectcmd/target/cucumber-html-reports",
		"json:target/cucumber.json",})
public class TestRunnercmd {
	
}
