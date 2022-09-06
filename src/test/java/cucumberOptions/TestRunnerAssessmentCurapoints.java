package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/SelfAssessmentWithCurapoints.feature",
		glue="mainFunction", tags= "@AssessmentWithCurapoints",
        plugin= {"pretty", "html:target/SelfAssessmentWithCurapoints.html", "json:target/SelfAssessmentWithCurapoints.json", "junit:target/SelfAssessmentWithCurapoints.xml"})
public class TestRunnerAssessmentCurapoints {

}
