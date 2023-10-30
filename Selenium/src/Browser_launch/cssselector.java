package Browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://facebook.com");
		driver.findElement(By.cssSelector("input[id='email')")).sendKeys("hi");
		driver.findElement(By.cssSelector("input[placeholder='epassword')")).sendKeys("hloo");
	}
	
	
	
	
	
		

}
