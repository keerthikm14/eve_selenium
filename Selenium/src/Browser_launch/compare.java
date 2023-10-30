package Browser_launch;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class compare {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("men shoes");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String txt = driver.findElement(By.xpath("//span[text()='1,196']")).getText();
		System.out.println(txt);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("men shoes");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String txt2 = driver.findElement(By.xpath("//div[text()='₹249']")).getText();
		System.out.println(txt2);
		driver.quit();
		
		
	
		
		
		

}
}
