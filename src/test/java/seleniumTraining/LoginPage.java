package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
			
//			Thread.sleep(3000);
//			
//			WebElement wb = driver.findElement(By.xpath("//input[@id='username']"));
//			wb.sendKeys("student");
//			
//			Thread.sleep(3000);
//			
//			WebElement wb1 = driver.findElement(By.xpath("//input[@id='password']"));
//			wb1.sendKeys("Password123");
//			
//			Thread.sleep(3000);
////			
//			WebElement wb2 = driver.findElement(By.xpath("//button[@id='submit']"));
//			wb2.click();
			
//			String title = driver.getTitle();
//			System.out.println(title);
//			
//			String url = driver.getCurrentUrl();
//			System.out.println(url);
			
//			String ps = driver.getPageSource();
//			System.out.println(ps);
					
			Thread.sleep(3000);
			
			driver.navigate().back();
			
			Thread.sleep(3000);
			
			driver.navigate().forward();
			
			Thread.sleep(3000);
			
			driver.navigate().refresh();
			
			driver.close();
			
			
			
			
			
			

	}

}
