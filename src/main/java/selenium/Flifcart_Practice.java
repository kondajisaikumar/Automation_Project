package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flifcart_Practice {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.name("q")).sendKeys("laptop hp", Keys.ENTER);
//		driver.findElement(
//				By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[2]"))
//				.click();
//		 driver.findElement(By.xpath("//input[@name='email']
		// [@name='email']")).sendKeys("My name is sai");
    
		WebElement email = driver.findElement(By.xpath("//input[@name='email']/following::input[@id='pass']"));
				// follwing xpath axis top to bottom
		WebElement Pass = driver.findElement(By.xpath("//input[@id='pass']/preceding::input[@name='email']"));
				//.sendKeys("Saikumar");// preceding xpath axis bottom to top
		WebElement login = driver.findElement(By.xpath("//div[@class='_8esn']/descendant::button[@name='login']"));// descendant
				email.sendKeys("saikumar")	;																								// pedda
				Pass.sendKeys("43434329990");																										// nundi
				login.click();																								// chinna...
    }
	}
	
