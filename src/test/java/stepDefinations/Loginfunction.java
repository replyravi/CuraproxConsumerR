package stepDefinations;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Loginfunction extends Capab {

	
	
	public Loginfunction() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public void loginfun()
	{
		
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"South Africa\")").click();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"));");
    	driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Login\")").click();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Email\")").sendKeys("curatest+rzsa378@morphos.is");
    	driver.findElementByAndroidUIAutomator("text(\"Password\")").sendKeys("Ringzero123");
    	System.out.println("curatest+rzsa378@morphos.is");
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    	System.out.println("Git push this command");
    	//driver.findElementByAndroidUIAutomator("text(\"LOGIN\")").click();
    	//driver.findElement(By.xpath("//android.view.ViewGroup[9]")).click();
    	driver.findElement(By.xpath ("//android.widget.TextView[@bounds='[470,940][610,1005]']")).click();
		
	}
}
