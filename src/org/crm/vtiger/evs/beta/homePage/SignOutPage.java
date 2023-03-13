package org.crm.vtiger.evs.beta.homePage;

import org.crm.vtiger.evs.beta.Util.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOutPage {
	
	@FindBy(linkText ="Sign Out")
	private WebElement sign_out;
	
	private WebDriverUtil utl=WebDriverUtil.getUtilObj();
	
	public void signOut() {
		
		utl.click(sign_out);
		
	}

}
