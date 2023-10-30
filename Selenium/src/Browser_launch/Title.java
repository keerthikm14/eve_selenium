package Browser_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebok.com");
		Thread.sleep(3000);
		String g_title = driver.getTitle();
		System.out.println(g_title);
	    driver.close();
	   
}
}
