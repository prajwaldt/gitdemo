package saleniumframew;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autoit {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\002E23744\\Documents\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(ops) ;
		
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.adobe.com/acrobat/online/pdf-to-jpg.html");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class*='spectrum-Button']")).click();
		Runtime.getRuntime().exec("C:\\Users\\002E23744\\Desktop\\ads.exe");
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='spectrum-Button--cta']")));
		//driver.findElement(By.cssSelector("[class*='spectrum-Button--cta']")).click();
		
		
		

	}

}
