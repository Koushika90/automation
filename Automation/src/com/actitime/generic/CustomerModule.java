package com.actitime.generic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.actitime.generic.ListnerImplementation.class)

public class CustomerModule extends BaseClass {
	
	@Test
	
	public void createcustomer() 
	{
	
		Assert.fail();
		
		Reporter.log("create customer",true);
		
	}
	
	@Test(dependsOnMethods = "createcustomer")
	
	public void modifycustomer() 
	
	{
		Reporter.log("modify customer", true);
		
	}
	
	@Test
	
	public void deletecustomer() 
	
	{
		Reporter.log("deletecustomer", true);
		
	}

}