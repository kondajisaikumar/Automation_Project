package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws Throwable  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
	
		TakesScreenshot ts = (TakesScreenshot) driver;//screen shot hole img
		File src =ts.getScreenshotAs(OutputType.FILE);
		File ds = new File("C:\\Users\\Admin\\Pictures\\Saved Pictures\\RedbussimgNmae.png");//IMP remember
		Files.copy(src, ds);
	}

}
