package com.Assignment1;

import com.TestPages.Facebookpage;
import com.Utilities.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	
		
		WebDriver driver;
		
		@Test
		
		public void facebooklogin() throws Exception{
		
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(ReadProperties.readproperty1("E:\\Selenium\\Selenium\\Workspace\\Interviewpurpose\\WallnuthubAssignment\\Resources\\Facebooklogin.properties", "url"));
		Facebookpage fbp = PageFactory.initElements(driver, Facebookpage.class);
		String usr1= ReadProperties.readproperty1("E:\\Selenium\\Selenium\\Workspace\\Interviewpurpose\\WallnuthubAssignment\\Resources\\Facebooklogin.properties", "usrname");
		String pwd= ReadProperties.readproperty1("E:\\Selenium\\Selenium\\Workspace\\Interviewpurpose\\WallnuthubAssignment\\Resources\\Facebooklogin.properties", "pwd");
		fbp.fblogin(usr1, pwd);
		Thread.sleep(3000);
		System.out.println("Hello World");
		driver.close();
		
	}

}
