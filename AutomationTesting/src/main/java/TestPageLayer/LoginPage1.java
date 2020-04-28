package TestPageLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import TestBaseLayer.TestBase;

public class LoginPage1 extends TestBase
{
	
	/* This is my pagelayer one first class test case
	 * Here i am using my testbase layer calss by using extends keyword. I am calling here
	 * 
	 */
	@FindBy(xpath="//div[@id='wnd_ThumbnailBlock_tg34pc']//img") WebElement T1;
	/* These @FindBy method is POM concept
	 * These method advantage is, you need to write always like driver.findelemet(By.xapth()....
	 * @FindBy equals to the driver.findelemet(By.xapth()....
	 */
	@FindBy(xpath="//button[@name='send']") WebElement T11;
	
	@FindBy(xpath="//div[@id='wnd_ThumbnailBlock_25l6oj']//img") WebElement T2;
	// This button is same for the remaining buttons
	@FindBy(xpath="//span[@class='b-btn-a-l']") WebElement T22;
	
	@FindBy(xpath="//div[@id='wnd_ThumbnailBlock_1v2a7s']//img") WebElement T3;
	
	
	@FindBy(xpath="//div[@id='wnd_ThumbnailBlock_3l5573']//img") WebElement T4;
	
	
	@FindBy(xpath="//div[@id='wnd_ThumbnailBlock_54qq06']//img") WebElement T5;
	
	
	@FindBy(xpath="//div[@id='wnd_ThumbnailBlock_2l4h54']//img") WebElement T6;

	
	@FindBy(xpath="//div[@id='wnd_ThumbnailBlock_12b0g9']//img") WebElement T7;
	             // //div[@id='wnd_ThumbnailBlock_12b0g9']//img
	
	
	@FindBy(xpath="//div[@id='wnd_ThumbnailBlock_1b7h1n']//img") WebElement T8;
	
	
	
	
	@FindBy(xpath="//input[@name='billing_first_name']") WebElement FirstName;
	@FindBy(xpath="//input[@name='billing_street']") WebElement Adress;
	
	@FindBy(xpath="//input[@name='billing_city']") WebElement City;
	@FindBy(xpath="//input[@name='billing_zip']") WebElement ZIPCode;
	@FindBy(xpath="//input[@name='email']") WebElement Email;
	@FindBy(xpath="//input[@name='phone']") WebElement Phone;
	
	@FindBy(xpath="//select[@name='billing_country']") WebElement SelC;
	@FindBy(xpath="//button[@name='send']") WebElement Sub;
	
	
	
	@FindBy(xpath="//div[@class='cart-piece-count']") WebElement Cart;
	
	@FindBy(xpath="(//button[contains(text(),'Continue')])[2]") WebElement Cont1;
	
	@FindBy(xpath="(//button[contains(text(),'Continue')])[3]") WebElement Cont2;

	

	@FindBy(xpath="//textarea[@id='ch-customer-note']") WebElement Note;

	@FindBy(xpath="(//input[@id='ch-agree'])[1]") WebElement Check1;

	@FindBy(xpath="//input[@id='ch-marketing']") WebElement Check2;

	@FindBy(xpath="(//button[@name='send'])[4]") WebElement CompOrder;
	
	// This is for the Constructor, I am using for the eleminating the duplicate purpose.
	public LoginPage1()
	{
		PageFactory.initElements(driver, this/*or Loginpage*/);
		/* Here the driver will come to the TestBase layer
		 * this means to the current class
		 */
		
	}
	
	// This method is used for the wait purpose, it means wait the tool till the application is reay
	// Depends on the situation, I will use my entire project
	public void Wait() throws InterruptedException 
	{
		Thread.sleep(2000);
	}

	// This is for the Mouse more action.
	public void mousemoreaction() throws InterruptedException
	{
		WebElement Objl=driver.findElement(By.xpath("//*[@id=\"menu\"]/div/ul/li[2]/a[1]/span"));
		 Wait();
		Actions action=new Actions(driver);
		action.moveToElement(Objl).perform();                                                                                                                                     
		driver.findElement(By.xpath("//span[contains(text(),'Teas')]")).click();
	}
	
	public void Select10Teas() throws InterruptedException
	{
		// This methos and below things, I am used to click the diffrent types of the teas
		T1.click();
		Wait();
		T11.click();
		Wait();
		/*
		 * This id for the after clicking the Tea, then it should go back and again click the diffrent tea.
		 * Here, I am used Navigational Commands.
		 */
		
		driver.navigate().back();
		
		Wait();
		T2.click();
		Wait();
		T22.click();
		Wait();
		driver.navigate().back();
		
		Wait();
		T3.click();
		Wait();
		T22.click();
		Wait();
		driver.navigate().back();
		
		Wait();
		T4.click();
		Wait();
		T22.click();
		Wait();
		driver.navigate().back();
		
		Wait();
		T5.click();
		Wait();
		T22.click();
		Wait();
		driver.navigate().back();
		
		Wait();
		T6.click();
		Wait();
		T22.click();
		Wait();
		driver.navigate().back();
		
		Wait();
		T7.click();
		Wait();
		T22.click();
		Wait();
		driver.navigate().back();
		
		Wait();
		T8.click();
		Wait();
		T22.click();
		Wait();
		driver.navigate().back();
		
		
		
		// Again First one, i am adding
		
	Wait();
	T1.click();
	Wait();	
	T11.click();
	Wait();
		driver.navigate().back();
		
		// Again Second one, I am adding
		
		Wait();
		T7.click();
		Wait();
		T22.click();
		Wait();
		
	}
	
	

	public void Add30() throws InterruptedException
	{
		/*
		 * This method is for after clicking the teas, then i need to add some teas is 60 or 30 or 32 depends on the requirement
		 */
		WebElement T1=driver.findElement(By.xpath("(//input[@type='number'])[1]"));
		T1.clear();
		T1.sendKeys("60");
		
		
		WebElement T2=driver.findElement(By.xpath("(//input[@type='number'])[2]"));
		T2.clear();
		T2.sendKeys("30");
		
		
		WebElement T3=driver.findElement(By.xpath("(//input[@type='number'])[3]"));
		T3.clear();
		T3.sendKeys("30");
		
		WebElement T4=driver.findElement(By.xpath("(//input[@type='number'])[4]"));
		T4.clear();
		T4.sendKeys("60");
		
		WebElement T5=driver.findElement(By.xpath("(//input[@type='number'])[5]"));
		T5.clear();
		T5.sendKeys("30");
		
		WebElement T6=driver.findElement(By.xpath("(//input[@type='number'])[6]"));
		T6.clear();
		T6.sendKeys("30");
		
		WebElement T7=driver.findElement(By.xpath("(//input[@type='number'])[7]"));
		T7.clear();
		T7.sendKeys("59");
		
		
		/*Thread.sleep(100);
		WebElement T8=driver.findElement(By.xpath("//div[8]//div[3]//div[1]//div[1]//input[1]"));
		T8.clear();
		T8.sendKeys("30");*/
		
		
	}
	// This method is for the after clicking the diffrent teas and how many qunatiy of the each tea then I need to add the carts all teas
	public  void Addcart()
	{
		Cart.click();
	}
	
	// This method is used for the after adding the tea to cart, then i need to fill the House details or other home details
	// So, this method, I am using like that
	public void Exisituser() 
	{
			FirstName.sendKeys(prop.getProperty("Firstname"));
		Adress.sendKeys(prop.getProperty("Address"));
		City.sendKeys(prop.getProperty("City"));
		ZIPCode.sendKeys(prop.getProperty("ZipCode"));
		SelC.click();
		driver.findElement(By.name("billing_country")).click();
		/*
		 * This below comment lines are used to select the drop down by using select
		 * Here, we have some methods is ther selectbyvisable text or indext or valuse,,,,etc
		 */
		/*Select Os = new Select(driver.findElement(By.name("billing_country")));
		Os.selectByVisibleText("South Africa");
		Os.selectByValue("South Africa");*/
		Email.clear();
		Email.sendKeys(prop.getProperty("Email"));
		Phone.clear();
		Phone.sendKeys(prop.getProperty("Phone"));
		Sub.click();
		
		
	}
	
	// This method, I am used for the after filling the adress, then i need to check and finalise the price value
	public void Checkout() throws InterruptedException 
	{
		Thread.sleep(50000);
		driver.findElement(By.xpath("//span[contains(text(),'Checkout')]")).click();
	}
	
	/*
	 * This is for the go to Next
	 */
	public void Continue1() 
	{
		/*
		 * Here, I am using webdriver wait concept, why I am used, like i am geeting issue while i am running my autoamtion test script.
		 * These particular elemet is skipping. So, that's why i am used werbdriver wait.
		 * What these three lines exactly do means, without clickng to the elment it should not go to the next step and one more it trying to 
		  click of the element.
		 */
		WebDriverWait wait = new WebDriverWait(driver,400);
		WebElement Test1;
		Test1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(@type,'submit')])[2]")));
		String str=driver.findElement(By.xpath("//h1[contains(text(),'Shipping method')]")).getText();
		System.out.println("Text="+str);
		Assert.assertEquals(str, "Shipping method");
		
		
		//Test1.click();
		/*
		 * This method, I am used to click elemet on Frames
		 */
		/*List<WebElement> total=driver.findElements(By.tagName("iframe"));
		int str=total.size();
	System.out.println("Total frames="+str);*/
		
		
		
		
		Cont1.click();
		//driver.switchTo().defaultContent();
		
		
	}
	
	// This method is for the go to the Next2
	public void Continue2()  
	{
		WebDriverWait wait1 = new WebDriverWait(driver,300);
		WebElement Test2;
		Test2= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(@type,'submit')])[3]")));
		//Test2.click();
		String str1=driver.findElement(By.xpath("//h1[contains(text(),'Payment')]")).getText();
		System.out.println("Text1="+str1);
		Assert.assertEquals(str1, "Payment");	
		Test2.click();
	//Cont2.click();
	}
	
	/*
	 * This is method is for the Review and Complete puporse I am created.
	 */
	public void RandC()
	{
		//Note.sendKeys(prop.getProperty("Notes"));
		Check1.click();
		Check2.click();
	}
	
	// This method is for the final completion.
	public void ComplterO()
	{
		CompOrder.click();
	}
}
