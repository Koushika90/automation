package Demoa;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class customermodule {

	@Test
	public void createcustomer() 
	{
	
		Reporter.log("create customer");
		
	}
	
	@Test
	
	public void modifycustomer() 
	{
		Assert.fail();
		Reporter.log("modify customer");
		
	}
	
	@Test
	
	public void deletecustomer() 
	
	{
	
		Reporter.log("deletecustomer");
		
	}
	
}