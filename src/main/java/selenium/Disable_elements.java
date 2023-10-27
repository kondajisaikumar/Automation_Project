package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable_elements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		JavascriptExecutor js =(JavascriptExecutor) driver;// 
		js.executeScript("document.querySelector(\"input[@placeholder='First Enter name']\").disabled=false");// Remember Carefully this one for disable Text feild
     	WebElement dsble=	driver.findElement(By.xpath("//input[@placeholder='First Enter name']"));
     	dsble.sendKeys("Saikumar");
	}

}
