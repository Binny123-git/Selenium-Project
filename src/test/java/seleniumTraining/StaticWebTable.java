package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		int rowsize = list.size();
		System.out.println(rowsize);
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		int col1 = col.size();
		System.out.println(col1);
		
		WebElement celldata = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[3]/td[2]"));
		String text = celldata.getText();
		System.out.println(text);
		
		String expectedData = "Jason";
		
		if(text.equalsIgnoreCase(expectedData)) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}

	}

}
