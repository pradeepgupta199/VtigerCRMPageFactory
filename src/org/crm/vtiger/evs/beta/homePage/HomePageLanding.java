package org.crm.vtiger.evs.beta.homePage;

import org.crm.vtiger.evs.beta.Analytics.subModule.AnalyticsSubModule;
import org.crm.vtiger.evs.beta.Util.WebDriverUtil;
import org.crm.vtiger.evs.beta.marketing.submodules.MarketingSubModules;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLanding {
	@FindBy(linkText ="My Home Page")
	private WebElement my_home_page;
	@FindBy(linkText = "Marketing")
	private WebElement marketing;
	@FindBy(linkText = "Sales")
	private WebElement sales;
	@FindBy(linkText = "Support")
	private WebElement support;
	@FindBy(linkText = "Analytics")
	private WebElement anaylytic;
	@FindBy(linkText = "Inventory")
	private WebElement inventry;
	@FindBy(linkText = "Tools")
	private WebElement tools;
	@FindBy(linkText = "Settings")
	private WebElement setting;
	@FindBy(linkText="About Us")
	private WebElement open_about_us;
	@FindBy(linkText="Feedback")
	private WebElement open_feedback;
	@FindBy(linkText ="Sign Out")
	private WebElement sign_out;


	private WebDriverUtil utl=WebDriverUtil.getUtilObj();
	
	public WebElement myHomePageXpath() {
		return my_home_page;
	}
	public WebElement marketingXpath() {
		return marketing;
	}
	public WebElement salesXpath() {
		return sales;
	}
	public WebElement supportXpath() {
		return support;
	}
	public WebElement anaylyticXpath() {
		return anaylytic;
	}
	public WebElement inventryXpath() {
		return inventry;
	}
	public WebElement toolsXpath() {
		return tools;
	}
	public WebElement settingXpath() {
		return setting;
	}
	public WebElement aboutUsXpath() {
		return open_about_us;
	}
	public WebElement feedBackXpath() {
		return open_feedback;
	}
	public WebElement signOutXpath() {
		return sign_out;
	}
	public void myHomePage() {
		utl.moveToElement(my_home_page);

	}
	public MarketingSubModules marketing() {
		utl.moveToElement(marketing);
		MarketingSubModules marksubmodules=	PageFactory.initElements(utl.getdriver(), MarketingSubModules.class);
		return marksubmodules;	
	}
	public MarketingSubModules sales() {
		utl.moveToElement(sales);
		MarketingSubModules marksubmodules=	PageFactory.initElements(utl.getdriver(), MarketingSubModules.class);
		return marksubmodules;
	}
	public void support() {
		utl.moveToElement(support);
	}
	public AnalyticsSubModule analytics() {
		utl.moveToElement(anaylytic);
		AnalyticsSubModule asm=PageFactory.initElements(utl.getdriver(), AnalyticsSubModule.class);
		return asm;
	}
	public void inventry() {
		utl.moveToElement(inventry);
	}
	public void tools() {
		utl.moveToElement(tools);
	}
	public void settings() {
		utl.moveToElement(setting);
	}
	public AboutUs openAboutUs() {
		utl.click(open_about_us);
		AboutUs abus=	PageFactory.initElements(utl.getdriver(), AboutUs.class);
		return abus;
	}
	public void openFeedback() {

		utl.click(open_feedback);
	}
	public void signOut() {

		utl.click(sign_out);

	}

}
