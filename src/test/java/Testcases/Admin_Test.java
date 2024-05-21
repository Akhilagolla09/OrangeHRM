package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Webpages.Admin;

public class Admin_Test extends driver {

	@Test(dataProvider="getData")
	public void admin_test(String Name,String Password, String Title, String Jobdiscription, String PayName, String Empstatus_name, String Jobcatg_name, String Name_workshift, String HouR,String MinuteS, String HouR1, String MinuteS1) throws InterruptedException {


		Admin obj = new Admin(driver);
		
//login
		obj.Loginpage1(Name, Password);
		
//admin-click on Job 
		obj.admin1();
		obj.job();
		
//Jobtitle
		obj.jobtitle(Title, Jobdiscription );
		
//Paygrades
		obj.paygrades(PayName);
		
//Employee status 
		obj.Emp_status(Empstatus_name);
		
//Job Catogerios
		obj.jobcategories(Jobcatg_name);
		
//workshifts
		obj.workshifts(Name_workshift,HouR, MinuteS, HouR1, MinuteS1);
	}

	@DataProvider
	public Object[][] getData() {
		String sheetname = "Admin";
		int rows = excel.getRowCount(sheetname);
		int cols = excel.getColumnCount(sheetname);
		Object[][] data = new Object[rows - 1][cols];
		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < cols; colNum++) {
				// data[0][0]
				data[rowNum - 2][colNum] = excel.getCellData(sheetname, colNum, rowNum);
			}
		}
		return data;
	}
}
