package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle {

	public static void main(String[] args) throws Throwable {
		ChromeOptions Options = new ChromeOptions();  //its kill the all browseser notivations
		Options.addArguments("--disable-notifications");// 
		WebDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[text()='Help']")).click();
		Set<String> id = driver.getWindowHandles();
		Iterator<String> ids = id.iterator();//it will iterate 
		String parent = ids.next();
		System.out.println(parent);
		System.out.println(driver.getTitle());
		String child = ids.next();
		System.out.println(child);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(child);// it will swich to parent or child if you give...
        System.out.println(driver.getTitle());//it will print name
		
		
		
		
		
		
		
		
		
		
		
		
//		String parent =driver.getWindowHandle();
//		System.out.println(parent);
//		String child =driver.getWindowHandle();
//		System.out.println(child);
	}

}
