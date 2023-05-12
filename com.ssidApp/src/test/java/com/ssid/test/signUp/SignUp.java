package com.ssid.test.signUp;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ssid.base.Base;

public class SignUp extends Base {
	
	@Test
	public void Signup() {
		try {
			fistDevice();
			wt = new WebDriverWait(ad, (50));
			System.out.println("AccountType: "+acType);
			System.out.println("id: "+NewID);
			wt.until(ExpectedConditions.visibilityOfElementLocated(skip)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(register)).click();
			appType();
			wt.until(ExpectedConditions.visibilityOfElementLocated(createProfile)).click();
			for(int i=0;i<2;i++) {
				wt.until(ExpectedConditions.visibilityOfElementLocated(accept)).click();
			}
			wt.until(ExpectedConditions.visibilityOfElementLocated(Cemail)).sendKeys(NewMail);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Cpassword)).sendKeys(Password);
			wt.until(ExpectedConditions.visibilityOfElementLocated(CCpassword)).sendKeys(Password);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Cprofile)).click();
			Thread.sleep(2000);
			if(Mail.equals("MailSAC")) {
				MailSAC();
			}else if(Mail.equals("YopMail")) {
				yopmail();
			}else if(Mail.equals("MailDrop")) {
				mailDrop();
			}else if(Mail.equals("mailNesia")) {
				mailNesia();
			}
			submitOtp();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Continue)).click();
			newLogin();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Videntity)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Vcontinue)).click();
			if(acType.equals("Individual")) {
				if(ap.equals("YIDINDJI")) {
					indivisualFormYIDINDJI(wt);
				}else {
					IndividualidentityForm();
				}				
			}else if(acType.equals("Organization")) {
				OrganisetionIdentityForm(ad, wt);
			}			
			accApproval();						
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}		
}
