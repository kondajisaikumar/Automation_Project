package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Mouse {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		WebElement elct = driver.findElement(By.xpath("//div[@aria-label='Electronics']"));

		Actions ac = new Actions(driver); // mouse move object
		ac.moveToElement(elct).perform();
		WebElement srch = driver.findElement(By.name("q"));
		srch.sendKeys("Saikumar");
		ac.doubleClick(srch).perform(); // doubleClick
	}
}
