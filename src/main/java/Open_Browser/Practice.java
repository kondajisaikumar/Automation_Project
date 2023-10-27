package Open_Browser;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gclid=Cj0KCQjwmvSoBhDOARIsAK6aV7ier9xBTFWxfEDuoURjR3STdgFHC4Chc0fuErnAKC24fG_i3BEEGhoaAk_iEALw_wcB");
      WebElement clk= driver.findElement(By.xpath("//a[text()='Home & Living']"));
      
      
    Actions act=new Actions(driver);
    Thread.sleep(2000);
    act.moveToElement(clk).perform();
	}

}
