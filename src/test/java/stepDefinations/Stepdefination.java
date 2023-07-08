package stepDefinations;



import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;
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





//@RunWith(Cucumber.class)
public class Stepdefination extends Base{
	public AndroidDriver <AndroidElement>driver =capabilities();
	
	//DesiredCapabilities cap = new DesiredCapabilities();
	
	//AndroidDriver <AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.2:4723/wd/hub"),cap);
	public Stepdefination() throws MalformedURLException {}
	
	@Given("^Open the curaprox consumer application and  Select the country as South Africa$")
	 public void open_the_curaprox_consumer_application_and_select_the_country_as_south_africa() throws Throwable {
		 
   // AndroidDriver <AndroidElement>driver =capabilities();
    
    	//AndroidDriver <AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.2:4723/wd/hub"),cap);
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	
    	driver.findElementByAndroidUIAutomator("text(\"South Africa\")").click();
    	//driver.startActivity(new Activity("com.wt.apkinfo","com.wt.apkinfo.activities.StartActivity"));
    	//driver.activateApp("com.wt.apkinfo");
    	
    	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"myMail\"));");
    	//driver.findElementByAndroidUIAutomator("text(\"myMail\")").click();
    	//driver.findElement(By.xpath("//android.widget.ImageView[4]")).click();
    	
    		
    }

    @And("^Tab Next button$")
    public void tab_next_button() throws Throwable {
    	
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
    
    } 

    @And("^Click on sign up with email$")
    public void click_on_register_new_practice() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Sign up with email\")").click();
    }
    
    /*   Their write code for signup with facebook */
    
    @And("^Click on sign up with facebook$")
    public void click_on_sign_up_with_facebook() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Sign up with Facebook\")").click();
    }
    
    @And("^Open facebook application$")
    public void open_facebook_application() throws Throwable {
       System.out.println("Facebook application open");
    }
    
    @Then("^Type facebook email and password$")
    public void type_facebook_email_and_password() throws Throwable {
    	System.out.println("Type email and password");
    }
    
    @Then("^Close the application$")
    public void close_the_application() throws Throwable {
    	System.out.println("Close the application");
    }

    
    /*   Their write code for signup with facebook */
    @Then("^Type email and password$")
    public void type_location_in_search_location_for_southafrica_and_select_location() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	Random randomEmail = new Random();
   	 int randomInt = randomEmail.nextInt(10000);
    	driver.findElementByAndroidUIAutomator("text(\"Email\")").sendKeys("curatest+rzsa"+randomInt+"@morphos.is");
    	driver.findElementByAndroidUIAutomator("text(\"Password\")").sendKeys("Ringzero123");
  // driver.pressKey(new KeyEvent(AndroidKey.ENTER));
       
    	
    }

    @And("^Click on sign up button$")
    public void click_conformation_location() throws Throwable {
    	 driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SIGN UP\"));");
    	 driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[452,919][628,984]']")).click();
    	 
    	//driver.findElementByAndroidUIAutomator("text(\"SIGN UP\")").click();
    }

    @And("^Click on accept terms and conditions$")
    public void click_on_accept_terms_and_conditions() throws Throwable {
    	
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"ACCEPT\")").click();
    	
    
    }
    
    
    @Then("^Open Gmail and conform the link$")
    public void enter_register_your_account_details() throws Throwable  {
    	
    	
    	driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
    	driver.activateApp("com.my.mail");	
    	driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
        	driver.findElementByAndroidUIAutomator("text(\"Curaprox app, Email Confirmation\")").click();
        	 driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        	 driver.findElementByAndroidUIAutomator("text(\"Confirm email\")").click();
        	 driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
    	/*
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     
       driver.findElementByAndroidUIAutomator("text(\"First Name\")").sendKeys("demo");
       driver.findElementByAndroidUIAutomator("text(\"Last Name\")").sendKeys("test");
       */
    }
    @And("^Curaprox app open$")
    public void click_on_i_am_a_dental_professional() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Curaprox\")").click();
    }

    @And("^Type first name and last name and click next button$")
    public void type_first_name_and_last_name_and_click_next_button() throws Throwable {
    	 driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	 driver.findElementByAndroidUIAutomator("text(\"First Name\")").sendKeys("demo");
         driver.findElementByAndroidUIAutomator("text(\"Last Name\")").sendKeys("test");
         driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
         driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
    }
    
    /* For Dynamic user id and password */
    

    @And("^Click on No, I have not been referred by anyone$")
    public void type_email_and_password_with_email_and_password() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	
    	driver.findElementByAndroidUIAutomator("text(\"No, I have not been referred by anyone\")").click();
    }

    @And("^Click on next button till profile page open$")
    public void click_next_button() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
   	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
	
       
    }

    @And("^Click on my account right side corner in the application$")
    public void accept_the_terms_and_condition() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
    	System.out.println("Done Second last"); 
    	//driver.resetApp(); // Reset the currently running app for this session
    	
    	
    }

    @And("^Click on logout$")
    public void open_gmail_and_conform_the_link() throws Throwable 
    { 
        	
        	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	
        	 driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
        	 driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
        	 driver.findElementByAndroidUIAutomator("text(\"LOG OUT\")").click();
    } 
    

/* Signup test code for Slovenia Region */
    
    @Given("^Open the curaprox consumer application and  Select the country as Slovenia$")
    public void open_the_curaprox_consumer_application_and_select_the_country_as_slovenia() throws Throwable {
        driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Slovenia\")").click();
    }
    
    @And("^Tab Next button in slovenia region$")
    public void tab_next_button_in_slovenia_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
   	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
    }
    
    @And("^Click on sign up with email slovenia region$")
    public void click_on_sign_up_with_email_slovenia_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Vpišite se z e-pošto\")").click();
    }
    
    @Then("^Type email and password slovenia region$")
    public void type_email_and_password_slovenia_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	Random randomEmail = new Random();
   	 int randomInt = randomEmail.nextInt(10000);
    	driver.findElementByAndroidUIAutomator("text(\"E-pošta\")").sendKeys("curatest+rzsa"+randomInt+"@morphos.is");
    	driver.findElementByAndroidUIAutomator("text(\"Geslo\")").sendKeys("Ringzero123");
    }
    
    @And("^Click on sign up button slovenia region$")
    public void click_on_sign_up_button_slovenia_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VPIŠITE SE\"));");
   	 driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[436,919][644,984]']")).click();
    }
    

    @And("^Click on accept terms and conditions slovenia region$")
    public void click_on_accept_terms_and_conditions_slovenia_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"SPREJMI\")").click();
    }
    
    @Then("^Open Gmail and conform the link slovenia region$")
    public void open_gmail_and_conform_the_link_slovenia_region() throws Throwable {

    	driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
    	driver.activateApp("com.my.mail");	
    	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        	driver.findElementByAndroidUIAutomator("text(\"Curaprox app, Email Confirmation\")").click();
        	 driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        	 driver.findElementByAndroidUIAutomator("text(\"Confirm email\")").click();
        	 driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
    }
    
    @And("^Curaprox app open slovenia region$")
    public void curaprox_app_open_slovenia_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Curaprox\")").click();
    }
    
    @And("^Type first name and last name and click next button slovenia region$")
    public void type_first_name_and_last_name_and_click_next_button_slovenia_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	 driver.findElementByAndroidUIAutomator("text(\"Ime\")").sendKeys("demo");
        driver.findElementByAndroidUIAutomator("text(\"Priimek\")").sendKeys("test");
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
        driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
    }
    @And("^Click on No, I have not been referred by anyone slovenia region$")
    public void click_on_no_i_have_not_been_referred_by_anyone_slovenia_region() throws Throwable {

    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Ne, ni me napotil/-a\")").click();
    }

    @And("^Click on next button till profile page open slovenia region$")
    public void click_on_next_button_till_profile_page_open_slovenia_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
   	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
  	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
  	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
  	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
	 //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
	 //driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[424,1653][656,1718]']")).click();
	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
	 //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NASLEDNJI\"));");
	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
	driver.findElementByAndroidUIAutomator("text(\"NASLEDNJI\")").click();
	 //driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[424,1653][656,1718]']")).click();
    }

    @And("^Click on my account right side corner in the application slovenia region$")
    public void click_on_my_account_right_side_corner_in_the_application_slovenia_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
    	System.out.println("Done Second last");
    }

    @And("^Click on logout slovenia region$")
    public void click_on_logout_slovenia_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	
   	 driver.findElementByAndroidUIAutomator("text(\"Odjava\")").click();
   	 driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	 driver.findElementByAndroidUIAutomator("text(\"ODJAVA\")").click();
    }
    
    
    /* Signup test code for Netherlands Region */
    
    @Given("^Open the curaprox consumer application and  Select the country as Netherlands$")
    public void open_the_curaprox_consumer_application_and_select_the_country_as_Netherlands() throws Throwable {
        driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Netherlands\")").click();
    }
    
    @And("^Tab Next button in Netherlands region$")
    public void tab_next_button_in_Netherlands_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
   	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
    }
    
    @And("^Click on sign up with email Netherlands region$")
    public void click_on_sign_up_with_email_Netherlands_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Aanmelden met e-mail\")").click();
    }
    
    @Then("^Type email and password Netherlands region$")
    public void type_email_and_password_Netherlands_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	Random randomEmail = new Random();
   	 int randomInt = randomEmail.nextInt(10000);
    	driver.findElementByAndroidUIAutomator("text(\"E-mail\")").sendKeys("curatest+rzsa"+randomInt+"@morphos.is");
    	driver.findElementByAndroidUIAutomator("text(\"Wachtwoord\")").sendKeys("Ringzero123");
    }
    
    @And("^Click on sign up button Netherlands region$")
    public void click_on_sign_up_button_Netherlands_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"AANMELDEN\"));");
   	 driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[403,919][678,984]']")).click();
    }
    

    @And("^Click on accept terms and conditions Netherlands region$")
    public void click_on_accept_terms_and_conditions_Netherlands_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"ACCEPTEREN\")").click();
    }
    
    @Then("^Open Gmail and conform the link Netherlands region$")
    public void open_gmail_and_conform_the_link_Netherlands_region() throws Throwable {

    	driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
    	driver.activateApp("com.my.mail");	
    	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        	driver.findElementByAndroidUIAutomator("text(\"Curaprox app, Email Confirmation\")").click();
        	 driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        	 driver.findElementByAndroidUIAutomator("text(\"Confirm email\")").click();
        	 driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
    }
    
    @And("^Curaprox app open Netherlands region$")
    public void curaprox_app_open_Netherlands_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Curaprox\")").click();
    }
    
    @And("^Type first name and last name and click next button Netherlands region$")
    public void type_first_name_and_last_name_and_click_next_button_Netherlands_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	 driver.findElementByAndroidUIAutomator("text(\"Voornaam\")").sendKeys("demo");
        driver.findElementByAndroidUIAutomator("text(\"Achternaam\")").sendKeys("test");
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
        driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
    }
    @And("^Click on No, I have not been referred by anyone Netherlands region$")
    public void click_on_no_i_have_not_been_referred_by_anyone_Netherlands_region() throws Throwable {

    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Nee, ik heb geen verwijzingscode\")").click();
    }

    @And("^Click on next button till profile page open Netherlands region$")
    public void click_on_next_button_till_profile_page_open_Netherlands_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
   	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
   	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
  	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
  	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
  	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
	 //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
	//driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
	 //driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[424,1653][656,1718]']")).click();
	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
	 //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VOLGENDE\"));");
	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
	driver.findElementByAndroidUIAutomator("text(\"VOLGENDE\")").click();
	 //driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[424,1653][656,1718]']")).click();
    }

    @And("^Click on my account right side corner in the application Netherlands region$")
    public void click_on_my_account_right_side_corner_in_the_application_Netherlands_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
    	System.out.println("Done Second last");
    }

    @And("^Click on logout Netherlands region$")
    public void click_on_logout_Netherlands_region() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	
   	 driver.findElementByAndroidUIAutomator("text(\"Afmelden\")").click();
   	 driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
   	 driver.findElementByAndroidUIAutomator("text(\"AFMELDEN\")").click();
    }

}