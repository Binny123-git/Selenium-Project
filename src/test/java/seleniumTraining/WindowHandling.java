package seleniumTraining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String parentWindow =driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement clickhere = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		clickhere.click();
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		Iterator<String> itr = allwindows.iterator();
		
		while(itr.hasNext()) {
			
			String childWindow = itr.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				
				String text = driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText();
				System.out.println(text);
				driver.close();
				
				Thread.sleep(3000);
				String text1 = driver.findElement(By.xpath("//h3[normalize-space()='Opening a new window']")).getText();
				
				driver.close();
		
			}
		}
	}

}
