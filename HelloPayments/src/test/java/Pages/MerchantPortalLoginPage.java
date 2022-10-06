package Pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Util.testbaseclass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MerchantPortalLoginPage extends testbaseclass {
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement Login_UserName;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Login_Password;
	
	@FindBy(xpath = "//button[contains(@class,'ui massive fluid primary button')]")
	WebElement Login_SignIn;
	
	public MerchantPortalLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean VerifyHelloPaymentsAdminPortalLoginPage() {
		try {
			Login_UserName.isDisplayed();
			return true;
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public void EnterUserName(String sUserName) {
		try {
			Login_UserName.sendKeys(sUserName);
		}catch(NoSuchElementException e) {
			e.getMessage();
		}		
	}
	
	public void EnterPassword(String sPassword) {
		try {
			Login_Password.sendKeys(sPassword);
			testbaseclass.screenShot("EnterPassword");
		}catch(NoSuchElementException e) {
			e.getMessage();
		}	
	}
	public void ClickSignIn() {
		try {
			Login_SignIn.click();
			Thread.sleep(7000);
			testbaseclass.screenShot("ClickSignIn");
			
		}catch(NoSuchElementException e) {
			e.getMessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//public void VerifyLoginError() {
		
		
		
	//}
	}
	
	

		
}
		
	

		

		    	
	    	
	    
	