package Browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopperstack {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.shoppersstack.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.shoppersstack.com/sub-category/camera");
		//driver.findElement(By.xpath("//a[text()='Electronic']")).click();
	//	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

}
}
