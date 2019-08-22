package testIng.org.india;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facetoface {
	
	@Parameters({"name"})
	@Test
	
	private void tc2(String s1) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\Desktop\\org.india\\src\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		

		driver.get("https://www.cheapfareguru.com/");
		WebElement go=driver.findElement(By.id("origin"));
		go.sendKeys(s1);
		
		
	}
	

}
