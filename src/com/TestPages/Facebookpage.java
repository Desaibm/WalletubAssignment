package com.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Facebookpage {
	
	@FindBy(id="email")
	WebElement fblogin;
	
	@FindBy(id="pass")
	WebElement fbpwd;
	
	@FindBy(id="u_0_2")
	WebElement loginfb;
	
	
	//Facebook Login
	public void fblogin(String s, String pw) {
		fblogin.sendKeys(s);
		fbpwd.sendKeys(pw);
		loginfb.click();
	}
	
	
	

}
