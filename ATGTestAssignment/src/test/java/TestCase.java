import java.util.concurrent.TimeUnit;	

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCase {
	
	 @Test
      public void createCoupon() throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //Go to ATG - Spel på Sport, Häst och Casino
		 driver.get("https://www.atg.se/");
		 
		 //Accept Cookies
		 driver.findElement(By.xpath("//button[text()='Godkänn alla cookies']")).click();
		 
		 //Select Häst
		 driver.findElement(By.xpath("//div[text()='Logga in']/following::span[text()='Häst']")).click();
		 
		 driver.findElement(By.xpath("//div[text()='Alla spel']")).click();
		 WebElement button = driver.findElement(By.xpath("//div[text()='V4']/span"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", button);
		 
		 //Mark 4 horses on v4:1
		 WebDriverWait wait = new WebDriverWait(driver,5);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-2']/preceding::button[text()='1']")));
	     driver.findElement(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-2']/preceding::button[text()='1']")).click();	 
	     
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-2']/preceding::button[text()='2']")));
	     driver.findElement(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-2']/preceding::button[text()='2']")).click();	 
	     
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-2']/preceding::button[text()='3']")));
	     driver.findElement(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-2']/preceding::button[text()='3']")).click();
	     
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-2']/preceding::button[text()='4']")));
	     driver.findElement(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-2']/preceding::button[text()='4']")).click();
	     
	     //Mark 1 horse on v4:2
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-3']/preceding::button[text()='1'][1]")));
	     driver.findElement(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-3']/preceding::button[text()='1'][1]")).click();
	     
	     //Mark 2 horses on v4:3
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-4']/preceding::button[text()='1'][1]")));
	     driver.findElement(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-4']/preceding::button[text()='1'][1]")).click();
	     
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-4']/preceding::button[text()='2'][1]")));
	     driver.findElement(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-4']/preceding::button[text()='2'][1]")).click();
	     
	     
	     //Mark all horses on v4:4
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-4']/following::button[text()='Alla']")));
	     driver.findElement(By.xpath("//button[text()='Rensa']/preceding::div[text()='V4-4']/following::button[text()='Alla']")).click();
	     
	     Thread.sleep(2000);
	     
	     driver.quit();
	     
	     
	 }
	 
	

}
