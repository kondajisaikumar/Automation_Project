package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchonisaion {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ksai1919@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("22222222222");

//		Thread.sleep(10000);//Static waiting 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicitywait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));// explicitywait
		WebElement sai = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("login")));
		sai.click();

	}

}
