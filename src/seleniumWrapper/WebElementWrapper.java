package seleniumWrapper;
import org.openqa.selenium.WebElement;

public class WebElementWrapper extends IWebElement {
	public WebElementWrapper(WebElement web_element) {
		web_element_ = web_element;
	}
	
	public void sendKeys(CharSequence keys)
	{
		web_element_.sendKeys(keys);
	}

	public void submit()
	{
		web_element_.submit();
	}
	
	public void click()
	{
		web_element_.click();
	}
	
	private WebElement web_element_;
}
