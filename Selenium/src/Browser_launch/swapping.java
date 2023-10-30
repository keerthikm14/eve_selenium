package Browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swapping {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/work.html");
		driver.manage().window().maximize();
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='a1']"));
		ele1.sendKeys(Keys.CONTROL+"a");
		ele1.sendKeys(Keys.CONTROL+"x");
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='a3']"));
		ele2.sendKeys(Keys.CONTROL+"v");
		//Thread.sleep(3000);
		WebElement ele3 = driver.findElement(By.xpath("//input[@id='a2']"));
		ele3.sendKeys(Keys.CONTROL+"a");
		ele3.sendKeys(Keys.CONTROL+"x");
		//Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"v");
		//Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL+"a");
		ele2.sendKeys(Keys.CONTROL+"x");
		
		//Thread.sleep(2000);
		//ele3.sendKeys(Keys.CONTROL+"v");
		ele3.sendKeys(Keys.CONTROL+"v");
		
		
		
		
		
}
	

}
