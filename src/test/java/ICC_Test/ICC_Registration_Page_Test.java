package ICC_Test;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ICC_Base.ICC_Base;
import ICC_Ui_Elements.ICC_Registration_Page;

public class ICC_Registration_Page_Test extends ICC_Base {
	ICC_Registration_Page IccRegistrationPage;
	@BeforeSuite
	public void launch() throws IOException {
		initialization();
		IccRegistrationPage = new ICC_Registration_Page();	
	}
	@AfterSuite
	public void close() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void RegisterButtonFunationality() {
		IccRegistrationPage.RegisterButton().click();
		Assert.assertEquals(driver.getTitle(), "Register & Login | ICC");
		
	}
	
	@Test(priority = 2)
	public void LoginPageLinkFunctionality () {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		IccRegistrationPage.LoginPageLink().click();
		Assert.assertEquals(IccRegistrationPage.LoginPageConfirmation().getText(), "Log in using your social account");
		driver.navigate().back();

	}
	
	@Test(priority = 3)
	public void SignWithAppleLinkFunctionality() {
		IccRegistrationPage.SigninWithAppleLink().click();
		Assert.assertEquals(driver.getTitle(), "Sign in with Apple ID");
		driver.navigate().back();
		
	}
	
	@Test(priority = 4)
	public void SignWithFacebookLinkFunctionality() {
		IccRegistrationPage.SigninWithFacebookLink().click();
		Assert.assertEquals(driver.getTitle(), "Log in to Facebook | Facebook");
		driver.navigate().back();
	}
	
	@Test(priority = 5)
	public void SignWithGoogleLinkFunctionality() throws InterruptedException {
		IccRegistrationPage.SigninWithGoogleLink().click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Sign in - Google Accounts");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);
		
	}
	
	
	@Test(priority = 6)
	public void EmailInputBoxFunctionality() throws InterruptedException {
		IccRegistrationPage.EmailInputBox().sendKeys("14prince09@gmail.com");
		IccRegistrationPage.ContinueWithEmailButton().click();
		
		
	}
	@Test(priority = 7)
	public void TermsAndConditionLinkFunctionality() throws InterruptedException {
		IccRegistrationPage.TermsAndConditionLink().click();
		Assert.assertEquals(driver.getTitle(), "International Cricket Council");
		driver.navigate().back();
		Thread.sleep(2000);
		IccRegistrationPage.ContinueWithEmailButton().click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 8)
	public void PasswordInputBoxFunctionality() throws InterruptedException {
		IccRegistrationPage.PasswordInputBox().sendKeys("Icccricket@999");
		Thread.sleep(2000);
		
		
	}
	@Test(priority = 9)
	public void SeeEnteredPasswordFunctionality() throws InterruptedException {
		IccRegistrationPage.SeeEnteredPassword().click();
		Thread.sleep(2000);
		IccRegistrationPage.SeeEnteredPassword().click();
		Thread.sleep(2000);
//		System.out.println("hi");
			
	}
	
	@Test(priority = 10)
	public void ConfirmPasswordInputBoxFunctionality() throws InterruptedException {
		IccRegistrationPage.ConfirmPasswordInputBox().sendKeys("Icccricket@999");
		Thread.sleep(2000);
		
		
	}
	@Test(priority = 11)
	public void SeeEnteredConfirmPasswordFunctionality() throws InterruptedException {
		IccRegistrationPage.SeeEnteredConfirmPassword().click();
		Thread.sleep(2000);
		IccRegistrationPage.SeeEnteredConfirmPassword().click();
		Thread.sleep(2000);
			
	}
	
	@Test(priority = 12)
	public void FirstNameInputBoxFunctionality() throws InterruptedException {
		IccRegistrationPage.FirstNameInputBox().sendKeys("Prince");
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority = 13)
	public void LastNameInputBoxFunctionality() throws InterruptedException {
		IccRegistrationPage.LastNameInputBox().sendKeys("Bhardwaj");
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority = 14)
	public void DobDayInputBoxFunctionality() throws InterruptedException {
		IccRegistrationPage.DobDayInputBox().sendKeys("14");
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 15)
	public void DobMonthInputBoxFunctionality() throws InterruptedException {
		IccRegistrationPage.DobMonthInputBox().sendKeys("10");
		Thread.sleep(2000);
			
	}
	
	@Test(priority = 16)
	public void DobYearInputBoxFunctionality() throws InterruptedException {
		IccRegistrationPage.DobYearInputBox().sendKeys("2001");
		Thread.sleep(2000);
	
	}
	
	@Test(priority = 17)
	public void TC1Functionality()  {
		IccRegistrationPage.TC1().click();
		
	}
	
	@Test(priority = 18)
	public void TC2Functionality()  {
		IccRegistrationPage.TC2().click();
		
	}
	
	@Test(priority = 19)
	public void RegistrationWithBlankEmailidBox() throws InterruptedException {
		IccRegistrationPage.EmailInputBox2().clear();
		IccRegistrationPage.CreateAccountButton().click();	
		Assert.assertEquals(IccRegistrationPage.BlankEmailBox().getText(), "Please specify your email address.");
		
	}
	
	@Test(priority = 20)
	public void RegistrationWithInvalidEmailid() throws InterruptedException {
		IccRegistrationPage.EmailInputBox2().sendKeys("14prince09gmail.com");
		IccRegistrationPage.CreateAccountButton().click();	
		Assert.assertEquals(IccRegistrationPage.WrongEmailId().getText(), "This value should be a valid email.");
		
	}
	
//	@Test(priority = 21)
//	public void RegistrationWithValidEmailid() throws InterruptedException {
//		IccRegistrationPage.EmailInputBox2().sendKeys("14prince09@gmail.com");
//		IccRegistrationPage.CreateAccountButton().click();	
////		Assert.assertEquals(IccRegistrationPage.WrongEmailId().getText(), "This value should be a valid email.");
//		
//	}
	
	
//	@Test(priority = 8)
//	public void RegistrationWithInvalidEmailid() throws InterruptedException {
//		IccRegistrationPage.EmailInputBox2().clear();
//		IccRegistrationPage.EmailInputBox2().sendKeys("14prince09gmail.com");
//		
//		
//		
//		
//	}

}
