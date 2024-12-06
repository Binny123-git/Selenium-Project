package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
//		frame.click();
		
		
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.click();
		
		WebElement datesel = driver.findElement(By.xpath("//a[normalize-space()='5']"));
		datesel.click();
		driver.close();
		
		

	}

}
