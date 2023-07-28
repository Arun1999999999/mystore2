package genericutility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;
import objectrepository.RegisterPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage loginpage;
	public RegisterPage registerpage;
	PropertyUtility utility=new PropertyUtility();
	public javaScriptUtility jsutility=new javaScriptUtility();
	@BeforeClass
	public void launchingBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	
		public void navigatingToApplication() throws IOException
		{
		driver.get(utility.returningDataFromFile("url"));
		loginpage=new LoginPage(driver);
		registerpage=new RegisterPage(driver);
		}
		
	
	@AfterMethod
	public void teardownbrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
