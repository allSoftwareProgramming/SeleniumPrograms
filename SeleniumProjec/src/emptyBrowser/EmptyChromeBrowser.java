// WAS to Launch the browser and enter the URL and close the browser
package emptyBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyChromeBrowser {

	public static void main(String[] args) {
		String chromekey = "webdriver.chrome.driver";
		String chromevalue = "./Software/chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new  ChromeDriver();
		
		
	

	}

}
