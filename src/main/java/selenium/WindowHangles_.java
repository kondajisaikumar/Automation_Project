package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHangles_ {

	public static void main(String[] args) {
		ChromeOptions Options = new ChromeOptions(); // its kill the all browseser notivations
		Options.addArguments("--disable-notifications");//
		WebDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[text()='Help']")).click();
		Set<String> id = driver.getWindowHandles();
		for (String ids : id) {
			String title = driver.switchTo().window(ids).getTitle();  //for each loop 
			  if(title.equals("red:Care")){ //it will close single window
			  driver.close(); //it will close single window
			  		  driver.quit();
		}
		}
	}
}
