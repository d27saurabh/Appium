package appium1;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class gestures extends start {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
        AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//Tap
		TouchAction t = new TouchAction(driver);
		t.tap(driver.findElementsByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
	
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		t.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names'")).waitAction(Duration.ofSeconds(3)).release().perform();
		driver.findElementsByXPath("android:id/alertTitle").getText();
	}

}
