package com.ssid.test.didCreation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ssid.base.Base;

import io.appium.java_client.MobileBy;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DidCreation extends Base {
	
	protected String did;
	@Test
	public void didCreation() {
		try {
			WebDriverManager.chromedriver().setup();
			fistDevice();
			wt = new WebDriverWait(ad, (80));
			driver= new ChromeDriver();
			driver.get(Lurl);		
			wait= new WebDriverWait(driver, (60));
			Thread.sleep(5000);
			bct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
					("(//label[@for='flexSwitchCheckChecked2'])[1]"))).getText();
			System.out.println();
			System.out.println("BlockChain Type: "+bct);
			driver.quit();
			System.out.println(java.time.LocalDateTime.now());
			System.out.println("application name: "+ap);
			System.out.println("AccountType: "+acType);
			System.out.println("Login id: "+NewMail);
			System.out.println("Password: "+Password);
			wt.until(ExpectedConditions.visibilityOfElementLocated(skip)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Lemail)).sendKeys(NewMail);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Lpassword)).sendKeys(Password);
			wt.until(ExpectedConditions.visibilityOfElementLocated(LoginBotten)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Videntity)).click();
			NewEnemonics = wt.until(ExpectedConditions.visibilityOfElementLocated(Enemonics)).getText();
			System.out.println("Mnemonics: "+NewEnemonics);
			wt.until(ExpectedConditions.visibilityOfElementLocated(checkbox)).click();
			ad.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)"
					+ ".instance(0)).scrollIntoView(new UiSelector().textContains(\"Submit\").instance(0))")).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(DIDName)).sendKeys(NewID);
			wt.until(ExpectedConditions.visibilityOfElementLocated(submit)).click();
			for(int i=0; i<2;i++) {
				pin(wt);
				wt.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
				Thread.sleep(100);
			}
			if(ap.equals("YIDINDJI")) {
				System.out.println("New DID: did:yidindji:"+NewID);				
			}else {
				System.out.println("New DID: did:ssid:"+NewID);
			}			
			System.out.println();
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
