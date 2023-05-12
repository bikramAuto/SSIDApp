package com.ssid.test.pairWiseLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ssid.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PairWiseLogin extends Base {
	@Test
	public void PairwiseTrust() throws InterruptedException {
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
		}
		driver= new ChromeDriver();
		driver.get(Lurl);		
		wait= new WebDriverWait(driver, (30));
		bct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@for='flexSwitchCheckChecked2'])[1]"))).getText();
		System.out.println("BlockChain Type: "+bct);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']"))).sendKeys(Ldid);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button']"))).click();
		try {
			wt.until(ExpectedConditions.visibilityOfElementLocated(tOk)).click();
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
			Select crn = new Select(driver.findElement(currency));
			crn.selectByVisibleText(token);			
			driver.findElement(By.xpath("//input[@type='number']")).sendKeys("2.7");
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("test");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}else {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[(@id='receiver')]"))).sendKeys(User2did);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Amount']"))).sendKeys("1.27");
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("test");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		wt.until(ExpectedConditions.visibilityOfElementLocated(tOk)).click();
		pin(wt);
		wt.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(tOk)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[(text()='OK')]"))).click();
		driver.quit();
		
	}

}
