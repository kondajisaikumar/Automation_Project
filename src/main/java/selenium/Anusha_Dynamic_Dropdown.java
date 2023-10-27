package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Anusha_Dynamic_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver google = new ChromeDriver();
		google.manage().window().maximize();
		google.get("file:///C:/Users/Admin/Documents/Anusha_Dynamicdrop.html"); // copy the url
		WebElement form = google.findElement(By.xpath("//select[@id='dropdown']")); // write xaph
		Select form1 = new Select(form);
		form1.selectByVisibleText("Apple");
		form1.selectByVisibleText("Banana");
		form1.selectByVisibleText("Cherry");
		Thread.sleep(2000);
		form1.deselectByVisibleText("Cherry");
		Thread.sleep(2000);
		form1.deselectByVisibleText("Banana");
	}

}
