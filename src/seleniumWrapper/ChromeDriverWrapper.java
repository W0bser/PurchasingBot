package seleniumWrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWrapper extends IWebDriver{
	public static String setChromeDriverLocation(String key, String value)
	{
		return System.setProperty(key, value);
	}
	
	public ChromeDriverWrapper() 
	{
		web_driver_ = new ChromeDriver();
	}
	
	public void get(String url)
	{
		web_driver_.get(url);
	}
	
	public WebElementWrapper findElementByString(String string) throws InterruptedException
	{
		WebElement web_element = null;
		char num_retries = 0;
		final char max_retries = 5;
		final long sleepTimeMsec = 1000;
		
		while(num_retries < max_retries) {
			try {
				web_element = web_driver_.findElement(By.name(string));
				break;	/* found it */
			} catch (org.openqa.selenium.NoSuchElementException e) {
				++num_retries;
				
				if (num_retries >= max_retries) {
					System.out.println("Ran out of retries to find element by string: " + string + " Got exception: " + e.getMessage());
					System.exit(0);
				}
				
				Thread.sleep(sleepTimeMsec);
			}
		}
		
		return new WebElementWrapper(web_element);
		
	}
	
	public WebElementWrapper findElementByXPath(String xpath) throws InterruptedException
	{
		WebElement web_element = null;
		char num_retries = 0;
		final char max_retries = 5;
		final long sleepTimeMsec = 1000;
		
		while (num_retries < max_retries) {
			try {
				web_element = web_driver_.findElement(By.xpath(xpath));
				break;	/* found it */
			} catch (org.openqa.selenium.NoSuchElementException e) {
				++num_retries;
				
				if (num_retries >= max_retries) {
					System.out.println("Ran out of retries to find element by xpath: " + xpath + " Got exception: " + e.getMessage());
					System.exit(0);
				}
				
				Thread.sleep(sleepTimeMsec);
			}
		}
		
		
		return new WebElementWrapper(web_element);
	}
	
	public String getTitle()
	{
		return web_driver_.getTitle();
	}
	
	
	private ChromeDriver web_driver_;
}
