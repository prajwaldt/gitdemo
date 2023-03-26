package saleniumframew.pageloader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import saleniumframew.abstratcomponent.Abstract;

public class Landingpage extends Abstract{
	
	WebDriver driver;
	public Landingpage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
 
	
	@FindBy(id="userEmail")	
	WebElement username;
	
	@FindBy(id="userPassword")	
	WebElement password;
	
	@FindBy(id="login")	
	WebElement submit;
	
	public void Goto()
	{
	driver.get("https://rahulshettyacademy.com/client");
	}
	
	public void main(String usernames,String passwrd)
	{
		username.sendKeys(usernames);
		password.sendKeys(passwrd);
		submit.click();
	}
}



