package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEx {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement bestsellers = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(bestsellers).perform();
		Thread.sleep(5000);
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		WebElement blog = driver.findElement(By.xpath("//a[normalize-space()='Blog']"));
		act.contextClick().perform();
		Thread.sleep(5000);
		
		
		driver.close();
	}

}
