package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Binny");
		
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("binithayadav14@gmail.com");
		
		Thread.sleep(5000);
		
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio' and @class='form-check-input mt-0'])[2]"));
		gender.click();
		
		WebElement state = driver.findElement(By.id("hobbies"));
		state.click();
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int size = list.size();
		System.out.println(size);
		
		for(int i=0;i<=size;i++) {
			list.get(i).click();
		}
		
		driver.close();
		
		
		
		
		
		

	}

}
