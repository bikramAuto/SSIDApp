package com.ssid.base.devices;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ssid.base.platform.platform;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Devices extends platform {
	
	public WebDriver driver;
	public URL url;
	public URL url1;
	public WebDriverWait  wt;
	public WebDriverWait  wt1;
	public AppiumDriver<MobileElement>  ad;
	public AppiumDriver<MobileElement>  ad2;
	
	
	
//	@Test
	public void fistDevice()  {
		try {
			DesiredCapabilities dc= new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, dn1);
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, pn1);
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, s1);
			dc.setCapability("appPackage", apppackage);
			dc.setCapability("appActivity", appactivity);
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 0);
			url=new URL("http://127.0.0.1:4724/wd/hub");
			ad = new AndroidDriver<MobileElement>(url,dc);
		}catch(Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			
	}
//	@Test
	public void SecondDevice() {
		try {
			DesiredCapabilities dc1= new DesiredCapabilities();
			dc1.setCapability(MobileCapabilityType.DEVICE_NAME, dn2);
			dc1.setCapability(MobileCapabilityType.PLATFORM_NAME, pn2);
			dc1.setCapability(MobileCapabilityType.PLATFORM_VERSION, s);
			dc1.setCapability("appPackage", apppackage);
			dc1.setCapability("appActivity", appactivity);
			dc1.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 0);
			url1=new URL("http://127.0.0.1:4723/wd/hub");
			ad2 = new AndroidDriver<MobileElement>(url1,dc1);
		}catch(Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
