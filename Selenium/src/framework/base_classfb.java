package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class base_classfb implements frame_constant{
	@Test
	public void run() 
	{
		System.setProperty(chrome_key,chrome_value);
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(FB_url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}

}
