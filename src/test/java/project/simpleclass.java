package project;

import org.testng.annotations.AfterTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class simpleclass {
	public class simple extends rider {
		AndroidDriver<AndroidElement> driver;
		@AfterTest
		public void last() {
			
			service.stop();
		}
	}
}