package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/VerifyNotificationSortingSectionCuraPoint.feature",
		glue="mainFunction", tags= "@VerifyNotification",
        plugin= {"pretty", "html:target/VerifyNotificationSortingSectionCuraPoint.html", "json:target/VerifyNotificationSortingSectionCuraPoint.json", "junit:target/VerifyNotificationSortingSectionCuraPoint.xml"})
public class TestRunnerVerifyNotificationSortingSectionCuraPoint {

}
