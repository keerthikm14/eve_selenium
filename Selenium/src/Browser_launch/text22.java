package Browser_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text22 {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/text22.html");
		driver.manage().window().maximize();
		 List<WebElement> text = driver.findElements(By.xpath("//input"));
		 text.size();
		 
		 for (WebElement text1 : text)
		 {
			 
		 
			text1.sendKeys("my name is keerthik");
		}

}
	
}
