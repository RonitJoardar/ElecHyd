package com.eaton.electricalhydraulic.ScreenLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.eaton.electricalhydraulic.TestBase.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AccountDetailsLocators extends TestBase{
	
	public AccountDetailsLocators(AppiumDriver driver) throws Exception {
		this.driver =driver;
		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 2 ,TimeUnit.SECONDS), this);
	}

	@iOSFindBy(id="Edit")
	public MobileElement editAccount;
	
	@iOSFindBy(id="Back")
	public MobileElement accountBack;
	
	@iOSFindBy(id="RightMenu")
	public MobileElement RightMenu;
	
	@iOSFindBy(xpath="//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	public MobileElement accountName;
	
	@iOSFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	public MobileElement favIcon;
	
	@iOSFindBy(id="Edit Account")
	public MobileElement quickActionEdit;
	
	@iOSFindBy(id="Navigate to Account")
	public MobileElement quickActionMap;
	
	@iOSFindBy(id="Add Me")
	public MobileElement quickActionAddMe;
	
	@iOSFindBy(id="Add Opportunity")
	public MobileElement quickActionAddOppty;
	
	@iOSFindBy(id="Add Contact")
	public MobileElement quickActionAddContact;
	
	@iOSFindBy(id="Add Activity")
	public MobileElement quickActionAddActivity;
	
	@iOSFindBy(id="Return to C360")
	public MobileElement mapBackBtn;
	
	@iOSFindBy(xpath="//XCUIElementTypeTabBar/XCUIElementTypeButton[2]")
	public MobileElement opportunitiesBtnAccountDetail;
	
	@iOSFindBy(xpath="//XCUIElementTypeTabBar/XCUIElementTypeButton[3]")
	public MobileElement contactBtnAccountDetail;
	
	@iOSFindBy(xpath="//XCUIElementTypeTabBar/XCUIElementTypeButton[4]")
	public MobileElement activityBtnAccountDetail;
	
	@iOSFindBy(xpath="//XCUIElementTypeTabBar/XCUIElementTypeButton[5]")
	public MobileElement moreBtnAccountDetail;
	
	@iOSFindBy(id="//XCUIElementTypeStaticText[@name='Opportunities']")
	public MobileElement opportunitiesHeader;
	
	@iOSFindBy(id="//XCUIElementTypeStaticText[@name='Contacts']")
	public MobileElement contactsHeader;
	
	@iOSFindBy(id="//XCUIElementTypeStaticText[@name='Activities']")
	public MobileElement activitiesHeader;
	
	@iOSFindBy(id="//XCUIElementTypeStaticText[@name='Leads']")
	public MobileElement leadsHeader;
	
	@iOSFindBy(id="//XCUIElementTypeStaticText[@name='Service Requests']")
	public MobileElement serviceRequestsHeader;
	
	@iOSFindBy(id="//XCUIElementTypeStaticText[@name='Notes']")
	public MobileElement notesHeader;
	
	@iOSFindBy(id="Service Requests")
	public MobileElement serviceRequestBtnAccountDetail;
	
	@iOSFindBy(id="Leads")
	public MobileElement leadsBtnAccountDetail;
	
	@iOSFindBy(id="Notes")
	public MobileElement notesBtnAccountDetail;
	
	@iOSFindBy(id="More")
	public MobileElement moreBtn;
	
	public void editAccount()
	{
		editAccount.click();
	}
	
	public void accountBack()
	{
		accountBack.click();
	}
	
	public void RightMenu()
	{
		RightMenu.click();
	}
	
	public String accountName()
	{
		return accountName.getAttribute("name").toString();
	}
	
	public void favIcon()
	{
		 favIcon.click();
	}
	
	public void quickActionEdit()
	{
		quickActionEdit.click();
	}
	
	public void quickActionMap() throws Exception
	{
		quickActionMap.click();
		Thread.sleep(2000);
	}
	
	public void quickActionAddMe()
	{
		quickActionAddMe.click();
	}
	

	public void quickActionAddOppty()
	{
		quickActionAddOppty.click();
	}

	public void quickActionAddActivity()
	{
		quickActionAddActivity.click();
	}
	
	public void quickActionAddContact()
	{
		quickActionAddContact.click();
	}
	
	public void mapBackBtn()
	{
		mapBackBtn.click();
	}
	
	public void opportunitiesBtnAccountDetail()
	{
		opportunitiesBtnAccountDetail.click();
	}
	
	public void contactBtnAccountDetail()
	{
		contactBtnAccountDetail.click();
	}

	public void activityBtnAccountDetail()
	{
		activityBtnAccountDetail.click();
	}
	
	public void moreBtnAccountDetail()
	{
		moreBtnAccountDetail.click();
	}
	public void leadsBtnAccountDetail()
	{
		leadsBtnAccountDetail.click();
	}
	
	public void serviceRequestBtnAccountDetail()
	{
		serviceRequestBtnAccountDetail.click();
	}
	public void notesBtnAccountDetail()
	{
		notesBtnAccountDetail.click();
	}
	public void moreBtn()
	{
		moreBtn.click();
	}

}
