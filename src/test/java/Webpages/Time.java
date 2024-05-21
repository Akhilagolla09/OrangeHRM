package Webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Time extends Baseclass {

	WebDriver driver;

	public Time(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By login = By.xpath("//button[@type='submit']");

	// Time
	By time = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[4]");
	By timesheet = By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[1]");
	By emptimesheet = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[2]");
	By ename = By.xpath("//input[@placeholder='Type for hints...']");
	By NameP = By.xpath("//div[@class='oxd-autocomplete-option']");
//		By enamee = By.xpath("//input[@placeholder='Type for hints...']");
	By view = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	By edit = By.xpath("(//button[@type='button'])[5]");
	By project = By.xpath("//input[@placeholder='Type for hints...']");
	By Activity = By.xpath("//div[@class='oxd-select-text-input']");
	By select = By.xpath("(//div[@role='listbox']//child::div)[6]");
	By day1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By day2 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
	By day3 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
	By day4 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
	By day5 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]");
	By savetimesheet = By.xpath("//button[@type='submit']");
	
	
//user login 	
	public void Loginpage(String UsernamE, String PASSworD) throws InterruptedException {
		WebElement el = driver.findElement(username);
		sendkeysint(el, UsernamE);
		Thread.sleep(2000);
	
		WebElement e2 = driver.findElement(password);
		sendkeysint(e2, PASSworD);
		Thread.sleep(2000);
	
		WebElement ele = driver.findElement(login);
		clickMethod(ele);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
//click on Time	
	public void TIME(String Ename, String prod,String DAy1,String DAy2,String DAy3,String DAy4,String DAy5) throws InterruptedException  {
		WebElement Time = driver.findElement(time);
		clickMethod(Time);
		Thread.sleep(2000);
	
//click on timesheet 
		WebElement Timesheet = driver.findElement(timesheet);
		clickMethod(Timesheet);
		Thread.sleep(2000);

//select employee timesheet 
		WebElement empTimesheet = driver.findElement(emptimesheet);
		clickMethod(empTimesheet);
		Thread.sleep(3000);

//enter employee name
		WebElement eName = driver.findElement(ename);
		sendkeysint(eName, Ename);
		Thread.sleep(3000);
		WebElement nameP= driver.findElement(NameP);
		clickMethod(nameP);                                                             
		
//click on view 
		WebElement vew = driver.findElement(view);
		clickMethod(vew);
 
//click on edit
		WebElement Edit = driver.findElement(edit);
		clickMethod(Edit);
 
		WebElement proj = driver.findElement(project);
		clickMethod(proj);
		sendkeysint(proj, prod);
		Thread.sleep(2000);
		proj.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
 
		WebElement 	Act = driver.findElement(Activity);
		clickMethod(Act);
		WebElement sel = driver.findElement(select);
		clickMethod(sel);
 
		WebElement Day1 = driver.findElement(day1);
		clickMethod(Day1);
		sendkeysint(Day1, DAy1);
 
		WebElement Day2 = driver.findElement(day2);
		clickMethod(Day2);
		sendkeysint(Day2, DAy2);
 
		WebElement Day3 = driver.findElement(day3);
		clickMethod(Day3);
		sendkeysint(Day3, DAy3);
 
		WebElement Day4 = driver.findElement(day4);
		clickMethod(Day4);
		sendkeysint(Day4, DAy4);
 
		WebElement Day5 = driver.findElement(day5);
		clickMethod(Day5);
		sendkeysint(Day5, DAy5);
 
//save
		WebElement save1= driver.findElement(savetimesheet);
		clickMethod(save1);
 
		
	}
		


}
