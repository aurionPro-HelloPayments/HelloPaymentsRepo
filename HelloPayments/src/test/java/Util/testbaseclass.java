package Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbaseclass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public testbaseclass() {
		
		try {
			prop = new Properties();
			FileInputStream fls = new FileInputStream("src/test/java/Config/config.properties");
			prop.load(fls);		
		}catch (IOException e) {
			e.getMessage();
		}
	
	}
	
	public static void initialization() {
		String sbrowser = prop.getProperty("browser");
		String sUrl = prop.getProperty("url");
		if(sbrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(sbrowser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "src/test/resources/Drivers/geckodriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		driver.get(sUrl);
	}
	
	public  static void screenShot(String fileName)
	{
		//Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     
      
        DateFormat dateFormat = new SimpleDateFormat("MMdd");
        
        //get current date time with Date()
        Date date = new Date();
        String date1= dateFormat.format(date);
        
        
        // Time
        DateFormat timeFormat = new SimpleDateFormat("HHmm");
        
        //get current date time with Date()
        Date time = new Date();
        String time1= timeFormat.format(time);
        fileName = fileName+time1;
       
        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File("D:\\HelloPayments-Snapshots\\Screenshots"+date1+"\\"+fileName+".png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
	}



}
