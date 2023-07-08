package mainFunction;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import stepDefinations.Capab;

public class Chatfunction extends Capab{

	public Chatfunction() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^Login Consumer application$")
    public void login_consumer_application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"South Africa\")").click();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Login\")").click();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Email\")").sendKeys("curatest+rzsa21103@morphos.is");
    	driver.findElementByAndroidUIAutomator("text(\"Password\")").sendKeys("Ringzero123");
    	System.out.println("curatest+rzsa21103@morphos.is");
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	//driver.findElementByAndroidUIAutomator("text(\"LOGIN\")").click();
    	//driver.findElement(By.xpath("//android.view.ViewGroup[9]")).click();
    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[470,940][610,1005]']")).click();
    }

    @Given("^Navigate to Dental Professional and search DP name Click on it$")
    public void navigate_to_dental_professional_and_search_dp_name_click_on_it() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Connect with Dental Professional\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"Allow only while using the app\")").click();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Practice name, dental professional name\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"Practice name, dental professional name\")").getText();
    	
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Practice name, dental professional name\")").sendKeys("Cur");
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Cura21109\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"Cura21109\")").getText();
    	driver.findElementByAndroidUIAutomator("text(\"Cura21109\")").click();
    	
    }

    @Given("^Click on connect option and Click on chat now option$")
    public void click_on_connect_option_and_click_on_chat_now_option() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"CONNECT\")").click();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"CONNECT NOW\")").click();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
    }

    @Given("^Type text on chat box and verify chat receive to DP$")
    public void type_text_on_chat_box_and_verify_chat_receive_to_dp() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"CHAT NOW\")").click();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Type message here\")").getText();
    	
    	driver.findElementByAndroidUIAutomator("text(\"Type message here\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"Type message here\")").sendKeys("Hi Test");
    	driver.navigate().back();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[985,1700][1038,1755]']")).click();
    	
    	// Affilate Application Open
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.activateApp("ag.curaden.curaprox.affiliate");
    	
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Home\")").click();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"PatientCenter\")").click();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"PatientCenter\")").getText();
    	driver.findElementByAndroidUIAutomator("text(\"Chat\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"Chat\")").getText();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
    	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Chat Settings\").instance(0))");
    	try {
		    driver.findElement(MobileBy.AndroidUIAutomator(
		            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
		} catch (InvalidSelectorException e) {
		    // ignore
		}
    	
    	driver.findElementByAndroidUIAutomator("text(\"Chat Settings\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"Same as working hours\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"CONFIRM\")").getText();
    	driver.findElementByAndroidUIAutomator("text(\"CONFIRM\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"CONFIRM\")").click();
    	
    	
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"PatientCenter\")").click();
    	
    	String chat="Chat";
    	String recom="My Recommendations";
    	if(chat=="Chat")
    	{
    		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        	driver.findElementByAndroidUIAutomator("text(\"Chat\")").click();
        	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        	driver.findElementByAndroidUIAutomator("text(\"Deep Testing\")").click();
        	driver.navigate().back();
    	}
    	if(recom=="My Recommendations") 
    	{
    		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        	driver.findElementByAndroidUIAutomator("text(\"Chat\")").click();
        	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        	driver.findElementByAndroidUIAutomator("text(\"Deep Testing\")").click();
        	driver.navigate().back();
    	}
    	else {System.out.println("Hello Test");}
    	
    	//driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"My Recommendations\")").click();
    	
    	
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"+\")").getText();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"+\")").click();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Recommend Products\")").click();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Product name\")").getText();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	
    	driver.findElementByAndroidUIAutomator("text(\"CS 5460\")").click();
    	
    	
    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[278,1642][803,1707]']")).click();
		//driver.findElementByAndroidUIAutomator("text(\"RECOMMEND PRODUCTS\")").click();
	
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		//driver.findElementByAndroidUIAutomator("text(\"Select all\")").click();
		driver.findElementByAndroidUIAutomator("text(\"CONFIRM PRODUCT\")").getText();
		driver.findElementByAndroidUIAutomator("text(\"CONFIRM PRODUCT\")").click();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Select all\")").getText();
		driver.findElementByAndroidUIAutomator("text(\"Select all\")").click();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"RECOMMEND PRODUCTS\")").getText();
		driver.findElementByAndroidUIAutomator("text(\"RECOMMEND PRODUCTS\")").click();
    	
    	driver.navigate().back();
    	driver.navigate().back();
    	driver.navigate().back();

    	driver.activateApp("ag.curaden.curaprox.consumer");
    	driver.navigate().back();
    	driver.navigate().back();
    	driver.navigate().back();
    	// Code for disconnect to the DP
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Chat with my Dental Professional\")").getText();
    	driver.findElementByAndroidUIAutomator("text(\"Chat with my Dental Professional\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"DISCONNECT\")").click();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"I confirm I want to disconnect\")").click();
    	
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	String dis="DISCONNECT";
    	if(dis=="DISCONNECT")
    	{
    	driver.findElementByAndroidUIAutomator("text(\"DISCONNECT\")").getText();
        driver.findElementByAndroidUIAutomator("text(\"DISCONNECT\")").click();
        driver.findElementByAndroidUIAutomator("text(\"DISCONNECT\")").click();
     
    	}
    }

    @Given("^Logout application$")
    public void logout_application() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    
    	//driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[943,1677][1001,1746]']")).click();
    	driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Log Out\").instance(0))");
    	driver.findElementByAndroidUIAutomator("text(\"Log Out\")").click();
    }
	
}
