package selenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmpireHome_Task {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.findElement(By.xpath("//input[@placeholder='example@gmail.com']")).sendKeys("sureshbabuemp@gmail.com");
		driver.findElement(By.xpath("//input[@title='Please enter your password']")).sendKeys("ZPMHQHIA");
		driver.findElement(By.xpath("//button[text()='Login']")).click();// Xpath for text Function
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='pe-7s-keypad']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Inventory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Add Inventory")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("select2-catDD-container")).click();
		driver.findElement(By.xpath("//ul[@id='select2-catDD-results']//descendant ::li[text()='Study hall']")).click();

		driver.findElement(By.id("select2-subcatDD-container")).click();
		driver.findElement(By.xpath("//ul[@id='select2-subcatDD-results']//descendant ::li[text()='chair']")).click();

		driver.findElement(By.id("select2-InventoryStatusId-container")).click();
		driver.findElement(
				By.xpath("//ul[@id='select2-InventoryStatusId-results']//descendant ::li[text()='Reserved']")).click();

		driver.findElement(By.id("select2-InventoryConditonId-container")).click();
		driver.findElement(By.xpath("//ul[@id='select2-InventoryConditonId-results']//descendant ::li[text()='Good']"))
				.click();

		driver.findElement(By.id("select2-InventoryLocationId-container")).click();
		driver.findElement(
				By.xpath("//ul[@id='select2-InventoryLocationId-results']//descendant ::li[text()='hyderabad']"))
				.click();

		driver.findElement(By.xpath("//span[@aria-labelledby='select2-factor-container']")).click();
		driver.findElement(By.xpath("//ul[@id='select2-factor-results']//descendant::li[text()='3.00']")).click();

		driver.findElement(By.name("RecievedDate")).sendKeys("01/01/1992");

		driver.findElement(By.name("ModelNumber")).sendKeys("5555");
		driver.findElement(By.name("Title")).sendKeys("Study Chair");
		driver.findElement(By.name("ItemDescription")).sendKeys("Study Chair for Students");
		driver.findElement(By.name("Brand")).sendKeys("Nilkamal");
		driver.findElement(By.name("Height")).sendKeys("3");
		driver.findElement(By.name("Width")).sendKeys("3");
		driver.findElement(By.name("Breadth")).sendKeys("2");

		driver.findElement(By.name("RecievedDate")).sendKeys("01/01/1992");

		driver.findElement(By.name("ColorName")).sendKeys("Brown");
		driver.findElement(By.name("ActualPrice")).sendKeys("500");
		driver.findElement(By.name("HSNCode")).sendKeys("12345");
		driver.findElement(By.name("RackName")).sendKeys("1");
		driver.findElement(By.name("PODetails")).sendKeys("Hyderabad");
		driver.findElement(By.name("InvoiceNumber")).sendKeys("135790");
		driver.findElement(By.name("Qty")).sendKeys("2");

		WebElement img1 = driver.findElement(By.name("ColorImageUploaded"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver; // this for choose files
		js1.executeScript("arguments[0].click();", img1);
		Robot rb1 = new Robot();
		rb1.delay(2000);
		StringSelection ss1 = new StringSelection("C:\\Users\\Admin\\Pictures\\Chair2");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);
		rb1.keyRelease(KeyEvent.VK_CONTROL);
		rb1.keyRelease(KeyEvent.VK_V);
		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyRelease(KeyEvent.VK_ENTER);

		WebElement img2 = driver.findElement(By.name("ProductMainImageUploaded"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver; // this for choose files
		js2.executeScript("arguments[0].click();", img2);
		Robot rb2 = new Robot();
		rb2.delay(2000);
		StringSelection ss2 = new StringSelection("C:\\Users\\Admin\\Pictures\\chair");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
		rb2.keyPress(KeyEvent.VK_CONTROL);
		rb2.keyPress(KeyEvent.VK_V);
		rb2.keyRelease(KeyEvent.VK_CONTROL);
		rb2.keyRelease(KeyEvent.VK_V);
		rb2.keyPress(KeyEvent.VK_ENTER);
		rb2.keyRelease(KeyEvent.VK_ENTER);

		WebElement img3 = driver.findElement(By.name("DocumentsUploaded"));
		JavascriptExecutor js3 = (JavascriptExecutor) driver; // this for choose files
		js3.executeScript("arguments[0].click();", img3);
		Robot rb3 = new Robot();
		rb3.delay(2000);
		StringSelection ss3 = new StringSelection("C:\\Users\\Admin\\Pictures\\Chair_Document");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);
		rb3.keyPress(KeyEvent.VK_CONTROL);
		rb3.keyPress(KeyEvent.VK_V);
		rb3.keyRelease(KeyEvent.VK_CONTROL);
		rb3.keyRelease(KeyEvent.VK_V);
		rb3.keyPress(KeyEvent.VK_ENTER);
		rb3.keyRelease(KeyEvent.VK_ENTER);
		 
		
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	}

}
