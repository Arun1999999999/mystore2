package genericutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javaScriptUtility {
	public void enteringDataUsingJavaScript(WebDriver driver,WebElement element,String data)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + data + "';", element);//arguments[0] refers to the element WebElement that you passed as the first argument in the method.
		
	}
	public void ClickingOnElement(WebDriver driver,WebElement ele)
	{

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",ele);
		
	
		
	}

}
