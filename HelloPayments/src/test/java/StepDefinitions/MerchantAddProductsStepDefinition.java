package StepDefinitions;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
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

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import Pages.MerchantPortalLoginPage;
import Pages.MerchantAddProductsPage;
import Pages.MerchantPortalHomePage;
import Util.testbaseclass;


public class MerchantAddProductsStepDefinition extends testbaseclass {
	MerchantPortalLoginPage adminloginpage;
	MerchantPortalHomePage adminhomepage;
	MerchantAddProductsPage merchantProductPage;
	
	
	
	@Then("User clicks on AddProduct button")
	public void user_clicks_on_add_product_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		adminhomepage = new MerchantPortalHomePage();
		adminhomepage.clickProducts();
		adminhomepage.clickProductsBtn();
	}

	@Then("User enters {string} in ProductName field")
	public void user_enters_in_product_name_field(String productName) {
	    // Write code here that turns the phrase above into concrete actions
		merchantProductPage = new MerchantAddProductsPage();
		merchantProductPage.enterProductName(productName);
	}

	@Then("User enters {string} in UnitPrice field")
	public void user_enters_in_unit_price_field(String unitPrice) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		merchantProductPage = new MerchantAddProductsPage();
		merchantProductPage.enterUnitPrice(unitPrice);
	  
	}
	
	@Then("User clicks on Tax button")
	public void user_clicks_on_tax_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		merchantProductPage = new MerchantAddProductsPage();
		merchantProductPage.clickTaxable();
	  
	}

	@Then("User enters {string} in Description field")
	public void user_enters_in_description_field(String prodDescription) {
	    // Write code here that turns the phrase above into concrete actions
		merchantProductPage = new MerchantAddProductsPage();
		merchantProductPage.enterUnitProductDescription(prodDescription);
	}

	@Then("User clicks on Save button")
	public void user_clicks_on_save_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		merchantProductPage = new MerchantAddProductsPage();
		merchantProductPage.clickSaveProducts();
	}


			
	
	
	
	
	
	
	
	/*@AfterStep
	public static void takeScreenshot(Scenario scenario) {
		
		
		final byte [] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");
		
	}*/
}
	
	
	
	
	
	
	
	
	
	
	
	

