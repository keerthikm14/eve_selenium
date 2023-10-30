package TestNg;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class runner extends baseclass
{
	@Test
	private void run() {
		driver.findElement(By.id("email")).sendKeys("hiiiii");
		driver.findElement(By.id("pass")).sendKeys("hloooo");

		

	}

}
