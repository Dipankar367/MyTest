package MyTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Keyword_Operation {
	
	public WebDriver driver;

	 @BeforeClass
	 public void beforeClass() 
	 {
	  driver = new FirefoxDriver();
	  driver.get("https://facebook.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	  @Test
	 public void testKeys_Chord() throws Exception {
	  
	  WebElement txtFName=driver.findElement(By.xpath(".//*[@id='u_0_l']"));
	  WebElement txtLName=driver.findElement(By.xpath(".//*[@id='u_0_n']"));
	  txtFName.sendKeys("Deeep");
	  Actions a = new Actions(driver);
	  a.sendKeys(txtFName, Keys.chord(Keys.CONTROL,"a")).perform();
	  //Performing select all action using CTRl+A
	  Thread.sleep(2000);
	  a.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
	  //Performing copy action using CTRL+C 
	   a.sendKeys(txtLName, Keys.chord(Keys.CONTROL,"v")).perform();
	  //Performing paste action using CTRL+V in LastName field
	  
	  
	 }

	

	 @AfterClass
	 public void afterClass() throws Exception 
	 {
	  driver.quit();
	 }
	}


