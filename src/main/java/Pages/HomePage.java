package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.elementUtil;

public class HomePage {

	
	private WebDriver driver;
	private elementUtil util;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		util=new elementUtil(driver);
	}
	
	private WebElement getHeaderElement(String headerValue)
	{
		String headerXpathValue="//a[contains(text(),'"+headerValue+"')]";
		return util.getElement("xpath", headerXpathValue);
	}
	
	public boolean isHeaderExists(String headerValue)
	{
		String header=getHeaderElement(headerValue).getText();
		System.out.println(header);
		return getHeaderElement(headerValue).isDisplayed();
	}
	private WebElement getContactElement(String contactValue)
	{
		String contactXpathValue="//a[contains(text(),'"+contactValue+"')]";
		return util.getElement("xpath", contactXpathValue);
	}
	
	public boolean isContactExists(String contactValue)
	{
		String contact=getContactElement(contactValue).getText();
		System.out.println(contact);
		return getContactElement(contactValue).isDisplayed();
	}
}
