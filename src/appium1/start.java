package appium1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class start {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//this is used to get the path of the apk file located in the project
		File f = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
		
		//Created a desired capabilities object to set Emulator, and provide the app to test on.
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "PixelXL");
		cap.setCapability(MobileCapabilityType.APP , fs.getAbsolutePath());
		
		//create a android driver object. arguments takes 1. the host url object 2.desired cap
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}
}
