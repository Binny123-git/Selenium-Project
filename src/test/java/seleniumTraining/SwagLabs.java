package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabs {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		
		Thread.sleep(3000);
		
		WebElement backpack = driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]"));
		backpack.getText();
		backpack.click();
		System.out.println(backpack);
		
		
		Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		
		Thread.sleep(3000);
		
		WebElement tshirtRed = driver.findElement(By.xpath("//div[6]//div[3]//button[1]"));
		tshirtRed.getText();
		tshirtRed.click();
		System.out.println(tshirtRed);
		
		Thread.sleep(3000);
		
		Actions actions1 = new Actions(driver);
		actions.sendKeys(Keys.PAGE_UP).perform();
		
		Thread.sleep(3000);
		
		WebElement cart = driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]"));
		cart.click();
		
		Thread.sleep(3000);
		
		WebElement checkout = driver.findElement(By.xpath("//a[normalize-space()='CHECKOUT']"));
		checkout.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
		firstName.sendKeys("Binny");
		
		Thread.sleep(3000);
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
		lastName.sendKeys("Yadav");
		
		Thread.sleep(3000);
		
		WebElement zipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		zipcode.sendKeys("560100");
		
		Thread.sleep(3000);
		
		WebElement continues = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
		continues.click();
		
		Thread.sleep(3000);
		
		WebElement finish = driver.findElement(By.xpath("//a[normalize-space()='FINISH']"));
		finish.click();
		
		
		
		
		driver.close();
		
			
	}

}
