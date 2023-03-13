package org.crm.vtiger.evs.beta.marketing.campagn;

import org.crm.vtiger.evs.beta.Util.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignCreationPage {

	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement camp_name;
	@FindBy(xpath="//input[@value='T']")
	private WebElement asign_to;
	@FindBy(xpath="//select[@name='campaigntype']")
	private WebElement camp_type;
	@FindBy(xpath="//input[@name='targetaudience']")
	private WebElement target_audeance;
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement save;
	@FindBy(xpath="(//input[@title='Cancel [Alt+X]'])[1]")
	private WebElement cancel;

	private WebDriverUtil utl=WebDriverUtil.getUtilObj();
	
	
	public WebElement campName() {
		return camp_name;
	}

	public WebElement assignTo() {
		return asign_to;
	}
	public WebElement campType() {
		return camp_type;
	}
	public WebElement targetAudience() {
		return target_audeance;
	}
	public WebElement save() {
		return save;
	}
	public WebElement cancel() {
		return cancel;
	}

	
	public void basicInformationCreation() {

		utl.sendKey(campName(), "Covid Vaxin");
		utl.click(assignTo());
		utl.selectByVisibleTextOrValue(campType(),"Webinar");
		utl.sendKey(targetAudience(), "younger");
	}
	public CampaignDetailsPage saveCamp() {
		utl.click(save());
		CampaignDetailsPage campdetailpg=PageFactory.initElements(utl.getdriver(), CampaignDetailsPage.class);
		return campdetailpg;
	}
	public CampaignCreationPage cancelCamp() {
		utl.click(cancel());
		return this;
	}
}
