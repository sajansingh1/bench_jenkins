package jenkinsMavenIntegration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTestCase {
	
	
	
	@Test
	
	public void lauchBrowser()
	{
		String Launching_browser ="Chrome";
		WebDriver driver=null;
		System.out.println("Launch browser is : " + Launching_browser);
		
		if(Launching_browser.contains("Chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajansingh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		}
		
		else if(Launching_browser.contains("Firefox"))
		{System.setProperty("webdriver.chrome.driver","D:\\Downloads\\Softwares\\browserDrivers\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
			
		}
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Google"),"Title match");
		
		driver.quit();
	}

}
