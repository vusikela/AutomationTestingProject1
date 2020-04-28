package AllTestScripts;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommomUtilites.TestUtil;
import TestBaseLayer.TestBase;
import TestPageLayer.LoginPage1;

/*
 * This is my main class for write my 1st automation test script.
 * Here, I am calling Page layer package, Test base layer package and also remaing layer depends on the situtation.
 */
public class Scenario1 extends TestBase
{
	public static WebDriver driver;
	public static LoginPage1 user;
	
	/*
	 * This Constructor will execute first in my class.
	 */
	public Scenario1()
	{
		// This Superconstructor, it will come to the Testbase layer package. here this construcort will be executed first.
		
		super();
	}
	
	// First priority, I am give to execute my script.
	@Test(priority=1)
	public void Subscribe() throws Throwable 
	{
		/* This method, I am calling testbase layer.
		 *  This initialization(); method will do the 
		 *  1. launch the browser
		 *  2. window maximize
		 *  3. Enter the URL
		 */
           initialization();
		
           /*
            * This is LoginPage1(); I am called on TestPagelayer
            * Here, I am created Object
            */
   		
		user=new LoginPage1();
		
		/*
		 * This mousemoreaction() method also I am calling on above calss: LoginPage1()
		 * and below all methods Select10Teas();,Addcart();,Add30();, Checkout(); also same class:LoginPage1()
		 */
		 
		user.mousemoreaction();
		
		user.Select10Teas();
		user.Addcart();
		user.Add30();
		user.Checkout();
	}
	/*
	 * This below testng is for Priority2, it means to the above Testng(p1) should be executed first, then it goes to the Next
	 */
	@Test(priority=2)
	public void login() 
	{
		
		/*
		 * This Exisituser();,Continue1();,Continue2();, RandC();, ComplterO(); method also I am calling on above calss: LoginPage1()
		 
		 */
		user.Exisituser();
		user.Continue1();
		
		user.Continue2();
		user.RandC();
		
		user.ComplterO();
	}
		
}
