package mainFunction;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import stepDefinations.Loginfunction;

public class VerifyNotificationsortingsectionCuraPoint extends Loginfunction {

	public VerifyNotificationsortingsectionCuraPoint() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}
	 @Given("^Login Curaprox Consumer$")
	    public void login_curaprox_consumer() throws Throwable {
		 super.loginfun();
			System.out.println("Hello test");
	    }

	    @Given("^Verify Notification Bar Open and click bell Icon verify notification and click back$")
	    public void verify_notification_bar_open_and_click_bell_icon_verify_notification_and_click_back() throws Throwable {
	    	driver.findElementByAndroidUIAutomator("text(\"Connect with Dental Professional\")").getText();
	    	((AndroidDriver) driver).openNotifications();
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.navigate().back();
	    	
	    	// Click on bell icon 
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[858,147][927,229]']")).click();
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"NOTIFICATION CENTER\")").getText();
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	String text = "You have earned 250 curapoints for completing onboarding";
	    	if(text=="You have earned 250 curapoints for completing onboarding")
	    	{
	    	
	    	driver.findElementByAndroidUIAutomator("text(\"You have earned 250 curapoints for completing onboarding\")").getText();
	    	}
	    	else 
	    	{
	    		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    		driver.findElementByAndroidUIAutomator("text(\"NOTIFICATION CENTER\")").getText();
	    		System.out.println("Please Complete Onboarding get 250 CuraPoint");
	    	}
	    	driver.navigate().back();
	    }

	    @Given("^Navigate to product page and verify sorting of product and click back$")
	    public void navigate_to_product_page_and_verify_sorting_of_product_and_click_back() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"Shop\")").click();
	    	driver.findElementByAndroidUIAutomator("text(\"Toothbrushes\")").click();
	    	driver.findElementByAndroidUIAutomator("text(\"Sorted by: Popularity\")").click();
	    	
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"Name, A to Z\")").click();
	    	driver.findElementByAndroidUIAutomator("text(\"Name, A to Z\")").getText();
	    	driver.navigate().back();
	    }

	    @Given("^Navigate to my account and verify section and sub section screen and click back$")
	    public void navigate_to_my_account_and_verify_section_and_sub_section_screen_and_click_back() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
	    	driver.findElementByAndroidUIAutomator("text(\"My Profile\")").click();
	    	driver.findElementByAndroidUIAutomator("text(\"MY PROFILE\")").getText();
	    	driver.navigate().back();
	    	driver.findElementByAndroidUIAutomator("text(\"My CuraPoints\")").click();
	    	driver.findElementByAndroidUIAutomator("text(\"My CuraPoints\")").getText();
	    	driver.navigate().back();
	    }

	    @Given("^Navigate to Cura Point section and verify 250CP received for onboarding process$")
	    public void navigate_to_cura_point_section_and_verify_250cp_received_for_onboarding_process() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    
	    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[943,1677][1001,1746]']")).click();
	    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Log Out\").instance(0))");
	    	driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
	    }
}
