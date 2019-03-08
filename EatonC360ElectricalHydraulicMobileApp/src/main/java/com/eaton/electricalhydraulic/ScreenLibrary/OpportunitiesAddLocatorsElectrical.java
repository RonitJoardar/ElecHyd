package com.eaton.electricalhydraulic.ScreenLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.eaton.electricalhydraulic.TestBase.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class OpportunitiesAddLocatorsElectrical extends TestBase {

	public OpportunitiesAddLocatorsElectrical(AppiumDriver driver) throws Exception {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 2, TimeUnit.SECONDS), this);
	}

	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='OPPORTUNITIES']")
	public MobileElement opportunitiesSideMenu;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	public MobileElement accountElement;
	
	@iOSFindBy(id="Next")
	public MobileElement nextBtn;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[2]/XCUIElementTypeTextField")
	public MobileElement opportunitiesNameTb;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement opportunitiesSalesStageDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[6]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement opportunitiesConfidenceDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[8]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement opportunitiesApplicationDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[10]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement opportunitiesSubApplicationDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[12]/XCUIElementTypeTextField")
	public MobileElement opportunitiesDescriptionTb;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[14]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement opportunitiesEndUseSegmentDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[16]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement opportunitiesEndUseSubSegmentDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[20]/XCUIElementTypeTextField")
	public MobileElement opportunitiesFinalQuoteNumberTb;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[22]/XCUIElementTypeTextField")
	public MobileElement opportunitiesOrderNumberTb;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[24]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement opportunitiesDealRegistrationDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[26]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement opportunitiesSalesVerticalDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[28]/XCUIElementTypeTextField")
	public MobileElement opportunitiesProposalDateDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[30]/XCUIElementTypeTextField")
	public MobileElement opportunitiesExpectedDecisionDateDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[32]/XCUIElementTypeTextField")
	public MobileElement opportunitiesExpirationDate;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[34]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement opportunitiesStatusDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[36]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement opportunitiesOutcomeStatusDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[38]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement opportunitiesOutcomeReasonDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[40]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement opportunitiesIncludeInStratPlanDD;
	
	@iOSFindBy(id="Unchecked.png")
	public MobileElement opportunitiesIncludeInTargetPlanCB;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[42]/XCUIElementTypeTextField")
	public MobileElement opportunitiesClosureSummaryTb;
	
	@iOSFindBy(xpath="//XCUIElementTypePickerWheel")
	public MobileElement opportunityDDWheel;
	
	@iOSFindBy(xpath="//XCUIElementTypePickerWheel[1]")
	public MobileElement opportunityMonthWheel;
	

	@iOSFindBy(xpath="//XCUIElementTypePickerWheel[2]")
	public MobileElement opportunityDayWheel;
	
	@iOSFindBy(xpath="//XCUIElementTypePickerWheel[3]")
	public MobileElement opportunityYearWheel;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Add Opportunities']")
	public MobileElement doneBtn;
	
	public void opportunitiesSideMenuClick()
	{
		opportunitiesSideMenu.click();
	}

	
	public void accountElement()
	{
		accountElement.click();
	}
	
	public void nextBtn()
	{
		nextBtn.click();
	}
	
	public void opportunitiesNameTb(String opptyName)
	{
		opportunitiesNameTb.clear();
		opportunitiesNameTb.sendKeys(opptyName);
	}
	public void opportunitiesSalesStageDD(String salesStage)
	{
		opportunitiesSalesStageDD.click();
		opportunityDDWheel.sendKeys(salesStage);
		doneBtn.click();
	}
	
	public void opportunitiesConfidenceDD(String confidence)
	{
		opportunitiesConfidenceDD.click();
		opportunityDDWheel.sendKeys(confidence);
		doneBtn.click();
	}
	
	public void opportunitiesApplicationDD(String application)
	{
		opportunitiesApplicationDD.click();
		opportunityDDWheel.sendKeys(application);
		doneBtn.click();
	}
	
	public void opportunitiesSubApplicationDD(String subApplication)
	{
		opportunitiesSubApplicationDD.click();
		opportunityDDWheel.sendKeys(subApplication);
		doneBtn.click();
	}
	
	public void opportunitiesDescriptionTb(String description)
	{
		opportunitiesDescriptionTb.clear();
		opportunitiesDescriptionTb.sendKeys(description);
		
	}
	
	public void opportunitiesEndUseSegmentDD(String endUseSegment)
	{
		opportunitiesEndUseSegmentDD.click();
		opportunityDDWheel.sendKeys(endUseSegment);
		doneBtn.click();
	}
	
	public void opportunitiesEndUseSubSegmentDD(String endUseSubSegment)
	{
		opportunitiesEndUseSubSegmentDD.click();
		opportunityDDWheel.sendKeys(endUseSubSegment);
		doneBtn.click();
	}
	
	public void opportunitiesFinalQuoteNumberTb(String finalQuoteNumber)
	{
		opportunitiesFinalQuoteNumberTb.clear();
		opportunitiesFinalQuoteNumberTb.sendKeys(finalQuoteNumber);
	}
	
	public void opportunitiesOrderNumberTb(String orderNumber)
	{
		opportunitiesOrderNumberTb.clear();
		opportunitiesOrderNumberTb.sendKeys(orderNumber);
	}
	
	public void opportunitiesDealRegistrationDD(String dealRegistration)
	{
		opportunitiesDealRegistrationDD.click();
		opportunityDDWheel.sendKeys(dealRegistration);
		doneBtn.click();
	}
	
	public void opportunitiesSalesVerticalDD(String salesVertical)
	{
		opportunitiesSalesVerticalDD.click();
		opportunityDDWheel.sendKeys(salesVertical);
		doneBtn.click();
	}
	
	public void opportunitiesProposalDateDD(String month)
	{
		opportunitiesProposalDateDD.click();
		opportunityMonthWheel.sendKeys(month);
		doneBtn.click();
		
	}
	
	public void opportunitiesExpectedDecisionDateDD(String month2)
	{
		opportunitiesExpectedDecisionDateDD.click();
		opportunityMonthWheel.sendKeys(month2);
		doneBtn.click();
	}
	
	public void opportunitiesExpirationDate(String month3)
	{
		opportunitiesExpirationDate.click();
		opportunityMonthWheel.sendKeys(month3);
		doneBtn.click();
	}
	
	public void opportunitiesStatusDD(String status)
	{
		opportunitiesStatusDD.click();
		opportunityDDWheel.sendKeys(status);
		doneBtn.click();
	}
	
	public void opportunitiesOutcomeStatusDD(String outcomeStatus)
	{
		opportunitiesOutcomeStatusDD.click();
		opportunityDDWheel.sendKeys(outcomeStatus);
		doneBtn.click();
	}
	
	public void opportunitiesIncludeInStratPlanDD(String stratPlan)
	{
		opportunitiesIncludeInStratPlanDD.click();
		opportunityDDWheel.sendKeys(stratPlan);
		doneBtn.click();
	}
	

	public void opportunitiesOutcomeReasonDD(String OutcomeReason)
	{
		opportunitiesOutcomeReasonDD.click();
		opportunityDDWheel.sendKeys(OutcomeReason);
		doneBtn.click();
	}
	
	public void opportunitiesIncludeInTargetPlanCB()
	{
		opportunitiesIncludeInTargetPlanCB.click();
	}
	
	public void opportunitiesClosureSummaryTb(String closureSummary)
	{
		opportunitiesClosureSummaryTb.clear();
		opportunitiesClosureSummaryTb.sendKeys(closureSummary);
	}
}
