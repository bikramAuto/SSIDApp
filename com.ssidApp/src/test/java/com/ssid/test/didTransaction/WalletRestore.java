package com.ssid.test.didTransaction;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ssid.base.Base;

public class WalletRestore extends Base {
	
	@Test
	public void walletOpen() {
		try {
			SecondDevice();
			wt1 = new WebDriverWait(ad2, (70));
			wt1.until(ExpectedConditions.visibilityOfElementLocated(skip)).click();
			wt1.until(ExpectedConditions.visibilityOfElementLocated(Lemail)).sendKeys(User2id);		
			ad2.findElement(Lpassword).sendKeys(User2psw);
			ad2.findElement(LoginBotten).click();
			wt1.until(ExpectedConditions.visibilityOfElementLocated(Next)).click();
			wt1.until(ExpectedConditions.visibilityOfElementLocated(Enemonics)).sendKeys(User2MNEMONICS);
			ad2.findElement(lSubmit).click();
			for(int i=0; i<2; i++) {
				pin(wt1);
				wt1.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
				Thread.sleep(100);
			}
	 	   wt1.until(ExpectedConditions.visibilityOfElementLocated(wallet)).click();	 
		   if(ap.equals("MultiToken")) {				 
			   if(token.equals("Barbados CBDC")) {
				wt1.until(ExpectedConditions.visibilityOfElementLocated(bbd)).click();
			   }else if(token.equals("PRNBG")) {
				wt1.until(ExpectedConditions.visibilityOfElementLocated(PRNBG)).click();			
			   }else if(token.equals("Omnian Rial")) {
				wt1.until(ExpectedConditions.visibilityOfElementLocated(OmnianRial)).click();
			   }else if(token.equals("Vietnam CBDC")) {
				wt1.until(ExpectedConditions.visibilityOfElementLocated(VietnamCBDC)).click();			
			   }
		    }
			 
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
	}
}
