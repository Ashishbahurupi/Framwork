package TestNg;

import org.testng.annotations.Test;

public class NewTestC {
	
	@Test(enabled=true)
	  public void testCase1() {
		  System.out.println("testCase1");    //this method we disabled ,so it will not execute
	  }
	  
	  @Test(enabled=true)
	  public void testCase2() {
		  System.out.println("testCase2");    //this method will execute
	  }
	  
}
