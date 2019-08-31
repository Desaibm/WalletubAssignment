package com.TestPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestInsuranceCompany {

	@FindBy(xpath = "//span[@class='brgm-button brgm-signup']")
	WebElement loginclick;

	 @FindBy(xpath="//input[@placeholder='Email Address']")
		WebElement usrname;

	@FindBy(xpath = "//button[@class='btn blue touch-element-cl']")
	WebElement Enterlogin;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pwd;

	@FindBy(xpath = "//div[@class='review-action ng-enter-element']//*[5]")
	WebElement star;

	@FindBy(xpath = "//span[contains(text(),'Select...')]")
	WebElement select1;

	@FindBy(xpath = "//li[contains(text(),'Health Insurance')]")
	WebElement health;

	@FindBy(xpath = "//textarea[@placeholder='Write your review...']")
	WebElement reviewtext;
	
	@FindBy(xpath="//div[@class='sbn-action semi-bold-font btn fixed-w-c tall']")
	WebElement detailsubmit;
	
	@FindBy(css="body.join.no-nav:nth-child(2) main.ng-animate-enabled.no-nav:nth-child(4) form.light.ng-invalid.ng-invalid-required.ng-valid-pattern.ng-valid-minlength.ng-valid-maxlength.ng-pristine.ng-valid-match:nth-child(1) div.ng-animate-enabled.basic-trans.enter nav.ng-animate-enabled.basic-trans.enter.join:nth-child(1) ul:nth-child(1) li:nth-child(2) > a:nth-child(1)")
	WebElement loginlink;
	
	@FindBy(xpath="//a[@class='user']")
	WebElement user1;
	
	@FindBy(xpath="//a[contains(text(),'Profile')]")
	WebElement profile1;
	//Clicking the login
	public void openloginpage() {

		loginclick.click();

	}
	//selecting profile
	public void profileclick() {
		profile1.click();
	}
	
	public void checklinks(){
		
		loginlink.click();
		
	}
//Login details
	public void loginentry(String s, String p) {
		usrname.sendKeys(s);
		pwd.sendKeys(p);
		Enterlogin.submit();
	}
//Aewlecting teh Star
	public void starclick() {

		star.click();
	}
//Selecting the insurace details as Health
	public void selectinsurancedetails() throws Exception {

		select1.click();
		Thread.sleep(3000);
		health.click();
	}
	//Entering the Review Text
	public void reviewtext(String str1) {
		reviewtext.sendKeys(str1);
	}
	//Clicking the submit Button
	public void clicksubmit() {
		detailsubmit.click();
	}

}
