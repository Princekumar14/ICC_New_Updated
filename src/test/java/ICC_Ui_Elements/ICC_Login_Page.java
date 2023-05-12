package ICC_Ui_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ICC_Base.ICC_Base;

public class ICC_Login_Page extends ICC_Base {
	public ICC_Login_Page() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//This Login Button belongs to HomePage
	@FindBy(xpath="//a[text()='Login']")
	WebElement ICCloginbutton;
	public WebElement IccLoginButton()  {
		return ICCloginbutton;
		
	}
	
	@FindBy(xpath="//div/header/p/a[text()='Create an account']") //Redirect to Registration page
	WebElement registration_page_link;
	public WebElement RegistrationPageLink()   {
		return registration_page_link;
		
	}
	@FindBy(xpath="//p[text()='Already have an account? ']")
	WebElement registration_page_confirmation;
	public WebElement RegistrationPageConfirmation()   {
		return registration_page_confirmation;
		
	}
	
	@FindBy(xpath="//span[text()='Sign in with Apple']") //Signin With Apple account
	WebElement signin_with_apple_link;
	public WebElement SigninWithAppleLink()   {
		return signin_with_apple_link;
		
	}
	
	@FindBy(xpath="//span[text()='Sign in with Facebook']") //Directly signin with Facebook account
	WebElement signin_with_facebook_link;
	public WebElement SigninWithFacebookLink()   {
		return signin_with_facebook_link;
		
	}
	
	@FindBy(xpath="//span[text()='Sign in with Google']") //Directly signin with Google account
	WebElement signin_with_google_link;
	public WebElement SigninWithGoogleLink()   {
		return signin_with_google_link;
		
	}
	
	@FindBy(xpath="//div[text()='Sign in with Google']") // signin with Google account confirmation
	WebElement signin_with_google_confirmation;
	public WebElement SigninWithGoogleConfirmation()   {
		return signin_with_google_confirmation;
		
	}
	
	
	@FindBy(xpath="//input[@id='username']")
	WebElement ICCusername;
	public WebElement IccUsername()  {
		return ICCusername;
		
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement ICCpassword;
	public WebElement IccPassword()  {
		return ICCpassword;
		
	}
	
	
	
	@FindBy(xpath="//button[@id='showPassword']/span") // See the password 
	WebElement see_entered_Password;
	public WebElement SeeEnteredPassword()   {
		return see_entered_Password;
		
	}
	
	
	@FindBy(xpath="//label[@for='rememberMe']") // Remember me check-box
	WebElement remember_me;
	public WebElement RememberMe()   {
		return remember_me;	
	}
	
	@FindBy(xpath="//a[@id='forgotPassword']") // Forgot password Link
	WebElement forgot_password;
	public WebElement ForgotPassword()   {
		return forgot_password;	
	}
	
	
	@FindBy(xpath="//p[text()='Enter your email address below to reset your password']") 
	WebElement forgot_password_clicked_confirmation;
	public WebElement ForgotPasswordClickedConfirmation()   {
		return forgot_password_clicked_confirmation;	
	}
	
	//This Login Button belongs to LoginPage
	@FindBy(xpath="//button[text()='Log in']")
	WebElement ICCloginpageloginbutton;
	public WebElement IccLoginpageLoginButton()  {
		return ICCloginpageloginbutton;
		
	}
	
	@FindBy(xpath="//li[text()='Please specify your email address.']")
	WebElement ICCemptyusernamebox;
	public WebElement IccEmptyUsernameBox()  {
		return ICCemptyusernamebox;
		
	}
	
	@FindBy(xpath="//li[text()='Please specify your password.']")
	WebElement ICCemptypasswordbox;
	public WebElement IccEmptyPasswordBox()  {
		return ICCemptypasswordbox;
		
	}
	
	
	@FindBy(xpath="//li[text()='This value should be a valid email.']")
	WebElement ICCinvalidusername;
	public WebElement IccInvalidUsername()  {
		return ICCinvalidusername;
		
	}
	
	@FindBy(xpath="//span[text()='Your username or password was incorrect.']")
	WebElement ICCinvalidpassword;
	public WebElement IccInvalidPassword()  {
		return ICCinvalidpassword;
		
	}
	
	@FindBy(xpath="//a[@id='sso-my-account']") 
	WebElement login_confirmation;
	public WebElement LoginConfirmation()   {
		return login_confirmation;
		
	}
	
	
	
	@FindBy(xpath="//div[@class='logout account-page__logout']/a") 
	WebElement logout;
	public WebElement LogOut()   {
		return logout;
		
	}
		

}
