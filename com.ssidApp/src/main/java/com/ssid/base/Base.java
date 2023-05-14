package com.ssid.base;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ssid.base.devices.Devices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends Devices {
	
	protected String otp;
	protected String NewEnemonics;
	protected WebDriverWait wait;
	protected String bct;
													
	protected By skip = MobileBy.xpath("//android.widget.TextView[@text=\">> Skip\"]");
	protected By register = MobileBy.xpath("//android.widget.TextView[@text=\"Register\"]");
	protected By individual = MobileBy.AccessibilityId("Individual");
	protected By Organization = MobileBy.AccessibilityId("Organization");
	protected By createProfile = MobileBy.xpath("//android.widget.TextView[@text=\"Next\"]");
	protected By accept = MobileBy.xpath("//android.widget.TextView[@text=\"Accept\"]");
	protected By Cemail = MobileBy.AccessibilityId("Email");
	protected By Cpassword = MobileBy.AccessibilityId("Password");
	protected By CCpassword = MobileBy.AccessibilityId("ConfirmPassword");
	protected By Cprofile = MobileBy.xpath("//android.widget.TextView[@text=\"Create Profile\"]");
	protected By cContinue = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]");
	private By rEmail = MobileBy.xpath("//android.widget.EditText[@content-desc=\"Email\"]");
	private By rPassword = MobileBy.xpath("//android.widget.EditText[@content-desc=\"Password\"]");
	private By rLogin = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]");
	protected By Videntity = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Next\"]");
	protected By Vcontinue = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]");
	
	private By Ifastname = MobileBy.AccessibilityId("Givenname");
	private By Ilastname = MobileBy.AccessibilityId("familyName");
	private By Idob = MobileBy.AccessibilityId("DOB");
	private By Iok = MobileBy.id("android:id/button1");
	private By Imob = MobileBy.AccessibilityId("PhoneNumber");
	private By Icity = MobileBy.xpath("//android.widget.EditText[@text=\"City\"]");
	private By Iprovinces = MobileBy.AccessibilityId("province");
	private By ICountry = MobileBy.AccessibilityId("Country");
	private By Ipin = MobileBy.xpath("//android.widget.EditText[@text=\"Zip code\"]");
	private By Raddress = MobileBy.AccessibilityId("Address");
	private By IDType = MobileBy.AccessibilityId("IDType");
	private By passport = MobileBy.xpath("//android.widget.TextView[@text=\"Passport\"]");	//Passport
	protected By IDNumber = MobileBy.AccessibilityId("IDNumber");
	protected By IDExp = MobileBy.AccessibilityId("IDExp");
	protected By SubmitId = MobileBy.AccessibilityId("SubmitId");
	protected By iTakePhoto = MobileBy.xpath("//android.widget.TextView[@text=\"Take Photo\"]"); 
	protected By pm = MobileBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	protected By Shutter = MobileBy.AccessibilityId("Shutter");
	protected By SubmitSelfie = MobileBy.AccessibilityId("SubmitSelfie"); // SubmitSelfie
	private By IFSubmit = MobileBy.AccessibilityId("Submit");
	private By ExitApp = MobileBy.AccessibilityId("ExitApp");
	protected By capture = MobileBy.AccessibilityId("Done");
	private By Exit = MobileBy.id("android:id/button1");
	
	protected By Lemail = MobileBy.AccessibilityId("Email");
	protected By Lpassword = MobileBy.AccessibilityId("Password");
	protected By LoginBotten = MobileBy.xpath("//android.widget.TextView[@text=\"Login\"]"); 
	protected By Next = MobileBy.AccessibilityId("Next");
	protected By Enemonics = MobileBy.AccessibilityId("Enemonics");
	protected By lSubmit = MobileBy.AccessibilityId("Submit");
	protected By fSubmit = MobileBy.AccessibilityId("Submit");	//Submit
	protected By wallet = MobileBy.xpath("//android.widget.TextView[@text=\"Wallet\"]");
	protected By Trasaction = MobileBy.xpath("//android.widget.TextView[@text=\"Payment\"]");

	protected By d2permition = MobileBy.id("com.android.packageinstaller:id/permission_allow_button");
	protected By d1permision = MobileBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	protected By tOk = MobileBy.id("android:id/button1"); //android:id/button1
	protected By To = MobileBy.AccessibilityId("To");
	protected By Amount = MobileBy.AccessibilityId("Amount");
	protected By Memo = MobileBy.AccessibilityId("Memo");
	protected By SendMoney = MobileBy.AccessibilityId("SendMoney");
	protected By forgot = MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"PasteEnemonics\"])[2]");
	protected By Submitid = MobileBy.AccessibilityId("Submitid");
	protected By TakePhoto = MobileBy.xpath("//android.widget.TextView[@text=\"Take Photo\"]");
	protected By cAllow = MobileBy.xpath("//android.widget.Button[@text=\"While using the app\"]");
	protected By click = MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]");
	protected By done = MobileBy.AccessibilityId("Done");
	protected By submitSelfie = MobileBy.AccessibilityId("Submitselfie");
	protected By reason = MobileBy.xpath("//android.widget.EditText[@content-desc=\"Reason\"]");
	protected By otpSubmit = MobileBy.AccessibilityId("Confirm");
	protected By exitApp = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"ExitApp\"]");
	protected By Continue = MobileBy.AccessibilityId("Continue");	// android:id/button1
	protected By checkbox = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Checkbox\"]");
	protected By submit = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]");
	protected By DIDName = MobileBy.AccessibilityId("DIDName");
	protected By View = MobileBy.xpath("(//button[(text()='View')])[1]");
	protected By rNext = MobileBy.xpath("//android.widget.TextView[@text=\"Next\"]");
	
	protected By submitid = MobileBy.AccessibilityId("submitid");
	protected By selfi = MobileBy.AccessibilityId("logo");
	protected By next = MobileBy.xpath("//android.widget.TextView[@text=\"Next\"]");
	protected By bbd = MobileBy.xpath("//android.widget.TextView[@text=\"Barbados CBDC : \"]");
	protected By PRNBG = MobileBy.xpath("//android.widget.TextView[@text=\"PRNBG : \"]");
	protected By OmnianRial = MobileBy.xpath("//android.widget.TextView[@text=\"Omnian Rial : \"]");
	protected By VietnamCBDC = MobileBy.xpath("//android.widget.TextView[@text=\"Vietnam CBDC : \"]");	
	protected By Tokens = MobileBy.xpath("//*/android.view.ViewGroup//android.widget.TextView[1]");
	
	protected By entityName = MobileBy.AccessibilityId("entityName");
	protected By entityNumber = MobileBy.AccessibilityId("entityNumber");
	protected By registrationName = MobileBy.AccessibilityId("registrationName");
	protected By PhoneNumber = MobileBy.AccessibilityId("PhoneNumber");
	protected By licenceNumber = MobileBy.AccessibilityId("licenceNumber");
	protected By website = MobileBy.AccessibilityId("website");
	protected By incorporation = MobileBy.AccessibilityId("incorporation");
	protected By business = MobileBy.AccessibilityId("business");
	protected By contactPerson = MobileBy.AccessibilityId("contactPerson");
	protected By additionalDetails = MobileBy.AccessibilityId("additionalDetails");
	protected By Address = MobileBy.AccessibilityId("Address");
	protected By Fax = MobileBy.AccessibilityId("Fax");
	protected By Country = MobileBy.AccessibilityId("Country");
	protected By suumit = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Submit\"]");
	protected By Document = MobileBy.AccessibilityId("Document");
	protected By domain = MobileBy.xpath("//button[@data-bs-toggle ='dropdown']");
	protected By MultiChain = MobileBy.xpath("//div[(text()='MultiChain')]");
	protected By currency = MobileBy.xpath("//select[@class='form-control admin-dropdown']");
	protected By Confirm = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Confirm\"]");
	
	protected By PostalAddress = MobileBy.AccessibilityId("PostalAddress");
	protected String newMail;
	protected String psw;
	protected String Notp;
	
//	@Test
	protected void mailNesia() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wait= new WebDriverWait(driver, (50));
		driver.get("https://mailnesia.com/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='mailbox']"))).sendKeys(NewID);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='sm']"))).click();
		
		Thread.sleep(5000);
//		driver.quit();
	}
	
//	@Test
	protected void mailDrop() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wait= new WebDriverWait(driver, (50));
		driver.get("https://maildrop.cc/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(//input[@type ='text'])[1]"))).sendKeys(NewID);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(//button[@type ='submit'])[1]"))).click();
		Thread.sleep(7000);
		Integer size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("frame size: "+size);
		driver.switchTo().frame(0);
		otp=driver.findElement(By.xpath("/html/body")).getText();
		otp = otp.replaceAll("[^0-9]", "");
		otp = StringUtils.left(otp, 6);
		System.out.println("otp: "+otp);
		driver.quit();
	}
	
//	@Test
	public void yopmail() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wait= new WebDriverWait(driver, (50));
		driver.get("https://yopmail.com/");		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//input[@placeholder='Enter your inbox here']"))).sendKeys(NewID);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//button[@title='Check Inbox @yopmail.com']"))).click();
		try {
			driver.switchTo().frame("a-z5yxnrpytufg");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//span[@role='checkbox']"))).click();
			System.out.println("insideTry");			
		}catch(Exception e) {
			System.out.println("insideCatch");
		}
		driver.switchTo().frame("ifmail");
		otp = wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//div[@id='mail']"))).getText();	//div[@id='mail']
		otp = otp.replaceAll("[^0-9]", "");
		otp = StringUtils.left(otp, 6);
		System.out.println("otp: "+otp);
		driver.quit();
	}
	
	
	public void indivisualFormYIDINDJI(WebDriverWait wt) {
		wt.until(ExpectedConditions.visibilityOfElementLocated(Ifastname)).sendKeys(FastName);
		wt.until(ExpectedConditions.visibilityOfElementLocated(Ilastname)).sendKeys(LastName);
		wt.until(ExpectedConditions.visibilityOfElementLocated(Idob)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(Iok)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(Address)).sendKeys(Adress);
		wt.until(ExpectedConditions.visibilityOfElementLocated(PostalAddress)).sendKeys(PostalPin);
		wt.until(ExpectedConditions.visibilityOfElementLocated(IFSubmit)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(IDType)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(passport)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(IDNumber)).sendKeys(NewID);
		wt.until(ExpectedConditions.visibilityOfElementLocated(IDExp)).sendKeys("123458678");
		wt.until(ExpectedConditions.visibilityOfElementLocated(SubmitId)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(TakePhoto)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(pm)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(Shutter)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(capture)).click();			
		wt.until(ExpectedConditions.visibilityOfElementLocated(SubmitSelfie)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(iTakePhoto)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(Shutter)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(capture)).click();			
		wt.until(ExpectedConditions.visibilityOfElementLocated(IFSubmit)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(ExitApp)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(Exit)).click();
	}
	
	public void PairWiselogin() throws InterruptedException {		
		WebDriverManager.chromedriver().setup();
		wt = new WebDriverWait(ad, (80));
	    wt.until(ExpectedConditions.visibilityOfElementLocated
	    		(skip)).click();
	    wt.until(ExpectedConditions.visibilityOfElementLocated
	    		(Lemail)).sendKeys(Lid);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(Lpassword)).sendKeys(Lpsw);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(LoginBotten)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(Next)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(Enemonics)).sendKeys(Lmnemonics);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(lSubmit)).click();
		for (int i=0; i<2; i++) {
            pin(wt);
            wt.until(ExpectedConditions.visibilityOfElementLocated
            		(fSubmit)).click();
		}
		driver= new ChromeDriver();
		driver.get(Lurl);		
		wait= new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		bct = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By
						.xpath("(//label[@for='flexSwitchCheckChecked2'])[1]"))).getText();
		System.out.println("BlockChain Type: "+bct);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//input[@type='checkbox']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//input[@type='text']"))).sendKeys(Ldid);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//button[@type='button']"))).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(tOk)).click();
		pin(wt);
        wt.until(ExpectedConditions.visibilityOfElementLocated(fSubmit)).click();
        wt.until(ExpectedConditions.visibilityOfElementLocated(tOk)).click();
	}
	
	public void OrganisetionIdentityForm
			(AppiumDriver<MobileElement>  ad, WebDriverWait wt) 
					throws InterruptedException {
		System.out.println("insude form");
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(entityName)).sendKeys(EntityName);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(entityNumber)).sendKeys(EntityNumber);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(registrationName)).sendKeys(RagistrationName);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(PhoneNumber)).sendKeys(MobileNumber);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(licenceNumber)).sendKeys(LicenceNumber);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(website)).sendKeys(WebSite);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(incorporation)).sendKeys(InCorporationDate);		
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(business)).sendKeys(Business);
		ad.findElement(MobileBy.AndroidUIAutomator
				("new UiScrollable(new UiSelector().scrollable"
						+ "(true)).scrollToEnd(400)"));
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(contactPerson)).sendKeys(ContactPersion);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(additionalDetails)).sendKeys(AddDetails);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(Address)).sendKeys(Adress);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(Fax)).sendKeys(fax);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(Country)).sendKeys(iCountry);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(suumit)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(Document)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(passport)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(IDNumber)).sendKeys("345678");
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(IDExp)).sendKeys("65432185");		
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(SubmitId)).click();
		Thread.sleep(1000);
		if(ap.equals("MetaMUI")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated
					(pm)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated
					(TakePhoto)).click();
		}else {
			wt.until(ExpectedConditions.visibilityOfElementLocated
					(TakePhoto)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated
					(pm)).click();
		}
//		try {
//			wt.until(ExpectedConditions.visibilityOfElementLocated
//					(TakePhoto)).click();
//			wt.until(ExpectedConditions.visibilityOfElementLocated
//					(pm)).click();
//			System.out.println("try");
//		}catch(Exception e){			
//			wt.until(ExpectedConditions.visibilityOfElementLocated
//					(pm)).click();
//			wt.until(ExpectedConditions.visibilityOfElementLocated
//					(TakePhoto)).click();
//			System.out.println("catch");
//		}
		Thread.sleep(200);
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(Shutter)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(capture)).click();		
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(SubmitSelfie)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(iTakePhoto)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(Shutter)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(capture)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(fSubmit)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(ExitApp)).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated
				(tOk)).click();		
	}
	
	public void appType() {
		if(acType.equals("Individual")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated
					(individual)).click();
		}else if(acType.equals("Organization")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated
					(Organization)).click();
		}
	}
	
//	@Test
	public void tokens() {
		List<MobileElement> tokens = ad.findElements(Tokens);
		System.out.println(tokens);
		
	}

	public void tokenType() {
		if(token.equals("Barbados CBDC")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated
					(bbd)).click();
		}else if(token.equals("PRNBG")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated
					(PRNBG)).click();			
		}else if(token.equals("Omnian Rial")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated
					(OmnianRial)).click();
		}else if(token.equals("Vietnam CBDC")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated
					(VietnamCBDC)).click();			
		}		
	}
	
	
	public void pin(WebDriverWait wt) {
		try {
			for (int p=1; p< 7; p++) {
	            wt.until(ExpectedConditions
	                    .visibilityOfElementLocated(MobileBy.xpath
	                    		("//android.widget.TextView[@text=\"" + p + 
	                    				"\"]"))).click();
	            Thread.sleep(100);
			}
        }catch(Exception e) {        	
        	e.printStackTrace();
		}		
	}
	
//	@Test
	public void MailSAC() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://mailsac.com/");
		driver.findElement(By.xpath
				("//input[@ng-model='myinbox']")).sendKeys(NewID);
		driver.findElement(By.xpath
				("//button[@ng-click='navToInbox(myinbox, postfix)']")).click();
		driver.findElement(By.xpath
				("/html/body/div/div[3]/div[1]/div/div[2]/div/table/tbody/tr[2]"))
						.click();
		try {
			otp = driver.findElement(By.xpath
					("//div[@ng-if='msg.body']")).getText();
			otp = otp.replaceAll("[^0-9]", "");
			otp = StringUtils.left(otp, 6);
			System.out.println("the otp is: "+otp);
			driver.quit();
		}catch(Exception e) {		
			for(int i=0; i<25; i++) {
				if(i==6 || i==12) {
					ad.findElement(By.xpath
							("//android.widget.TextView[@text=\"Resend OTP\"]")).click();
				}
				if (i<20) {
					driver.navigate().back();
					driver.navigate().refresh();
				}else if(i>=20) {
					Thread.sleep(1000);
					driver.navigate().refresh();
				}				
				Thread.sleep(1000);
				driver.findElement(By.xpath
						("//input[@ng-model='myinbox']")).sendKeys(NewID);
				driver.findElement(By.xpath
						("//button[@ng-click='navToInbox(myinbox, postfix)']")).click();
				driver.findElement(By.xpath
						("/html/body/div/div[3]/div[1]/div/div[2]/div/table/tbody/tr[2]"))
							.click();
				Thread.sleep(1000);
				try {
					Boolean element = driver.findElement(By.xpath
							("//div[@ng-if='msg.body']")).isDisplayed();
					System.out.println("elements: "+element);
					if(element.equals(true)) {
						otp = driver.findElement(By.xpath
								("//div[@ng-if='msg.body']")).getText();
						otp = otp.replaceAll("[^0-9]", "");
						otp = StringUtils.left(otp, 6);
						System.out.println("the otp is: "+otp);
						driver.quit();
						break;
					}				
				}catch(Exception o) {
					System.out.println("please wait not complited");
				}
			}
		}
	}
	
	
//	@Test
	public void submitOtp() throws InterruptedException {
		char[] totp = otp.toCharArray();
		System.out.println("inside sOtp");
		ad.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Input\"]"));
		for (int i = 0; i < totp.length; i++) {
            wt.until(ExpectedConditions.visibilityOfElementLocated(
                    MobileBy.xpath("//android.widget.EditText[@resource-id=\"otpInput-" + i + "\"]")))
                    .sendKeys(totp[i] + "");
        	}
		try {
			wt.until(ExpectedConditions.visibilityOfElementLocated(otpSubmit)).click();
		}catch(Exception e) {
			wt.until(ExpectedConditions.visibilityOfElementLocated(Confirm)).click();
		}
		
//		if(ap.equals("MetaMUI") | ap.equals("TokenChain") | ap.equals("MultiToken")) {
//			try {
//				wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1"))).click();
//			}catch(Exception e){
//				e.printStackTrace();
//			}
//		}
	}
	
//	@Test
	public void restoreAcApproval() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get(Lurl);
		wait= new WebDriverWait(driver, (60));
		bct = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//label[@for='flexSwitchCheckChecked2'])[1]"))).getText();
		System.out.println("BlockChain Type: "+bct);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@type='email']"))).sendKeys(Lid);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@type='password']"))).sendKeys(Lpsw);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@type='button']"))).click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[(text()='Restore Account Request')]"))).click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(View)).click();				
		Actions at = new Actions(driver);
	    at.sendKeys(Keys.PAGE_DOWN).build().perform();
	    wait.until(ExpectedConditions
	    		.visibilityOfElementLocated(By.xpath("//button[(text()='Accept')]"))).click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[(text()='Confirm')]"))).click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[(text()='OK')])[1]"))).click();
	    driver.quit();
	    
	}
	
	public void newLogin() {
		wt.until(ExpectedConditions.visibilityOfElementLocated(rEmail)).sendKeys(NewMail);
		ad.findElement(rPassword).sendKeys(Password);
		ad.findElement(rLogin).click();
	}
	
	public void IndividualidentityForm() {
		try {
			wt = new WebDriverWait(ad, (20));
			System.out.println("insude form");
			wt.until(ExpectedConditions.visibilityOfElementLocated(Ifastname)).sendKeys(FastName);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Ilastname)).sendKeys(LastName);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Idob)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Iok)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Icity)).sendKeys(City);
			wt.until(ExpectedConditions.visibilityOfElementLocated(ICountry)).sendKeys(iCountry);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Ipin)).sendKeys(PostalPin);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Imob)).sendKeys(MobileNumber);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Iprovinces)).sendKeys(State);
			wt.until(ExpectedConditions.visibilityOfElementLocated(Raddress)).sendKeys(Adress);					
			ad.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)"
					+ ".instance(0)).scrollIntoView(new UiSelector().textContains(\"Submit\").instance(0))")).click();			
			wt.until(ExpectedConditions.visibilityOfElementLocated(IDType)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(passport)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(IDNumber)).sendKeys(NewID);
			wt.until(ExpectedConditions.visibilityOfElementLocated(IDExp)).sendKeys("123458678");
			wt.until(ExpectedConditions.visibilityOfElementLocated(SubmitId)).click();
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
			wt.until(ExpectedConditions.visibilityOfElementLocated(Shutter)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(capture)).click();			
			wt.until(ExpectedConditions.visibilityOfElementLocated(SubmitSelfie)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(iTakePhoto)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Shutter)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(capture)).click();			
			wt.until(ExpectedConditions.visibilityOfElementLocated(IFSubmit)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(ExitApp)).click();
			wt.until(ExpectedConditions.visibilityOfElementLocated(Exit)).click();				
		}catch(Exception e){
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}		
	}
	
//	@Test
	public void accApproval() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Lurl);		
		wait= new WebDriverWait(driver, (60));
		bct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@for='flexSwitchCheckChecked2'])[1]"))).getText();
		System.out.println("BlockChain Type: "+bct);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']"))).sendKeys(Lid);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))).sendKeys(Lpsw);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button']"))).click();
		if(acType.equals("Individual")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[(text()='Individual')]"))).click();
		}else if(acType.equals("Organization")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[(text()='Business')]"))).click();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[(text()='View')])[1]"))).click();		
		Actions at = new Actions(driver);
	    at.sendKeys(Keys.PAGE_DOWN).build().perform();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[(text()='Approve')]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[(text()='OK')]"))).click();
	    driver.quit();
	}
	
	
}
