package Browser_launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class childbrowserclick {
	public static void main(String[] args) throws InterruptedException, AWTException
	{

		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[text()='Support']"));
		WebElement ele5 = driver.findElement(By.xpath("//span[text()='Blog']"));
		ArrayList<WebElement>ar1=new ArrayList<WebElement>();
		ar1.add(ele1);
		ar1.
		Actions act=new Actions(driver);
		Robot r=new Robot();
		for (WebElement ele : ar1) {
			act.contextClick(ele).perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			
		}
			Thread.sleep(1000);
		act.contextClick(ele2).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		act.contextClick(ele3).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		act.contextClick(ele4).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		act.contextClick(ele5).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String>arrid=new ArrayList<String>(allid);
		
		Thread.sleep(1000);
		
		for (String id: arrid){
    driver.switchTo().window(id);
 	
		}
		
		String id1 = arrid.get(5);
		driver.switchTo().window(id1);
	}
		
		

}
