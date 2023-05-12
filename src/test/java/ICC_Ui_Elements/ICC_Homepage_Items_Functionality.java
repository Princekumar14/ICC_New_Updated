package ICC_Ui_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ICC_Base.ICC_Base;

public class ICC_Homepage_Items_Functionality extends ICC_Base {
	public ICC_Homepage_Items_Functionality()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[1]/a")
	WebElement home_option;
	public WebElement HomeOption()  {
		return home_option;
		 	
	}
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[2]/button")
	WebElement scores_option;
	public WebElement ScoresOption() {
		return scores_option;
		 	
	}
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[3]/button")
	WebElement rankings_option;
	public WebElement RankingsOption() {
		return rankings_option;
		 	
	}
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[4]/button")
	WebElement events_option;
	public WebElement EventsOption()  {
		return events_option;
		 	
	}
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[5]/a")
	WebElement news_option;
	public WebElement NewsOption() {
		return news_option;
		 	
	}
	
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[6]/a")
	WebElement awards_option;
	public WebElement AwardsOption() {
		return awards_option;
		 	
	}
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[7]/a")
	WebElement videos_option;
	public WebElement VideosOption() {
		return videos_option;
		 	
	}
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[8]/a")
	WebElement icc_tv_Option;
	public WebElement IccTvOption() {
		return icc_tv_Option;
		 	
	}
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[9]/a")
	WebElement shop_option;
	public WebElement ShopOption() {
		return shop_option;
		 	
	}
	
	@FindBy(xpath="//nav[@class='main-navigation__desktop-list js-desktop-nav']/ul/li[10]/a")
	WebElement travel_option;
	public WebElement TravelOption() {
		return travel_option;
		 	
	}
	@FindBy(xpath="//a[@class='logo']/img")
	WebElement travelpagelogo;
	public WebElement TravelPageLogo() {
		return travelpagelogo;
		 	
	}
	
	@FindBy(xpath="//div[@class='match-card-list-mobile__tabs']/button[text()='Results']")
	WebElement resultsbutton;
	public WebElement ResultsButton() {
		return resultsbutton;
		 	
	}
	
	@FindBy(xpath="//a[text()='View All Fixtures']")
	WebElement matchfixturebutton;
	public WebElement MatchFixtureButton() {
		return matchfixturebutton;
		 	
	}

}
