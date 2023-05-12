package com.ssid.test.keyRotation;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ssid.base.Base;

import io.appium.java_client.MobileBy;

public class KeyRotation extends Base {
	
	@Test(priority=1)
	public void forgoteMnemonics() {
		try {
			fistDevice();
			wt = new WebDriverWait(ad, (40));
			wt.until(ExpectedConditions.visibilityOfElementLocated(skip)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Lemail)).sendKeys(NewMail);		
			ad.findElement(Lpassword).sendKeys(Password);
			ad.findElement(LoginBotten).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Next)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(forgot)).click();
			if(ap.equals("MultiToken")|ap.equals("YIDINDJI")) {
				wt.until(ExpectedConditions.visibilityOfElementLocated(submitid)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(TakePhoto)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(pm)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(Shutter)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(capture)).click();				
				wt.until(ExpectedConditions.visibilityOfElementLocated(selfi)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(iTakePhoto)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(Shutter)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(capture)).click();
			}else if(ap.equals("TokenChain")){
				wt.until(ExpectedConditions.visibilityOfElementLocated(Submitid)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(TakePhoto)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(cAllow)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(click)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(done)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(selfi)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(TakePhoto)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(click)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(done)).click();
			}else {
				wt.until(ExpectedConditions.visibilityOfElementLocated(Submitid)).click();
				Thread.sleep(1000);
				try {
					wt.until(ExpectedConditions.visibilityOfElementLocated(TakePhoto)).click();
					wt.until(ExpectedConditions.visibilityOfElementLocated(pm)).click();
					System.out.println("try");
				}catch(Exception e){			
					wt.until(ExpectedConditions.visibilityOfElementLocated(pm)).click();
					wt.until(ExpectedConditions.visibilityOfElementLocated(TakePhoto)).click();
					System.out.println("catch");
				}
				Thread.sleep(200);
				wt.until(ExpectedConditions.visibilityOfElementLocated(click)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(done)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(submitSelfie)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(TakePhoto)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(click)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(done)).click();
			}
			
			wt.until(ExpectedConditions.visibilityOfElementLocated(reason)).sendKeys("Testing");
			wt.until(ExpectedConditions.visibilityOfElementLocated(lSubmit)).click();
			if(Mail.equals("MailSAC")) {
				MailSAC();
			}else if(Mail.equals("YopMail")) {
				yopmail();
			}
			submitOtp();
			
			wt.until(ExpectedConditions.visibilityOfElementLocated(tOk)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(exitApp)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(tOk)).click();
			restoreAcApproval();
			
			
		}catch(Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	public void setMnemonics() throws InterruptedException {
		SecondDevice();
		wt1 = new WebDriverWait(ad2, (95));
		wt1.until(ExpectedConditions.visibilityOfElementLocated(skip)).click();
		wt1.until(ExpectedConditions.visibilityOfElementLocated(Lemail)).sendKeys(NewMail);
		wt1.until(ExpectedConditions.visibilityOfElementLocated(Lpassword)).sendKeys(Password);
		wt1.until(ExpectedConditions.visibilityOfElementLocated(LoginBotten)).click();
		if(ap.equals("TokenChain") | ap.equals("MetaMUI")) {
			wt1.until(ExpectedConditions.visibilityOfElementLocated(next)).click();
		}else {
			for(int i=0; i<2; i++) {
				wt1.until(ExpectedConditions.visibilityOfElementLocated(next)).click();
				Thread.sleep(100);
			}
		}		
		NewEnemonics = wt1.until(ExpectedConditions.visibilityOfElementLocated(Enemonics)).getText();
		System.out.println("new Mnemonics is: "+NewEnemonics);
		wt1.until(ExpectedConditions.visibilityOfElementLocated(checkbox)).click();
		ad2.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector"
				+ "().scrollable(true).instance(0)).scrollIntoView(new UiSelector()"
				+ ".textContains(\"Submit\").instance(0))")).click();		
		for(int p=0; p<2; p++) {
			pin(wt1);
            wt1.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();			
			Thread.sleep(100);
		}
		Thread.sleep(2000);
		ad2.quit();
	}
	
	
}
