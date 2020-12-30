import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test12 {
	
	WebDriver driver;
	
	  @Test
		public void asetUp1() {
			
				System.setProperty("webdriver.chrome.driver", "C:\\Automation Softwares\\chromedriver.exe");
				driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://10.82.180.36/Common/Login.aspx");
			
	        driver.quit();
	        
	}

}
