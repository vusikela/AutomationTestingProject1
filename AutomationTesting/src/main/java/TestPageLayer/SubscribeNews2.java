package TestPageLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBaseLayer.TestBase;

public class SubscribeNews2 extends TestBase {

	/* This is my pagelayer one 2nd class test case
	 * Here i am using my testbase layer calss by using extends keyword. I am calling here
	 * 
	 */
	
	@FindBy(xpath="//span[contains(text(),'Contact')]") WebElement Contactus;
	/* These @FindBy method is POM concept
	 * These method advantage is, you need to write always like driver.findelemet(By.xapth()....
	 * @FindBy equals to the driver.findelemet(By.xapth()....
	 */
	@FindBy(xpath="//input[@id='field-wnd_EmailField_805630']") WebElement Email;
	@FindBy(xpath=" //div[@class='form-submit b-btn cf b-btn-2']//button[@name='send']") WebElement Submit;
	
	public SubscribeNews2()
	{
		PageFactory.initElements(driver, this/*or Loginpage*/);
		/* Here the driver will come to the TestBase layer
		 * this means to the current class
		 */
	}
	
	public void Con()
	{
		Contactus.click();
	}
	/*This method, I am sending testdata by using XL
	 * This method I will use my [src/test/java] to write my main automation scripts purpose.
	 */
	public void Sub(String e)
	{
		Email.clear();
		Email.sendKeys(e);
		Submit.click();
	}
	
	
	
	public static void failed(String un)
	{
		File Scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(Scrfile, new File("/C:/Users/User/Desktop/Eclipse/AutomationTesting/Failedscreenshots"+un+"-"+"png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	
}
