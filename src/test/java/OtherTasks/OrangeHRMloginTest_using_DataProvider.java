package OtherTasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OrangeHRMloginTest_using_DataProvider {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		//setup the webBrowser driver
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	
	
	@Test(dataProvider = "loginData")
	public void testLogin(String username, String password) throws  InterruptedException
	{
		Thread.sleep(2000);
		WebElement usernameInput=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usernameInput.sendKeys(username);
		
		Thread.sleep(2000);
		WebElement passwordInput=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordInput.sendKeys(password);
		
		driver.findElement(By.xpath("//form[@class='oxd-form']/div[3]/button")).click();
		
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actualUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Log in Successfully!! ");
		
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(actualUrl, expectedUrl);
//		System.out.println("Successfully loged in");
		
//		if(expectedUrl.equals(actualUrl)) {
//			System.out.println("Successfully loged in");
//			
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[text()='Logout']")).click();
//
//			
//			
//		}
//		else {
//			System.out.println("Something went Wrong ");
//		}
		
	}
	
	
	
	@AfterTest
	public void quit() 
	{
		driver.quit();
	}
	
	@DataProvider(name = "loginData")
	public Object[][] provideLoginData(){
		return new Object[][] {
			{"prince", "something"},
			{"Admin", "admin123"}
			
		};
	}
	
	

}



