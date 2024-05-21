package Webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Leave extends Baseclass {

	WebDriver driver;

	public Leave(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By login = By.xpath("//button[@type='submit']");

//Leave
	By leave = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]");
	By assignleave = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[4]");
	By Empname = By.xpath("//input[@placeholder='Type for hints...']");
	By proname = By.xpath("//p[@class='oxd-userdropdown-name']");
	By leavetype = By.xpath("//div[@class='oxd-select-text-input']");
	By leavesselect = By.xpath("(//div[@role='listbox']//child::div)[5]");
	By fromdate = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By fromdate1 = By.xpath("(//div[@class='oxd-calendar-dates-grid']//div)[position()=1]");
	By todate = By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]");
	By todate2 = By.xpath("(//div[@class='oxd-calendar-dates-grid']//div)[position()=6]");
	By comments = By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");
	By Assign = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	By ok = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-button-margin']");


//Login
	public void Loginpage(String Username,String PASSworD) throws InterruptedException {
		WebElement el = driver.findElement(username);
		sendkeysint(el, Username);
		Thread.sleep(2000);
	
		WebElement e2 = driver.findElement(password);
		sendkeysint(e2, PASSworD);
		Thread.sleep(2000);
	
		WebElement ele = driver.findElement(login);
		clickMethod(ele);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

//Leave module	
	public void LEAVE(String From,String CommentS) throws InterruptedException  {
		WebElement Leave = driver.findElement(leave);
		clickMethod(Leave);
		Thread.sleep(2000);

//click on assign leave 
		WebElement AssignLeave = driver.findElement(assignleave);
		clickMethod(AssignLeave);
		Thread.sleep(2000);

//enter details
		WebElement Ename= driver.findElement(Empname);
		WebElement Pname= driver.findElement(proname);
	    String s =Pname.getText();
		sendkeysint(Ename, s);
		Thread.sleep(2000);
		Ename.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		
		
		WebElement leav3 = driver.findElement(leavetype);
		clickMethod(leav3);
 
		WebElement leav4 = driver.findElement(leavesselect);
		clickMethod(leav4);
 
		WebElement from2 = driver.findElement(fromdate);
		clickMethod(from2);
		sendkeysint(from2, From);
		WebElement from3 = driver.findElement(fromdate1);
		clickMethod(from3);
 
		WebElement to2 = driver.findElement(todate);
		clickMethod(to2);
		WebElement to3 = driver.findElement(todate2);
		clickMethod(to3);

		WebElement comment= driver.findElement(comments);
		sendkeysint(comment, CommentS);
		Thread.sleep(2000);

//click on assign
		WebElement assign= driver.findElement(Assign);
		clickMethod(assign);
		Thread.sleep(2000); 
		
		WebElement OKK= driver.findElement(ok);
		clickMethod(OKK);
		Thread.sleep(4000);
		
	}
	
}
