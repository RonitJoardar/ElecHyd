package com.eaton.electricalhydraulic.ScreenLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.eaton.electricalhydraulic.TestBase.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ProductLocators extends TestBase{

	public ProductLocators(AppiumDriver driver) throws Exception {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 2, TimeUnit.SECONDS), this);
	}

	@iOSFindBy(xpath="//XCUIElementTypeOther[2]//XCUIElementTypeOther[1]XCUIElementTypeTextField")
	public MobileElement businessGroupDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement productDivisionDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[6]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement productLineDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[8]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement productFamilyDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[10]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement productSubFamilyDD;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[12]/XCUIElementTypeTextField")
	public MobileElement quantityTb;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[14]/XCUIElementTypeTextField")
	public MobileElement unitPriceTb;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[16]/XCUIElementTypeTextField")
	public MobileElement reportingAlternateTb;
	
	@iOSFindBy(xpath="//XCUIElementTypePickerWheel")
	public MobileElement productWheel;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Add Product']")
	public MobileElement doneBtn;
	
	public void businessGroupDD(String businessGroup)
	{
		businessGroupDD.click();
		productWheel.sendKeys(businessGroup);
		doneBtn.click();
	}
	
	public void productDivisionDD(String productDivision)
	{
		productDivisionDD.click();
		productWheel.sendKeys(productDivision);
		doneBtn.click();
	}
	
	public void productLineDD(String productLine)
	{
		productLineDD.click();
		productWheel.sendKeys(productLine);
		doneBtn.click();
	}
	public void productFamilyDD(String productFamily)
	{
		productFamilyDD.click();
		productWheel.sendKeys(productFamily);
		doneBtn.click();
	}
	
	public void productSubFamilyDD(String productSubFamily)
	{
		productSubFamilyDD.click();
		productWheel.sendKeys(productSubFamily);
		doneBtn.click();
	}
	
	public void quantityTb(String quantity)
	{
		quantityTb.sendKeys(quantity);
		doneBtn.click();
	}
	
	public void unitPriceTb(String unitPrice)
	{
		unitPriceTb.sendKeys(unitPrice);
		doneBtn.click();
	}
}
