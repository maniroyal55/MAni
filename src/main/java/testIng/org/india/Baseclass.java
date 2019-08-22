package testIng.org.india;

import java.io.File;
import java.nio.file.Files;
import java.util.Set;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Baseclass {

	public static WebDriver driver;
	
	public static WebDriver launch(){

		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\Desktop\\org.india\\driver\\chromedriver.exe");
		 
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		return driver;
		}
	
	 public static void url(String url){
		 
		 driver.get(url);
	 }
	 
	public static void sendkey(WebElement e,String s) {
		
		e.sendKeys(s);
		}
	
	public static void move2element(WebElement r) {
		
		
		Actions acc=new Actions(driver);
		acc.moveToElement(r).perform();
	
	}
	
	public static void doubleclick(WebElement r) {
		
		Actions acc=new Actions(driver);
		acc.doubleClick(r).perform();
		
		
		
	} 	public static void context(WebElement r,WebElement r1) {
		
		Actions acc=new Actions(driver);
		acc.dragAndDrop(r,r1).perform();
	}
		public static void right(WebElement e) {
			
			Actions acc=new Actions(driver);
			
			acc.contextClick(e).perform();
			
		}
		public static void click(WebElement e) {
			
			e.click();
			
		}
		public static void screen() {
			
			TakesScreenshot tk=(TakesScreenshot)driver;
			File src=tk.getScreenshotAs(OutputType.FILE);
			File des= new File("C:\\Users\\srini\\Desktop\\org.india\\ScreenShot\\mani.png");
            File.		
			
			}
		
		public static void window() {
			
			String par = driver.getWindowHandle();
			
			Set<String> all = driver.getWindowHandles();
		
			for(String x:all) {
				
				if(!x.equals(par)) {
					
					driver.switchTo().window(x);
					
				}
			}
		
		
		
		}
		
		
		
		
	} 
	
	
	

