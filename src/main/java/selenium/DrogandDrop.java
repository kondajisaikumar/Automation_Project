package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogandDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.switchTo().frame(2);//frame index 2
		WebElement from = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement to = driver.findElement(By.id("trash"));

		Actions ac = new Actions(driver);
		ac.dragAndDrop(from, to).perform();
		// driver.switchTo().defaultContent()

	}

}
