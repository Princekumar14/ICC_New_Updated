package ICC_Test;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ICC_Base.ICC_Base;
import ICC_Ui_Elements.ICC_Player_Comparison_Module;
import ICC_Ui_Elements.ICC_Scores_Page;

public class ICC_Player_Comparison_Module_Test extends ICC_Base {
	ICC_Player_Comparison_Module ICCPlayerComparison;

	@BeforeSuite
	public void launch() throws IOException {
		initialization();
		ICCPlayerComparison = new ICC_Player_Comparison_Module();
	}

	@AfterSuite
	public void close() {
		driver.quit();
	}

	@Test(priority = 1)
	public void VisibilityOfPlayerComparisonSection() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCPlayerComparison.RankingsButton()).perform();
		action.moveToElement(ICCPlayerComparison.MensSectionOverview()).click().perform();
		Assert.assertEquals(ICCPlayerComparison.PlayerComparisonSection().isDisplayed() , true);
		

	}
	
	@Test(priority = 2)
	public void PlayerComparisonFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCPlayerComparison.RankingsButton()).perform();
		action.moveToElement(ICCPlayerComparison.MensSectionOverview()).click().perform();
		ICCPlayerComparison.PlayerComparisonSection().click();
		Assert.assertEquals(ICCPlayerComparison.PlayerComparisonSectionConfirmation().isDisplayed() , true);

	}
	
	@Test(priority = 3)
	public void TopBowlerOptionFunctionality() throws InterruptedException {
//		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCPlayerComparison.RankingsButton()).perform();
		action.moveToElement(ICCPlayerComparison.MensSectionOverview()).click().perform();
		ICCPlayerComparison.PlayerComparisonSection().click();
		Thread.sleep(3000);
		action.moveToElement(ICCPlayerComparison.TopBowlerOption()).click().perform();
//		ICCPlayerComparison.TopBowlerOption().click();
		Assert.assertEquals(ICCPlayerComparison.TopBowlingList().isDisplayed() , true);

	}
	
	@Test(priority = 4)
	public void TopAllRounderOptionFunctionality() throws InterruptedException {
		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCPlayerComparison.RankingsButton()).perform();
		action.moveToElement(ICCPlayerComparison.MensSectionOverview()).click().perform();
		ICCPlayerComparison.PlayerComparisonSection().click();
		ICCPlayerComparison.TopAllRounderOption().click();
		Assert.assertEquals(ICCPlayerComparison.TopAllRounderList().isDisplayed() , true);

	}
	
	@Test(priority = 5)
	public void TopBatsmenOptionFunctionality() throws InterruptedException {
		driver.navigate().to("https://www.icc-cricket.com/homepage");
		Actions action = new Actions(driver);
		action.moveToElement(ICCPlayerComparison.RankingsButton()).perform();
		action.moveToElement(ICCPlayerComparison.MensSectionOverview()).click().perform();
		ICCPlayerComparison.PlayerComparisonSection().click();
		ICCPlayerComparison.TopBatsmenOption().click();
		Assert.assertEquals(ICCPlayerComparison.TopBattingList().isDisplayed() , true);

	}

	@Test(priority = 6)
	public void TestTopBattingForwardButtonFunctionality() throws InterruptedException {
		ICCPlayerComparison.TestTopBattingForwardButton().click();
		Assert.assertEquals(ICCPlayerComparison.TestTopBattingSlider2().isEnabled() , true);

	}
	
	@Test(priority = 7)
	public void TestTopBattingBackwardButtonFunctionality() throws InterruptedException {
		ICCPlayerComparison.TestTopBattingBackwardButton().click();
		Assert.assertEquals(ICCPlayerComparison.TestTopBattingSlider1().isEnabled() , true);

	}
}
