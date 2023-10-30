package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcount {
	@Test(priority = 0,invocationCount = 5)
	  
	  public void test()
	  
	  {
		  Reporter.log("keeertttttttttthiiiiiiiiiiiiiikkkkkkkkkk",true);
	  }

	  @Test(priority = 1)
	  
	  public void test1()
	  
	  {
		  Reporter.log("hiiiii",true);
	  }
	  @Test(priority = 3)
	  
	  public void dog() {
		  Reporter.log("nayiiiiiiiii",true);
		
	}

	  @Test(priority = 2)
	  public void cat() {
		  Reporter.log("bvcccccc",true);
	  }
}

