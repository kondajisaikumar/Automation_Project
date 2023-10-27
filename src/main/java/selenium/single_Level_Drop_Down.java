package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class single_Level_Drop_Down {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		List<WebElement> country = driver.findElements(By.xpath("//select[@name='Country']//option"));//check  >>>option
		
		for (int k = 0; k <country.size(); k++) {
			System.out.println(country.get(k).getText());//it will print all the dropdown element list and select one
			if (country.get(k).getText().equals("Belize")){

			country.get(k).click();
			}
		}
//
//	Select sel =new Select(country);
//	sel.selectByVisibleText("Andorra");
//	sel.selectByValue("Aruba");
//	sel.selectByIndex(1);
	}

}
