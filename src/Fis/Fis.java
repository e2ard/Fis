package Fis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.thoughtworks.selenium.Selenium;

public class Fis {
	private FirefoxDriver firefoxDriver;
	private String url = "https://istestsecure.vic.lt/Public/Login.aspx?ReturnUrl=%2fFis%2fExportCertificateList.aspx";
	
	public Fis(){
		firefoxDriver = new FirefoxDriver();
	}
	
	public void connect(){
		firefoxDriver.get(url);
		
		if(firefoxDriver.getTitle().contains("Prisijungimas prie sistemos")){
			System.out.println("Connected");
		}else
			System.out.println("Not connected");
	}
	public void logIn(String user, String pass){
		
		String userId= "ctl00_PublicPlaceHolder_UserName";
		WebElement userInput = firefoxDriver.findElement(By.id(userId));
		userInput.sendKeys(user);
		
		String passId = "ctl00_PublicPlaceHolder_Password";
		WebElement passInput = firefoxDriver.findElement(By.id(passId));
		passInput.sendKeys(pass);
		
		WebElement prisijunti = firefoxDriver.findElement(By.id("ctl00_PublicPlaceHolder_LoginButton"));
		prisijunti.click();
		
		if(firefoxDriver.getTitle().contains("Paraiškų / sertifikatų paieška")){
			System.out.println("Connected");
		}else
			System.out.println("Not connected");
	}

}
