package testIng.org.india;

import javax.swing.SpringLayout.Constraints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

public class App 
{
	
	static WebDriver driver;

	@BeforeClass
	
	private void launch() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\Desktop\\org.india\\driver\\chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	@Parameters({"user"})
	@Test
	
	private void tc1(String s1) {
		
		driver.get("https://www.etsy.com/");
		
		WebElement search = driver.findElement(By.id("global-enhancements-search-query"));
		search.sendKeys(s1);
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
	SoftAssert s=new SoftAssert();
	
	s.assertEquals("https://www.etsy.com/",driver.getCurrentUrl());

	s.assertTrue(driver.getTitle().contains("Etsy "));
	
	s.assertAll();
	
	}
	

	
}