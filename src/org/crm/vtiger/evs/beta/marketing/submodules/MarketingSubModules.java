package org.crm.vtiger.evs.beta.marketing.submodules;

import org.crm.vtiger.evs.beta.Util.WebDriverUtil;
import org.crm.vtiger.evs.beta.marketing.campagn.CampaignLandingPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketingSubModules {

	@FindBy(linkText="Campaigns")
	private WebElement camp;
  private WebDriverUtil utl=WebDriverUtil.getUtilObj();
	public CampaignLandingPage campaign() {
		
		utl.moveToElement(camp);
		utl.click(camp);
		
		CampaignLandingPage camplandpg=PageFactory.initElements(utl.getdriver(), CampaignLandingPage.class);
	return camplandpg;
	}
	public void account() {

	}
	public void contact() {

	}
	public void webmail() {

	}
	public void lead() {

	}
	public void calender() {

	}
	public void document() {

	}
}
