package Browser_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/checkbox.html");
		driver.manage().window().maximize();
		 List<WebElement> check = driver.findElements(By.xpath("//input"));
		int count = check.size();
		System.out.println(count);
		
		//for(int i=0;i<count;i++)
		for (WebElement checks1 : check)
		{
			checks1.click();
		}
	{
	
    //WebElement checks = check.get(i);
  //  checks.click();
	}
	for(int j=count-1;j>=0;j--)
		{
		
	    WebElement checks1 = check.get(j);
	   checks1.click();
		}
		//driver.quit();
		
}
}
