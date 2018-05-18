package MyTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrap_Dropdown {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> li = driver.findElements(By.xpath("//ul[@class='dropdown-menu test']//li//a"));
		
		for (int j = 0; j <=li.size(); j++) {
			System.out.println(li.get(j).getText());
			
			if(li.get(j).getText().contains("JavaScript"))
			{
			li.get(j).click();
			break;
			}
			
		}
		
		
		
		
	}

}
