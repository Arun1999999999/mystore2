package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(linkText = "Register")
	private WebElement register;
	
	@FindBy(id = "gender-male")
	private WebElement radiobutton;
	
	
	
	@FindBy(id = "FirstName")
	private WebElement firstname;
	
	@FindBy(id = "LastName")
	private WebElement lastname;
	
	@FindBy(xpath = "(//input[@class='text-box single-line'])[3]")
	private WebElement regEmail;
	
	@FindBy(xpath = "(//input[@class='text-box single-line password'])[1]")
	private WebElement regPassword;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpass;
	
	@FindBy(xpath = "//input[@class='button-1 register-next-step-button']")
	private WebElement regbutton;

	public WebElement getRegister() {
		return register;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getRegEmail() {
		return regEmail;
	}

	public WebElement getRegPassword() {
		return regPassword;
	}

	public WebElement getConfirmpass() {
		return confirmpass;
	}

	public WebElement getRegbutton() {
		return regbutton;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}


}
