package ICC_Test;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ICC_Base.ICC_Base;
import ICC_Ui_Elements.ICC_Rankings_Page_Mens_Overview_Section;
public class ICC_Rankings_Page_Mens_Overview_Section_Test extends ICC_Base {
	ICC_Rankings_Page_Mens_Overview_Section ICCRankingsPageMensOverviewSection;

	@BeforeSuite
	public void launch() throws IOException {
		initialization();
		ICCRankingsPageMensOverviewSection = new ICC_Rankings_Page_Mens_Overview_Section();
	}

	@AfterSuite
	public void close() {
		driver.quit();
	}

	@Test(priority = 1)
	public void T20iTeamRankings_ViewFullTableButton_Functionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPageMensOverviewSection.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPageMensOverviewSection.MensSectionOverview()).click().perform();
		ICCRankingsPageMensOverviewSection.T20iTeamRankingsViewFullTableButton().click();
		Assert.assertEquals(ICCRankingsPageMensOverviewSection.FullList_MensT20iTeamRankings().isDisplayed() , true);

	}
	
	@Test(priority = 2)
	public void OdiTeamRankings_ViewFullTableButton_Functionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPageMensOverviewSection.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPageMensOverviewSection.MensSectionOverview()).click().perform();
		ICCRankingsPageMensOverviewSection.OdiTeamRankingsViewFullTableButton().click();
		Assert.assertEquals(ICCRankingsPageMensOverviewSection.FullList_MensOdiTeamRankings().isDisplayed() , true);

	}
	
	@Test(priority = 3)
	public void TestTeamRankings_ViewFullTableButton_Functionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPageMensOverviewSection.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPageMensOverviewSection.MensSectionOverview()).click().perform();
		ICCRankingsPageMensOverviewSection.TestTeamRankingsViewFullTableButton().click();
		Assert.assertEquals(ICCRankingsPageMensOverviewSection.FullList_MensTestTeamRankings().isDisplayed() , true);

	}
	
	
	
	
	@Test(priority = 4)
	public void T20iBattingRankings_ViewFullTableButton_Functionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPageMensOverviewSection.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPageMensOverviewSection.MensSectionOverview()).click().perform();
		ICCRankingsPageMensOverviewSection.T20iBattingRankingsViewFullTableButton().click();
		Assert.assertEquals(ICCRankingsPageMensOverviewSection.FullList_MensT20iBattingRankings().isDisplayed() , true);

	}
	
	@Test(priority = 5)
	public void OdiBattingRankings_ViewFullTableButton_Functionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPageMensOverviewSection.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPageMensOverviewSection.MensSectionOverview()).click().perform();
		ICCRankingsPageMensOverviewSection.OdiBattingRankingsViewFullTableButton().click();
		Assert.assertEquals(ICCRankingsPageMensOverviewSection.FullList_MensOdiBattingRankings().isDisplayed() , true);

	}
	
	@Test(priority = 6)
	public void TestBattingRankings_ViewFullTableButton_Functionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPageMensOverviewSection.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPageMensOverviewSection.MensSectionOverview()).click().perform();
		ICCRankingsPageMensOverviewSection.TestBattingRankingsViewFullTableButton().click();
		Assert.assertEquals(ICCRankingsPageMensOverviewSection.FullList_MensTestBattingRankings().isDisplayed() , true);

	}
	
	
	
	
	@Test(priority = 7)
	public void T20iBowlingRankings_ViewFullTableButton_Functionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPageMensOverviewSection.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPageMensOverviewSection.MensSectionOverview()).click().perform();
		ICCRankingsPageMensOverviewSection.T20iBowlingRankingsViewFullTableButton().click();
		Assert.assertEquals(ICCRankingsPageMensOverviewSection.FullList_MensT20iBowlingRankings().isDisplayed() , true);

	}
	
	@Test(priority = 8)
	public void OdiBowlingRankings_ViewFullTableButton_Functionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPageMensOverviewSection.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPageMensOverviewSection.MensSectionOverview()).click().perform();
		ICCRankingsPageMensOverviewSection.OdiBowlingRankingsViewFullTableButton().click();
		Assert.assertEquals(ICCRankingsPageMensOverviewSection.FullList_MensOdiBowlingRankings().isDisplayed() , true);

	}
	
	@Test(priority = 9)
	public void TestBowlingRankings_ViewFullTableButton_Functionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPageMensOverviewSection.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPageMensOverviewSection.MensSectionOverview()).click().perform();
		ICCRankingsPageMensOverviewSection.TestBowlingRankingsViewFullTableButton().click();
		Assert.assertEquals(ICCRankingsPageMensOverviewSection.FullList_MensTestBowlingRankings().isDisplayed() , true);

	}
	
	
	
	
	@Test(priority = 10)
	public void T20iAllRounderRankings_ViewFullTableButton_Functionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPageMensOverviewSection.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPageMensOverviewSection.MensSectionOverview()).click().perform();
		ICCRankingsPageMensOverviewSection.T20iAllRounderRankingsViewFullTableButton().click();
		Assert.assertEquals(ICCRankingsPageMensOverviewSection.FullList_MensT20iAllRounderRankings().isDisplayed() , true);

	}
	
	@Test(priority = 11)
	public void OdiAllRounderRankings_ViewFullTableButton_Functionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPageMensOverviewSection.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPageMensOverviewSection.MensSectionOverview()).click().perform();
		ICCRankingsPageMensOverviewSection.OdiAllRounderRankingsViewFullTableButton().click();
		Assert.assertEquals(ICCRankingsPageMensOverviewSection.FullList_MensOdiAllRounderRankings().isDisplayed() , true);

	}
	
	@Test(priority = 12)
	public void TestAllRounderRankings_ViewFullTableButton_Functionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPageMensOverviewSection.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPageMensOverviewSection.MensSectionOverview()).click().perform();
		ICCRankingsPageMensOverviewSection.TestAllRounderRankingsViewFullTableButton().click();
		Assert.assertEquals(ICCRankingsPageMensOverviewSection.FullList_MensTestAllRounderRankings().isDisplayed() , true);

	}
	

	
}
