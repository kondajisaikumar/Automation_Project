package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screen_Shot_PartculerPic {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		WebElement india = driver.findElement(By.xpath("//img[@alt='India']"));
		
		
		File from =india.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\Admin\\Pictures\\Saved Pictures\\Indiapic.png");//IMP remember
		Files.copy(from, to);
	}

}
