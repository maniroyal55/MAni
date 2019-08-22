package testIng.org.india;

import java.beans.Visibility;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\Desktop\\org.india\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
	WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
	
	Actions acc=new Actions(driver);
	
	acc.moveToElement(men).perform();
	
	WebElement fast = driver.findElement(By.xpath("(//a[text()='Fastrack'])[1]"));
	
	fast.click();
	
	driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
	
	//Wait<WebDriverWait> f=new FluentWait<WebDriverWait>(driver).withTimeout(Duration.ofSeconds(800)).pollingEvery(Duration.ofMillis(90)).ignoring(Throwable.class));
	
	
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='_1vC4OE']"));
	
	int i = list.size();
	System.out.println(i);
	
	for(WebElement h:list) {
		
		System.out.println(h.getText());
		
		
		
	}
	
	
	
	
	}
}
