package testScript;

import org.testng.annotations.Test;

import genericutility.BaseClass;

public class TC_02Test extends BaseClass {
	@Test
	public void RegisterCredential() throws InterruptedException
	{registerpage.getRegister().click();
	registerpage.getRadiobutton().click();
	registerpage.getFirstname().sendKeys("arun");
	//registerpage.getLastname().sendKeys("acharya");
	//Thread.sleep(2000);
	jsutility.enteringDataUsingJavaScript(driver, registerpage.getLastname(), "hiiiii");
	//		registerpage.getRegEmail().sendKeys("arunacharaya@gmai.com");
	jsutility.enteringDataUsingJavaScript(driver, registerpage.getRegEmail(), "hiiiii");

	registerpage.getRegPassword().sendKeys("#####");
	//jsutility.enteringDataUsingJavaScript(driver, registerpage.getRegPassword(), "######");

	//registerpage.getConfirmpass().sendKeys("#####");
	jsutility.enteringDataUsingJavaScript(driver, registerpage.getConfirmpass(), "#####");

	registerpage.getRegbutton().click();

	}

}
