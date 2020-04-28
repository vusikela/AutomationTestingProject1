package TestBaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import CommomUtilites.Webeventlistener;







public class TestBase 
{
	
	
		public static WebDriver driver;
		public static Properties prop;

		public static EventFiringWebDriver e_driver;
		
		public static Webeventlistener eventListener;
		
		/* This Test Base layer, depends on the situation I am used entire my frame on any level
		 * 
		 */
		public TestBase()
		{
			/*
			 * This is property file to read the all data form, like  whatever you are given on Configure file.
			 */
			try
				{
				prop= new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Eclipse\\AutomationTesting\\src\\main\\java\\Properties\\Configfile");
	
				prop.load(fis);
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				catch(NullPointerException e)
				{
					e.printStackTrace();
				}
				//System.out.println(prop.getProperty("browser"));
			}
		
		

		public static void initialization( )
		{
			/*
			 * This method, I am used to executing the scripts on diffrent browsers, like Chrome, Firefox and IE,,,etc
			 */
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Drivers\\chromedriver1.exe");
		driver= new ChromeDriver();
		}
		else
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Desktop\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		
		}
		
		if(browserName.equalsIgnoreCase("edge"))
			
		{
			System.setProperty("webdriver.edge.driver",".C:\\Users\\User\\Desktop\\Drivers\\MicrosoftWebDriver.exe");
			//create Edge instance
			driver = new EdgeDriver();
		
		}
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		
	 eventListener = new Webeventlistener();
		e_driver.register(eventListener);
		driver = e_driver;
		// This is for the window maximize purpose
		driver.manage().window().maximize();
		// This is for the Deleting the Cookies.
		driver.manage().deleteAllCookies();
		// This is waiting the tool, till the application is ready
		driver.manage().timeouts().implicitlyWait(400,TimeUnit.SECONDS);

		
// This is for the get the URl on COnfigure file by using Prop
		driver.get(prop.getProperty("url"));
		
		}	

}
