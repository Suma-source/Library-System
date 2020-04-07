package TestCases;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class baseTest {
	

	@BeforeSuite
	public void setUp()
	{
		System.out.println("Initializing test");
		
	}
	@AfterSuite
	public void quit()
	{
		System.out.println("Quitting test");
		
	}
	
	

}
