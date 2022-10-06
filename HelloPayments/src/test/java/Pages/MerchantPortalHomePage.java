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


public class MerchantPortalHomePage extends testbaseclass {
	
		
	//@FindBy(xpath = "//h3[contains(text(), 'Monthly Invoicing Amount')]")
	//WebElement Home_MonthlyInvoicingAmount;
	
	
	@FindBy(xpath = "//div[contains(text(),'Payments')]")
	WebElement Home_HelloPaymentsMenu;
	
	@FindBy(xpath = "//div[@class='header-controll'][0]")
	WebElement Home_AccountDropDown;
	
	@FindBy(xpath = "//img[contains(text(), 'Logout')]")
	WebElement Home_Logout;
	
	@FindBy(xpath = "//span[contains(text(),' Products ')]")
	WebElement Menu_Product;
	@FindBy(xpath = "//Button[contains(text(),'Add Product ')]")
	WebElement Add_ProductBtn;
	
	public MerchantPortalHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean VerifyHelloPaymentslHomePage() {
		try {
			Home_HelloPaymentsMenu.isDisplayed();
			return true;
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public void ClickAccountName() {
		try {
			Home_AccountDropDown.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch(NoSuchElementException e) {
			e.getMessage();
		}	
	}
	
	public void ClickLogout() {
		try {
			Home_Logout.click();
		}catch(NoSuchElementException e) {
			e.getMessage();
		}
	}
	
	
	public void clickProducts()
	{
		try {
			Menu_Product.click();
		}catch(NoSuchElementException e) {
			e.getMessage();
		}
	}
	
	public void clickProductsBtn()
	{
		try {
			Add_ProductBtn.click();
		}catch(NoSuchElementException e) {
			e.getMessage();
		}
	}
	
	
	
	
		
}
		
	

		

		    	
	    	
	    
	