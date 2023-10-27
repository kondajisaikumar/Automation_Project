package Open_Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {

	public static void main(String[] args) throws InterruptedException 
	{ 
	 System.setProperty("webdriver.chrome.driver", 
	"./drivers/chromedriver.exe"); 
	 WebDriver driver = new ChromeDriver(); 
	 driver.manage().window().maximize(); 
	 driver.get("https://www.google.com/"); 
	 
	 WebElement Addr = 
	driver.findElement(By.xpath("//input[@title='Search']")); 
	 Addr.sendKeys("Qspiders"); 
	 
	 Thread.sleep(3000); 
	 List<WebElement> allOptions = 
	driver.findElements(By.xpath("//ul[@class='erkvQe']/descendant::li[contains(@class,'sbct')]")); 
	 System.out.println(allOptions.size()); 
	 
	 
	 Thread.sleep(3000); 
	 
	 for(WebElement everyOp:allOptions) 
	 { 
	 System.out.println(everyOp.getText()); 
	 } 
	 
	 
	 for(WebElement everyOp:allOptions) 
	 { 
	 if(everyOp.getText().equals("qspiders reviews")) 
	 { 
	 Thread.sleep(3000); 
	 WebElement ReqOpt = 
	driver.findElement(By.xpath("//b[contains(text(),'reviews')]")); 
	 ReqOpt.click(); 
	 } 
	 } 
	 } 
	} 
	