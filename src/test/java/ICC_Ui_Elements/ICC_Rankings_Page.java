package ICC_Ui_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ICC_Base.ICC_Base;

public class ICC_Rankings_Page extends ICC_Base {
	public ICC_Rankings_Page() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[3]/button")
	WebElement rankings_button;
	public WebElement RankingsButton() {
		return rankings_button;
		 	
	}
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[3]/ul/li[1]/button")
	WebElement rankings_mens_section;
	public WebElement RankingsMensSectionVisibility() {
		return rankings_mens_section;
		 	
	}
	
	@FindBy(xpath="(//a[@href='/rankings/mens/overview'])[1]")
	WebElement mens_section_overview;
	public WebElement MensSectionOverview() {
		return mens_section_overview;
					 	
	}
	
	@FindBy(xpath="(//a[@href='/rankings/mens/team-rankings'])[1]")
	WebElement mens_team_rankings;
	public WebElement MensSectionTeamRankings() {
		return mens_team_rankings;
		 	
	}
	
	@FindBy(xpath="(//a[@href='/rankings/mens/player-rankings'])[1]")
	WebElement mens_player_rankings;
	public WebElement MensSectionPlayerRankings() {
		return mens_player_rankings;
		 	
	}
	
	@FindBy(xpath="(//a[@href='/rankings/mens/rankings-predictor/test'])[1]")
	WebElement mens_team_rankings_predictor;
	public WebElement MensSectionTeamRankingsPredictor() {
		return mens_team_rankings_predictor;
		 	
	}
		
	@FindBy(xpath="(//a[@href='/rankings/womens/overview'])[1]")
	WebElement womens_section_overview;
	public WebElement WomensSectionOverview() {
		return womens_section_overview;
					 	
	}
	
	@FindBy(xpath="(//a[@href='/rankings/womens/team-rankings'])[1]")
	WebElement womens_team_rankings;
	public WebElement WomensSectionTeamRankings() {
		return womens_team_rankings;
		 	
	}
	
	@FindBy(xpath="(//a[@href='/rankings/womens/player-rankings'])[1]")
	WebElement womens_player_rankings;
	public WebElement WomensSectionPlayerRankings() {
		return womens_player_rankings;
		 	
	}
	
	
	@FindBy(xpath="(//a[@href='/rankings/mens/player-rankings/comparison'])[1]")
	WebElement player_rankings_comparison;
	public WebElement PlayerRankingsComparison() {
		return player_rankings_comparison;
		 	
	}
	
	@FindBy(xpath="(//a[@href='/rankings/about'])[1]")
	WebElement about_rankings;
	public WebElement AboutRankings() {
		return about_rankings;
		 	
	}
	
	@FindBy(xpath="(//a[@href='/rankings/faqs'])[1]")
	WebElement rankings_faqs;
	public WebElement RankingsFAQS() {
		return rankings_faqs;
		 	
	}
	
	
	
	
	
	
	
}
