package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Netherlandssignuptest.feature",
		glue="stepDefinations", tags= "@NetherlandsSignuptest",
        plugin= {"pretty", "html:target/NetherlandsSignuptest.html", "json:target/NetherlandsSignuptest.json", "junit:target/NetherlandsSignuptest.xml"})
public class TestRunnerNetherlandsSignuptestRunner {

}
