package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Loginnetherlands.feature",
		glue="stepDefinationsLogin", tags= "@LoginNetherlands",
        plugin= {"pretty", "html:target/LoginNetherlands.html", "json:target/LoginNetherlands.json", "junit:target/LoginNetherlands.xml"})
public class TestRunnerLoginNetherlandsRunnerLogin {

}
