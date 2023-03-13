package org.crm.vtiger.evs.beta.homePage;

import org.crm.vtiger.evs.beta.Util.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUs {

//	@FindBy(linkText="About Us")
//	private WebElement open_about_us;
	@FindBy(xpath="//input[@name='close']")
	private WebElement aboutus_close;
	@FindBy(linkText="Read License")
	private WebElement read_licence;
	@FindBy(linkText="Privacy Policy")
	private WebElement privacy_policy;
	@FindBy(linkText="Contact Us")
	private WebElement contact_us;

	private WebDriverUtil utl=WebDriverUtil.getUtilObj();
//	public void openAboutus() {
//		utl.click(open_about_us);
//	}

	public void windowHandle() {
		utl.windowHandlesByTitle("vtiger CRM 5 - Free, Commercial grade Open Source CRM");
	}
	public void moveToMainPage() {
		utl.windowHandlesByTitle("admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM");
	}
	public void readLicence() {
		utl.click(read_licence);
		
	}
	public void privacyPolicy() {
		utl.click(privacy_policy);
		
	}
	public void contactUs() {
		utl.click(contact_us);
	}
	public void closeAboutus() {
		windowHandle();
		utl.click(aboutus_close);
		moveToMainPage();
	}


}
