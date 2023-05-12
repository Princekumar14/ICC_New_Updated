package ICC_Ui_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ICC_Base.ICC_Base;

public class ICC_Player_Comparison_Module extends ICC_Base {
	public ICC_Player_Comparison_Module() {
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
	
	@FindBy(xpath="//a[text()='Player Comparison']")
	WebElement player_comparison_mod;
	public WebElement PlayerComparisonSection() {
		return player_comparison_mod;
					 	
	}
	
	@FindBy(xpath="//h2[text()='Player Rankings Comparison']")
	WebElement player_comparison_mod_confirmation;
	public WebElement PlayerComparisonSectionConfirmation() {
		return player_comparison_mod_confirmation;
					 	
	}
	
	@FindBy(xpath="(//ul[@class='tabs__list']/li[1])[2]")
	WebElement top_batsmen;
	public WebElement TopBatsmenOption() {
		return top_batsmen;
					 	
	}
	@FindBy(xpath="//div[@class='player-comparison-search__tab-content active' and @data-ui-tab='TOP BATSMEN']")
	WebElement top_batting_list;
	public WebElement TopBattingList() {
		return top_batting_list;
					 	
	}
	
	
	@FindBy(xpath="(//ul[@class='tabs__list']/li[2])[2]")
	WebElement top_bowler;
	public WebElement TopBowlerOption() {
		return top_bowler;
					 	
	}
	@FindBy(xpath="//div[@class='player-comparison-search__tab-content active' and @data-ui-tab='TOP BOWLERS']")
	WebElement top_bowling_list;
	public WebElement TopBowlingList() {
		return top_bowling_list;
					 	
	}
	
	@FindBy(xpath="(//ul[@class='tabs__list']/li[3])[2]")
	WebElement top_all_rounder;
	public WebElement TopAllRounderOption() {
		return top_all_rounder;
					 	
	}
	@FindBy(xpath="//div[@class='player-comparison-search__tab-content active' and @data-ui-tab='TOP ALL-ROUNDERS']")
	WebElement top_all_rounder_list;
	public WebElement TopAllRounderList() {
		return top_all_rounder_list;
					 	
	}
	
	@FindBy(xpath="//div[@class='rankings-player-comparison__quick-pick js-rankings-comparison-quick-pick']/div/div/div[@class='tabs']/div[1]/div[1]/div[2]/div/div/button[2]")
	WebElement test_top_batting_frwd_btn;
	public WebElement TestTopBattingForwardButton() {
		return test_top_batting_frwd_btn;
					 	
	}
	@FindBy(xpath="//div[@class='rankings-player-comparison__quick-pick js-rankings-comparison-quick-pick']/div/div/div[@class='tabs']/div[1]/div[1]/div[2]/div/div/button[2]")
	WebElement test_top_batting_backward_btn;
	public WebElement TestTopBattingBackwardButton() {
		return test_top_batting_backward_btn;
					 	
	}
	
	
	@FindBy(xpath="//div[@class='player-comparison-quick-pick js-quick-pick']/div/div/div[1]/div[1]/div[2]/ul/li[2]/button")
	WebElement test_top_batting_backward_btn_1;
	public WebElement TestTopBattingSlider1() {
		return test_top_batting_backward_btn_1;
					 	
	}
	
	@FindBy(xpath="//div[@class='player-comparison-quick-pick js-quick-pick']/div/div/div[1]/div[1]/div[2]/ul/li[2]/button")
	WebElement test_top_batting_backward_btn_2;
	public WebElement TestTopBattingSlider2() {
		return test_top_batting_backward_btn_2;
					 	
	}
	
	
	
	
}
