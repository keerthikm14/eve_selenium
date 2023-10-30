package Browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendiv {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("dateOfBirthInput")).click();	
		driver.findElement(By.xpath("//div[text()='18']")).click();

}
}