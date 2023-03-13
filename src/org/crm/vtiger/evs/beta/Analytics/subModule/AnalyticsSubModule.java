package org.crm.vtiger.evs.beta.Analytics.subModule;

import org.crm.vtiger.evs.beta.Analytics.dashBoard.DashBoardLandingPage;
import org.crm.vtiger.evs.beta.Analytics.reports.ReportsLandingPage;
import org.crm.vtiger.evs.beta.Util.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnalyticsSubModule {

	@FindBy(linkText="Reports")
	private WebElement reports;
	@FindBy(linkText="Dashboard")
	private WebElement dashboard;
	
	private WebDriverUtil utl=WebDriverUtil.getUtilObj();

	public WebElement reports() {
		return reports;
	}
	public WebElement dashboard() {
		return dashboard;
	}
	
	public ReportsLandingPage clickOnReports() {
		utl.click(reports);
		ReportsLandingPage rlp=PageFactory.initElements(utl.getdriver(), ReportsLandingPage.class);
		return rlp;
	}
	public DashBoardLandingPage clickOndashboard() {
		utl.click(dashboard);
		DashBoardLandingPage dblp=PageFactory.initElements(utl.getdriver(), DashBoardLandingPage.class);
		return dblp;
	}

}
