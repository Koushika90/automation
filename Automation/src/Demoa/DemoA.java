package Demoa;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public void demoA() {
		Reporter.log("hello world");//prints only in the report generated.
	}

	@Test
	
	public void demoB() {
		
		Reporter.log("welcome to the new world", true);
		
		//prints both on the report and console generated.
	}
	
	@Test
	
	public void demoC() {
		
		System.out.println("welcome to the new world of automation");
		
		//prints only on the console.
	}
	
}

