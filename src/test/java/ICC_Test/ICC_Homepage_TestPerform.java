package ICC_Test;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ICC_Base.ICC_Base;
import ICC_Ui_Elements.Icc_Homepage;

public class ICC_Homepage_TestPerform extends ICC_Base {
	Icc_Homepage IccHP;
	public ExtentTest test;
	public ExtentReports extent;
	@BeforeSuite
	public void launch() throws IOException {
		initialization();
		IccHP = new Icc_Homepage();	
	}
	@AfterSuite
	public void close() {
		driver.quit();
	}
	
	@BeforeTest
	public void startTest() {
//		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html",true);
		extent=new ExtentReports("C:\\Users\\prkumar\\.jenkins\\workspace\\Extent_Report.html",true);	
		
	
	}

	@AfterTest
	public void endTest() {
		extent.endTest(test);
		extent.flush();
	}
	

	@Test(priority = 1)
	public void LogoVisibility() throws InterruptedException {
		test=extent.startTest("Verify whether `ICC logo` section is visible");
		test.log(LogStatus.INFO, "`ICC logo` section visibility Test is intiated");
		test.log(LogStatus.INFO,"Verify `ICC logo` section is visible");
		
		if((IccHP.IccLogoVisibility().isDisplayed()) == true) 
		{
			test.log(LogStatus.PASS, "`ICC logo` is visible");
		}
		else
		{
		test.log(LogStatus.FAIL, "`ICC logo` is not visible");
		}
		
		Assert.assertEquals(IccHP.IccLogoVisibility().isDisplayed(), true);
	}
	
	@Test(priority = 2)
	public void HomeSectionVisibility() throws InterruptedException{
		test=extent.startTest("Verify whether `Home` section is visible");
		test.log(LogStatus.INFO, "`Home` section visibility Test is intiated");
		test.log(LogStatus.INFO,"Verify `Home` section is visible");
		
		if((IccHP.HomeOptionVisibility().isDisplayed()) == true) 
		{
			test.log(LogStatus.PASS, "`Home` section is visible");
		}
		else
		{
		test.log(LogStatus.FAIL, "`Home` section is not visible");
		}
		Assert.assertEquals(IccHP.HomeOptionVisibility().isDisplayed(), true);
	}
	@Test(priority = 3)
	public void ScoresSectionVisibility() throws InterruptedException{
		test=extent.startTest("Verify whether `Scores` section is visible");
		test.log(LogStatus.INFO, "`Scores` section visibility Test is intiated");
		test.log(LogStatus.INFO,"Verify `Scores` section is visible");
		
		if((IccHP.ScoresOptionVisibility().isDisplayed()) == true) 
		{
			test.log(LogStatus.PASS, "`Scores` section is visible");
		}
		else
		{
		test.log(LogStatus.FAIL, "`Scores` section is not visible");
		}
		Assert.assertEquals(IccHP.ScoresOptionVisibility().isDisplayed(), true);
	}
	@Test(priority = 4)
	public void RankingsSectionVisibility() throws InterruptedException{
		test=extent.startTest("Verify whether `Rankings` section is visible");
		test.log(LogStatus.INFO, "`Rankings` section visibility Test is intiated");
		test.log(LogStatus.INFO,"Verify `Rankings` section is visible");
		
		if((IccHP.RankingsOptionVisibility().isDisplayed()) == true) 
		{
			test.log(LogStatus.PASS, "`Rankings` section is visible");
		}
		else
		{
		test.log(LogStatus.FAIL, "`Rankings` section is not visible");
		}
		Assert.assertEquals(IccHP.RankingsOptionVisibility().isDisplayed(), true);
	}
	@Test(priority = 5)
	public void EventsSectionVisibility() throws InterruptedException{
		test=extent.startTest("Verify whether `Events` section is visible");
		test.log(LogStatus.INFO, "`Events` section visibility Test is intiated");
		test.log(LogStatus.INFO,"Verify `Events` section is visible");
		
		if((IccHP.EventsOptionVisibility().isDisplayed()) == true) 
		{
			test.log(LogStatus.PASS, "`Events` section is visible");
		}
		else
		{
		test.log(LogStatus.FAIL, "`Events` section is not visible");
		}
		Assert.assertEquals(IccHP.EventsOptionVisibility().isDisplayed(), true);
	}
	
	@Test(priority = 6)
	public void NewsSectionVisibility() throws InterruptedException{
		test=extent.startTest("Verify whether `News` section is visible");
		test.log(LogStatus.INFO, "`News` section visibility Test is intiated");
		test.log(LogStatus.INFO,"Verify `News` section is visible");
		
		if((IccHP.NewsOptionVisibility().isDisplayed()) == true) 
		{
			test.log(LogStatus.PASS, "`News` section is visible");
		}
		else
		{
		test.log(LogStatus.FAIL, "`News` section is not visible");
		}
		Assert.assertEquals(IccHP.NewsOptionVisibility().isDisplayed(), true);
	}
	
	@Test(priority = 7)
	public void AwardsSectionVisibility() throws InterruptedException{
		test=extent.startTest("Verify whether `Awards` section is visible");
		test.log(LogStatus.INFO, "`Awards` visibility Test is intiated");
		test.log(LogStatus.INFO,"Verify `Awards` section is visible");
		
		if((IccHP.AwardsOptionVisibility().isDisplayed()) == true) 
		{
			test.log(LogStatus.PASS, "`Awards` section is visible");
		}
		else
		{
		test.log(LogStatus.FAIL, "`Awards` section is not visible");
		}
		Assert.assertEquals(IccHP.AwardsOptionVisibility().isDisplayed(), true);
	}
	
	@Test(priority = 8)
	public void VideosSectionVisibility() throws InterruptedException{
		test=extent.startTest("Verify whether `Videos` section is visible");
		test.log(LogStatus.INFO, "`Videos` section visibility Test is intiated");
		test.log(LogStatus.INFO,"Verify `Videos` section is visible");
		
		if((IccHP.VideosOptionVisibility().isDisplayed()) == true) 
		{
			test.log(LogStatus.PASS, "`Videos` section is visible");
		}
		else
		{
		test.log(LogStatus.FAIL, "`Videos` section is not visible");
		}
		Assert.assertEquals(IccHP.VideosOptionVisibility().isDisplayed(), true);
	}
	
	@Test(priority = 9)
	public void IccTvSectionVisibility() throws InterruptedException{
		test=extent.startTest("Verify whether `Icc Tv` section is visible");
		test.log(LogStatus.INFO, "`Icc Tv` section visibility Test is intiated");
		test.log(LogStatus.INFO,"Verify `Icc Tv` section is visible");
		
		if((IccHP.IccTvOptionVisibility().isDisplayed()) == true) 
		{
			test.log(LogStatus.PASS, "`Icc Tv` section is visible");
		}
		else
		{
		test.log(LogStatus.FAIL, "`Icc Tv` section is not visible");
		}
		Assert.assertEquals(IccHP.IccTvOptionVisibility().isDisplayed(), true);
	}
	@Test(priority = 10)
	public void ShopSectionVisibility() throws InterruptedException{
		test=extent.startTest("Verify whether `Shop` section is visible");
		test.log(LogStatus.INFO, "`Shop` section visibility Test is intiated");
		test.log(LogStatus.INFO,"Verify `Shop` section is visible");
		
		if((IccHP.ShopOptionVisibility().isDisplayed()) == true) 
		{
			test.log(LogStatus.PASS, "`Shop` section is visible");
		}
		else
		{
		test.log(LogStatus.FAIL, "`Shop` section is not visible");
		}
		Assert.assertEquals(IccHP.ShopOptionVisibility().isDisplayed(), true);
	}
	
	@Test(priority = 11)
	public void TravelSectionVisibility() throws InterruptedException{
		test=extent.startTest("Verify whether `Travel` section is visible");
		test.log(LogStatus.INFO, "`Travel` section visibility Test is intiated");
		test.log(LogStatus.INFO,"Verify `Travel` section is visible");
		
		if((IccHP.TravelOptionVisibility().isDisplayed()) == true) 
		{
			test.log(LogStatus.PASS, "`Travel` section is visible");
		}
		else
		{
		test.log(LogStatus.FAIL, "`Travel` section is not visible");
		}
		Assert.assertEquals(IccHP.TravelOptionVisibility().isDisplayed(), true);
	}
	
	

	
}
