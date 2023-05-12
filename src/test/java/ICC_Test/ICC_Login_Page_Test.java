package ICC_Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ICC_Base.ICC_Base;
import ICC_Ui_Elements.ICC_Login_Page;

public class ICC_Login_Page_Test extends ICC_Base {
	ICC_Login_Page ICCLoginPage;
	@BeforeSuite
	public void launch() throws IOException {
		initialization();
		ICCLoginPage = new ICC_Login_Page();	
	}
	
	
	@AfterSuite
	public void close() {
		driver.quit();
	}

	
	
	
	@Test(priority = 1)
	public void LoginButtonFunctionality() {
		ICCLoginPage.IccLoginButton().click();
		Assert.assertEquals(driver.getTitle(), "Register & Login | ICC");
		
	}
	
	@Test(priority = 2)
	public void RegistrationPageLinkFunctionality () throws InterruptedException {
		ICCLoginPage.RegistrationPageLink().click();
		Thread.sleep(2000);
		Assert.assertEquals(ICCLoginPage.RegistrationPageConfirmation().isDisplayed(), true);
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	@Test(priority = 3)
	public void SignWithAppleLinkFunctionality() {
		driver.navigate().to("https://sso.fanaccount.icc-cricket.com/auth/realms/ICC/protocol/openid-connect/auth?client_id=icc-sso-web&redirect_uri=https%3A%2F%2Fwww.icc-cricket.com%2Fhomepage&state=0eaf30f2-e4aa-4b7b-9262-38a229daa813&response_mode=fragment&response_type=code&scope=openid&nonce=7d06596b-5d20-4362-8e97-4a81d5e0e725&_gl=1*x1zk6i*_ga*MzU5MDUwMDE0LjE2ODI0MTAwMjc.*_ga_SB8SBQVNVM*MTY4MjY3MTQyMy4yMC4xLjE2ODI2NzE3NjQuNjAuMC4w");
		ICCLoginPage.SigninWithAppleLink().click();
		Assert.assertEquals(driver.getTitle(), "Sign in with Apple ID");
		driver.navigate().back();
		
	}
	
	@Test(priority = 4)
	public void SignWithFacebookLinkFunctionality() {
		ICCLoginPage.SigninWithFacebookLink().click();
		Assert.assertEquals(driver.getTitle(), "Log in to Facebook | Facebook");
		driver.navigate().back();
	}
	
	@Test(priority = 5)
	public void SignWithGoogleLinkFunctionality() throws InterruptedException {
		ICCLoginPage.SigninWithGoogleLink().click();
		Thread.sleep(3000);
		String s1 = "Sign in - Google accounts";
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase(s1));
		
		
//		Assert.assertEquals(ICCLoginPage.SigninWithGoogleConfirmation().getText(), "Sign in with Google");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);
		
	}
	
//	@Test(priority = 6)
//	public void EmailInputBoxFunctionality() throws InterruptedException {
//		ICCLoginPage.IccUsername().sendKeys("14prince09@gmail.com");
//		Thread.sleep(2000);
//		ICCLoginPage.IccUsername().clear();
//		
//		
//		
//	}
//	
//	@Test(priority = 7)
//	public void PasswordnputBoxFunctionality() throws InterruptedException {
//		ICCLoginPage.IccPassword().sendKeys("Icccricket@999");
//		Thread.sleep(2000);
//		ICCLoginPage.IccPassword().clear();
//		
//		
//		
//	}
//	@Test(priority = 8)
//	public void SeeEnteredPasswordFunctionality() throws InterruptedException {
//		ICCLoginPage.IccPassword().sendKeys("Icccricket@999");
//		ICCLoginPage.SeeEnteredPassword().click();
//		Thread.sleep(2000);
//		ICCLoginPage.IccPassword().clear();
//			
//	}
//	
//	@Test(priority = 9)
//	public void RememberMeCheckBox()  {
//		ICCLoginPage.RememberMe().click();
//		ICCLoginPage.RememberMe().click();
//		
//		
//	}
//	
//	@Test(priority = 10)
//	public void ForgotPasswordLink()  {
//		ICCLoginPage.ForgotPassword().click();
//		Assert.assertEquals(ICCLoginPage.ForgotPasswordClickedConfirmation().getText(), "Enter your email address below to reset your password");
//		
//		
//	}
//	
//	@Test(priority = 11)
//	public void LoginWithoutEnteringEmailAndPassword()  {
//		driver.navigate().to("https://sso.fanaccount.icc-cricket.com/auth/realms/ICC/protocol/openid-connect/auth?client_id=icc-sso-web&redirect_uri=https%3A%2F%2Fwww.icc-cricket.com%2Fhomepage&state=0eaf30f2-e4aa-4b7b-9262-38a229daa813&response_mode=fragment&response_type=code&scope=openid&nonce=7d06596b-5d20-4362-8e97-4a81d5e0e725&_gl=1*x1zk6i*_ga*MzU5MDUwMDE0LjE2ODI0MTAwMjc.*_ga_SB8SBQVNVM*MTY4MjY3MTQyMy4yMC4xLjE2ODI2NzE3NjQuNjAuMC4w");
//		ICCLoginPage.IccLoginpageLoginButton().click();
//		Assert.assertEquals(ICCLoginPage.IccEmptyUsernameBox().getText(), "Please specify your email address.");
//		Assert.assertEquals(ICCLoginPage.IccEmptyPasswordBox().getText(), "Please specify your password.");
//		
//		
//	}
//	
//	@Test(priority = 12)
//	public void LoginByEnteringOnlyEmail()  {
//		ICCLoginPage.IccUsername().sendKeys("14prince09@gmail.com");
//		ICCLoginPage.IccLoginpageLoginButton().click();
//		Assert.assertEquals(ICCLoginPage.IccEmptyPasswordBox().getText(), "Please specify your password.");
//		
//		
//	}
//	
//	@Test(priority = 13)
//	public void LoginByEnteringOnlyPassword()  {
//		driver.navigate().to("https://sso.fanaccount.icc-cricket.com/auth/realms/ICC/protocol/openid-connect/auth?client_id=icc-sso-web&redirect_uri=https%3A%2F%2Fwww.icc-cricket.com%2Fhomepage&state=0eaf30f2-e4aa-4b7b-9262-38a229daa813&response_mode=fragment&response_type=code&scope=openid&nonce=7d06596b-5d20-4362-8e97-4a81d5e0e725&_gl=1*x1zk6i*_ga*MzU5MDUwMDE0LjE2ODI0MTAwMjc.*_ga_SB8SBQVNVM*MTY4MjY3MTQyMy4yMC4xLjE2ODI2NzE3NjQuNjAuMC4w");
//		ICCLoginPage.IccPassword().sendKeys("Icccricket@999");
//		ICCLoginPage.IccLoginpageLoginButton().click();
//		Assert.assertEquals(ICCLoginPage.IccEmptyUsernameBox().getText(), "Please specify your email address.");
//		
//		
//	}
//	
//	@Test(priority = 14)
//	public void LoginWithInvalidEmailAndPassword()  {
//		driver.navigate().to("https://sso.fanaccount.icc-cricket.com/auth/realms/ICC/protocol/openid-connect/auth?client_id=icc-sso-web&redirect_uri=https%3A%2F%2Fwww.icc-cricket.com%2Fhomepage&state=0eaf30f2-e4aa-4b7b-9262-38a229daa813&response_mode=fragment&response_type=code&scope=openid&nonce=7d06596b-5d20-4362-8e97-4a81d5e0e725&_gl=1*x1zk6i*_ga*MzU5MDUwMDE0LjE2ODI0MTAwMjc.*_ga_SB8SBQVNVM*MTY4MjY3MTQyMy4yMC4xLjE2ODI2NzE3NjQuNjAuMC4w");
//		ICCLoginPage.IccUsername().sendKeys("14prince09gmail.com");
//		ICCLoginPage.IccPassword().sendKeys("Icccricket@99999");
//		ICCLoginPage.IccLoginpageLoginButton().click();
//		Assert.assertEquals(ICCLoginPage.IccInvalidUsername().getText(), "This value should be a valid email.");
//		
//		
//	}
//	
//	@Test(priority = 15)
//	public void LoginWithInvalidEmailAndValidPassword()  {
//		driver.navigate().to("https://sso.fanaccount.icc-cricket.com/auth/realms/ICC/protocol/openid-connect/auth?client_id=icc-sso-web&redirect_uri=https%3A%2F%2Fwww.icc-cricket.com%2Fhomepage&state=0eaf30f2-e4aa-4b7b-9262-38a229daa813&response_mode=fragment&response_type=code&scope=openid&nonce=7d06596b-5d20-4362-8e97-4a81d5e0e725&_gl=1*x1zk6i*_ga*MzU5MDUwMDE0LjE2ODI0MTAwMjc.*_ga_SB8SBQVNVM*MTY4MjY3MTQyMy4yMC4xLjE2ODI2NzE3NjQuNjAuMC4w");
//		ICCLoginPage.IccUsername().sendKeys("14prince09gmail.com");
//		ICCLoginPage.IccPassword().sendKeys("Icccricket@999");
//		ICCLoginPage.IccLoginpageLoginButton().click();
//		Assert.assertEquals(ICCLoginPage.IccInvalidUsername().getText(), "This value should be a valid email.");
//		
//		
//	}
//	
//	@Test(priority = 16)
//	public void LoginWithValidEmailAndInvalidPassword()  {
//		driver.navigate().to("https://sso.fanaccount.icc-cricket.com/auth/realms/ICC/protocol/openid-connect/auth?client_id=icc-sso-web&redirect_uri=https%3A%2F%2Fwww.icc-cricket.com%2Fhomepage&state=0eaf30f2-e4aa-4b7b-9262-38a229daa813&response_mode=fragment&response_type=code&scope=openid&nonce=7d06596b-5d20-4362-8e97-4a81d5e0e725&_gl=1*x1zk6i*_ga*MzU5MDUwMDE0LjE2ODI0MTAwMjc.*_ga_SB8SBQVNVM*MTY4MjY3MTQyMy4yMC4xLjE2ODI2NzE3NjQuNjAuMC4w");
//		ICCLoginPage.IccUsername().sendKeys("14prince09@gmail.com");
//		ICCLoginPage.IccPassword().sendKeys("Icccricket@99999");
//		ICCLoginPage.IccLoginpageLoginButton().click();
//		Assert.assertEquals(ICCLoginPage.IccInvalidPassword().getText(), "Your username or password was incorrect.");
//		
//		
//	}
//	
//	@Test(priority = 17)
//	public void LoginWithValidEmailAndPassword() throws InterruptedException  {
//		driver.navigate().to("https://sso.fanaccount.icc-cricket.com/auth/realms/ICC/protocol/openid-connect/auth?client_id=icc-sso-web&redirect_uri=https%3A%2F%2Fwww.icc-cricket.com%2Fhomepage&state=0eaf30f2-e4aa-4b7b-9262-38a229daa813&response_mode=fragment&response_type=code&scope=openid&nonce=7d06596b-5d20-4362-8e97-4a81d5e0e725&_gl=1*x1zk6i*_ga*MzU5MDUwMDE0LjE2ODI0MTAwMjc.*_ga_SB8SBQVNVM*MTY4MjY3MTQyMy4yMC4xLjE2ODI2NzE3NjQuNjAuMC4w");
//		ICCLoginPage.IccUsername().sendKeys("14prince09@gmail.com");
//		ICCLoginPage.IccPassword().sendKeys("Icccricket@999");
//		ICCLoginPage.IccLoginpageLoginButton().click();
//		Thread.sleep(6000);
//		Assert.assertEquals(ICCLoginPage.LoginConfirmation().isDisplayed(), true);
//		
//		
//	}
//	
//	@Test(priority = 18)
//	public void LogOut()  throws InterruptedException{
//		Thread.sleep(6000);
//		ICCLoginPage.LoginConfirmation().click();
//		Thread.sleep(3000);
//		ICCLoginPage.LogOut().click();
//		
//		Assert.assertEquals(driver.getTitle(), "Register & Login | ICC");
//		
//		
//	}
	
	

}
