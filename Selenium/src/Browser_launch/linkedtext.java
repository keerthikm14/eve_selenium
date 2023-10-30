package Browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedtext {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("tester123@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("tester@123");
        driver.findElement(By.name("login")).click();
	    driver.quit();

}
}
