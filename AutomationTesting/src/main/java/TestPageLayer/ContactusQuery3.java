package TestPageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBaseLayer.TestBase;

public class ContactusQuery3 extends TestBase

{
	/* This is my pagelayer one 2nd class test case
	 * Here i am using my testbase layer calss by using extends keyword. I am calling here
	 * 
	 */

	@FindBy(xpath="//span[contains(text(),'Contact')]") WebElement Contactus;
	/* These @FindBy method is POM concept
	 * These method advantage is, you need to write always like driver.findelemet(By.xapth()....
	 * @FindBy equals to the driver.findelemet(By.xapth()....
	 */
	@FindBy(xpath="//input[@id='field-wnd_ShortTextField_611991']") WebElement Fieldlabel;
	////input[@id='field-wnd_ShortTextField_611991']
	@FindBy(xpath="//div[@class='form-submit b-btn cf b-btn-1']//button[@name='send']") WebElement Submit;

	
	public ContactusQuery3()
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
	
	public void Field(String e)
	{
		Fieldlabel.clear();
		Fieldlabel.sendKeys(e);
		Submit.click();
		
	}
	
	
	
	
	
}
