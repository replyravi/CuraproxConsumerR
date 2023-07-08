package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/DPChat.feature",
		glue="mainFunction", tags= "@DPChatfunction",
        plugin= {"pretty", "html:target/DPChatfunction.html", "json:target/DPChatfunction.json", "junit:target/DPChatfunction.xml"})
public class TestRunnerDPChat {

}
