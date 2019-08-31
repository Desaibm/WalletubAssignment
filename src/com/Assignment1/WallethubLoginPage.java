package com.Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestPages.TestInsuranceCompany;
import com.Utilities.ReadProperties;

public class WallethubLoginPage {

	WebDriver driver;

	@Test

	public void Loginwallethub() throws Exception {

		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(ReadProperties.readproperty1(
				"E:\\Selenium\\Selenium\\Workspace\\Interviewpurpose\\WallethubAssignment\\Resources\\Wallethublogin.properties",
				"url"));
		TestInsuranceCompany tic = PageFactory.initElements(driver, TestInsuranceCompany.class);
		Thread.sleep(3000);
		scroldown1();
		Thread.sleep(3000);
		mousehovr();
		Thread.sleep(3000);
		tic.starclick();
		tic.selectinsurancedetails();
		Thread.sleep(3000);
		String st1 = ReadProperties.readproperty1(
				"E:\\Selenium\\Selenium\\Workspace\\Interviewpurpose\\WallethubAssignment\\Resources\\Wallethublogin.properties",
				"text");
		System.out.println(st1);
		tic.reviewtext(st1);
		Thread.sleep(3000);
		tic.clicksubmit();
		Thread.sleep(3000);
		loginselect();
		String st2 = ReadProperties.readproperty1(
				"E:\\Selenium\\Selenium\\Workspace\\Interviewpurpose\\WallethubAssignment\\Resources\\Wallethublogin.properties",
				"username");
		String st3 = ReadProperties.readproperty1(
				"E:\\Selenium\\Selenium\\Workspace\\Interviewpurpose\\WallethubAssignment\\Resources\\Wallethublogin.properties",
				"password");
		Thread.sleep(3000);
		tic.loginentry(st2, st3);
		Thread.sleep(3000);
		userselect();
		Thread.sleep(3000);
		tic.profileclick();

		WebElement review = driver.findElement(By.xpath("//p[@class='feeddesc']"));

		Assert.assertTrue(review.getText().contains(st1));

		driver.close();
	}
	//Scroll Down page
	public void scroldown1() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,600)");

	}
//Selected user Scrolldown
	public void userselect() {
		WebElement user2 = driver.findElement(By.xpath("//a[@class='user']"));
		Actions ac4 = new Actions(driver);
		ac4.moveToElement(user2).build().perform();
	}
	//Mouse hover for selecting the stars
	public void mousehovr() {
		WebElement we = driver.findElement(By.xpath("//div[@class='review-action ng-enter-element']//*[4]"));
		Actions ac1 = new Actions(driver);
		ac1.moveToElement(we).build().perform();
	}
	//Selecting the Login Tab after submitting the Review
	public void loginselect() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement we3 = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//nav[@class='ng-animate-enabled basic-trans enter join']//a[contains(text(),'Login')]")));
		Actions ac2 = new Actions(driver);
		ac2.click(we3).build().perform();
	}

}
