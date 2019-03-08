package com.eaton.electricalhydraulic.ScreenLibrary;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.eaton.electricalhydraulic.TestBase.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AccountListAdvSearchLocators extends TestBase {

	public AccountListAdvSearchLocators(AppiumDriver driver) throws Exception {
			this.driver =driver;
		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 2 ,TimeUnit.SECONDS), this);
	}

	@iOSFindBy(id="Globe")
	public MobileElement mapGlobe;
	
	@iOSFindBy(id="All_Accounts.png")
	public MobileElement allAccountsList;
	
	@iOSFindBy(id="Open & Dont show again")
	public MobileElement allAccountOnlineConfimation;
	
	@iOSFindBy(id="team.png")
	public MobileElement teamAccountsList;
	
	@iOSFindBy(id="mywhite.png")
	public MobileElement myAccountsList;
	
	@iOSFindBy(id="Favourites.png")
	public MobileElement favouriteAccountList;
	
	@iOSFindBy(id="filterwhite") 
	public MobileElement accountFilter;
	
	@iOSFindBy(xpath="//XCUIElementTypeTextField[@value='Accounts Search']")
	public MobileElement accountSearch;
	
	//@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Automated Account']")
	@iOSFindBy(xpath="//XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	public MobileElement accountListElement;
	
	@iOSFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeButton")
	public MobileElement accountListPhone;
	
	@iOSFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText")
	public MobileElement accountListName;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[2]/XCUIElementTypeTextField")
	public MobileElement erpIdAdvSearch;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[4]/XCUIElementTypeTextField")
	public MobileElement accountNameAdvSearch;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[6]/XCUIElementTypeTextField")
	public MobileElement addrLine1AdvSearch;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[8]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement countryAdvSearch;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[10]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement stateAdvSearch;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[12]/XCUIElementTypeTextField")
	public MobileElement cityAdvSearch;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[14]/XCUIElementTypeTextField")
	public MobileElement postalCodeAdvSearch;
	
	@iOSFindBy(id="Clear Filters")
	public MobileElement clearFilterAdvSearch;
	
	@iOSFindBy(id="Account Name")
	public MobileElement accountNameSort;
	
	@iOSFindBy(id="Date Created")
	public MobileElement dateCreatedSort;
	
	@iOSFindBy(id="Ascending")
	public MobileElement ascendingSort;
	
	@iOSFindBy(id="Descending")
	public MobileElement descendingSort;
	
	@iOSFindBy(id="Apply")
	public MobileElement applyAdvSearch;
	
	@iOSFindBy(id="Cancel")
	public MobileElement cancelAdvSearch;
	
	@iOSFindBy(id="Yes")
	public MobileElement confirmCancel;
	
	@iOSFindBy(id="Filter Accounts")
	public MobileElement doneAdvSearch;
	
	@iOSFindBy(xpath="//XCUIElementTypePickerWheel")
	public MobileElement pickerElement;
	
	public void mapGlobe() throws Exception
	{
		mapGlobe.click();
	}
	
	public void allAccountsList()
	{
		allAccountsList.click();
	}
	
	public void allAccountOnlineConfimation()
	{
		allAccountOnlineConfimation.click();
	}
	
	public void teamAccountsList()
	{
		teamAccountsList.click();
	}
	
	public void myAccountsList() throws Exception
	{
		myAccountsList.click();
		Thread.sleep(30000);
	}
	
	public void favouriteAccountList()
	{
		favouriteAccountList.click();
	}
	
	public void accountFilter()
	{
		accountFilter.click();
	}
	
	public void accountSearch(String account) throws Exception
	{
		accountSearch.sendKeys(account);
		Thread.sleep(10000);
	}
	
	public void accountListElement() throws Exception
	{
		accountListElement.click();
	}
	
	public void accountListPhone()
	{
		accountListPhone.click();
	}
	

	public String accountListName()
	{
		return accountListName.getAttribute("name").toString();
	}
	
	public void erpIdAdvSearch(String erpId)
	{
		erpIdAdvSearch.sendKeys(erpId);
	}
	
	public void accountNameAdvSearch(String accountName)
	{
		accountNameAdvSearch.sendKeys(accountName);
	}
	
	public void addrLine1AdvSearch(String addrLine1)
	{
		addrLine1AdvSearch.sendKeys(addrLine1);
	}
	
	public void countryAdvSearch(String country)
	{
		countryAdvSearch.click();
		for(int i=0; i<223;i++)
		{
		pickerElement.setValue(country);
		}
		doneAdvSearch.click();
		
	}
	public void stateAdvSearch(String state)
	{
		stateAdvSearch.click();
		for(int i=0; i<12;i++)
		{
		pickerElement.setValue(state);
		}
		doneAdvSearch.click();
	}
	
	public void cityAdvSearch(String city)
	{
		cityAdvSearch.sendKeys(city);
		
	}
	public void postalCodeAdvSearch(String postalCode)
	{
		postalCodeAdvSearch.sendKeys(postalCode);
		
	}
	public void clearFilterAdvSearch()
	{
		clearFilterAdvSearch.click();
		
	}
	public void accountNameSort()
	{
		accountNameSort.click();
		
	}
	
	public void ascendingSort()
	{
		ascendingSort.click();
		
	}
	
	public void descendingSort()
	{
		descendingSort.click();
		
	}
	
	public void applyAdvSearch() throws Exception
	{
		applyAdvSearch.click();
		Thread.sleep(10000);
		
	}
	
	public void cancelAdvSearch()
	{
		cancelAdvSearch.click();
		
	}
	
	public void doneAdvSearch()
	{
		doneAdvSearch.click();
		
	}
	
	public void dateCreatedSort()
	{
		dateCreatedSort.click();
		
	}
}
