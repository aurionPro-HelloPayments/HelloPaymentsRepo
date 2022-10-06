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
import Pages.MerchantPortalHomePage;
import Util.testbaseclass;


public class MerchantPortalLoginStepDefinition extends testbaseclass {
	MerchantPortalLoginPage adminloginpage;
	MerchantPortalHomePage adminhomepage;
	
	@Given("^User open Browser and launched the Admin portal Url$")
	public void user_open_Browser_and_launched_the_Admin_portal_url() {
		adminloginpage=new MerchantPortalLoginPage();
		testbaseclass.initialization();
	}
    
	@When("^User enters \"(.*)\" in UserName field$")
	public void user_enters_username_in_username_field(String sUserName) {
		adminloginpage=new MerchantPortalLoginPage();
		adminloginpage.EnterUserName(sUserName);
	}
	
	@When("^User enters \"(.*)\" in Password field$")
	public void user_enters_password_in_password_field(String sPassword) {
		adminloginpage=new MerchantPortalLoginPage();
		adminloginpage.EnterPassword(sPassword);
	}
	
	@When("^User clicks on Login button$")
	public void user_clicks_on_login_button() {
		adminloginpage=new MerchantPortalLoginPage();
		adminloginpage.ClickSignIn();
	}
	
	@Then("^Admin Portal Home page should be displayed$")
	public void admin_portal_home_page_should_be_displayed() {
		adminhomepage = new MerchantPortalHomePage();
		Assert.assertTrue(adminhomepage.VerifyHelloPaymentslHomePage());
	}
	
	@Then("^Admin Portal Home page should NOT be displayed$")
	public void admin_portal_home_page_should_not_be_displayed() {
		adminhomepage = new MerchantPortalHomePage();
		Assert.assertTrue(adminloginpage.VerifyHelloPaymentsAdminPortalLoginPage());
	}
	
	@Then("^User clicks on account name$")
	public void user_clicks_on_account_name() {
		adminhomepage = new MerchantPortalHomePage();
		adminhomepage.ClickAccountName();
	}
	@Then("^User clicks on logout button$")
	public void user_clicks_on_logout_button() {
		adminhomepage = new MerchantPortalHomePage();
		adminhomepage.ClickLogout();		
	}
	@Then("^Admin Portal Login page should be displayed$")
	public void admin_portal_login_page_should_be_displayed() {
		adminloginpage=new MerchantPortalLoginPage();
		Assert.assertTrue(adminloginpage.VerifyHelloPaymentsAdminPortalLoginPage());
	}
	@Then("^User close the brower$")
	public void user_close_the_browser() {
		driver.quit();
		
	}
	/*@AfterStep
	public static void takeScreenshot(Scenario scenario) {
		
		
		final byte [] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");
		
	}*/
}
	
	
	
	
	
	
	
	
	
	
	
	

