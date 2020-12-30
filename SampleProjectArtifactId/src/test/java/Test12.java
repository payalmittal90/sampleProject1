import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test12 {
	
	WebDriver driver;
	
	  @Test
		public void asetUp1() {
		  ChromeOptions options = new ChromeOptions();
				System.setProperty("webdriver.chrome.driver", "C:\\Automation Softwares\\chromedriver.exe");
				options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
				options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
				options.addArguments("--headless"); // only if you are ACTUALLY running headless
				options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
				options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
				options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
				options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
				options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
				driver = new ChromeDriver(options);
				
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://10.82.180.36/Common/Login.aspx");
			
	        driver.quit();
	        
	}

}
