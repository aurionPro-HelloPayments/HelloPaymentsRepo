package Pages;
import java.util.List;
import java.util.UUID;

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


public class MerchantAddProductsPage extends testbaseclass {
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement Login_UserName;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Login_Password;
	
	@FindBy(xpath = "//button[contains(@class,'ui massive fluid primary button')]")
	WebElement Login_SignIn;
	
	@FindBy(xpath = "//span[contains(text(),' Products ')]")
	WebElement Menu_Product;
	
	@FindBy(xpath = "//Button[contains(text(),'Add Product ')]")
	WebElement Add_Product;
	
	@FindBy(xpath = "//div[@class='eight wide required field']//input[@placeholder='Product Name']")
	WebElement Product_Name;
	
	@FindBy(xpath = "//input[@placeholder='0.00']")
	WebElement Product_Unit_Price;
	
	@FindBy(xpath = "//textarea[@placeholder='Product Description']")
	WebElement Product_Description;
	
	@FindBy(xpath = "//button[@class='ui normal primary button']")
	WebElement Product_Save;
	
	
	
	public MerchantAddProductsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterProductName(String productName)
	{
		try {
			String uuid = UUID.randomUUID().toString();
			
			productName = productName + uuid.substring(0,8);
			Product_Name.sendKeys(productName);;
		}catch(NoSuchElementException e) {
			e.getMessage();
		}
	}
	
	
	public void enterUnitPrice(String unitPrice)
	{
		try {
			Product_Unit_Price.sendKeys(unitPrice);;
		}catch(NoSuchElementException e) {
			e.getMessage();
		}
	}
	
	public void enterUnitProductDescription(String productDescription)
	{
		try {
			Product_Description.sendKeys(productDescription);;
		}catch(NoSuchElementException e) {
			e.getMessage();
		}
	}

	
	
	public void clickSaveProducts() throws InterruptedException
	{
		try {
			Product_Save.click();
			Thread.sleep(7000);
			testbaseclass.screenShot("clickSaveProducts");
		}catch(NoSuchElementException e) {
			e.getMessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
}
	
	
	
	
	
	/*
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
		}catch(NoSuchElementException e) {
			e.getMessage();
		}	
	}
	public void ClickSignIn() {
		try {
			Login_SignIn.click();
			Thread.sleep(7000);
		}catch(NoSuchElementException e) {
			e.getMessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//public void VerifyLoginError() {
		
		
		
	//}*/
	
	
	

		

		
	

		

		    	
	    	
	    
	