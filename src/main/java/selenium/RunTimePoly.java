package selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RunTimePoly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter The Browser Name");
		String BrowserName = sc.next();
		if (BrowserName.equals("chrome")) {
			new ChromeDriver();
		} else if (BrowserName.equals("edge")) {
			new EdgeDriver();
		} else {
			System.out.println("Enter Proper BrowserName");
		}

	}
}