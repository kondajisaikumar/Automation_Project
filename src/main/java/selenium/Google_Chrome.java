package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Chrome {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.get("https://www.instagram.com/");
//		driver.navigate().to("https://www.facebook.com/");  // we can use navigate method too for open browser
//		String s = driver.getCurrentUrl();
//		System.out.println(s);
//		String d = driver.getTitle();
//		System.out.println(d);
//		String f = driver.getPageSource();
//		System.out.println(f);
//		Dimension dm = new Dimension(500, 400);
//		driver.manage().window().setSize(dm);
//		Point p = new Point(500, 100);
//		driver.manage().window().setPosition(p);
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
	}

}
