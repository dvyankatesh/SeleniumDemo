package SeleniumDemo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement txtUname = driver.findElement(By.name("username"));
		WebElement txtPass = driver.findElement(By.name("password"));
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		txtUname.sendKeys("Admin");
		txtPass.sendKeys("admin123");
		btn.click();
		WebElement ddown = driver.findElement(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		ddown.click();
		WebElement ul =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul"));
		Select dd= new Select(ul);
		 dd.selectByVisibleText("Logout");
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}
