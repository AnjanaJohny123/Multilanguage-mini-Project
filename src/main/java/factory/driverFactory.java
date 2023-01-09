package factory;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class driverFactory {

	public WebDriver driver;
	
	public WebDriver initDriver(String browserName,Properties prop)
	{
		System.out.println("Browsername is: "+ browserName);
		switch(browserName.toLowerCase())
		{
		case "chrome":
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Automated testing\\chromedriver.exe" );
		break;
		case "firefox":
			driver=new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Desktop\\Automated testing\\geckodriver.exe" );
			break;
		case "safari":
			driver=new SafariDriver();
			System.setProperty("webdriver.safari.driver","C:\\Users\\USER\\Desktop\\Automated testing\\safaridriver.exe" );
			break;
		default:
			System.out.println("browser not found :"+browserName);
			break;
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}
}
