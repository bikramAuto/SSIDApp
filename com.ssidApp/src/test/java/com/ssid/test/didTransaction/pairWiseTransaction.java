package com.ssid.test.didTransaction;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ssid.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pairWiseTransaction extends Base {
	WebDriver driver;
	@Test(priority=2)
	public void pTransaction() throws InterruptedException {
		fistDevice();
		WebDriverManager.chromedriver().setup();
		wt = new WebDriverWait(ad, (60));
	    wt.until(ExpectedConditions.visibilityOfElementLocated(skip)).click();
	    wt.until(ExpectedConditions.visibilityOfElementLocated(Lemail)).sendKeys(Lid);
		wt.until(ExpectedConditions.visibilityOfElementLocated(Lpassword)).sendKeys(Lpsw);
		wt.until(ExpectedConditions.visibilityOfElementLocated(LoginBotten)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(Next)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(Enemonics)).sendKeys(Lmnemonics);
		wt.until(ExpectedConditions.visibilityOfElementLocated(lSubmit)).click();
		for (int i=0; i<2; i++) {
            pin(wt);
            wt.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
            Thread.sleep(100);
		}
		driver= new ChromeDriver();
		driver.get(Lurl);		
		wait= new WebDriverWait(driver, (60));
		Thread.sleep(5000);
		bct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@for='flexSwitchCheckChecked2'])[1]"))).getText();
		System.out.println("BlockChain Type: "+bct);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']"))).sendKeys(Ldid);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button']"))).click();
		try {
			Thread.sleep(5000);
			ad.findElement(tOk).click();
		}catch(Exception e){
			driver.navigate().refresh();
			Thread.sleep(1500);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']"))).sendKeys(Ldid);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button']"))).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(tOk)).click();
		}		
		pin(wt);
		wt.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(tOk)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[(text()='Transfer')])[1]"))).click();		
		if(ap.equals("MultiToken")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[(@id='receiver')]"))).sendKeys(User2did);
			driver.findElement(domain).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(MultiChain)).click();
			Thread.sleep(3000);
			Select crn = new Select(driver.findElement(currency));
			crn.selectByVisibleText(token);			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Amount']"))).sendKeys("1.27");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[2]"))).sendKeys("test");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
		}else {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[(@id='receiver')]"))).sendKeys(User2did);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Amount']"))).sendKeys("1.27");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[2]"))).sendKeys("test");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
		}
		try {
			Thread.sleep(5000);
			ad.findElement(tOk).click();
		}catch(Exception e) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[(text()='OK')]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[(@id='receiver')]"))).sendKeys(User2did);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Amount']"))).sendKeys("1.27");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[2]"))).sendKeys("test");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(tOk)).click();
		}		
		pin(wt);
		wt.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[(text()='OK')]"))).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(tOk)).click();
		driver.quit();
		
	}
	
	
	@Test(priority=1)
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
