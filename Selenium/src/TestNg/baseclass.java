package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseclass {
	public WebDriver driver;
	
@BeforeMethod 
private void open_app() {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
}
@AfterMethod
private void close_app() {
	driver.close();
}

}
