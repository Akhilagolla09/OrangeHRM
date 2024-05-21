package Webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PIM extends Baseclass {

	WebDriver driver;

	public PIM(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By login = By.xpath("//button[@type='submit']");

//PIM
	By pim = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]");
	By Employeelist = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]");
	By EmpList_add = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
//	By firstname = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']");
	By firstname = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input");
	By middlename = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-middlename']");
	By lastname = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']");
	By empsave = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	By nickname = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");

	By nationality = By.xpath("(//div[@clear='false'])[1]");
	By nation1 = By.xpath("(//div[@role='listbox']//child::div)[92]");
	By martial = By.xpath("(//div[@clear='false'])[2]");
	By Mstatus = By.xpath("(//div[@role='listbox']//child::div)[2]");
	By DOB = By.xpath("(//input[@class='oxd-input oxd-input--active'])[9]");
	By gender = By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]");
	By elsave = By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]");

	By nameemp = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
	By empID = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By supervisor = By.xpath("(//input[@placeholder='Type for hints...'])[2]");
	By reset = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']");
	By checkbox = By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[3]");
	By delete1 = By.xpath("(//i[@class='oxd-icon bi-trash'])[2]");
	By cancel = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text orangehrm-button-margin']");

//LOGIN PAGE 
	public void Loginpage(String UserName, String PASSword) throws InterruptedException {
		WebElement el = driver.findElement(username);
		sendkeysint(el,  UserName);
		Thread.sleep(2000);

		WebElement e2 = driver.findElement(password);
		sendkeysint(e2,PASSword);
		Thread.sleep(2000);

		WebElement ele = driver.findElement(login);
		clickMethod(ele);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void PIM(String Fname,String Mname,String Lname, String Nickname, String DateOB,String EmpName, String Empid, String SuperVisor) throws InterruptedException {
		WebElement Pim = driver.findElement(pim);
		clickMethod(Pim);
		Thread.sleep(2000);

//click on employee list 
		WebElement Emp_List = driver.findElement(Employeelist);
		clickMethod(Emp_List);
		Thread.sleep(1000);

//add employee
		WebElement Emp_add = driver.findElement(EmpList_add);
		clickMethod(Emp_add);
		Thread.sleep(1000);

		WebElement fname = driver.findElement(firstname);
		clickMethod(fname);
		sendkeysint(fname, Fname);

		WebElement mname = driver.findElement(middlename);
		clickMethod(mname);
		sendkeysint(mname, Mname);

		WebElement lname = driver.findElement(lastname);
		clickMethod(lname);
		sendkeysint(lname, Lname);

		WebElement emplsave = driver.findElement(empsave);
		clickMethod(emplsave);
		Thread.sleep(5000);


		WebElement nick = driver.findElement(nickname);
		clickMethod(nick);
		sendkeysint(nick, Nickname);
		Thread.sleep(2000);

		WebElement Nationality = driver.findElement(nationality);
		clickMethod(Nationality);
		WebElement Nation = driver.findElement(nation1);
		clickMethod(Nation);
		Thread.sleep(4000);

		WebElement martial_status = driver.findElement(martial);
		clickMethod(martial_status);
		WebElement statusM = driver.findElement(Mstatus);
		clickMethod(statusM);
		Thread.sleep(2000);

		WebElement birthdate = driver.findElement(DOB);
		clickMethod(birthdate);
		sendkeysint(birthdate, DateOB);
		Thread.sleep(2000);

		WebElement Gender = driver.findElement(gender);
		clickMethod(Gender);
		Thread.sleep(2000);

		WebElement El_save = driver.findElement(elsave);
		clickMethod(El_save);
		Thread.sleep(2000);

//click on "Employee List" tile-add employee information
		
		WebElement Emp_List1 = driver.findElement(Employeelist);
		clickMethod(Emp_List1);
		Thread.sleep(1000);

		WebElement nameEmp = driver.findElement(nameemp);
		clickMethod(nameEmp);
		sendkeysint(nameEmp, EmpName);
		Thread.sleep(2000);

		WebElement IDEmp = driver.findElement(empID);
		clickMethod(IDEmp);
		sendkeysint(IDEmp, Empid);
		Thread.sleep(2000);

		WebElement supr_name = driver.findElement(supervisor);
		clickMethod(supr_name);
		sendkeysint(supr_name, SuperVisor);

//click on reset
		WebElement Reset = driver.findElement(reset);
		clickMethod(Reset);
		Thread.sleep(2000);

//select 2nd checkbox
		WebElement checkBox = driver.findElement(checkbox);
		clickMethod(checkBox);
		Thread.sleep(2000);

//click on delete 
		WebElement Delete = driver.findElement(delete1);
		clickMethod(Delete);
		Thread.sleep(2000);

//click on no cancel
		WebElement cancel_button = driver.findElement(cancel);
		clickMethod(cancel_button);
		Thread.sleep(2000);

		WebElement Reset1 = driver.findElement(reset);
		clickMethod(Reset1);
		Thread.sleep(2000);
	}

}
