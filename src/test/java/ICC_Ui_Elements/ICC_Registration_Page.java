package ICC_Ui_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ICC_Base.ICC_Base;

public class ICC_Registration_Page extends ICC_Base {
	public ICC_Registration_Page() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register_button;
	public WebElement RegisterButton()   {
		return register_button;
		
	}
	
	
	
	@FindBy(xpath="//div/p/a[text()='Log in']") //Redirect to Login page
	WebElement login_page_link;
	public WebElement LoginPageLink()   {
		return login_page_link;
		
	}
	@FindBy(xpath="//h2[text()='Log in using your social account']")
	WebElement login_page_confirmation;
	public WebElement LoginPageConfirmation()   {
		return login_page_confirmation;
		
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
	
	
	@FindBy(xpath="//input[@id='reg-email']") // Entering mail-id in Email
	WebElement email_input_box;
	public WebElement EmailInputBox()   {
		return email_input_box;
		
	}
	@FindBy(xpath="//span[text()='Continue with email']") 
	WebElement continue_with_email_button;
	public WebElement ContinueWithEmailButton()   {
		return continue_with_email_button;
		
	}
	
	@FindBy(xpath="//a[text()='terms and conditions']") 
	WebElement terms_and_condition_link;
	public WebElement TermsAndConditionLink()   {
		return terms_and_condition_link;
		
	}
	
	@FindBy(xpath="//input[@id='email']") 
	WebElement email_input_box2;
	public WebElement EmailInputBox2()   {
		return email_input_box2;
		
	}
	
	
	@FindBy(xpath="//input[@id='password']") // Entering password in passwod-box
	WebElement password_input_box;
	public WebElement PasswordInputBox()   {
		return password_input_box;
		
	}
	
	@FindBy(xpath="//button[@id='showPassword']/span") // See the password 
	WebElement see_entered_Password;
	public WebElement SeeEnteredPassword()   {
		return see_entered_Password;
		
	}
	
	@FindBy(xpath="//input[@id='password-confirm']") // Confirmin the entered password
	WebElement confirm_password_input_box;
	public WebElement ConfirmPasswordInputBox()   {
		return confirm_password_input_box;
		
	}
	
	@FindBy(xpath="//button[@id='showPasswordConfirm']/span") // See the Confirm password 
	WebElement see_entered_Confirm_Password;
	public WebElement SeeEnteredConfirmPassword()   {
		return see_entered_Confirm_Password;
		
	}
	
	@FindBy(xpath="//input[@id='firstName']") 
	WebElement first_name_input_box;
	public WebElement FirstNameInputBox()   {
		return first_name_input_box;
		
	}
	
	@FindBy(xpath="//input[@id='lastName']") 
	WebElement last_name_input_box;
	public WebElement LastNameInputBox()   {
		return last_name_input_box;
		
	}
	
	@FindBy(xpath="//input[@id='dobDay']") // Enter here your Date of birth
	WebElement dob_day_input_box;
	public WebElement DobDayInputBox()   {
		return dob_day_input_box;
		
	}
	
	@FindBy(xpath="//input[@id='dobMonth']") // Enter here your Month of birth
	WebElement dob_month_input_box;
	public WebElement DobMonthInputBox()   {
		return dob_month_input_box;
		
	}
	
	
	@FindBy(xpath="//input[@id='dobYear']") // Enter here your Year of birth
	WebElement dob_year_input_box;
	public WebElement DobYearInputBox()   {
		return dob_year_input_box;
		
	}
	
	
	@FindBy(xpath="//ul[@class='form__optins']/li[1]/div/label") // Terms & Condition (2)
	WebElement tc1;
	public WebElement TC1()   {
		return tc1;	
	}
	
	
	@FindBy(xpath="//label[@for='iccContact']") // Terms & Condition (2)
	WebElement tc2;
	public WebElement TC2()   {
		return tc2;	
	}
	
	@FindBy(xpath="//button[text()='Create account']") 
	WebElement create_account_button;
	public WebElement CreateAccountButton()   {
		return create_account_button;	
	}
	
	@FindBy(xpath="//li[text()='Please specify your email address.']") 
	WebElement blank_email_box;
	public WebElement BlankEmailBox()   {
		return blank_email_box;	
	}
	
	@FindBy(xpath="//li[text()='This value should be a valid email.']") 
	WebElement wrong_email_id;
	public WebElement WrongEmailId()   {
		return wrong_email_id;	
	}
	
	
}
