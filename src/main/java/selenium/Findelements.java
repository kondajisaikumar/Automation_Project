package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		List<WebElement> country = driver.findElements(By.xpath("//select[@name='Country']//option"));// for findelememts only
//	     for (WebElement option : country) {
//			if (option.getText().equals("Aruba")) {
//				option.click();
			
//			country.get(country.size()-232).click();//its selected by index of drop down
			
			
		
	}

}
