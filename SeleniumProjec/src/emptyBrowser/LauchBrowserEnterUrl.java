package emptyBrowser;

//WAS To launch the browser and enter the URL and close the browser
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchBrowserEnterUrl {

	public static void main(String[] args) throws InterruptedException {
		String chromekey = "webdriver.chrome.driver";
		String chromevalue = "./Software/chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		WebDriver driver=new  ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		//driver.close();
		driver.close();
	
		
		

	}

}
