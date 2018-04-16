package stonehatch;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestStonehatch 
{
	@BeforeMethod
	public void AppLunch() throws InterruptedException
	{
		Allmethods.Appluncher();
	}
	
	@Test(enabled=false)
	public void AgentDetails() throws InterruptedException, IOException
	{
		Allmethods.Agentlogin();
		Allmethods.Agentdetails();
	}
	
			
	@AfterMethod
	public void Closebrowser()
	{
		Allmethods.Browserclose();
	}
	
	@Test(priority=1)
	public void ShLogin() throws Exception
	{
		Allmethods.Shlogin();
		Allmethods.Shdetails();
	}
	
	
}