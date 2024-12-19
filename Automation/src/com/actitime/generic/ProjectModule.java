package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule extends BaseClass {
	
@Test
	
	public void createproject()
	{
		Reporter.log("create project", true);
	
	}
	
	@Test
	
	public void modifyproject()
	{
		Reporter.log("modify project", true);
	
	}
	
	@Test
	
	public void deleteproject()
	{
		Reporter.log("delete project", true);
	
	}
}