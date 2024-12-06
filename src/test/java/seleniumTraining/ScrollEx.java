package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollEx {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-300)", "");
		
//		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Elemental Selenium']"));
//		
//		Actions act = new Actions(driver);
//		act.scrollToElement(element).perform();
//		Thread.sleep(3000);
//		act.click();
//		Thread.sleep(3000);
//		driver.navigate().back();

	}

}
