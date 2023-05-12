import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public void MailSAC() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://mailsac.com/");
		driver.findElement(By.xpath
				("//input[@ng-model='myinbox']")).sendKeys(NewID);
		driver.findElement(By.xpath
				("//button[@ng-click='navToInbox(myinbox, postfix)']")).click();
		driver.findElement(By.xpath
				("/html/body/div/div[3]/div[1]/div/div[2]/div/table/tbody/tr[2]")).click();
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