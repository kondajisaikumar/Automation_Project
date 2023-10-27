package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		WebElement aprtc = driver.findElement(By.xpath("//img[@alt='APSRTC_logo']"));

		Point pt = aprtc.getLocation(); // ScrollDown to perticular point or element
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy" + pt);

	//	JavascriptExecutor js =(JavascriptExecutor) driver;// ask to sanjay, scroll down
		//js.executeScript("window.scrollBy(450,1000)");// scroll down

//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");  //its take page bottom

	}

}
