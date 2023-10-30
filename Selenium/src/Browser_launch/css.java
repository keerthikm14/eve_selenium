package Browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com");
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("leo trailor");
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.cssSelector("a[title='LEO - Glimpse of Harold Das | Thalapathy Vijay | Lokesh Kanagaraj | Anirudh Ravichander']")).click();
		driver.findElement(By.cssSelector("a[title='LEO - Glimpse of Antony Das | Thalapathy Vijay | Lokesh Kanagaraj | Anirudh Ravichander']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[aria-label='like this video along with 994,284 other people']")).click();
	
	}
}