package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://ui.cogmento.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			driver.findElement(By.name("email")).sendKeys("binithayadav14@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Binny@123");
//			Thread.sleep(3000);
			
			WebElement l=driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
			l.click();
			
//			driver.switchTo().frame("mainpanel");
			driver.findElement(By.xpath("//div[@id='main-nav']//div[3]")).click();
			
			String before = "//table[@class='ui celled definition sortable striped table custom-grid']/tbody";
			
		String after = "]/td[2]";
		
		for(int i=1;i<=3;i++) {
			String name = driver.findElement(By.xpath (after+ i+ before )).getText();
			System.out.println(name);
			
			if(name.contains("Ananya pandey")) {
				driver.findElement(By.xpath("//table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr["+i+"]/td[1]")).click();
			}
		}
	}

}
