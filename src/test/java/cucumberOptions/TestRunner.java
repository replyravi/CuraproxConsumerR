package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinations", tags= "@Signuptest",
        plugin= {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml"})
public class TestRunner {

}
