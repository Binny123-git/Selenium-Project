package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='column-b']"));
		
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, dest).perform();
//		driver.close();

	}

}
