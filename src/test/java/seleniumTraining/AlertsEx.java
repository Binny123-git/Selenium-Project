package seleniumTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//		WebElement wb = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
//		wb.click();
//		Thread.sleep(5000);
		
//		Alert al1 = driver.switchTo().alert();
//		al1.dismiss();
		
		WebElement wb1 = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[4]"));
		wb1.click();
		Thread.sleep(5000);
		
		Alert al2 = driver.switchTo().alert();
		String altext = al2.getText();
		
		System.out.println(altext);
		Thread.sleep(5000);
		al2.sendKeys("Binitha");
		
		al2.accept();
		
		driver.close();
		

	}

}
