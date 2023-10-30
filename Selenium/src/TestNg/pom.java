package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
	@FindBy(id="email")
	private WebElement ele;
	public pom (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enter_UN()
	{
		ele.sendKeys("hiii");
	}

}
