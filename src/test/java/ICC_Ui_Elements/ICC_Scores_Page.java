package ICC_Ui_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ICC_Base.ICC_Base;

public class ICC_Scores_Page extends ICC_Base {
	public ICC_Scores_Page() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[2]/button")
	WebElement scores_button;
	public WebElement ScoresButton() {
		return scores_button;
		 	
	}
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[2]/ul/li[1]/button")
	WebElement mens_section;
	public WebElement MensSectionVisibility() {
		return mens_section;
		 	
	}
	
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[2]/ul/li[1]/ul/li[1]/a")
	WebElement mens_section_fixtures;
	public WebElement MensSectionFixtures() {
		return mens_section_fixtures;
		 	
	}
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[2]/ul/li[1]/ul/li[2]/a")
	WebElement mens_results_fixtures;
	public WebElement MensSectionResults() {
		return mens_results_fixtures;
		 	
	}
	
	
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[2]/ul/li[2]/ul/li[1]/a")
	WebElement womens_section_fixtures;
	public WebElement WomensSectionFixtures() {
		return womens_section_fixtures;
		 	
	}
	
	//	(//a[@href='/live-cricket/womens-results'])[2]
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[2]/ul/li[2]/ul/li[2]/a")
	WebElement womens_results_fixtures;
	public WebElement WomensSectionResults() {
		return womens_results_fixtures;
		 	
	}
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[2]/ul/li[3]/a")
	WebElement livescores;
	public WebElement LiveScores() {
		return livescores;
		 	
	}
	//div[text()='Filter by Team']
	@FindBy(xpath="(//div[@class='drop-down__clickzone js-dropdown-trigger' and @role='button' ])[1]")
	WebElement fixtures_team_filteration;
	public WebElement FixturesTeamFilteration() {
		return fixtures_team_filteration;
		 	
	}
	
	//div[text()='Filter by Format']
	@FindBy(xpath="(//div[@class='drop-down__clickzone js-dropdown-trigger' and @role='button' ])[2]")
	WebElement fixtures_format_filteration;
	public WebElement FixturesFormatFilteration() {
		return fixtures_format_filteration;
		 	
	}
	
	
	
	@FindBy(xpath="//li[text()='  New Zealand ']")
	WebElement select_team;
	public WebElement SelectTeam() {
		return select_team;
		 	
	}
	//div[text()='  New Zealand ']
	@FindBy(xpath="//div[text()='  New Zealand ']")
	WebElement selected_team;
	public WebElement SelectedTeam() {
		return selected_team;
		 	
	}
	
	@FindBy(xpath="//li[text()='  ODI ']")
	WebElement select_format;
	public WebElement SelectFormat() {
		return select_format;
		 	
	}
	@FindBy(xpath="//div[text()='  ODI ']")
	WebElement selected_format;
	public WebElement SelectedFormat() {
		return selected_format;
		 	
	}
	
	
	@FindBy(xpath="//div[@class='js-matchlist']")
	WebElement filteration_working;
	public WebElement FilterationWorking() {
		return filteration_working;
		 	
	}
	
	
	
	@FindBy(xpath="//li[text()='  Bangladesh Women ']")
	WebElement select_team_women;
	public WebElement SelectTeamWomen() {
		return select_team_women;
		 	
	}
	//div[text()='  New Zealand ']
	@FindBy(xpath="//div[text()='  Bangladesh Women ']")
	WebElement selected_team_women;
	public WebElement SelectedTeamWomen() {
		return selected_team_women;
		 	
	}
	
	
	
	
}
