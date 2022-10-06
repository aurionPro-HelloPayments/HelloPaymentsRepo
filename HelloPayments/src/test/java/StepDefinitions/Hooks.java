package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import Util.testbaseclass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends testbaseclass{
	
private BeforeClass base;
	
	public void Hook(BeforeClass base) {
		this.base = base;
	}

	@Before(order = 0)
	public void initDriver() {
		System.out.println("*************Open a new browser*************");
	}
	
	@Before(order = 1)
	public void maximizeWindow() {
		System.out.println("*************Maximize the current window*************");
	}
	
	@After(order = 0)
	public void signOut() {
		System.out.println("*************The Test case scenario is completed*************");
	}

	@After(order = 1)
	public void teardown() {
		System.out.println("*************Now Close the browser*************");
		driver.quit();
	}
}
