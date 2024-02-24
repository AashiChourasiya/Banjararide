package project;

import java.awt.event.KeyEvent;
import java.io.IOException;

import static io.appium.java_client.touch.offset.ElementOption.element;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.touch.TapOptions;

public class rider1 extends rider {

	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void Before() throws IOException, InterruptedException {
		service = startServer();
		driver = capabilities(deviceName, AppPackage, plateformName, AppActivity);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	    @Test(enabled = true)
	    public void task1() throws InterruptedException {
	    //UIAutomator API is an Android native way of finding element
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"BOOK NOW\")")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Hire Bike\")")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Shine SP 125\"))").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(MobileBy.className("android.widget.ImageView")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"7 days 0 hr\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
  	    driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=\"14 February 2024\"]")).click();
	
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"18\")")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
		
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
		
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
		
	}
	    @Test(enabled = true)
	    public void task2() {
	    	
			//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"My Tools\")")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Bookings\")")).click();
		
			driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search\")")).sendKeys("Activa");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
		
			driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Home\")")).click();
	    
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    @Test(enabled = true)
	    public void task3() {
	 			
//	 			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
	 			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 			
	 	        driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Call Us\")")).click();
	 				
	 	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	        driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
	 			
	 			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 			
	 			driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
	 			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 			
	 			driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
	 			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 			
	 			driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
	 			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 		}
}