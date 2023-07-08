package mainFunction;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import stepDefinations.Loginfunction;

public class AssessmentCurapoints extends Loginfunction {

	public AssessmentCurapoints() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Given("^Login to Curaprox Consumer app for verify selfAssessment successfully and should receive curapoints also$")
    public void login_to_curaprox_consumer_app_for_verify_selfassessment_successfully_and_should_receive_curapoints_also() throws Throwable {
		super.loginfun();
		System.out.println("Hello test");
    }

    @Given("^Click on Your Curapoints for verify user able to complete selfAssessment then click back$")
    public void click_on_your_curapoints_for_verify_user_able_to_complete_selfassessment_then_click_back() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Connect with Dental Professional\")").getText();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Your Curapoints\").instance(0))");
    	driver.findElementByAndroidUIAutomator("text(\"Your Curapoints\")").click();
    	
    	String text= "Complete Self-Assessment";
        if(text=="Complete Self-Assessment")
        {
        	System.out.println(driver.findElementByAndroidUIAutomator("text(\"Complete Self-Assessment\")").getText());
        }
        else 
        {
        	System.out.println("User unable to complete the self-assessment");
        }
        driver.navigate().back();
    }

    @Given("^Click on bell Icon for verify user able to receive Curapoints regarding selfAssessment then click back$")
    public void click_on_bell_icon_for_verify_user_able_to_receive_curapoints_regarding_selfassessment_then_click_back() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Connect with Dental Professional\")").getText();
        TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(new PointOption().withCoordinates(996, 174)).perform();
		driver.findElementByAndroidUIAutomator("text(\"NOTIFICATION CENTER\")").getText();
		String text= "You have finished the self assessment";
        if(text=="You have finished the self assessment")
        {
        	System.out.println(driver.findElementByAndroidUIAutomator("text(\"You have finished the self assessment\")").getText());
        }
        else 
        {
        	System.out.println("User unable to complete the self-assessment");
        }
        driver.navigate().back();
		
    }

    @Then("^Logout the application$")
    public void logout_the_application() throws Throwable {
        
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	//driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[900,1757][1044,1794]']")).click();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Log Out\").instance(0))");
    	driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
    }
	
}
