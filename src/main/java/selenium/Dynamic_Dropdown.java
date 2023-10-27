package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Narendramodi");
		Thread.sleep(2000); //Definitely give some time to open
		
		List<WebElement> modi =driver.findElements(By.xpath("//div[@aria-label='narendra modi stadium']"));//for dynamic drop down we use "findelements"
		 for(WebElement option:modi){
			 if(option.getText().equals("narendra modi stadium")) { //you have to give name here
				 option.click();
			 }
		 }

	}

}
