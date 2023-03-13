package org.crm.vtiger.evs.beta.marketing.campagn;

import org.crm.vtiger.evs.beta.Util.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignLandingPage {

	@FindBy(xpath="//img[@alt='Create Campaign...']")
	private WebElement create_camp;
	
	public WebElement createCamp() {
		return create_camp;
	}
	
	public CampaignCreationPage createCampaign() {
		WebDriverUtil utl=WebDriverUtil.getUtilObj();
		utl.click(createCamp());
		CampaignCreationPage campcreatpg=	PageFactory.initElements(utl.getdriver(), CampaignCreationPage.class);
		return campcreatpg;
	}
}
