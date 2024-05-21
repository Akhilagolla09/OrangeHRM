package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Webpages.Time;

public class Time_Test extends driver {

	@Test(dataProvider="getData")
	public void time(String UsernamE, String PASSworD, String Ename, String prod,String DAy1,String DAy2,String DAy3,String DAy4,String DAy5) throws InterruptedException {

		Time obj = new Time(driver);
//login
		obj.Loginpage(UsernamE,PASSworD);
//Time
		obj.TIME(Ename,prod, DAy1,DAy2,DAy3,DAy4,DAy5);
	}

	@DataProvider
	public Object[][] getData() {
		String sheetname = "Time";
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
