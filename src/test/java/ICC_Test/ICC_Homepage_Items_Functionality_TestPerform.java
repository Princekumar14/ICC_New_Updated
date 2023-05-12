package ICC_Test;


import java.io.IOException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ICC_Base.ICC_Base;
import ICC_Ui_Elements.ICC_Homepage_Items_Functionality;


public class ICC_Homepage_Items_Functionality_TestPerform extends ICC_Base {
	ICC_Homepage_Items_Functionality icc_Homepage_Items;
	
	
	@BeforeSuite
	public void launch() throws IOException {
		
		initialization();
		icc_Homepage_Items =new ICC_Homepage_Items_Functionality();
		
	}
	@AfterSuite
	public void close() {
		driver.quit();
	}
	
//	@Test(priority = 1)
//	public void HomeSection()  {
//		
//		icc_Homepage_Items.HomeOption().click();
//		Assert.assertEquals(driver.getTitle(), "Official International Cricket Council Website");
//	}
	@Test(priority = 1)
	public void ScoresSection() throws InterruptedException{
		Actions action = new Actions(driver);
		action.moveToElement(icc_Homepage_Items.ScoresOption()).perform();
		Thread.sleep(3000);
		
	}
	@Test(priority = 2)
	public void RankingsSection() throws InterruptedException{
		Actions action = new Actions(driver);
		action.moveToElement(icc_Homepage_Items.RankingsOption()).perform();
		Thread.sleep(3000);
	}
	@Test(priority = 3)
	public void EventsSection() throws InterruptedException{
		Actions action = new Actions(driver);
		action.moveToElement(icc_Homepage_Items.EventsOption()).perform();
		Thread.sleep(3000);
	}
	@Test(priority = 4)
	public void NewsSection(){
		icc_Homepage_Items.NewsOption().click();
		Assert.assertEquals(driver.getTitle(), "Cricket News | ICC");
		
	}
	@Test(priority = 5)
	public void AwardsSection() {
		icc_Homepage_Items.AwardsOption().click();
		Assert.assertEquals(driver.getTitle(), "ICC Cricket Awards | ICC");
		
	}
	@Test(priority = 6)
	public void VideosSection() {
		icc_Homepage_Items.VideosOption().click();
		Assert.assertEquals(driver.getTitle(), "Cricket Videos | ICC");
		
	}
	@Test(priority = 7)
	public void IccTvSection() throws InterruptedException{
		icc_Homepage_Items.IccTvOption().click();
		Thread.sleep(5000);
//		Assert.assertEquals(driver.getTitle(), "HOME - ICC");
		Assert.assertEquals(driver.getCurrentUrl(), "https://app.icc.tv/home");
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 8)
	public void ShopSection() {
		icc_Homepage_Items.ShopOption().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.fancode.com/shop/icc?utm_source=icc&utm_medium=banner");
		driver.navigate().back();
	}
	
	@Test(priority = 9)
	public void TravelSection() {
		icc_Homepage_Items.TravelOption().click();
		Assert.assertEquals(icc_Homepage_Items.TravelPageLogo().isDisplayed(), true);
		driver.navigate().back();
	}
	@Test(priority = 10)
	public void HomeSection()  {
		
		icc_Homepage_Items.HomeOption().click();
		Assert.assertEquals(driver.getTitle(), "Official International Cricket Council Website");
	}
	@Test(priority = 11)
	public void MatchFixtureButtonFunctionality() throws InterruptedException {
		Thread.sleep(3000);
		icc_Homepage_Items.MatchFixtureButton().click();
		Assert.assertEquals(driver.getTitle(), "Men's Cricket Fixtures | ICC");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
	}
	
	
	
	
	

}
