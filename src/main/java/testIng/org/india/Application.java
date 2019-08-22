package testIng.org.india;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class Application {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\Desktop\\org.india\\driver\\chromedriver.exe");
		 
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cheapair.com/");
		
		WebElement ele = driver.findElement(By.id("from1"));
		
		ele.sendKeys("Coimbatore");
		
        Thread.sleep(4000);
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		WebElement element = driver.findElement(By.id("to1"));
		element.sendKeys("Chennai");
		
		Thread.sleep(4000);
		
	
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(4000);
		
		WebElement element2 = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[21]"));
		
		element2.click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[21]")).click();
		
		
		
		WebElement element3 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		
		element3.click();
		
		String par = driver.getWindowHandle();
		
		Set<String> all = driver.getWindowHandles();
	
		for(String x:all) {
			
			if(!x.equals(par)) {
				
				driver.switchTo().window(x);
				}
			}
		
		Thread.sleep(10000);
		
driver.findElement(By.xpath("//span[text()='No Thanks']")).click();
		
WebElement w=driver.findElement(By.xpath("//div[@class='btn btn-primary bordered fltrt-filter-cat-opt']"));

Actions acc=new Actions(driver);

acc.moveToElement(w).perform();

Thread.sleep(2000);

WebElement twnfou = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[1]"));
twnfou.click();



for(int i=0;i<27;i++) {
	
	r.keyPress(KeyEvent.VK_RIGHT);
	r.keyRelease(KeyEvent.VK_RIGHT);
}

driver.findElement(By.id("applyFilters")).click();

		
	}}
