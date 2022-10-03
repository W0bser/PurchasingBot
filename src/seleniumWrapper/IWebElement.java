package seleniumWrapper;

public abstract class IWebElement {
	abstract void sendKeys(CharSequence keys);
	abstract void submit();
	abstract void click();
}
