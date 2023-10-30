package Browser_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/watch?v=Y5BeWdODPqo");
		Thread.sleep(3000);
	    driver.close();

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		Thread.sleep(2000);
		driver1.navigate().to("https://systechsoftwares.com");
		Thread.sleep(4000);
		driver1.close();
		
//		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
//		WebDriver driver2 = new ChromeDriver();
//		Thread.sleep(2000);
//		driver2.navigate().to("https://www.instagram.com");
//	    driver2.close();
	//System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	//FirefoxDriver driver1 =new FirefoxDriver();
				}

}       