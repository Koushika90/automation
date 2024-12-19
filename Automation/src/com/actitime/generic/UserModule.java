package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserModule extends BaseClass {

	@Test
	
	public void createuser() 
	{
		
		Reporter.log("create user");
		
	}
	
	@Test
	
	public void modifyuser() 
	{
	
		Reporter.log("modify user");
		
	}
	
	@Test
	
	public void deleteuser() 
	
	{
	
		Reporter.log("delete user");
		
	}

}
