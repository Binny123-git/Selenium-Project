package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksEx {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);
		
		for(WebElement link:links) {
			System.out.println(link.getText());
		}
		
	}

}
