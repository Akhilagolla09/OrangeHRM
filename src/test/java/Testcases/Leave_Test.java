package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Webpages.Leave;

public class Leave_Test extends driver {

	@Test(dataProvider="getData")
	public void leave(String Username,String PASSworD, String From,String CommentS) throws InterruptedException {

		Leave obj = new Leave(driver);

//login
		obj.Loginpage(Username,PASSworD);
		
//leave module
		obj.LEAVE(From, CommentS);
	}

	@DataProvider
	public Object[][] getData() {
		String sheetname = "Leave";
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
