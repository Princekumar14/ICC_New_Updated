package ICC_Test;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ICC_Base.ICC_Base;
import ICC_Ui_Elements.ICC_Scores_Page;

public class ICC_Scores_Page_Test extends ICC_Base {
	ICC_Scores_Page ICCScoresPage;

	@BeforeSuite
	public void launch() throws IOException {
		initialization();
		ICCScoresPage = new ICC_Scores_Page();
	}

	@AfterSuite
	public void close() {
		driver.quit();
	}

	@Test(priority = 1)
	public void ScoresButtonFunctionality() throws InterruptedException {
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(ICCScoresPage.ScoresButton()).perform();
		Assert.assertEquals(ICCScoresPage.MensSectionVisibility().isDisplayed(), true);

	}

	@Test(priority = 2)
	public void MensSectionFixturesFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCScoresPage.ScoresButton()).perform();
		action.moveToElement(ICCScoresPage.MensSectionFixtures()).click().perform();
		Assert.assertEquals(driver.getTitle(), "Men's Cricket Fixtures | ICC");

	}

	@Test(priority = 3)
	public void MensSectionResultsFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCScoresPage.ScoresButton()).perform();
		action.moveToElement(ICCScoresPage.MensSectionResults()).click().perform();
		Assert.assertEquals(driver.getTitle(), "Men's Cricket Results | ICC");

	}

	@Test(priority = 4)
	public void WomensSectionFixturesFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCScoresPage.ScoresButton()).perform();
		action.moveToElement(ICCScoresPage.WomensSectionFixtures()).click().perform();
		Assert.assertEquals(driver.getTitle(), "Women's Cricket Fixtures | ICC");

	}

	@Test(priority = 5)
	public void WomensSectionResultsFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCScoresPage.ScoresButton()).perform();
		action.moveToElement(ICCScoresPage.WomensSectionResults()).click().perform();
		Assert.assertEquals(driver.getTitle(), "Women's Cricket Results | ICC");

	}

	@Test(priority = 6)
	public void LiveScoresFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCScoresPage.ScoresButton()).perform();
		action.moveToElement(ICCScoresPage.LiveScores()).click().perform();
		Assert.assertEquals(driver.getTitle(), "Live Cricket Scores | ICC");

	}
	
	@Test(priority = 7)
	public void MenFilterByTeamFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCScoresPage.ScoresButton()).perform();
		action.moveToElement(ICCScoresPage.MensSectionFixtures()).click().perform();
		Thread.sleep(2000);
		ICCScoresPage.FixturesTeamFilteration().click();
		Thread.sleep(2000);
		ICCScoresPage.SelectTeam().click();
		Assert.assertEquals(ICCScoresPage.SelectedTeam().getText() , "New Zealand");

	}

	@Test(priority = 8)
	public void MenFilterByFormatFunctionality() throws InterruptedException {
		Thread.sleep(2000);
		ICCScoresPage.FixturesFormatFilteration().click();
		Thread.sleep(2000);
		ICCScoresPage.SelectFormat().click();
		Assert.assertEquals(ICCScoresPage.SelectedFormat().getText() , "ODI");

	}
	
	@Test(priority = 9)
	public void WomenFilterByTeamFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCScoresPage.ScoresButton()).perform();
		action.moveToElement(ICCScoresPage.WomensSectionFixtures()).click().perform();
		Thread.sleep(2000);
		ICCScoresPage.FixturesTeamFilteration().click();
		Thread.sleep(2000);
		ICCScoresPage.SelectTeamWomen().click();
		Assert.assertEquals(ICCScoresPage.SelectedTeamWomen().getText() , "Bangladesh Women");

	}

	@Test(priority = 10)
	public void WomenFilterByFormatFunctionality() throws InterruptedException {
		Thread.sleep(2000);
		ICCScoresPage.FixturesFormatFilteration().click();
		Thread.sleep(2000);
		ICCScoresPage.SelectFormat().click();
		Assert.assertEquals(ICCScoresPage.SelectedFormat().getText() , "ODI");

	}
}
