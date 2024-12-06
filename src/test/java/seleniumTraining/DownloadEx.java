package seleniumTraining;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadEx {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/download");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement download = driver.findElement(By.xpath("//a[normalize-space()='avatar.png']"));
		
		download.click();
		
		File f = new File("C:\\Users\\Kiosk_User");
		
		if (f.exists()) {
			System.out.println("File existes");
		}else {
			System.out.println("File does not exist");
		}
		
		driver.close();
	}

}
