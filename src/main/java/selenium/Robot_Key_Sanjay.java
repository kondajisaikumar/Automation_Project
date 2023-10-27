package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Key_Sanjay {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.findElement(By.xpath("//input[@placeholder='example@gmail.com']")).sendKeys("sureshbabuemp@gmail.com");
		driver.findElement(By.xpath("//input[@title='Please enter your password']")).sendKeys("ZPMHQHIA");
		driver.findElement(By.xpath("//button[text()='Login']")).click();// Xpath for text Function
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='pe-7s-keypad']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Inventory']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Inventory")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("windows.scroll.By(0,1500)");
	}
}
