package ICC_Ui_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ICC_Base.ICC_Base;

public class ICC_Rankings_Page_Mens_Overview_Section extends ICC_Base {
	public ICC_Rankings_Page_Mens_Overview_Section() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[3]/button")
	WebElement rankings_button;
	public WebElement RankingsButton() {
		return rankings_button;
		 	
	}
	@FindBy(xpath="(//a[@href='/rankings/mens/overview'])[1]")
	WebElement mens_section_overview;
	public WebElement MensSectionOverview() {
		return mens_section_overview;
					 	
	}
	
	
	
	@FindBy(xpath="//a[@href='/rankings/mens/team-rankings/t20i']")
	WebElement t20i_team_rankings_ViewFullTable_button;
	public WebElement T20iTeamRankingsViewFullTableButton() {
		return t20i_team_rankings_ViewFullTable_button;
		 	
	}
	@FindBy(xpath="//h4[text()=\"Men's T20I Team Rankings\"]")
	WebElement FullList_mens_t20i_team_rankings;
	public WebElement FullList_MensT20iTeamRankings() {
		return FullList_mens_t20i_team_rankings;
		 	
	}
	
	
	@FindBy(xpath="//a[@href='/rankings/mens/team-rankings/odi']")
	WebElement odi_team_rankings_ViewFullTable_button;
	public WebElement OdiTeamRankingsViewFullTableButton() {
		return odi_team_rankings_ViewFullTable_button;
		 	
	}
	@FindBy(xpath="//h4[text()=\"Men's ODI Team Rankings\"]")
	WebElement FullList_mens_odi_team_rankings;
	public WebElement FullList_MensOdiTeamRankings() {
		return FullList_mens_odi_team_rankings;
		 	
	}
	
	
	@FindBy(xpath="//a[@href='/rankings/mens/team-rankings/test']")
	WebElement test_team_rankings_ViewFullTable_button;
	public WebElement TestTeamRankingsViewFullTableButton() {
		return test_team_rankings_ViewFullTable_button;
		 	
	}
	@FindBy(xpath="//h4[text()=\"Men's Test Team Rankings\"]")
	WebElement FullList_mens_test_team_rankings;
	public WebElement FullList_MensTestTeamRankings() {
		return FullList_mens_test_team_rankings;
		 	
	}
	
	
	
	
	@FindBy(xpath="//a[@href='/rankings/mens/player-rankings/t20i/batting']")
	WebElement t20i_batting_rankings_ViewFullTable_button;
	public WebElement T20iBattingRankingsViewFullTableButton() {
		return t20i_batting_rankings_ViewFullTable_button;
		 	
	}
	@FindBy(xpath="//h4[text()=\"Men's T20I Batting Rankings\"]")
	WebElement FullList_mens_t20i_batting_rankings;
	public WebElement FullList_MensT20iBattingRankings() {
		return FullList_mens_t20i_batting_rankings;
		 	
	}
	
	
	@FindBy(xpath="//a[@href='/rankings/mens/player-rankings/odi/batting']")
	WebElement odi_batting_rankings_ViewFullTable_button;
	public WebElement OdiBattingRankingsViewFullTableButton() {
		return odi_batting_rankings_ViewFullTable_button;
		 	
	}
	@FindBy(xpath="//h4[text()=\"Men's ODI Batting Rankings\"]")
	WebElement FullList_mens_odi_batting_rankings;
	public WebElement FullList_MensOdiBattingRankings() {
		return FullList_mens_odi_batting_rankings;
		 	
	}
	
	
	@FindBy(xpath="//a[@href='/rankings/mens/player-rankings/test/batting']")
	WebElement test_batting_rankings_ViewFullTable_button;
	public WebElement TestBattingRankingsViewFullTableButton() {
		return test_batting_rankings_ViewFullTable_button;
		 	
	}
	@FindBy(xpath="//h4[text()=\"Men's Test Batting Rankings\"]")
	WebElement FullList_mens_test_batting_rankings;
	public WebElement FullList_MensTestBattingRankings() {
		return FullList_mens_test_batting_rankings;
		 	
	}
	
	
	
	
	@FindBy(xpath="//a[@href='/rankings/mens/player-rankings/t20i/bowling']")
	WebElement t20i_bowling_rankings_ViewFullTable_button;
	public WebElement T20iBowlingRankingsViewFullTableButton() {
		return t20i_bowling_rankings_ViewFullTable_button;
		 	
	}
	@FindBy(xpath="//h4[text()=\"Men's T20I Bowling Rankings\"]")
	WebElement FullList_mens_t20i_bowling_rankings;
	public WebElement FullList_MensT20iBowlingRankings() {
		return FullList_mens_t20i_bowling_rankings;
		 	
	}
	
	
	@FindBy(xpath="//a[@href='/rankings/mens/player-rankings/odi/bowling']")
	WebElement odi_bowling_rankings_ViewFullTable_button;
	public WebElement OdiBowlingRankingsViewFullTableButton() {
		return odi_bowling_rankings_ViewFullTable_button;
		 	
	}
	@FindBy(xpath="//h4[text()=\"Men's ODI Bowling Rankings\"]")
	WebElement FullList_mens_odi_bowling_rankings;
	public WebElement FullList_MensOdiBowlingRankings() {
		return FullList_mens_odi_bowling_rankings;
		 	
	}
	
	
	@FindBy(xpath="//a[@href='/rankings/mens/player-rankings/test/bowling']")
	WebElement test_bowling_rankings_ViewFullTable_button;
	public WebElement TestBowlingRankingsViewFullTableButton() {
		return test_bowling_rankings_ViewFullTable_button;
		 	
	}
	@FindBy(xpath="//h4[text()=\"Men's Test Bowling Rankings\"]")
	WebElement FullList_mens_test_bowling_rankings;
	public WebElement FullList_MensTestBowlingRankings() {
		return FullList_mens_test_bowling_rankings;
		 	
	}
	
	
	
	
	@FindBy(xpath="//a[@href='/rankings/mens/player-rankings/t20i/all-rounder']")
	WebElement t20i_all_rounder_rankings_ViewFullTable_button;
	public WebElement T20iAllRounderRankingsViewFullTableButton() {
		return t20i_all_rounder_rankings_ViewFullTable_button;
		 	
	}
	@FindBy(xpath="//h4[text()=\"Men's T20I All-Rounder Rankings\"]")
	WebElement FullList_mens_t20i_all_rounder_rankings;
	public WebElement FullList_MensT20iAllRounderRankings() {
		return FullList_mens_t20i_all_rounder_rankings;
		 	
	}
	
	
	@FindBy(xpath="//a[@href='/rankings/mens/player-rankings/odi/all-rounder']")
	WebElement odi_all_rounder_rankings_ViewFullTable_button;
	public WebElement OdiAllRounderRankingsViewFullTableButton() {
		return odi_all_rounder_rankings_ViewFullTable_button;
		 	
	}
	@FindBy(xpath="//h4[text()=\"Men's ODI All-Rounder Rankings\"]")
	WebElement FullList_mens_odi_all_rounder_rankings;
	public WebElement FullList_MensOdiAllRounderRankings() {
		return FullList_mens_odi_all_rounder_rankings;
		 	
	}
	
	
	@FindBy(xpath="//a[@href='/rankings/mens/player-rankings/test/all-rounder']")
	WebElement test_all_rounder_rankings_ViewFullTable_button;
	public WebElement TestAllRounderRankingsViewFullTableButton() {
		return test_all_rounder_rankings_ViewFullTable_button;
		 	
	}
	@FindBy(xpath="//h4[text()=\"Men's Test All-Rounder Rankings\"]")
	WebElement FullList_mens_test_all_rounder_rankings;
	public WebElement FullList_MensTestAllRounderRankings() {
		return FullList_mens_test_all_rounder_rankings;
		 	
	}
	
	
	
}
