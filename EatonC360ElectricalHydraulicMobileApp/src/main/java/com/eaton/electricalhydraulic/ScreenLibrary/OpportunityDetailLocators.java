package com.eaton.electricalhydraulic.ScreenLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.eaton.electricalhydraulic.TestBase.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class OpportunityDetailLocators extends TestBase {
	
	public OpportunityDetailLocators(AppiumDriver driver) throws Exception {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 2, TimeUnit.SECONDS), this);
	}

	@iOSFindBy(id="Edit Opportunity")
	public MobileElement opportunitiesSideMenuEdit;
	
	@iOSFindBy(id="Mark as Favorite")
	public MobileElement opportunitiesSideMenuFavorite;
	
	@iOSFindBy(id="Email Contact")
	public MobileElement opportunitiesSideMenuEmailContact;
	
	@iOSFindBy(id="Mark as Win")
	public MobileElement opportunitiesSideMenuMarkasWin;
	
	@iOSFindBy(id="Mark as Loss")
	public MobileElement opportunitiesSideMenuMarkasLoss;
	
	@iOSFindBy(id="Add Reminders")
	public MobileElement opportunitiesSideMenuAddReminder;
	
	@iOSFindBy(id="Add Eaton Team Member")
	public MobileElement opportunitiesSideMenuAddEatonTeamMember;
	
	@iOSFindBy(id="Adjust Primary Eaton Team Member")
	public MobileElement opportunitiesSideMenuAdjustPrimaryEatonTeamMember;
	
	@iOSFindBy(id="Add Product")
	public MobileElement opportunitiesSideMenuAddProduct;
	
	@iOSFindBy(id="Log Sales Call")
	public MobileElement opportunitiesSideMenuLogSalesCall;
	
	@iOSFindBy(id="Add Activity")
	public MobileElement opportunitiesSideMenuAddActivity;
	
	@iOSFindBy(id="Add Follow-up Activity")
	public MobileElement opportunitiesSideMenuAddFollowupActivity;
	
	@iOSFindBy(id="Add Note")
	public MobileElement opportunitiesSideMenuAddNote;
	
	@iOSFindBy(id="Add Account Connection")
	public MobileElement opportunitiesSideMenuAddAccountConnection;

	@iOSFindBy(id="Add Contact Connection")
	public MobileElement opportunitiesSideMenuAddContactConnection;
	
	@iOSFindBy(id="Add Lead")
	public MobileElement opportunitiesSideMenuAddLead;
	
	@iOSFindBy(xpath="//XCUIElementTypeTabBar/XCUIElementTypeButton[2]")
	public MobileElement productTabOppty;
	
	@iOSFindBy(xpath="//XCUIElementTypeTabBar/XCUIElementTypeButton[3]")
	public MobileElement activitiesTabOppty;
	
	@iOSFindBy(xpath="//XCUIElementTypeTabBar/XCUIElementTypeButton[4]")
	public MobileElement connectionsTabOppty;
	
	@iOSFindBy(xpath="//XCUIElementTypeTabBar/XCUIElementTypeButton[5]")
	public MobileElement moreTabOppty;
	
	@iOSFindBy(xpath="//XCUIElementTypeTable")
	public MobileElement rightMenuTable;
	
	@iOSFindBy(id="Notes")
	public MobileElement notesTabOppty;
	
	@iOSFindBy(id="Leads")
	public MobileElement leadsTabOppty;
	
	@iOSFindBy(id="Back")
	public MobileElement opportunityBack;
	
	@iOSFindBy(id="More")
	public MobileElement moreBtn;
	
	@iOSFindBy(id="//XCUIElementTypeStaticText[@name='Products']")
	public MobileElement opportunitiesHeader;
	
	@iOSFindBy(id="//XCUIElementTypeStaticText[@name='Connections']")
	public MobileElement contactsHeader;
	
	@iOSFindBy(id="//XCUIElementTypeStaticText[@name='Activities']")
	public MobileElement activitiesHeader;
	
	@iOSFindBy(id="//XCUIElementTypeStaticText[@name='Leads']")
	public MobileElement leadsHeader;
	
	@iOSFindBy(id="//XCUIElementTypeStaticText[@name='Notes']")
	public MobileElement notesHeader;
	
	@iOSFindBy(xpath="//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	public MobileElement opportunityName;
	
	public void opportunitiesSideMenuEdit()
	{
		opportunitiesSideMenuEdit.click();
	}
	
	public String opportunitiesName()
	{
		return opportunityName.getAttribute("name").toString();
	}
	
	public void opportunitiesSideMenuFavorite()
	{
		opportunitiesSideMenuFavorite.click();
	}
	
	public void opportunitiesSideMenuEmailContact()
	{
		opportunitiesSideMenuEmailContact.click();
	}
	
	public void opportunitiesSideMenuMarkasWin()
	{
		opportunitiesSideMenuMarkasWin.click();
	}
	
	public void opportunitiesSideMenuMarkasLoss()
	{
		opportunitiesSideMenuMarkasLoss.click();
	}
	
	public void opportunitiesSideMenuAddReminder()
	{
		opportunitiesSideMenuAddReminder.click();
	}

	public void opportunitiesSideMenuAddEatonTeamMember()
	{
		opportunitiesSideMenuAddEatonTeamMember.click();
	}
	
	public void opportunitiesSideMenuAdjustPrimaryEatonTeamMember()
	{
		opportunitiesSideMenuAdjustPrimaryEatonTeamMember.click();
	}
	
	public void opportunitiesSideMenuAddProduct()
	{
		opportunitiesSideMenuAddProduct.click();
	}
	
	public void opportunitiesSideMenuLogSalesCall()
	{
		opportunitiesSideMenuLogSalesCall.click();
	}

	public void opportunitiesSideMenuAddActivity()
	{
		opportunitiesSideMenuAddActivity.click();
	}

	public void opportunitiesSideMenuAddFollowupActivity()
	{
		opportunitiesSideMenuAddFollowupActivity.click();
	}
	
	public void opportunitiesSideMenuAddNote()
	{
		opportunitiesSideMenuAddNote.click();
	}
	
	public void opportunitiesSideMenuAddAccountConnection()
	{
		opportunitiesSideMenuAddAccountConnection.click();
	}
	
	public void opportunitiesSideMenuAddContactConnection()
	{
		opportunitiesSideMenuAddContactConnection.click();
	}
	
	public void opportunitiesSideMenuAddLead()
	{
		opportunitiesSideMenuAddLead.click();
	}
	
	public void productTabOppty()
	{
		productTabOppty.click();
	}

	public void activitiesTabOppty()
	{
		activitiesTabOppty.click();
	}
	
	public void connectionsTabOppty()
	{
		connectionsTabOppty.click();
	}
	
	public void moreTabOppty()
	{
		moreTabOppty.click();
	}
	
	public void notesTabOppty()
	{
		notesTabOppty.click();
	}
	
	public void leadsTabOppty()
	{
		leadsTabOppty.click();
	}


}
