package Maven.SampleM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginpage {
	
	WebDriver driver;
	
	public fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	By Username = By.xpath("//input[@type='email']");
	By Password = By.xpath("//input[@type='password']");
	@FindBy(xpath="//input[@type='submit']")
	WebElement logIn;
	//By LogIn = By.xpath("//input[@type='submit']");
	
	public WebElement UserId()
	{
		return driver.findElement(Username);
	}
	public WebElement UserPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement LoginId()
	{
		return logIn;
	}
}
