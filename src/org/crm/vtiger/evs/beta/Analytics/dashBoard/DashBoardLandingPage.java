package org.crm.vtiger.evs.beta.Analytics.dashBoard;

import org.crm.vtiger.evs.beta.Util.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardLandingPage {
	
	private WebElement ticket_by_contact;
	
	WebDriverUtil utl=WebDriverUtil.getUtilObj();
	
	public void scrollDashboard() {
		
		utl.jsScroll(0, 500);
		
	}
	public void matchDropdown() {
		
		
	}

}
