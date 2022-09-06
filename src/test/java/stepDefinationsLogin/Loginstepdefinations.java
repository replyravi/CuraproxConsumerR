package stepDefinationsLogin;




import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Duration;




public class Loginstepdefinations extends Base {
	
	
	public AndroidDriver <AndroidElement>driver =capabilities();
	public Loginstepdefinations() throws MalformedURLException {}
	
	 @Given("^Select South Africa$")
	    public void select_south_africa() throws Throwable {
		 driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("text(\"South Africa\")").click();
	    }

	    @Given("^Tab Next button$")
	    public void tab_next_button() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
	    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
	    
	    }

	    @Given("^Click on Sign In$")
	    public void click_on_sign_in() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"Login\")").click();
	    	
	    }
	    @And("^type email and password with (.+) and (.+)$")
	    public void type_email_and_password_with_and(String email, String password) throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"Email\")").sendKeys(email);
	    	driver.findElementByAndroidUIAutomator("text(\"Password\")").sendKeys(password);
	    	System.out.println(email);
}
	    

	    @Then("^Click on Login$")
	    public void click_on_login() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	//driver.findElementByAndroidUIAutomator("text(\"LOGIN\")").click();
	    	//driver.findElement(By.xpath("//android.view.ViewGroup[9]")).click();
	    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[470,940][610,1005]']")).click();
	    }

	    @Then("^Click on My Account$")
	    public void click_on_three_line_top_left_side_of_the_app() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
	    	// driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).click();
	    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[969,126][1038,250]']")).click();
	   
	    }

	    @Then("^Click on Logout$")
	    public void click_on_logout() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Log Out\"));");
	    	driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"LOG OUT\")").click();
	    }

	    /* Login for Slovenia */
	    
	    @Given("^Select South Slovenia$")
	    public void select_south_slovenia() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			 driver.findElementByAndroidUIAutomator("text(\"Slovenia\")").click();
	    }

	    @Given("^Tab Next button Slovenia$")
	    public void tab_next_button_slovenia() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
	    	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
	    }

	    @Given("^Click on Sign In Slovenia$")
	    public void click_on_sign_in_slovenia() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"Prijava\")").click();
	    }
	   
	    @And("^Slovenia type email and password with (.+) and (.+)$")
	    public void Slovenia_type_email_and_password_with_and(String email, String password) throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"E-pošta\")").sendKeys(email);
	    	driver.findElementByAndroidUIAutomator("text(\"Geslo\")").sendKeys(password);
	    	System.out.println(email);
	    }
	    
	    @Then("^Click on Login Slovenia$")
	    public void click_on_login_slovenia() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	//driver.findElementByAndroidUIAutomator("text(\"LOGIN\")").click();
	    	//driver.findElement(By.xpath("//android.view.ViewGroup[9]")).click();
	    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[459,940][622,1005]']")).click();
	    }

	    @Then("^Click on My Account Slovenia$")
	    public void click_on_my_account_slovenia() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
	    }

	    @Then("^Click on Logout Slovenia$")
	    public void click_on_logout_slovenia() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Log Out\"));");
	    	driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"LOG OUT\")").click();
	    }

	    
	    
	    /* Login for Netherlands */
	    
	    
	    @Given("^Select South Netherlands$")
	    public void select_south_Netherlands() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			 driver.findElementByAndroidUIAutomator("text(\"Netherlands\")").click();
	    }

	    @Given("^Tab Next button Netherlands$")
	    public void tab_next_button_Netherlands() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
	    	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
	    }

	    @Given("^Click on Sign In Netherlands$")
	    public void click_on_sign_in_Netherlands() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"Inloggen\")").click();
	    }
	   
	    @And("^Netherlands type email and password with (.+) and (.+)$")
	    public void Netherlands_type_email_and_password_with_and(String email, String password) throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"E-mail\")").sendKeys(email);
	    	driver.findElementByAndroidUIAutomator("text(\"Wachtwoord\")").sendKeys(password);
	    	System.out.println(email);
	    }
	    
	    @Then("^Click on Login Netherlands$")
	    public void click_on_login_Netherlands() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	//driver.findElementByAndroidUIAutomator("text(\"LOGIN\")").click();
	    	//driver.findElement(By.xpath("//android.view.ViewGroup[9]")).click();
	    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[422,940][658,1005]']")).click();
	    }

	    @Then("^Click on My Account Netherlands$")
	    public void click_on_my_account_Netherlands() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
	    }

	    @Then("^Click on Logout Netherlands$")
	    public void click_on_logout_Netherlands() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Log Out\"));");
	    	driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
	    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"LOG OUT\")").click();
	    }
  
	    
	    
	    
}