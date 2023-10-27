package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("ksai1919@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("22222222222");
//		driver.findElement(By.name("login")).click();
//      driver.findElement(By.className("login")).click();  // ex:-  its just like name only (same)...
//      driver.findElement(By.linkText("https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjk0MTc0MTY3LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&ars=facebook_login")).click();
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		driver.findElement(By.partialLinkText("Forgotten p")).click();
//      driver.findElement(By.cssSelector("#email")).sendKeys("Saikumar");//cssselectors #email sytanx 1st type
//      driver.findElement(By.cssSelector("[name='email']")).sendKeys("Saikumar123");;////cssselectors [name='email'] sytanx 2nd type
		
	}
}