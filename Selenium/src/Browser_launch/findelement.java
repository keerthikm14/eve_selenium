package Browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/keerthik.html");
		driver.findElement(By.tagName("a")).click();
}
}


  
