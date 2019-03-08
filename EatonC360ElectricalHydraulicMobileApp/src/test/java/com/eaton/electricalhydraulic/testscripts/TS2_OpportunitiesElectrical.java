package com.eaton.electricalhydraulic.testscripts;

import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eaton.electricalhydraulic.DataProvider.AddOpportunityDataProviderES;
import com.eaton.electricalhydraulic.TestBase.TestBase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;

public class TS2_OpportunitiesElectrical extends AddOpportunityDataProviderES {
	
	public TS2_OpportunitiesElectrical() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void TC000_login()  throws Exception
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
	@Test(dependsOnMethods="TC000_login", dataProvider ="addOpportunityDataProvider")
	public void TC001_addNewOpportunity(String opptyName,String salesStage,String confidence,String application,String subApplication,String description,String endUseSegment,String endUseSubSegment,String finalQuoteNumber,String orderNumber,String dealRegistration,String salesVertical,String month,String month2,String month3,String status,String outcomeStatus,String OutcomeReason,String stratPlan,String closureSummary) throws Exception
	{
		
		loadAccountAddElements();
		loadAccountListAdvSearchElements();
		loadElectricalOpportunityAddElements();
		loadAccountDetailElements();
		loadElectricalOpportunityDetailLocatorsElements();
		accadd.hamburger();			
		oppaddelectrical.opportunitiesSideMenuClick();
		accadd.addAccountButtonClick();
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(acclistsearch.accountListElement));
		acclistsearch.accountListElement();
		oppaddelectrical.nextBtn();
		oppaddelectrical.opportunitiesNameTb(opptyName);
		oppaddelectrical.opportunitiesSalesStageDD(salesStage);
		oppaddelectrical.opportunitiesConfidenceDD(confidence);
		oppaddelectrical.opportunitiesApplicationDD(application);
		oppaddelectrical.opportunitiesSubApplicationDD(subApplication);
		oppaddelectrical.opportunitiesDescriptionTb(description);
		oppaddelectrical.opportunitiesEndUseSegmentDD(endUseSegment);
		oppaddelectrical.opportunitiesEndUseSubSegmentDD(endUseSubSegment);
		oppaddelectrical.opportunitiesFinalQuoteNumberTb(finalQuoteNumber);
		oppaddelectrical.opportunitiesOrderNumberTb(orderNumber);
		oppaddelectrical.opportunitiesDealRegistrationDD(dealRegistration);
		oppaddelectrical.opportunitiesSalesVerticalDD(salesVertical);
		oppaddelectrical.opportunitiesProposalDateDD(month);
		oppaddelectrical.opportunitiesExpectedDecisionDateDD(month2);
		oppaddelectrical.opportunitiesExpirationDate(month3);
		oppaddelectrical.opportunitiesStatusDD(status);
		oppaddelectrical.opportunitiesOutcomeStatusDD(outcomeStatus);
		oppaddelectrical.opportunitiesOutcomeReasonDD(OutcomeReason);;
		oppaddelectrical.opportunitiesIncludeInStratPlanDD(stratPlan);
		oppaddelectrical.opportunitiesIncludeInTargetPlanCB();
		oppaddelectrical.opportunitiesClosureSummaryTb(closureSummary);
		accadd.saveBtn.click();
		accadd.confirmSaveClick();
		Thread.sleep(3000);
		
	}
	
	@Test(dependsOnMethods="TC000_login", dataProvider ="addOpportunityDataProvider")
	public void TC002_addNewOpportunityValidate(String opptyName,String salesStage,String confidence,String application,String subApplication,String month2,  String status) throws Exception
	{
		
		loadAccountAddElements();
		loadAccountListAdvSearchElements();
		loadElectricalOpportunityAddElements();
		loadAccountDetailElements();
		loadElectricalOpportunityDetailLocatorsElements();
		accadd.hamburger();			
		oppaddelectrical.opportunitiesSideMenuClick();
		accadd.addAccountButtonClick();
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(acclistsearch.accountListElement));
		acclistsearch.accountListElement();
		oppaddelectrical.nextBtn();
		oppaddelectrical.opportunitiesNameTb(opptyName);
		accadd.validate();
		oppaddelectrical.opportunitiesSalesStageDD(salesStage);
		accadd.validate();
		oppaddelectrical.opportunitiesConfidenceDD(confidence);
		accadd.validate();
		oppaddelectrical.opportunitiesApplicationDD(application);
		accadd.validate();
		oppaddelectrical.opportunitiesSubApplicationDD(subApplication);
		accadd.validate();
		oppaddelectrical.opportunitiesExpectedDecisionDateDD(month2);
		accadd.validate();
		oppaddelectrical.opportunitiesStatusDD(status);
		accadd.validate();
		accadd.saveBtn.click();
		accadd.confirmSaveClick();
		Thread.sleep(3000);
		
	}
	
	@Test(dependsOnMethods="TC001_addNewOpportunity", dataProvider ="editOpportunityDataProvider")
	public void TC003_editOpportunity(String opptyName,String salesStage,String confidence,String application,String subApplication,String description,String endUseSegment,String endUseSubSegment,String finalQuoteNumber,String orderNumber,String dealRegistration,String salesVertical,String month,String month2,String month3,String status,String outcomeStatus,String OutcomeReason,String stratPlan,String closureSummary) throws Exception
	{
		
		loadAccountAddElements();
		loadAccountListAdvSearchElements();
		loadElectricalOpportunityAddElements();
		loadAccountDetailElements();
		loadElectricalOpportunityDetailLocatorsElements();
		acclistsearch.myAccountsList();
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(acclistsearch.accountListElement));
		acclistsearch.accountListElement();
		accdetail.RightMenu();
		oppdetail.opportunitiesSideMenuEdit();
		//scrollToElement(oppdetail.opportunitiesSideMenuEdit, oppdetail.opportunitiesSideMenuAddProduct);*/
		oppaddelectrical.opportunitiesNameTb(opptyName);
		oppaddelectrical.opportunitiesSalesStageDD(salesStage);
		oppaddelectrical.opportunitiesConfidenceDD(confidence);
		oppaddelectrical.opportunitiesApplicationDD(application);
		oppaddelectrical.opportunitiesSubApplicationDD(subApplication);
		oppaddelectrical.opportunitiesDescriptionTb(description);
		oppaddelectrical.opportunitiesEndUseSegmentDD(endUseSegment);
		oppaddelectrical.opportunitiesEndUseSubSegmentDD(endUseSubSegment);
		oppaddelectrical.opportunitiesFinalQuoteNumberTb(finalQuoteNumber);
		oppaddelectrical.opportunitiesOrderNumberTb(orderNumber);
		oppaddelectrical.opportunitiesDealRegistrationDD(dealRegistration);
		oppaddelectrical.opportunitiesSalesVerticalDD(salesVertical);
		oppaddelectrical.opportunitiesProposalDateDD(month);
		oppaddelectrical.opportunitiesExpectedDecisionDateDD(month2);
		oppaddelectrical.opportunitiesExpirationDate(month3);
		oppaddelectrical.opportunitiesStatusDD(status);
		oppaddelectrical.opportunitiesOutcomeStatusDD(outcomeStatus);
		oppaddelectrical.opportunitiesOutcomeReasonDD(OutcomeReason);;
		oppaddelectrical.opportunitiesIncludeInStratPlanDD(stratPlan);
		oppaddelectrical.opportunitiesIncludeInTargetPlanCB();
		oppaddelectrical.opportunitiesClosureSummaryTb(closureSummary);
		accadd.saveBtn.click();
		accadd.confirmSaveClick();
		Thread.sleep(3000);
		
	}

}
