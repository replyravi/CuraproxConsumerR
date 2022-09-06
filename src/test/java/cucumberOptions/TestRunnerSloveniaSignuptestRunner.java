package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Sloveniasignuptest.feature",
		glue="stepDefinations", tags= "@SloveniaSignuptest",
        plugin= {"pretty", "html:target/SloveniaSignuptest.html", "json:target/SloveniaSignuptest.json", "junit:target/SloveniaSignuptest.xml"})
public class TestRunnerSloveniaSignuptestRunner {

}
