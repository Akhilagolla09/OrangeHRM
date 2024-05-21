package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Webpages.PIM;

public class PIM_Test extends driver {

	
	@Test(dataProvider="getData")
	public void pim(String UserName, String PASSword,String Fname,String Mname,String Lname, String Nickname, String DateOB,String EmpName, String Empid, String SuperVisor) throws InterruptedException {

		PIM obj = new PIM(driver);
	
//login 
		obj.Loginpage(UserName, PASSword);
		
//PIM
		obj.PIM(Fname,Mname,Lname,Nickname,DateOB,EmpName, Empid, SuperVisor);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		String sheetname = "PIM";
		int rows = excel.getRowCount(sheetname);
		int cols = excel.getColumnCount(sheetname);
		Object[][] data = new Object[rows-1][cols];
		for(int rowNum=2;rowNum<= rows;rowNum++) {
			for(int colNum=0;colNum<cols;colNum++) {
				//data[0][0]
				data[rowNum-2][colNum]=excel.getCellData(sheetname, colNum, rowNum);
			}
		}
		return data;
}
}
