package project;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class rider {
	
	public static String deviceName;
	public static String plateformName;
	public static String AppPackage;
	public static String AppActivity;
	//slack code start
	public AppiumDriverLocalService service;
	public AppiumDriverLocalService startServer()
	{
	boolean flag = checkifserverisRunning(4723);
	if(!flag)
	{
	//
	service = AppiumDriverLocalService.buildDefaultService();
	service.start();
	}
	return service;
	}
	public static boolean checkifserverisRunning(int port)
	{
	boolean isServerRunning=false;
	ServerSocket serversocket;
	//that the flow of the program doesn't break
	try{
	serversocket = new ServerSocket(port);
	serversocket.close();
	}
	catch(IOException e)
	{
	isServerRunning = true;
	}
	finally {
	serversocket=null;
	}
	return isServerRunning;
	}
	//slack code end
	
	public static void Startemulator() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//src//main//resources//extension.bat");
		
		Thread.sleep(10000);
	}
	//now i want to define string values in our method---
		public static AndroidDriver<AndroidElement> capabilities(String deviceName, String plateformName,String AppActivity, String AppPackage) throws IOException, InterruptedException {
			// if we want to fetch value from global property there are two ways for fetching
			// 1. file input output 2.file reader
			// fetching the values of global property using the file reader
			FileReader gp = new FileReader(System.getProperty("user.dir")+"//src//main//java//Global.properties");
			// i want to load the properties of it
			Properties pro = new Properties(); // here i loaded the properties of my global properties
			// i want to fetch properties i create object of properties to load the file
			// we are created this because of loaded this in my l
			pro.load(gp);
		
			//loading the each and every global properties
			
			 deviceName = pro.getProperty("deviceName");
			 plateformName = pro.getProperty("plateformName");
			 AppPackage = pro.getProperty("AppPackage");
			 AppActivity = pro.getProperty("AppActivity");
			
			if(deviceName.equals("Aashi")) {
				Startemulator();
			}
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, plateformName);
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, AppPackage);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, AppActivity);
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		return driver;
	}
				
}