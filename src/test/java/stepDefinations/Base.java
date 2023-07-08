package stepDefinations;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

		//AndroidDriver <AndroidElement>driver =capabilities();
		//File appDir = new File("src/test/java");
		
		//File app= new File(appDir, "curaprox.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		/*
    	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel_4");
    	cap.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
    	cap.setCapability(AndroidMobileCapabilityType.APPLICATION_NAME, "Curaprox");
    	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "ag.curaden.curaprox.consumer");
    	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ag.curaden.curaprox.consumer.MainActivity");
    	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		*/
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel_4");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability(MobileCapabilityType.APP, "/Users/ravi/Downloads/CuraproxConsumerR/src/Curaprox.apk");
		
		
		//
		/*
		 cap.setCapability("platormName", "Android");  
cap.setCapability("deviceName", "pixel_4");  
cap.setCapability("appPackage","ag.curaden.curaprox.consumer");  
cap.setCapability("appActivity","ag.curaden.curaprox.consumer.MainActivity");
cap.setCapability("automationName","uiAutomator2");
		*/
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Curaproxemulator");
		
		//cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		// UI Automator --> android app
		
		// uiautomator2
		//DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

	AndroidDriver <AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
	return driver;
	
	}

	public static AndroidDriver<AndroidElement> gmailcapabilities() throws MalformedURLException
	{
File appDir = new File("src/test/java");
		
		File app= new File(appDir, "mymail.apk");
		DesiredCapabilities capb = new DesiredCapabilities();
    	//capb.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel_4");
		capb.setCapability("deviceName", "pixel_4");
		
    	//capb.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    	//capb.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");
		capb.setCapability("automationName","UiAutomator2");
    	AndroidDriver <AndroidElement> driver1 = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capb);
    	
    	return driver1;
	}
	
}
