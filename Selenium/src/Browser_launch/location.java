package Browser_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class location {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement> loc = driver.findElements(By.xpath("//img"));
		Thread.sleep(2000);
		
		
		for (WebElement location : loc)
		{
			String loc1 = location.getAttribute("src");
			System.out.println(loc1);
		
		}
	
	driver.quit();
	} 

}
