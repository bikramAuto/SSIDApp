package com.ssid.test.didTransaction;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ssid.base.Base;

public class DidTransaction extends Base {
	 
	@Test
	public void didTrasaction()  {
		try {
			fistDevice();
			wt = new WebDriverWait(ad, (80));
			if(ap.equals("MultiToken")) {
				wt.until(ExpectedConditions.visibilityOfElementLocated(skip)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(Lemail)).sendKeys(User1id);		
				ad.findElement(Lpassword).sendKeys(User1psw);
				ad.findElement(LoginBotten).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(Next)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(Enemonics)).sendKeys(User1MNEMONICS);
				ad.findElement(lSubmit).click();
				for(int i=0; i<2;i++) {
					pin(wt);
					wt.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
					Thread.sleep(100);
				}
				 wt.until(ExpectedConditions.visibilityOfElementLocated(wallet)).click();
				 tokenType();
				 Thread.sleep(4000);				 
				 wt.until(ExpectedConditions.visibilityOfElementLocated(Trasaction)).click();
					try {
						wt.until(ExpectedConditions.visibilityOfElementLocated(d1permision)).click();
					}catch(Exception e) {
						wt.until(ExpectedConditions.visibilityOfElementLocated(d2permition)).click();	
					}
					Thread.sleep(3000);
					wt.until(ExpectedConditions.visibilityOfElementLocated(To)).sendKeys(User2did);
					wt.until(ExpectedConditions.visibilityOfElementLocated(Amount)).sendKeys(amt1);
					wt.until(ExpectedConditions.visibilityOfElementLocated(Memo)).sendKeys("Testing");
					Thread.sleep(1000);
					wt.until(ExpectedConditions.visibilityOfElementLocated(SendMoney)).click();
					pin(wt);
					wt.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();			 
					wt.until(ExpectedConditions.visibilityOfElementLocated(tOk)).click();
				 
			}else {
				wt.until(ExpectedConditions.visibilityOfElementLocated(skip)).click();
			    wt.until(ExpectedConditions.visibilityOfElementLocated(Lemail)).sendKeys(User1id);
				wt.until(ExpectedConditions.visibilityOfElementLocated(Lpassword)).sendKeys(User1psw);
				wt.until(ExpectedConditions.visibilityOfElementLocated(LoginBotten)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(Next)).click();
				wt.until(ExpectedConditions.visibilityOfElementLocated(Enemonics)).sendKeys(User1MNEMONICS);
				wt.until(ExpectedConditions.visibilityOfElementLocated(lSubmit)).click();
				for(int i=0; i<2;i++) {
					pin(wt);
					wt.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
					Thread.sleep(100);
				}
				
				wt.until(ExpectedConditions.visibilityOfElementLocated(Trasaction)).click();								
				try {
					wt.until(ExpectedConditions.visibilityOfElementLocated(d1permision)).click();
				}catch(Exception e) {
					wt.until(ExpectedConditions.visibilityOfElementLocated(d2permition)).click();	
				}
				Thread.sleep(3000);
				wt.until(ExpectedConditions.visibilityOfElementLocated(To)).sendKeys(User2did);
				wt.until(ExpectedConditions.visibilityOfElementLocated(Amount)).sendKeys(amt1);
				wt.until(ExpectedConditions.visibilityOfElementLocated(Memo)).sendKeys("Testing");
				Thread.sleep(1000);
				wt.until(ExpectedConditions.visibilityOfElementLocated(SendMoney)).click();
				pin(wt);
				wt.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();			 
				wt.until(ExpectedConditions.visibilityOfElementLocated(tOk)).click();
			}
		    
			
		}catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
		
		
	}
	
	@Test
	public void awalletOpen() {
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
			for(int i=0; i<2;i++) {
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
