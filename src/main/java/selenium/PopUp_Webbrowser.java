package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUp_Webbrowser {

	public static void main(String[] args) {
		ChromeOptions Options = new ChromeOptions();// predefine class
		Options.addArguments("--disable-notifications");// it will disable browser notivication popups

		WebDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
	}

}
