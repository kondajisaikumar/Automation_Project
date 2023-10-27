package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Empaire_home {

	public static void main(String[] args) throws AWTException, InterruptedException {
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
		Thread.sleep(1000);
		driver.findElement(By.id("select2-catDD-container")).click();

		WebElement date = driver.findElement(By.name("RecievedDate"));
		date.sendKeys("01/01/1992");
		WebElement img = driver.findElement(By.name("ProductMainImageUploaded"));

		JavascriptExecutor js = (JavascriptExecutor) driver; // this for choose files
		js.executeScript("arguments[0].click();", img);

		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Pictures\\chair");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
