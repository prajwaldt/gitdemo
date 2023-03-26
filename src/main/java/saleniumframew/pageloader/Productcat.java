package saleniumframew.pageloader;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import saleniumframew.abstratcomponent.Abstract;

public class Productcat extends Abstract {
	
	
	WebDriver driver;
	public Productcat(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	  
	@FindBy(css=".mb-3")	
	List<WebElement> products;
	@FindBy(css=".ng-animating")	
	WebElement ele;
	By byprod=By.cssSelector(".mb-3");
	By addcart=By.cssSelector(".card-body button:last-of-type");
	By toastmsg=By.cssSelector("#toast-container");
	
	public List<WebElement > getproducts()
	{
		waitforelementtoapper(byprod);
		return products;
	}
	public WebElement getproductbyname(String productName)
	{
		WebElement prod =	products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		return prod;
	}
	public void addproducttocart(String productName) throws InterruptedException
	{
		WebElement prod=getproductbyname(productName);
		prod.findElement(addcart).click();
		waitforelementtoapper(toastmsg);
		waitforelementtodiapper(ele);
	}
	 
}
