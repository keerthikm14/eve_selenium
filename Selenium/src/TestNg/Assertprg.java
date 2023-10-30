package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertprg {
	@Test(priority = 0)
	  
	  public void test()
	  
	  {
System.out.println("login to facebook");
	  }

	  @Test(priority = 1)
	  
	  public void test1()
	  
	  {
		  System.out.println("open the account");
		  
	  }
	  @Test(priority = 3,dependsOnMethods = "test1")
	  
	  public void dog() {
		  System.out.println("search the friend");
		  Assert.fail();
		
	}

	  @Test(priority = 2,dependsOnMethods =   "dog")
	  public void cat() {
		  System.out.println("give the request");
	  }

}
