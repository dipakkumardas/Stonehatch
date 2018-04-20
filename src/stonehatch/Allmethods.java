package stonehatch;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Allmethods 
{
	
	public static ChromeDriver Driver;
	public static String quotenumber;
	//AllWait obj1 = new AllWait();
	
		
	
	// @Test(priority=1)
	public static void Appluncher() throws InterruptedException
	{
		
			
		//System.setProperty("webdriver.chrome.driver", "E:\\StoneHatch\\Selenium\\Driver\\chromedriver.exe"); /*for browser launch*/
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe"); /*for browser launch*/
		Driver = new ChromeDriver();
		Driver.manage().window().maximize(); 
		Driver.manage().deleteAllCookies();
		//Driver.get("https://staging.offshoresoftwaresolutions.net/stonehatch/");
		
		Driver.get("https://dev.offshoresoftwaresolutions.net/stonehatch/");
		
		Driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  
		  //System.setProperty("webdriver.edge.driver", "F:\\Automation\\Tools\\MicrosoftWebDriver.exe");
		  //Driver = new EdgeDriver();
		
				
	}
	
	
	//@Test(priority=2)
public static void Agentlogin() throws InterruptedException, IOException
	
	{
		
		Driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("DDAgentone");
		Driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Dipak4321@");
		
		 Driver.findElement(By.xpath("//*[@id='frmuserlogin']/input[3]")).click();
	
}
	
	//@Test(priority=3)
public static void Agentdetails() throws InterruptedException, IOException
	
	{
		
		
		  
		 WebDriverWait wait = new WebDriverWait(Driver,90);
		 //int Time = 90;
		// WebElement A = Driver.findElement(By.xpath("//*[@id='preloader']"));
		 AllWait.waitExplicitly(Driver, By.xpath("//*[@id='preloader']"), "ioe", 90);
		 
		//wait.until(ExpectedConditions.invisibilityOf(Driver.findElement(By.xpath("//*[@id='preloader']"))));
		
		//Click New Quote
		// Thread.sleep(4000);
		 Driver.findElement(By.linkText("New Quote Request")).click();
		 
		 
		 wait.until(ExpectedConditions.invisibilityOf(Driver.findElement(By.xpath("//*[@id='preloader']"))));
		 Driver.findElement(By.xpath("//*[@id='organisation']")).sendKeys("Stonehatch New Testing Company");
		 Driver.findElement(By.xpath("//*[@id='insured_house']")).sendKeys("45 AB Housing");
		 Driver.findElement(By.xpath("//*[@id='insured_state']")).sendKeys("Australia");
		 Driver.findElement(By.xpath("//*[@id='insured_postcode']")).sendKeys("0211");
		
		
		 
		Select dropCountry = new Select (Driver.findElement(By.name("insured_country")));
		dropCountry.selectByVisibleText("Australia");
		Driver.findElement(By.xpath("//*[@id='email']")).sendKeys("dipak@yopmail.com");
		 
		 // For Date Calendar 

		 Driver.findElement(By.xpath("//*[@id='calclassSd']/i")).click();
		 Thread.sleep(2000);
		 
		 
		 Driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/a")).click();
		 
		Driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//*[@id='policyDocs']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("E:\\StoneHatch\\Agentdoc3.exe");
		Thread.sleep(8000);
		Driver.findElement(By.xpath("//*[@id='policyDocs']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("E:\\StoneHatch\\Agentdoc4.exe");
		Thread.sleep(5000);
		
		
		
		
		
		Driver.findElement(By.xpath("//*[@id='btnNext']")).click();
		Thread.sleep(5000);
		
		
		Driver.findElement(By.id("btnNewCsv")).click();
		Thread.sleep(5000);
		
		Driver.findElement(By.id("riskDetails")).click();
		Thread.sleep(8000);
		Runtime.getRuntime().exec("E:\\StoneHatch\\importcsv.exe");
		Thread.sleep(8000);
		Driver.findElement(By.id("Upload")).click();
		Thread.sleep(9000);
		
	/*	// Second Part Animal
		Driver.findElement(By.xpath("//*[@id='agentCommision']")).clear();
		Driver.findElement(By.xpath("//*[@id='agentCommision']")).sendKeys("12"); 
		Driver.findElement(By.xpath("//*[@id='agentRate']")).clear();
		Driver.findElement(By.xpath("//*[@id='agentRate']")).sendKeys("10"); 
		Driver.findElement(By.xpath("//*[@id='animalName']")).sendKeys("Horse One");
		Driver.findElement(By.xpath("//*[@id='sumInsured']")).sendKeys("10000");
		
		
		
		
		//Animal Age Year
		//Thread.sleep(5000);
		Select drpYear = new Select(Driver.findElement(By.id("animalAge")));
		drpYear.selectByVisibleText("2009");
		
		
		//Animal Age Month
		
		Select drpMonth = new Select(Driver.findElement(By.id("animalMonth")));
		drpMonth.selectByVisibleText("March");
		//Thread.sleep(5000);
		
		//Animal Age Day
		
		Select drpDay = new Select(Driver.findElement(By.id("animalDay")));
		drpDay.selectByVisibleText("15");
		//Thread.sleep(5000);
		
		//Animal Sex
		
		Select drpSex = new Select(Driver.findElement(By.id("animalSex")));
		drpSex.selectByVisibleText("Mare");
		//Thread.sleep(5000);
		
		
		//Animal Use
		
		Select drpUse = new Select(Driver.findElement(By.id("animalUse")));
		drpUse.selectByVisibleText("Hunter Jumper");
		//Thread.sleep(5000);
		
		//Animal Breed
		
		Select drpBreed = new Select(Driver.findElement(By.id("animalBreed")));
	    drpBreed.selectByVisibleText("Paso Fino");
		//Thread.sleep(5000);
			
		WebElement radio1 = Driver.findElement(By.id("infullOption"));
		radio1.click();
		
		//Thread.sleep(5000);
		Driver.findElement(By.xpath("//*[@id='infullVal']")).sendKeys("10");
		
		
		Select drpInfull = new Select(Driver.findElement(By.id("infull_text")));
		drpInfull.selectByVisibleText("Select");
		
		
		Driver.findElement(By.xpath("//*[@id='addMore']")).click();
		WebDriverWait wait1 = new WebDriverWait(Driver,500);
		 wait1.until(ExpectedConditions.invisibilityOf(Driver.findElement(By.xpath("//*[@id='preloader']"))));
		  Thread.sleep(5000);*/
				
		Driver.findElement(By.xpath("//input[@value='Submit for Quotation']")).click();
		wait.until(ExpectedConditions.invisibilityOf(Driver.findElement(By.xpath("//*[@id='preloader']"))));
		Thread.sleep(3000);
	
		
		//Windows Fancy Box and Type Message on fck editor
		Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
		//Driver.switchTo().frame(Driver.findElement(By.className("cke_wysiwyg_frame cke_reset")));
		Driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("This is Testing Purpose");

		
		
		
		
	
		
		Driver.switchTo().defaultContent();
			
		Driver.findElement(By.xpath("//*[@id='btnAddNote']")).click();
		wait.until(ExpectedConditions.invisibilityOf(Driver.findElement(By.xpath("//*[@id='preloader']"))));
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[contains(text(),'Click here')]"))));
		Thread.sleep(5000);
		
		
		
		
		
		Driver.findElement(By.xpath("//a[contains(text(),'Click here')]")).click();
				
		quotenumber=Driver.findElement(By.xpath("//tr[@class='first_row']//following-sibling::tr//child::td[2]/a")).getText();
		
		System.out.println("quote number under Agentdetails :"+quotenumber);
		
		Thread.sleep(3000);
		
		/*Driver.findElement(By.xpath("//span[text()='Home']")).click();
		
		Driver.findElement(By.xpath("//*[@id='bdy']/div[4]/div[2]/div/div[2]/p/a")).click();
		
		wait.until(ExpectedConditions.invisibilityOf(Driver.findElement(By.xpath("//*[@id='preloader']"))));
		
		Driver.close(); */
		
		
	}
	
	public static void Browserclose()
	{
		Driver.close();
	}
	 
	
	public static void Shlogin() throws Exception
	{
		//ShLogin Details
		
		// Load Property File For SH Login
		//Properties prop=loadProperties();
		
		Driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("dipak");
		Driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Dipak4321@");
		Driver.findElement(By.xpath("//*[@id='frmuserlogin']/input[3]")).click();
		
		/*Driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys(prop.getProperty("sh"));
		Driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(prop.getProperty("shpass"));
		Driver.findElement(By.xpath("//*[@id='frmuserlogin']/input[3]")).click();*/
		
	}
	
	
	public static void Shdetails() throws InterruptedException
	{
		
		//System.out.println("quote number under getnumber :"+ quotenumber);
		
		/*Driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("dipak_SA");
		Driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("dipak84321@");
		 Driver.findElement(By.xpath("//*[@id='frmuserlogin']/input[3]")).click();*/
		 
		 WebDriverWait wait1 = new WebDriverWait(Driver,120);
		 wait1.until(ExpectedConditions.invisibilityOf(Driver.findElement(By.xpath("//*[@id='preloader']"))));
		 
		// Click on Search Fields
		 Select search = new Select(Driver.findElement(By.id("searchField")));
		search.selectByVisibleText("Risk Ref");
		
		Thread.sleep(3000);
		
		//Give Quote RefNo-------------------------
	/*	Driver.findElement(By.xpath("//input[@id='SearchValue']")).sendKeys(quotenumber);
		Thread.sleep(3000);*/
		
		Driver.findElement(By.xpath("//input[@id='SearchValue']")).sendKeys("QUOP1800726");
		
		// Click Search 
		Driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(5000);
		
		Driver.findElement(By.xpath("//*[@id='tabs-1']/div/ul/li[1]/a")).click();
		Thread.sleep(5000);
		
				
		 WebDriverWait wait11 = new WebDriverWait(Driver,90);
		wait11.until(ExpectedConditions.invisibilityOf(Driver.findElement(By.xpath("//*[@id='preloader']"))));
		 
		 //Payment Info Click
		 
		Driver.findElement(By.xpath("//a[contains(text(),'Payment Info')]")).click();
		Thread.sleep(5000);
	
		
		
		//Payment Info Save Button Click
		WebDriverWait wait2 = new WebDriverWait(Driver,120);
		wait2.until(ExpectedConditions.invisibilityOf(Driver.findElement(By.xpath("//*[@id='preloader']"))));
		
		Driver.findElement(By.xpath("//input[@id='bind']")).click();
		Thread.sleep(3000);
		
	
		// Click Quote Details 
		Thread.sleep(9000);
		//Driver.findElement(By.xpath("//*[@id='ui-id-1']")).click();
		
		Driver.findElement(By.xpath("//a[contains(text(),'Quote Details')]")).click();
		Thread.sleep(3000);
		
		//WebDriverWait wait6 = new WebDriverWait(Driver,130);
		 //wait6.until(ExpectedConditions.elementToBeClickable(Driver.findElement(By.xpath("//*[@id='ui-id-1']")))).click();
		
		
		
		WebDriverWait wait3 = new WebDriverWait(Driver,120);
		wait3.until(ExpectedConditions.invisibilityOf(Driver.findElement(By.xpath("//*[@id='preloader']"))));
		
		//Driver.findElement(By.xpath("//button[@id='RSU']")).click();
		
		Driver.findElement(By.xpath("//*[@id='RSU']")).click();
		Thread.sleep(8000);
		
					
		WebDriverWait wait4 = new WebDriverWait(Driver,120);
		wait4.until(ExpectedConditions.invisibilityOf(Driver.findElement(By.xpath("//*[@id='preloader']"))));
    
	
		Driver.switchTo().frame(Driver.findElement(By.xpath("//*[@id='MailIfram']")));
		
		wait4.until(ExpectedConditions.invisibilityOf(Driver.findElement(By.xpath("//*[@id='preloader']"))));
		
		int row=1;
		List<WebElement> allfacility=Driver.findElements(By.xpath("//*[@id='uwDiv']/ul/table/tbody/tr['x']/td[2]"));

		for(WebElement facility:allfacility)
		{
	    
	    String facilitytext=facility.getText();
		
		//System.out.println(facilitytext);

		if(facilitytext.equalsIgnoreCase("IndusStonehatch"))
		{
		
		   Driver.findElement(By.xpath("//*[@id='uwDiv']/ul/table/tbody/"+"tr["+row+"]"+"/td[1]/input")).click();
			
			//*[@id="uwDiv"]/ul/table/tbody/tr[28]/td[1]/input
			
		break;
		}
		
			
			row++;
			//System.out.println(row);
		
		}
		
		Driver.findElement(By.xpath("//*[@id='sendMail']")).click();
		WebDriverWait wait5 = new WebDriverWait(Driver,90);
		wait5.until(ExpectedConditions.invisibilityOf(Driver.findElement(By.xpath("//*[@id='preloader']"))));
		
		//Driver.close();  
		
	
	}
	 
	
	}
	 
	


