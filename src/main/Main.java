package main;

import seleniumWrapper.*;

public class Main {

	static public void sendEmail(ChromeDriverWrapper driver) throws InterruptedException
	{
		driver.get("https://mail.umn.edu");
		
		/* username */
		WebElementWrapper element = driver.findElementByString("j_username");
		element.sendKeys("<My Username Here>");
		
		/* password */
		element = driver.findElementByString("j_password");
		element.sendKeys("<My Password Here>");
		
		/* click on "Submit" (or something) */
		element = driver.findElementByString("_eventId_proceed");
		element.click();

		/* Click "Continue" to verify it's "me" */
		element = driver.findElementByXPath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span");
		element.click();
		
		/* compose */
		element = driver.findElementByXPath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div");
		element.click();
		
		/* "To" line */
		element = driver.findElementByXPath("//*[@id=\":rc\"]");
		element.sendKeys("<Recipient's Username>");
		
		/* "Subject" line */
		element = driver.findElementByXPath("//*[@id=\":qu\"]");
		element.sendKeys("hi");
		
		/* "Body" of message */
		element = driver.findElementByXPath("//*[@id=\":rz\"]");
		element.sendKeys("buy this thing\n\nplease");
		
		/* send message button */
		//*[@id=":qk"]
		element = driver.findElementByXPath("//*[@id=\":qk\"]");
		element.click();
		
		System.out.println("Page title is: " + driver.getTitle());
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriverWrapper.setChromeDriverLocation("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeDriverWrapper driver = new ChromeDriverWrapper();
		sendEmail(driver);
		
/* 
 		ACTUAL CODE!!!!
*/
		
	}

}
