package Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider="getdata")
public class testParameters {
	
	public void doLogin(String username,String password)
	{
		System.out.println(username+ "---"+password);
	}
	@DataProvider
	public Object[][] getdata()
	{
		
		Object[][] data = new Object[3][2];
		data[0][0]="sumitra";
		data[0][1]="password";
		data[1][0]="sumitra1";
		data[1][1]="password1";
		data[2][0]="sumitra2";
		data[2][1]="password2";
		return data;
		
				
	}

}
