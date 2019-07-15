package example;


import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		/*driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); */	
		driver.get("https://www.saucelabs.com");       
	       WebElement href = driver.findElement(By.xpath("//a[@href='/beta/login']"));
	       assertTrue((href.isDisplayed()));  
	       driver.close();
		
	}	
	@BeforeTest
	public void beforeTest() {	
	   // driver = new FirefoxDriver(); 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();  
		//testEasy();
		/*driver.get("https://www.saucelabs.com");       
	       WebElement href = driver.findElement(By.xpath("//a[@href='/beta/login']"));
	       assertTrue((href.isDisplayed()));  
	       driver.close();*/
		
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}	
}
