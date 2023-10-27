package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		WebElement js1 = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//		js1.click();//it will click Ok
//		Alert a = driver.switchTo().alert();
//    	a.accept();

//		WebElement js2 = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
//		js2.click();//it will click cancle
//		Alert a = driver.switchTo().alert();
//		System.out.println(a.getText());//it will show the title of popups

		WebElement js3 = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		js3.click();
		Alert a = driver.switchTo().alert();
        a.sendKeys("Saikumar");
        a.accept();
	}

}
