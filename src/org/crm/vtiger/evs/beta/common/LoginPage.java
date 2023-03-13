package org.crm.vtiger.evs.beta.common;

import org.crm.vtiger.evs.beta.Util.WebDriverUtil;
import org.crm.vtiger.evs.beta.homePage.HomePageLanding;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement user_name;
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;
    @FindBy(xpath="//input[@name='Login']")
	private WebElement login;
	
    private WebDriverUtil utl=WebDriverUtil.getUtilObj();
    
    public WebElement userName() {
		return user_name;
	}
    public WebElement password() {
		return password;
	}
    public WebElement login() {
		return login;
	}
    
	public HomePageLanding validLogin() {
		
		utl.sendKey(userName(), "admin");
		utl.sendKey(password(), "admin");
        utl.click(login());		
        
        utl.titleMatch("admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM","HomePage");
        HomePageLanding homepg=PageFactory.initElements(utl.getdriver(), HomePageLanding.class);
	return homepg;
	}
	public LoginPage invalidLogin() {
		
		utl.sendKey(userName(), "min");
		utl.sendKey(password(), "1545");
        utl.click(login());
        utl.titleMatch("admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM","HomePage");
        
        return this;
	}

}
