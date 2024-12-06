package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Enable {

	public static void main(String[] args) throws InterruptedException {
					
					WebDriverManager.chromedriver().setup();
					
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
					driver.manage().window().maximize();
					Thread.sleep(5000);
					
					Actions actions = new Actions(driver);
					actions.sendKeys(Keys.PAGE_DOWN).perform();
					
					
					Thread.sleep(5000);
					
					WebElement dropdown = driver.findElement(By.id("state"));
					dropdown.click();
					Thread.sleep(5000);
					
					Select sel = new Select(dropdown);
					
					sel.selectByIndex(1);
					
//					
//					WebElement name = driver.findElement(By.id("name"));
//					name.sendKeys("Binny");
//					
//					Thread.sleep(5000);
//					
//					WebElement email = driver.findElement(By.id("email"));
//					email.sendKeys("binithayadav14@gmail.com");
//					
//					Thread.sleep(5000);
//					
//					WebElement wb3 = driver.findElement(By.className("logo-desktop"));
//					if(wb3.isDisplayed()) {
//						System.out.println("Logo is Dispalyed");
//					}else {
//						System.out.println("Logo is not displayed");
//					}
					
					
//					
//					WebElement wb2 = driver.findElement(By.xpath("//button[@id='submit']"));
//					wb2.click();
 driver.close();
	}

}
