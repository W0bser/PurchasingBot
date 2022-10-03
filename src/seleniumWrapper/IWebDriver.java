package seleniumWrapper;

public abstract class IWebDriver {
	abstract void get(String url);
	abstract IWebElement findElementByString(String string) throws InterruptedException;
	abstract IWebElement findElementByXPath(String xpath) throws InterruptedException;
	abstract String getTitle(); 
}
