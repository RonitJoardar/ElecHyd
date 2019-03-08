package com.eaton.electricalhydraulic.ScreenLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eaton.electricalhydraulic.TestBase.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Login extends TestBase {
	
	public Login(AppiumDriver driver) throws Exception
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 2, TimeUnit.SECONDS), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Cancel']")
	public MobileElement popUpCancel;
	
	@iOSFindBy(id="Fingerprint-100.png")
	public MobileElement figerprintIcon;
	
	@iOSFindBy(id="userName")
	public MobileElement userNameTb;
	
	@iOSFindBy(id="Return")
	public MobileElement keyBoardReturn;
	
	@iOSFindBy(id="txtPassword")
	public MobileElement passwordTb;
	
	@iOSFindBy(id="EatonLogo")
	public MobileElement done;
	
	@iOSFindBy(id="LOGIN")
	public MobileElement loginBtn;
	
	@iOSFindBy(id="Accounts loaded")
	public MobileElement accountsLoaded;
	
	@iOSFindBy(id="LOVs loaded")
	public MobileElement lovLoaded;
	
	@iOSFindBy(id="//XCUIElementTypeImage[@name='checkbox-marked-circle-white.png'][1]")
	public MobileElement whiteCheckBox;
	
	@iOSFindBy(id="Next")
	public MobileElement nextBtn;
	
	@iOSFindBy(id="Allow")
	public MobileElement allowBtn;
	
	public void popUpCancel()
	{
		popUpCancel.click();
	}
	public void keyBoardReturn()
	{
		keyBoardReturn.click();
	}
	public void userNameTb(String userName)
	{
		userNameTb.sendKeys(userName);
	}
	public void passwordTb(String password)
	{
		passwordTb.sendKeys(password);
	}
	public void figerprintIcon()
	{
		figerprintIcon.click();
	}
	public void loginBtn()
	{
		loginBtn.click();
	}
}
