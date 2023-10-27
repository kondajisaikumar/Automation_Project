package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_Locator {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Jawan");// Xpath unique attributes 
//        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("SRK12345");// Xpath unique attributes 
//        driver.findElement(By.xpath("//button[text()='Log in']")).click();
         driver.findElement(By.xpath("//input[@name='email'] [@name='email']")).sendKeys("My name is sai");
	}

}
