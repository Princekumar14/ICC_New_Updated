package ICC_Test;

import java.io.IOException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ICC_Base.ICC_Base;
import ICC_Ui_Elements.ICC_Rankings_Page;
public class ICC_Rankings_Page_Test extends ICC_Base {
	ICC_Rankings_Page ICCRankingsPage;

	@BeforeSuite
	public void launch() throws IOException {
		initialization();
		ICCRankingsPage = new ICC_Rankings_Page();
	}

	@AfterSuite
	public void close() {
		driver.quit();
	}

	@Test(priority = 1)
	public void ScoresButtonFunctionality() throws InterruptedException {
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPage.RankingsButton()).perform();
		Assert.assertEquals(ICCRankingsPage.RankingsMensSectionVisibility().isDisplayed(), true);

	}
	
	@Test(priority = 2)
	public void MensSectionOverviewFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPage.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPage.MensSectionOverview()).click().perform();
		Assert.assertEquals(driver.getTitle(), "ICC Men's Cricket Rankings Overview | ICC");

	}
	
	@Test(priority = 3)
	public void MensSectionTeamRankingFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPage.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPage.MensSectionTeamRankings()).click().perform();
		Assert.assertEquals(driver.getTitle(), "ICC Men's T20I Team Rankings | ICC");

	}
	
	@Test(priority = 4)
	public void MensSectionPlayerRankingFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPage.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPage.MensSectionPlayerRankings()).click().perform();
		Assert.assertEquals(driver.getTitle(), "ICC Men's T20I Player Rankings | ICC");

	}
	
	@Test(priority = 5)
	public void MensSectionTeamRankingsPredictorFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPage.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPage.MensSectionTeamRankingsPredictor()).click().perform();
		Assert.assertEquals(driver.getTitle(), "ICC Men's Test | Rankings Predictor | ICC");

	}
	
	@Test(priority = 6)
	public void WomensSectionOverviewFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPage.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPage.WomensSectionOverview()).click().perform();
		Assert.assertEquals(driver.getTitle(), "ICC Women's Cricket Rankings Overview | ICC");

	}
	
	@Test(priority = 7)
	public void WomensSectionTeamRankingFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPage.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPage.WomensSectionTeamRankings()).click().perform();
		Assert.assertEquals(driver.getTitle(), "ICC Women's ODI Team Rankings | ICC");

	}
	
	@Test(priority = 8)
	public void WomensSectionPlayerRankingFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPage.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPage.WomensSectionPlayerRankings()).click().perform();
		Assert.assertEquals(driver.getTitle(), "ICC Women's ODI Player Rankings | ICC");

	}
	
	@Test(priority = 9)
	public void PlayerHeadToHeadFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPage.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPage.PlayerRankingsComparison()).click().perform();
		Assert.assertEquals(driver.getTitle(), "ICC Men's | Rankings Comparison | ICC");

	}
	
	@Test(priority = 10)
	public void AboutRankingsFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPage.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPage.AboutRankings()).click().perform();
		Assert.assertEquals(driver.getTitle(), "ICC About Section of Rankings International Cricket Council");

	}
	
	@Test(priority = 11)
	public void RankingsFAQS_Functionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCRankingsPage.RankingsButton()).perform();
		action.moveToElement(ICCRankingsPage.RankingsFAQS()).click().perform();
		Assert.assertEquals(driver.getTitle(), "ICC FAQs Section of Rankings International Cricket Council");

	}

	
}
