package Webpages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class Admin extends Baseclass{
	
	WebDriver driver;

	public Admin(WebDriver driver) {
		this.driver = driver;
	}

	By username11 = By.cssSelector("input[name=username]");
	By password1= By.xpath("//input[@name='password']");
	By login1 = By.xpath("//button[@type='submit']");
	By admin1 = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");    
//jobtitle
	By job =By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]");
    By jobtitle=By.xpath("(//a[@role=\"menuitem\"])[1]");
	By add =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By jobtitle1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By jobdiscription =By.xpath("(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[1]");
	By jobspecification =By.xpath("//div[@class='oxd-file-button']");
	By save1 = By.xpath("//button[@type='submit']");
//paygrades
	By paygrades = By.xpath("(//a[@role='menuitem'])[2]");
	By addpaygrades = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By payName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By paysave =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
//Employement status
	By employment_status = By.xpath("(//a[@role='menuitem'])[3]");
	By add_empstatus =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By empstatus_name=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By save_empstatus = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
//jobcategories	
	By job_categories= By.xpath("(//a[@role='menuitem'])[4]");
	By jobcatg_add   = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By jobcatg_name = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By save_jobcatg = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    
//workshifts 
	By workshifts =By.xpath("(//a[@role='menuitem'])[5]");
	By add_workshift = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By name_workshift = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	
	By from_time =By.xpath("(//i[@class='oxd-icon bi-clock oxd-time-input--clock'])[1]");
	By hour =By.xpath("(//input[@class='oxd-input oxd-input--active oxd-time-hour-input-text'])[1]");
	By minutes =By.xpath("(//input[@class='oxd-input oxd-input--active oxd-time-minute-input-text'])[1]");
	By Am = By.xpath("(//div[@class='oxd-time-period-label'])[1]");
	
	By to_time =By.xpath("(//i[@class='oxd-icon bi-clock oxd-time-input--clock'])[2]");
	By hour1 = By.xpath("//input[@class='oxd-input oxd-input--active oxd-time-hour-input-text']");
	By minutes1= By.xpath("//input[@class='oxd-input oxd-input--active oxd-time-minute-input-text']");
    By Pm	= By.xpath("(//div[@class='oxd-time-period-label'])[2]");
//  By assignedemployees = By.xpath("//input[@placeholder='Type for hints...']");
    By saveW =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    
    By delete =By.xpath("(//i[@class='oxd-icon bi-trash'])[1]");
	By popup =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");
	


	
	//LOGIN PAGE 
			public void Loginpage1(String Name,String Password)  {
				WebElement Un = driver.findElement(username11);
				//sendkeysint(el, "Admin");
				sendkeysint(Un, Name);
			
				WebElement pd = driver.findElement(password1);
				sendkeysint(pd, Password);
			
			
				WebElement logi = driver.findElement(login1);
				clickMethod(logi);
				
				String actualtitle = "OrangeHRM";
				String expectedtitle = driver.getTitle();
				Assert.assertEquals(actualtitle, expectedtitle);
			
			}	
//admin
			public void admin1()  {
				WebElement e4 = driver.findElement(admin1);
				clickMethod(e4);
			
			}
//job
			public void job() throws InterruptedException {
				WebElement e5 = driver.findElement(job);
				clickMethod(e5);
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				
				WebElement e6 = driver.findElement(jobtitle);
				clickMethod(e6);
				Thread.sleep(2000);
				
				WebElement e7 = driver.findElement(add);
				clickMethod(e7);
				
			}

//JobTitle
			
			public void jobtitle(String Title, String Jobdiscription){
				WebElement e8 = driver.findElement(jobtitle1);
				sendkeysint(e8, Title);
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			
				WebElement e9 = driver.findElement(jobdiscription);
				sendkeysint(e9, Jobdiscription);
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				
				WebElement save = driver.findElement(save1);
				clickMethod(save);
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			}
			
//Paygrades
			public void paygrades(String PayName) throws InterruptedException  {
				WebElement job1 = driver.findElement(job);
				clickMethod(job1);
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				
				
				WebElement pay = driver.findElement(paygrades);
				clickMethod(pay);
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				    
				
				WebElement add_pay = driver.findElement(addpaygrades);
				clickMethod(add_pay);
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				
				
				WebElement name_pay = driver.findElement(payName);
				clickMethod(name_pay);
				sendkeysint(name_pay, PayName);
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				
				
				WebElement save_pay = driver.findElement(paysave);
				clickMethod(save_pay);
				Thread.sleep(2000);
				   	
			}
//Employment status 			
			public void Emp_status(String Empstatus_name) throws InterruptedException {
				WebElement job2 = driver.findElement(job);
				clickMethod(job2);
				Thread.sleep(2000);
				
				
				WebElement employstatus = driver.findElement(employment_status);
				clickMethod(employstatus);
				Thread.sleep(2000);    
			
				WebElement add_employstatus = driver.findElement(add_empstatus);
				clickMethod(add_employstatus);
				Thread.sleep(2000);                  
				
				WebElement name_empstatus = driver.findElement(empstatus_name);
				clickMethod(name_empstatus);
				sendkeysint(name_empstatus, Empstatus_name);
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				
				WebElement employstatus_save = driver.findElement(save_empstatus);
				clickMethod(employstatus_save);
				Thread.sleep(2000);
			}

//Job categories 
			public void jobcategories(String Jobcatg_name) throws InterruptedException {
				WebElement job3 = driver.findElement(job);
				clickMethod(job3);
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				
				WebElement jobcateg = driver.findElement(job_categories);
				clickMethod(jobcateg);             
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);   
			
				WebElement jobcateg_add = driver.findElement(jobcatg_add);
				clickMethod(jobcateg_add);             
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				
				WebElement name_jobcatg = driver.findElement(jobcatg_name);
				clickMethod(name_jobcatg);
				sendkeysint(name_jobcatg, Jobcatg_name);
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				
				WebElement jobcatg_save = driver.findElement(save_jobcatg);
				clickMethod(jobcatg_save);
				Thread.sleep(2000); 
			}
			
//workshifts
			public void workshifts(String Name_workshift, String HouR,String MinuteS, String HouR1, String MinuteS1) throws InterruptedException {
				WebElement job4 = driver.findElement(job);
				clickMethod(job4);
				Thread.sleep(1000);
				
				WebElement workshift = driver.findElement(workshifts);
				clickMethod(workshift);
				Thread.sleep(1000);
				
				WebElement Addshift = driver.findElement(add_workshift);
				clickMethod(Addshift);
				Thread.sleep(1000);
				
				WebElement Addshiftname = driver.findElement(name_workshift);
				clickMethod(Addshiftname);
				sendkeysint(Addshiftname, Name_workshift);
				Thread.sleep(1000);	 
				
				WebElement From_Time = driver.findElement(from_time);
				clickMethod(From_Time);
				Thread.sleep(1000);
				
				WebElement Hour = driver.findElement(hour);
				clickMethod(Hour);
				clearMethod(Hour);
				sendkeysint(Hour, HouR);
				Thread.sleep(1000);
				
				WebElement Minutes = driver.findElement(minutes);
				clickMethod(Minutes);
				clearMethod(Minutes);
				sendkeysint(Minutes,MinuteS);
				Thread.sleep(1000);
				
				WebElement am = driver.findElement(Am);
				clickMethod(am); 
				Thread.sleep(1000);
				
				
				WebElement To_Time = driver.findElement(to_time);
				clickMethod(To_Time);
				Thread.sleep(1000);
				
				WebElement Hour1 = driver.findElement(hour1);
				clickMethod(Hour1);
				clearMethod(Hour1);
				sendkeysint(Hour1,HouR1);
				Thread.sleep(1000);
				
				WebElement Minutes1 = driver.findElement(minutes1);
				clickMethod(Minutes1);
				clearMethod(Minutes1);
				sendkeysint(Minutes1,MinuteS1);
				Thread.sleep(1000);
				
				WebElement pm = driver.findElement(Pm);
				clickMethod(pm); 
				Thread.sleep(1000);
	
				                      		
				WebElement SaveShift = driver.findElement(saveW);
				clickMethod(SaveShift); 
				Thread.sleep(1000);
								

				WebElement del = driver.findElement(delete);
				clickMethod(del); 
				Thread.sleep(1000);
				
				WebElement yes_del = driver.findElement(popup);
				clickMethod(yes_del); 
				Thread.sleep(1000);
			}                                                                                                                      
			
}
