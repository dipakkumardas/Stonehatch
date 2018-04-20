package stonehatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllWait 
{
	 public static void waitExplicitly(WebDriver driver,By by,String waittype,int waittime)
	 {
		  
		  WebDriverWait w=new WebDriverWait(driver,waittime);
		  switch(waittype)
		  {
		  
		  case "poe":
			  
			  w.until(ExpectedConditions.presenceOfElementLocated(by));
			  break;
		  
		  
		  case "voe":
			  w.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
			  break;
			  
			
		  case "etc":	  
			  
			  w.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
			  break;
			  
		  case "ioe":
			  
			  w.until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
			  break;
			  
		  case "ets":
			  
			  w.until(ExpectedConditions.elementToBeSelected(driver.findElement(by)));
			  break;
			  
		  
		  }
		  
		  
	  }
	  
		  public static void waitExplicitly(WebDriver driver,String waittype,int waittime) {
			  WebDriverWait w=new WebDriverWait(driver,waittime);
			  switch(waittype)
			  {
			  case "aip" :
				  w.until(ExpectedConditions.alertIsPresent());
				  break;
			  
			  }
			  
			  
		  }
	

}
