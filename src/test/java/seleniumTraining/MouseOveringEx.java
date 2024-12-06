package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOveringEx {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement wb = driver.findElement(By.id("mousehover"));
		WebElement top = driver.findElement(By.xpath("//a[normalize-space()='Top']"));
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		act.doubleClick(wb).perform();
		Thread.sleep(3000);
		act.moveToElement(top).perform();
		act.click(top).perform();
		
		driver.findElement(By.xpath("//img[@class='logoClass']")).isDisplayed();
		System.out.println(driver);
	}

}
