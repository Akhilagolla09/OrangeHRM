package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Webpages.Login;

public class Login_Test extends driver {

	@Test(dataProvider="getData")
	public void Login_test(String NamE,String PassworD, String username, String password, String ConfirmPass) throws InterruptedException {

		Login obj = new Login(driver);
		
//user login
    	obj.Loginpage(NamE, PassworD);
    	
//admin-usermangement
    	obj.admin();
    	obj.usermanagement();
    	obj.user();
    	
//adding user
    	obj.Add();                                  
    	obj.Add_User(username, password,ConfirmPass);
    	obj.searchuser();
    	
//logout
    	obj.LOGOUT();
	}
	@DataProvider
	public Object[][] getData(){
		String sheetname = "Login";
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
