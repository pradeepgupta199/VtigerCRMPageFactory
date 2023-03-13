package org.crm.vtiger.evs.beta.homePage;

import org.crm.vtiger.evs.beta.Util.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedBack {
	
	@FindBy(linkText="Feedback")
   private WebElement open_feedback;
	
	private WebDriverUtil utl=WebDriverUtil.getUtilObj();
//	public void openFeedback() {
//		
//		utl.click(open_feedback);
//	}
	
}
