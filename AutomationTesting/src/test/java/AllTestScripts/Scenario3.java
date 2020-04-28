package AllTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommomUtilites.TestUtil;
import TestBaseLayer.TestBase;
import TestNglisteners.CustomListener;
import TestPageLayer.ContactusQuery3;

@Listeners(CustomListener.class)
/*
 * These listers for particular my automation script is passed or failed or skipped purpose, I am used.
 * These listers, I am calling on TestNGListenrs package throw, I am calling.
 */
public class Scenario3 extends TestBase
{
	/*
	 
	 * This is my main class for write my 3rd automation test script.
	 * Here, I am calling Page layer package, Test base layer package and also remaing layer depends on the situtation.
	 */
	
	public static ContactusQuery3 user;
	String sheetName1="Sec3";
	/*
	 * This Constructor will execute first in my class.
	 */
	public Scenario3()
	{
		// This Superconstructor, it will come to the Testbase layer package. here this construcort will be executed first.
		
		super();
	}
	
	// After constructor, this method will be executed
	@BeforeMethod
	public void ContactQ() throws InterruptedException
	{
		/* This method, I am calling testbase layer.
		 *  This initialization(); method will do the 
		 *  1. launch the browser
		 *  2. window maximize
		 *  3. Enter the URL
		 */
		
		initialization();
		/*
         * This is ContactusQuery3(); I am called on TestPagelayer
         * Here, I am created Object
         */
		
		user=new ContactusQuery3();
		/*
		 * ThisCon();) method also I am calling on above calss: ContactusQuery3();
		 */
		user.Con();
		
		//user.Sub("vusikelasatheesh123@gmail.com");
	}
	
	@DataProvider
	public Object[][] getATestData()
	{
		Object data[][]=TestUtil.getTestData(sheetName1);
		return data;
		/*SheetName go to the getTestData, then it will go to the 
		 * TestUtilpage do all things, then return all data, that data is 2 dimensional object array[][]
		 * After simple i will do store this all data in the 2D object array[][](object data[][])
		 * what is the purpose we are usning object array means, it stores the all data, for example we have 100 lines of the that 
		 * can be stored in this object arry, that is the main advantage of them.
		 * what it will do means this@Dataprovider fetching the from getTestData.sheetname(Reg) and returns all the data
		 * So this is the @Dataprovider,my data provider name is getATestData
		  */
		}
	
	@Test(dataProvider="getATestData")
	/*So this data provider name i will use on the @Test
	  * So finally whatever data fetching this getATestData method will pass the all data into the below testCase 
	  * Why or How?
	  * Because inside@Test method we already write getATestData method
	  * who is the provider of the provider of this data is GertATestData
	  * we have clearly to write the dataProvider="getATestData 
	  * */
	public void newContact(String Add)
	{
		user.Field(Add);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeapp()
	{
		
		driver.close();
	}

}
