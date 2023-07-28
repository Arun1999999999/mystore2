package testScript;

import org.testng.annotations.Test;

import genericutility.BaseClass;
import objectrepository.LoginPage;

public class TC_01Test extends BaseClass{
	@Test
	public void loginWithValidCredentials()
	{
		loginpage.getLogin().click();
		
		loginpage.getEmail().sendKeys("arunacharya");
		loginpage.getPassword().sendKeys("#############");
		loginpage.getLoginbutton().click();
	}
	

}
