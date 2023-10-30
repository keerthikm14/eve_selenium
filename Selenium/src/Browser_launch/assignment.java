package Browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class assignment {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("keerthik");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Saliyan");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("keerthikm14@gmail.com");
		WebElement a = driver.findElement(By.id("gender-radio-1"));
		

}
}