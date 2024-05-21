package Webpages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dev.failsafe.internal.util.Assert;

public class Login extends Baseclass{

	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.xpath("//input[@name='username']");
	By password =By.name("password");
	By login = By.cssSelector("button[type=submit]");
	By admin = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
	By usermanagement =By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']");
	By user = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li/a");
	
//ADD
	By Add = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
	By userrole = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
	By role = By.xpath("(//div[@role='listbox']//child::div)[2]");
	By employeename =By.xpath("//input[@placeholder='Type for hints...']");
	By profilename = By.xpath("//p[@class='oxd-userdropdown-name']");
	By status = By.xpath("(//div[@class='oxd-select-text-input'])[2]");
	By role2 = By.xpath("(//div[@role='listbox']//child::div)[2]");
	By Username = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By Password = By.xpath("(//input[@type='password'])[1]");
	By confirmpassword = By.xpath("(//input[@type='password'])[2]");
	By save =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
//search user
	By username1=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By userrole1=By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
	By role3 =By.xpath("(//div[@role='listbox']//child::div)[2]");
	By employeename1 =By.xpath("//input[@placeholder='Type for hints...']");
	By status1=By.xpath("(//div[@class='oxd-select-text-input'])[2]");
	By role4 = By.xpath("(//div[@role='listbox']//child::div)[2]");
	By search=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");	

	
//logout
	By profile =By.xpath("//p[@class='oxd-userdropdown-name']");
	By logout =By.xpath("(//a[@role='menuitem'])[4]"); 
	
	
	//LOGIN PAGE 
		public void Loginpage(String NamE, String PassworD) {
			WebElement el = driver.findElement(username);
			sendkeysint(el, NamE);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
			WebElement e2 = driver.findElement(password);
			sendkeysint(e2, PassworD);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
			WebElement ele = driver.findElement(login);
			clickMethod(ele);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}

	//ADMIN
		public void admin() throws InterruptedException {
			WebElement admin1 = driver.findElement(admin);
			clickMethod(admin1);
			Thread.sleep(4000);
		}
		
		public void usermanagement() throws InterruptedException {
			WebElement usermange = driver.findElement(usermanagement);
			clickMethod(usermange);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		
		public void user()  {
			WebElement user1 = driver.findElement(user);
			clickMethod(user1);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		
//ADD USER
		public void Add() {
			WebElement add= driver.findElement(Add);
			clickMethod(add);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		
		public void Add_User(String username,String password,String ConfirmPass) throws InterruptedException {
			WebElement Roleuser= driver.findElement(userrole);
			clickMethod(Roleuser);
			WebElement select = driver.findElement(role);
			clickMethod(select);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			
			WebElement Ename= driver.findElement(employeename);
			WebElement element= driver.findElement(profilename);
		    String s =element.getText();
			sendkeysint(Ename, s);
			Thread.sleep(2000);
			Ename.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(3000);
		
			WebElement Status= driver.findElement(status);    
			clickMethod(Status);  
			WebElement select1 = driver.findElement(role2);
			clickMethod(select1);
			
			WebElement Uname= driver.findElement(Username);
			clickMethod(Uname);
			sendkeysint(Uname,username );
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			WebElement passW= driver.findElement(Password);
			clickMethod(passW);
			sendkeysint(passW, password);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			WebElement confPass= driver.findElement(confirmpassword);
			clickMethod(confPass);
			sendkeysint(confPass, ConfirmPass );
			Thread.sleep(4000);
			
			WebElement Save = driver.findElement(save);
			clickMethod(Save);
			Thread.sleep(4000);	
		}
		
//SEARCH
		public void searchuser() throws InterruptedException  {
			
			WebElement usermang = driver.findElement(usermanagement);
			clickMethod(usermang);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
			WebElement User = driver.findElement(user);
			clickMethod(User);
			Thread.sleep(4000);
			
			WebElement UserName=driver.findElement(username1);
			clickMethod(UserName);
			sendkeysint(UserName, "AkhilaGolla");
	
			
			WebElement Urole= driver.findElement(userrole1);
			clickMethod(Urole);
			WebElement select3 = driver.findElement(role3);
			clickMethod(select3);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
			
			WebElement Status1= driver.findElement(status1);    
			clickMethod(Status1);
			WebElement select4 = driver.findElement(role4);
			clickMethod(select4);
		
			WebElement Search = driver.findElement(search);
			clickMethod(Search);
			Thread.sleep(4000);

		}    
		
		
		
	//LOGOUT
		public void LOGOUT() {
			WebElement ele17 = driver.findElement(profile);
			clickMethod(ele17);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
			WebElement ele18 = driver.findElement(logout);
			clickMethod(ele18);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		}                                                                  
		
}
