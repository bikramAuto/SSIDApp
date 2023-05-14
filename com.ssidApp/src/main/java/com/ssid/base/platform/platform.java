package com.ssid.base.platform;

import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;


public class platform {
		
	//Device1
	public String dn1;
	public String pn1;
	public int pv1;
	public String s1;
	
	//Device2
	public String dn2;
	public String pn2;
	public int pv2;
	public String s;
	
	//User1
	public String User1id;
	public String User1psw;
	public String User1did;
	public String User1MNEMONICS;
	public double User1;
	public String amt1;
	
	//User2
	public String User2id;
	public String User2psw;
	public String User2did;
	public String User2MNEMONICS;
	public double User2;
	public String amt2;
	
	//MultiToken
	protected String token;		
	protected String Lurl;
	protected String Lid;
	protected String Lpsw;
	protected String Ldid;
	protected String Lmnemonics;
	protected String ap;
	
	protected String apppackage;
	protected String appactivity;
	
	//SignUp Data
	protected String NewID;
	protected String NewMail;
	protected String Password;
	protected String FastName;
	protected String LastName;
	protected String City;
	protected String iCountry;
	protected String PostalPin;
	protected String MobileNumber;
	protected String State;
	protected String Adress;
	protected String EntityName;
	protected String EntityNumber;
	protected String RagistrationName;
	protected String LicenceNumber;
	protected String WebSite;
	protected String InCorporationDate;
	protected String Business;
	protected String ContactPersion;
	protected String AddDetails;
	protected String fax;
	protected String Mail;
	protected int mn;
	protected int En;
	protected int pp;
	protected int id;
	protected int fx;
	protected String os;
	protected String filePath;
	
	
	public String acType;

	@SuppressWarnings("resource")
	@BeforeTest
	public void Excel() throws IOException, InvalidFormatException {		
		os = System.getProperty("os.name");
		os = os.replaceAll("[^a-zA-Z]", "");
		System.out.println("os: "+os);		
		if (os.equals("Windows")) {
			String userHome = System.getProperty("user.home");
			filePath = userHome + File.separator + "OneDrive" + File.separator + "Desktop" + File.separator
					+ "Test_Android" + File.separator + "Book.xlsx";
			
		}else {			
			String userHome = System.getProperty("user.home");
			filePath = userHome + File.separator + "Desktop" + File.separator
					+ "Test_Android" + File.separator + "Book.xlsx";
			
		}		
		File inputStream = new File(filePath);
		System.out.println("file parh: "+inputStream);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet1 = workbook.getSheetAt(0);
		ap = sheet1.getRow(1).getCell(6).getStringCellValue();
		acType = sheet1.getRow(3).getCell(6).getStringCellValue();
		NewID = sheet1.getRow(5).getCell(6).getStringCellValue();
		Mail = sheet1.getRow(22).getCell(6).getStringCellValue();
		if(Mail.equals("MailSAC")) {
			NewMail = NewID+"@mailsac.com";
		}else if(Mail.equals("YopMail")) {
			NewMail = NewID+"@yopmail.com";
		}else if(Mail.equals("MailDrop")) {
			NewMail = NewID+"@maildrop.cc";
		}else if(Mail.equals("mailNesia")) {
			NewMail = NewID+"@mailnesia.com";
		}
		Password = sheet1.getRow(6).getCell(6).getStringCellValue();
		System.out.println("application name: "+ap);
		
		if(acType.equals("Individual")) {
			Sheet sheet = workbook.getSheetAt(0);			
			FastName = sheet.getRow(8).getCell(4).getStringCellValue();
			LastName = sheet.getRow(9).getCell(4).getStringCellValue();
			City = sheet.getRow(10).getCell(4).getStringCellValue();
			iCountry = sheet.getRow(11).getCell(4).getStringCellValue();
			pp = (int)sheet.getRow(12).getCell(4).getNumericCellValue();
			PostalPin = Integer.toString(pp);
			mn = (int) sheet.getRow(13).getCell(4).getNumericCellValue();
			MobileNumber = Integer.toString(mn);
			State = sheet.getRow(14).getCell(4).getStringCellValue();
			Adress = sheet.getRow(15).getCell(4).getStringCellValue();
			
		}else if(acType.equals("Organization")) {
			Sheet sheet = workbook.getSheetAt(0);
			EntityName = sheet.getRow(8).getCell(7).getStringCellValue();
			
			En = (int) sheet.getRow(9).getCell(7).getNumericCellValue();
			EntityNumber = Integer.toString(En);
			
			RagistrationName = sheet.getRow(10).getCell(7).getStringCellValue();
			
			mn = (int)sheet.getRow(11).getCell(7).getNumericCellValue();
			MobileNumber = Integer.toString(mn);
			
			LicenceNumber = sheet.getRow(12).getCell(7).getStringCellValue();
			WebSite = sheet.getRow(13).getCell(7).getStringCellValue();
			id = (int)sheet.getRow(14).getCell(7).getNumericCellValue();
			InCorporationDate = Integer.toString(id);
			Business = sheet.getRow(15).getCell(7).getStringCellValue();
			ContactPersion = sheet.getRow(16).getCell(7).getStringCellValue();
			AddDetails = sheet.getRow(17).getCell(7).getStringCellValue();
			Adress = sheet.getRow(18).getCell(7).getStringCellValue();
			fx = (int)sheet.getRow(19).getCell(7).getNumericCellValue();
			fax = Integer.toString(fx);
			iCountry = sheet.getRow(20).getCell(7).getStringCellValue();
		}
		
		if( ap.equals("MetaMUI")) {
			Sheet sheet = workbook.getSheetAt(2);			
			
			apppackage= "id.metamui.ssid";
			appactivity= "id.metamui.ssid.MainActivity";
			
			User1id = sheet.getRow(1).getCell(1).getStringCellValue();
			User1psw = sheet.getRow(2).getCell(1).getStringCellValue();
			User1did = sheet.getRow(3).getCell(1).getStringCellValue();
			User1MNEMONICS = sheet.getRow(4).getCell(1).getStringCellValue();
			User1 = (double) sheet.getRow(5).getCell(1).getNumericCellValue();
			amt1=Double.toString(User1);
			
			User2id = sheet.getRow(1).getCell(3).getStringCellValue();
			User2psw = sheet.getRow(2).getCell(3).getStringCellValue();
			User2did = sheet.getRow(3).getCell(3).getStringCellValue();
			User2MNEMONICS = sheet.getRow(4).getCell(3).getStringCellValue();
			User2 = (double) sheet.getRow(5).getCell(3).getNumericCellValue();
			amt2=Double.toString(User2);
			
			dn1 = sheet.getRow(7).getCell(1).getStringCellValue();
			pn1 = sheet.getRow(8).getCell(1).getStringCellValue();
			pv1 = (int) sheet.getRow(9).getCell(1).getNumericCellValue();
			s1=Integer.toString(pv1);
			
			dn2 = sheet.getRow(7).getCell(3).getStringCellValue();
			pn2 = sheet.getRow(8).getCell(3).getStringCellValue();
			pv2 = (int) sheet.getRow(9).getCell(3).getNumericCellValue();
			s=Integer.toString(pv2);
			
			Lurl = "https://swn-admin.metamui.network/login";
			Lid = sheet.getRow(12).getCell(1).getStringCellValue();
			Lpsw = sheet.getRow(13).getCell(1).getStringCellValue();
			Lmnemonics = sheet.getRow(15).getCell(1).getStringCellValue();
			Ldid = sheet.getRow(14).getCell(1).getStringCellValue();
			
			System.out.println("Sender Device");
			System.out.println();
			System.out.println(dn1);
			System.out.println(pn1);
			System.out.println(s1);
			
			System.out.println("receiver Device");
			System.out.println();
			System.out.println(dn2);
			System.out.println(pn2);
			System.out.println(s);
			
			System.out.println();
			System.out.println(User1id);
			System.out.println(User1psw);
			System.out.println(User1did);
			System.out.println(User1MNEMONICS);
			System.out.println("amount: "+amt1);
			
			System.out.println();
			System.out.println(User2id);
			System.out.println(User2psw);
			System.out.println(User2did);
			System.out.println(User2MNEMONICS);
			System.out.println("amount: "+amt2);
			
		}else if(ap.equals("TokenChain")) {
			Sheet sheet = workbook.getSheetAt(1);			
			
			apppackage= "id.cbdc.token";
			appactivity= "id.cbdc.token.MainActivity";
			
			User1id = sheet.getRow(1).getCell(1).getStringCellValue();
			User1psw = sheet.getRow(2).getCell(1).getStringCellValue();
			User1did = sheet.getRow(3).getCell(1).getStringCellValue();
			User1MNEMONICS = sheet.getRow(4).getCell(1).getStringCellValue();
			User1 = (double) sheet.getRow(5).getCell(1).getNumericCellValue();
			amt1=Double.toString(User1);
			
			User2id = sheet.getRow(1).getCell(3).getStringCellValue();
			User2psw = sheet.getRow(2).getCell(3).getStringCellValue();
			User2did = sheet.getRow(3).getCell(3).getStringCellValue();
			User2MNEMONICS = sheet.getRow(4).getCell(3).getStringCellValue();			
			
			dn1 = sheet.getRow(7).getCell(1).getStringCellValue();
			pn1 = sheet.getRow(8).getCell(1).getStringCellValue();
			pv1 = (int) sheet.getRow(9).getCell(1).getNumericCellValue();
			s1=Integer.toString(pv1);
			
			dn2 = sheet.getRow(7).getCell(3).getStringCellValue();
			pn2 = sheet.getRow(8).getCell(3).getStringCellValue();
			pv2 = (int) sheet.getRow(9).getCell(3).getNumericCellValue();
			s=Integer.toString(pv2);
			
			Lurl = "https://new-blockchain-cbdc-admin.web.app/login";
			Lid = sheet.getRow(12).getCell(1).getStringCellValue();
			Lpsw = sheet.getRow(13).getCell(1).getStringCellValue();
			Lmnemonics = sheet.getRow(15).getCell(1).getStringCellValue();
			Ldid = sheet.getRow(14).getCell(1).getStringCellValue();
			
			System.out.println();
			System.out.println(dn1);
			System.out.println(pn1);
			System.out.println(s1);
			
			System.out.println();
			System.out.println(dn2);
			System.out.println(pn2);
			System.out.println(s);
			
			System.out.println();
			System.out.println(User1id);
			System.out.println(User1psw);
			System.out.println(User1did);
			System.out.println(User1MNEMONICS);
			System.out.println("amount: "+amt1);
			
			System.out.println();
			System.out.println(User2id);
			System.out.println(User2psw);
			System.out.println(User2did);
			System.out.println(User2MNEMONICS);
			
		}else if(ap.equals("MultiToken")) {
			Sheet sheet = workbook.getSheetAt(3);
			
			apppackage= "id.cbdc.ssid";
			appactivity= "id.cbdc.ssid.MainActivity";
			
			User1id = sheet.getRow(1).getCell(1).getStringCellValue();
			User1psw = sheet.getRow(2).getCell(1).getStringCellValue();
			User1did = sheet.getRow(3).getCell(1).getStringCellValue();
			User1MNEMONICS = sheet.getRow(4).getCell(1).getStringCellValue();
			User1 = (double) sheet.getRow(5).getCell(2).getNumericCellValue();
			amt1=Double.toString(User1);
			
			User2id = sheet.getRow(1).getCell(3).getStringCellValue();
			User2psw = sheet.getRow(2).getCell(3).getStringCellValue();
			User2did = sheet.getRow(3).getCell(3).getStringCellValue();
			User2MNEMONICS = sheet.getRow(4).getCell(3).getStringCellValue();
			
			dn1 = sheet.getRow(7).getCell(1).getStringCellValue();
			pn1 = sheet.getRow(8).getCell(1).getStringCellValue();
			pv1 = (int) sheet.getRow(9).getCell(1).getNumericCellValue();
			s1=Integer.toString(pv1);
			
			dn2 = sheet.getRow(7).getCell(3).getStringCellValue();
			pn2 = sheet.getRow(8).getCell(3).getStringCellValue();
			pv2 = (int) sheet.getRow(9).getCell(3).getNumericCellValue();
			s=Integer.toString(pv2);
			
			Lurl = "https://new-blockchain-cbdc-admin.web.app/login";
			Lid = sheet.getRow(12).getCell(1).getStringCellValue();
			Lpsw = sheet.getRow(13).getCell(1).getStringCellValue();
			token = sheet.getRow(5).getCell(0).getStringCellValue();
			Ldid = sheet.getRow(14).getCell(1).getStringCellValue();
			Lmnemonics = sheet.getRow(15).getCell(1).getStringCellValue();
			
			System.out.println();
			System.out.println(dn1);
			System.out.println(pn1);
			System.out.println(s1);
			
			System.out.println();
			System.out.println(dn2);
			System.out.println(pn2);
			System.out.println(s);
			
			System.out.println();
			System.out.println(User1id);
			System.out.println(User1psw);
			System.out.println(User1did);
			System.out.println(User1MNEMONICS);
			
			System.out.println();
			System.out.println("TokenType: "+token);
			System.out.println("amount: "+amt1);
			
			System.out.println();
			System.out.println(User2id);
			System.out.println(User2psw);
			System.out.println(User2did);
			System.out.println(User2MNEMONICS);
			System.out.println();
						
		}else if(ap.equals("YIDINDJI")) {
			Sheet sheet = workbook.getSheetAt(4);
			
			apppackage= "id.yidindji.govt.ssid"; 		
			appactivity= "id.yidindji.govt.ssid.MainActivity";
			
			User1id = sheet.getRow(1).getCell(1).getStringCellValue();
			User1psw = sheet.getRow(2).getCell(1).getStringCellValue();
			User1did = sheet.getRow(3).getCell(1).getStringCellValue();
			User1MNEMONICS = sheet.getRow(4).getCell(1).getStringCellValue();
			User1 = (double) sheet.getRow(5).getCell(1).getNumericCellValue();
			amt1=Double.toString(User1);
			
			User2id = sheet.getRow(1).getCell(3).getStringCellValue();
			User2psw = sheet.getRow(2).getCell(3).getStringCellValue();
			User2did = sheet.getRow(3).getCell(3).getStringCellValue();
			User2MNEMONICS = sheet.getRow(4).getCell(3).getStringCellValue();
			
			dn1 = sheet.getRow(7).getCell(1).getStringCellValue();
			pn1 = sheet.getRow(8).getCell(1).getStringCellValue();
			pv1 = (int) sheet.getRow(9).getCell(1).getNumericCellValue();
			s1=Integer.toString(pv1);
			
			dn2 = sheet.getRow(7).getCell(3).getStringCellValue();
			pn2 = sheet.getRow(8).getCell(3).getStringCellValue();
			pv2 = (int) sheet.getRow(9).getCell(3).getNumericCellValue();
			s=Integer.toString(pv2);
			
			Lurl = "https://ssid-admin-panel.web.app/";
			Lid = sheet.getRow(12).getCell(1).getStringCellValue();
			Lpsw = sheet.getRow(13).getCell(1).getStringCellValue();
			token = sheet.getRow(5).getCell(0).getStringCellValue();
			Ldid = sheet.getRow(14).getCell(1).getStringCellValue();
			Lmnemonics = sheet.getRow(15).getCell(1).getStringCellValue();
			
			System.out.println();
			System.out.println(dn1);
			System.out.println(pn1);
			System.out.println(s1);
			
			System.out.println();
			System.out.println(dn2);
			System.out.println(pn2);
			System.out.println(s);
			
			System.out.println();
			System.out.println(User1id);
			System.out.println(User1psw);
			System.out.println(User1did);
			System.out.println(User1MNEMONICS);
			
			System.out.println();
			System.out.println("amount: "+amt1);
			
			System.out.println();
			System.out.println(User2id);
			System.out.println(User2psw);
			System.out.println(User2did);
			System.out.println(User2MNEMONICS);
			System.out.println();
						
		}
		System.out.println();
		System.out.println("admin url: "+Lurl);
		System.out.println("admin id: "+Lid);
		System.out.println("admin password: "+Lpsw);
		System.out.println("admin mnemonics: "+Lmnemonics);
		System.out.println("admin DID: "+Ldid);
	}
	
	
}
