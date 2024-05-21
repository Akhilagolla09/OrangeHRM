package Testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utilities.ExcelReader;
import Utilities.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driver {

  
	static WebDriver driver;
	
	public static ExcelReader excel=new ExcelReader("C:\\Users\\GOAKHILA\\eclipse-workspace\\OrangeHRM-Task\\src\\test\\resources\\ORANGE-HRM_excel.xlsx");
	public static ExtentReports report = ExtentManager.getInstance();
	public static ExtentTest test;
	public static  Logger log =  Logger.getLogger("devpinoyLogger");   //inbuilt class
	
	
	
	@BeforeSuite
	public void openBrowser() {
			
		WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		
		String actURL ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String ExtURL = driver.getCurrentUrl();
		Assert.assertEquals(actURL, ExtURL);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		log.debug("Login Sucessfull");	
	}
	@AfterSuite
	public void closeBrowser() {
		if(driver != null) {
			driver.quit();
			
		log.debug("driver is closed");
		}
	}
}
