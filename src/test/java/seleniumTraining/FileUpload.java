package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		
		WebElement browse = driver.findElement(By.id("picture"));
		Thread.sleep(3000);
		browse.click();
		browse.sendKeys("C:\\Users\\Kiosk_User\\Documents\\TextFile");
		
//		Webelement fileupload = driver.findElement(By.xpath(""))
		
		

	}

}
