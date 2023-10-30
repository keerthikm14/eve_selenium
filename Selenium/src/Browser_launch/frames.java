package Browser_launch;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	public static void main(String[] args) throws InterruptedException, AWTException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/main.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("a1")).sendKeys("hii");
		Thread.sleep(2000);
		driver.switchTo().frame("f1");
		driver.findElement(By.id("p1")).sendKeys("keerthik");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("e1")).sendKeys("hloo");
		Thread.sleep(2000);

	}
}
