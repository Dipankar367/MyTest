package MyTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		
		WebElement date = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select d = new Select(date);
		Thread.sleep(3000);
		d.selectByValue("7");
		
		Select m = new Select(month);
		m.selectByIndex(6);
		
		Select y = new Select(year);
		y.selectByVisibleText("1992");;
		
	}

}
