package com.eaton.electricalhydraulic.testscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eaton.electricalhydraulic.DataProvider.AddAccountDataProvider;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;



public class TS1_Accounts extends AddAccountDataProvider {

	public TS1_Accounts() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void TC000_login() throws Exception
			{
				
				loadLoginElements();
				//login.popUpCancel();
				login.userNameTb("C9927332");
				login.keyBoardReturn();
				login.passwordTb("Eaton$123");
				login.keyBoardReturn();
				login.loginBtn();
				List <MobileElement> ele = (List<MobileElement>) driver.findElements(MobileBy.id("hamburger"));
				boolean flag = ele.size()>0;
				if(flag==false)
				{
				
					WebDriverWait wait = new WebDriverWait(driver,600);
					wait.until(ExpectedConditions.visibilityOf(login.allowBtn));
					login.allowBtn.click();
					wait.until(ExpectedConditions.visibilityOf(login.lovLoaded));
					login.nextBtn.click();
				}
			}
	@Test(dataProvider="addAccountDataProvider" , dependsOnMethods="TC000_login")
	public void TC001_addNewAccount(String accountName,String addrLine1,String addrLine2,String country,String state,String city,String pcode,String phone) throws Exception
	{
		
		loadAccountAddElements();
		loadAccountListAdvSearchElements();
		accadd.hamburger();			
		accadd.accountSideMenuClick();
		acclistsearch.mapGlobe();
		accadd.addAccountButtonClick();
		accadd.accountNameTb(accountName);
		accadd.accountAddressline1Tb(addrLine1);
		accadd.accountAddressline2Tb(addrLine2);
		accadd.accountCountryDD(country,driver);
		accadd.accountStateDD(state);
		accadd.accountCityTb(city);
		accadd.accountPostalCodeTb(pcode);
		accadd.mainPhone(phone);
		accadd.savBtnClick();
		accadd.okBtnClick();
		loadAccountListAdvSearchElements();
		Assert.assertTrue(IsElementPresent(driver, acclistsearch.mapGlobe));
		
	}
	
	@Test(dataProvider="addAccountDataProvider", dependsOnMethods="TC001_addNewAccount")
	public void TC002_addNewAccountValidation(String accountName,String addrLine1,String addrLine2,String country,String state,String city,String pcode,String phone) throws Exception
	{
		loadAccountAddElements();
		accadd.accountSideMenuClick();
		accadd.addAccountButtonClick();
		accadd.validate();
		accadd.accountNameTb(accountName);
		accadd.validate();
		accadd.accountAddressline1Tb(addrLine1);
		accadd.validate();
		accadd.accountAddressline2Tb(addrLine2);
		accadd.accountCountryDD(country,driver);
		accadd.validate();
		accadd.accountStateDD(state);
		accadd.validate();
		accadd.accountCityTb(city);
		accadd.validate();
		accadd.accountPostalCodeTb(pcode);
		accadd.validate();
		accadd.mainPhone(phone);
		accadd.validate();
		accadd.savBtnClick();
		accadd.okBtnClick();
		accadd.postValidation();
	}
	@Test(dependsOnMethods="TC002_addNewAccountValidation")
	public void TC003_EditAccount() throws Exception
	{
		loadAccountListAdvSearchElements();
		loadAccountAddElements();
	
		accadd.hamburger();
		accadd.accountSideMenuClick();
		acclistsearch.myAccountsList();
		acclistsearch.accountListElement();
		loadAccountDetailElements();
		accdetail.editAccount();
		accadd.mainPhone("999999999");
		accadd.savBtnClick();
		accadd.confirmSaveClick();
		
		Assert.assertTrue(IsElementPresent(driver, accdetail.editAccount));
		accdetail.accountBack();
		
	}
	
	@Test(dependsOnMethods="TC003_EditAccount")
	public void TC004_EditAccountValidation() throws Exception
	{
		loadAccountListAdvSearchElements();
		loadAccountAddElements();
		acclistsearch.myAccountsList();
		acclistsearch.accountListElement();
		loadAccountDetailElements();
		accdetail.editAccount();
		Assert.assertTrue(IsElementEnabled(driver, accadd.accountNameTb));
		Assert.assertTrue(IsElementEnabled(driver, accadd.accountAddressline1Tb));
		Assert.assertTrue(IsElementEnabled(driver, accadd.accountAddressline2Tb));
		//Assert.assertTrue(IsElementEnabled(driver, accadd.accountCountryDD));
		//Assert.assertTrue(IsElementEnabled(driver, accadd.accountStateDD));
		Assert.assertTrue(IsElementEnabled(driver, accadd.accountCityTb));
		Assert.assertTrue(IsElementEnabled(driver, accadd.accountPostalCodeTb));
		accadd.savBtnClick();
		accadd.confirmSaveClick();
		accdetail.accountBack();
	
	}
	@Test(dependsOnMethods="TC004_EditAccountValidation")
	public void TC005_favouriteAccount() throws Exception
	{
		loadAccountListAdvSearchElements();
		loadAccountAddElements();
		acclistsearch.myAccountsList();
		acclistsearch.accountListElement();
		loadAccountDetailElements();
		String accountName = accdetail.accountName();
		accdetail.RightMenu();
		accdetail.favIcon();
		accdetail.accountBack();
		acclistsearch.favouriteAccountList();
		acclistsearch.accountSearch(accountName);
		acclistsearch.accountListName();
		Assert.assertEquals(accountName, acclistsearch.accountListName());
	
		
	}
	
	@Test(dependsOnMethods="TC005_favouriteAccount")
	public void TC006_acccountQuickActionEditAccounttNavigation() throws Exception
	{
		loadAccountAddElements();
		loadAccountDetailElements();
		loadAccountListAdvSearchElements();
		acclistsearch.myAccountsList();
		acclistsearch.accountListElement();
		accdetail.RightMenu();
		accdetail.quickActionEdit();
		acclistsearch.cancelAdvSearch();
		acclistsearch.confirmCancel.click();
		Assert.assertTrue(IsElementPresent(driver,accdetail.editAccount));
		

	}
	
	@Test(dependsOnMethods="TC006_acccountQuickActionEditAccounttNavigation")
	public void TC007_acccountQuickActionMapNavigation() throws Exception
	{
		loadAccountAddElements();
		loadAccountDetailElements();
		loadAccountListAdvSearchElements();
		acclistsearch.myAccountsList();
		acclistsearch.accountListElement();
		accdetail.RightMenu();
		accdetail.quickActionMap();
		accdetail.mapBackBtn();
		Assert.assertTrue(IsElementPresent(driver,accdetail.editAccount));
	}

	@Test(dependsOnMethods="TC007_acccountQuickActionMapNavigation")
	public void TC008_acccountQuickActionAddContactNavigation() throws Exception
	{
		loadAccountAddElements();
		loadAccountDetailElements();
		loadAccountListAdvSearchElements();
		acclistsearch.myAccountsList();
		acclistsearch.accountListElement();
		accdetail.RightMenu();
		accdetail.quickActionAddContact();
		acclistsearch.cancelAdvSearch();
		acclistsearch.confirmCancel.click();
		Assert.assertTrue(IsElementPresent(driver,accdetail.editAccount));
	}
	
	@Test(dependsOnMethods="TC008_acccountQuickActionAddContactNavigation")
	public void TC009_acccountQuickActionAddOpportunityNavigation() throws Exception
	{
		loadAccountAddElements();
		loadAccountDetailElements();
		loadAccountListAdvSearchElements();
		acclistsearch.myAccountsList();
		acclistsearch.accountListElement();
		accdetail.RightMenu();
		accdetail.quickActionAddOppty();
		acclistsearch.cancelAdvSearch();
		acclistsearch.confirmCancel.click();
		Assert.assertTrue(IsElementPresent(driver,accdetail.editAccount));
		
	}
	
	@Test(dependsOnMethods="TC009_acccountQuickActionAddOpportunityNavigation")
	public void TC0010_accountQuickActionAddActivityNavigation() throws Exception
	{
		loadAccountAddElements();
		loadAccountDetailElements();
		loadAccountListAdvSearchElements();
		acclistsearch.myAccountsList();
		acclistsearch.accountListElement();
		accdetail.RightMenu();
		accdetail.quickActionAddActivity();
		acclistsearch.cancelAdvSearch();
		acclistsearch.confirmCancel.click();
		Assert.assertTrue(IsElementPresent(driver,accdetail.editAccount));
		accdetail.accountBack();
		
	}
	
	@Test(dependsOnMethods="TC0010_accountQuickActionAddActivityNavigation")
	public void TC0011_verifyOpportunityNavigationFromAccountDetails() throws Exception
	{
		loadAccountDetailElements();
		accdetail.opportunitiesBtnAccountDetail();
		Assert.assertTrue(IsElementPresent(driver, accdetail.opportunitiesHeader));

	}
	
	@Test(dependsOnMethods="TC0011_verifyOpportunityNavigationFromAccountDetails")
	public void TC0012_verifyContactsNavigationFromAccountDetails() throws Exception
	{

		loadAccountDetailElements();
		accdetail.contactBtnAccountDetail();
		Assert.assertTrue(IsElementPresent(driver, accdetail.contactsHeader));
	
	}
	
	@Test(dependsOnMethods="TC0012_verifyContactsNavigationFromAccountDetails")
	public void TC0013_verifyActivitiesNavigationFromAccountDetails() throws Exception
	{
		loadAccountDetailElements();
		accdetail.activityBtnAccountDetail();
		Assert.assertTrue(IsElementPresent(driver, accdetail.activitiesHeader));
		
	}
	
	@Test(dependsOnMethods="TC0013_verifyActivitiesNavigationFromAccountDetails")
	public void TC0014_verifyMoreNavigationFromAccountDetails() throws Exception
	{
		loadAccountDetailElements();
		accdetail.moreBtnAccountDetail();
		Assert.assertTrue(IsElementPresent(driver, accdetail.leadsBtnAccountDetail));
		
	}
	

	@Test(dependsOnMethods="TC0014_verifyMoreNavigationFromAccountDetails")
	public void TC0015_verifyLeadsNavigationFromAccountDetails() throws Exception
	{
		
		loadAccountDetailElements();
		accdetail.moreBtnAccountDetail();
		accdetail.leadsBtnAccountDetail();
		Assert.assertTrue(IsElementPresent(driver, accdetail.leadsHeader));
		accdetail.moreBtn();
		
	}
	

	@Test(dependsOnMethods="TC0015_verifyLeadsNavigationFromAccountDetails")
	public void TC0016_verifyServiceRequestNavigationFromAccountDetails() throws Exception
	{
		
		loadAccountDetailElements();
		accdetail.moreBtnAccountDetail();
		accdetail.serviceRequestBtnAccountDetail();
		Assert.assertTrue(IsElementPresent(driver, accdetail.serviceRequestsHeader));
		accdetail.moreBtn();
		
	}
	
	@Test(dependsOnMethods="TC0016_verifyServiceRequestNavigationFromAccountDetails")
	public void TC0017_verifyNotesNavigationFromAccountDetails() throws Exception
	{
		
		loadAccountDetailElements();
		accdetail.moreBtnAccountDetail();
		accdetail.notesBtnAccountDetail();
		Assert.assertTrue(IsElementPresent(driver, accdetail.notesHeader));
		accdetail.moreBtn();
		accdetail.accountBack();
		
	}
	
	@Test(dependsOnMethods="TC0017_verifyNotesNavigationFromAccountDetails")
	public void TC0018_accountNameAdvanceSearch() throws Exception
	{
		loadAccountAddElements();
		loadAccountDetailElements();
		loadAccountListAdvSearchElements();
		acclistsearch.myAccountsList();
		acclistsearch.accountFilter();
		acclistsearch.accountNameAdvSearch("test");
		acclistsearch.applyAdvSearch();
		Assert.assertEquals("test", acclistsearch.accountListName());
	}
	
}
