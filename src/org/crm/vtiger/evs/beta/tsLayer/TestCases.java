package org.crm.vtiger.evs.beta.tsLayer;

import org.crm.vtiger.evs.beta.Analytics.dashBoard.DashBoardLandingPage;
import org.crm.vtiger.evs.beta.Analytics.subModule.AnalyticsSubModule;
import org.crm.vtiger.evs.beta.Util.WebDriverUtil;
import org.crm.vtiger.evs.beta.common.LoginPage;
import org.crm.vtiger.evs.beta.homePage.AboutUs;
import org.crm.vtiger.evs.beta.homePage.HomePageLanding;
import org.crm.vtiger.evs.beta.homePage.SignOutPage;
import org.crm.vtiger.evs.beta.marketing.campagn.CampaignCreationPage;
import org.crm.vtiger.evs.beta.marketing.campagn.CampaignLandingPage;
import org.crm.vtiger.evs.beta.marketing.submodules.MarketingSubModules;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestCases {

	private static WebDriverUtil utl=WebDriverUtil.getUtilObj();

	public static void main(String[] args) {

		TestCases c=new TestCases();
		//		c.tsloginPage();
		//c.tsMarketingCampaignCreation();
		//c.tsHomePageAboutUs();
		c.tsAnalyticDashBoard();

		//		SignOutPage sign= PageFactory.initElements(WebDriverUtil.Driver, SignOutPage.class);
		//		sign.signOut();
	}
	public HomePageLanding tsloginPage() {
		utl.launchBroWser("chrome");
		LoginPage lopg=  utl.login("http://localhost:8888");
		lopg.invalidLogin();
		HomePageLanding homepg=lopg.validLogin();
		return homepg;
	}
	public void tsMarketingCampaignCreation() {
		/*	utl.launchBroWser("chrome");

		LoginPage lopg=  utl.login("http://localhost:8888");
		lopg.invalidLogin();
		HomePageLanding homepg=lopg.validLogin();
		 */
		HomePageLanding homepg=tsloginPage();
		MarketingSubModules submarketing=	homepg.marketing();
		CampaignLandingPage camplandpg=submarketing.campaign();

		CampaignCreationPage	campcreationpg=	camplandpg.createCampaign();

		campcreationpg.basicInformationCreation();

	}
	public void tsHomePageAboutUs() {
		HomePageLanding homepg=tsloginPage();
		AboutUs aboutus=homepg.openAboutUs();
		aboutus.windowHandle();
		aboutus.closeAboutus();
	}
	public void tsAnalyticDashBoard() {
		HomePageLanding hpl=tsloginPage();
		AnalyticsSubModule asm=hpl.analytics();
		DashBoardLandingPage dblp=asm.clickOndashboard();
		
	}

}
