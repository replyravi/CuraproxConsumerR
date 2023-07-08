package lessonComplete;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Duration;
import stepDefinations.Loginfunction;

public class LessonComplete extends Loginfunction  {

		 
		public LessonComplete() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

		// TODO Auto-generated constructor stub
	
		//public AndroidDriver <AndroidElement>driver =capabilities();
		//public StepDefinationsHomepageOpenlink() throws MalformedURLException {}
		
	
		@Given("^Login to Curaprox$")
		    public void login_to_curaprox() throws Throwable {
			// main code link to loginfunction class 	
			super.loginfun();
		System.out.println("Hello test");
			
		    }

		 @Given("^Verify Continue Your Lesson$")
		    public void verify_continue_your_lesson() throws Throwable {
			 driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"CONTINUE YOUR LESSON\").instance(0))");
		    
		    
		    }

		 @Given("^Navigate to MY CURAPOINTS  get text Complete Educational Content and get text Complete Educational Content Correctly$")
		    public void navigate_to_my_curapoints_get_text_complete_educational_content_and_get_text_complete_educational_content_correctly() throws Throwable {
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[943,1677][1001,1746]']")).click();
		    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"My CuraPoints\").instance(0))");
		    	driver.findElementByAndroidUIAutomator("text(\"My CuraPoints\")").click();
		    	String text="Complete Educational Content";
		    	String text2="Complete Educational Content Correctly";
		 if(text=="Complete Educational Content")
		 {
				driver.findElementByAndroidUIAutomator("text(\"Complete Educational Content\")").getText();
		 }
		 if(text2=="Complete Educational Content Correctly")
		 {
			 driver.findElementByAndroidUIAutomator("text(\"Complete Educational Content Correctly\")").getText();
		 }
		 
		 else
		 {
			 System.out.println("Continue Your lesson Not Started");
		 }
		 driver.navigate().back();
		 }

		
		    @Given("^Log out application$")
		    public void log_out_application() throws Throwable {
		    	
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Log Out\").instance(0))");
		    	driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
		    	driver.findElementByAndroidUIAutomator("text(\"LOG OUT\")").click();
		    }

		// TODO Auto-generated constructor stub
	}



