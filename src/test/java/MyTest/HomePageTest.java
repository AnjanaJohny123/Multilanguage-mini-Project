package MyTest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import configReader.ConfigPropReader;
import factory.driverFactory;

public class HomePageTest {

	driverFactory df;
	ConfigPropReader cp;
	Properties prop;
	WebDriver driver;
	HomePage homePage;
	
	
	@BeforeTest
	public void setup()
	{
		cp=new ConfigPropReader();
		prop=cp.initLangProp();
		df=new driverFactory();
		driver=df.initDriver("chrome", prop);
		homePage=new HomePage(driver);
	}
	
	@Test
	public void headerTest()
	{
		Assert.assertTrue(homePage.isHeaderExists(prop.getProperty("header")));
	}
	@Test
	public void contactTest()
	{
		Assert.assertTrue(homePage.isContactExists(prop.getProperty("contact")));
	}
	 @AfterTest
	 public void tearDown()
	 {
		 driver.quit();
	 }
}
