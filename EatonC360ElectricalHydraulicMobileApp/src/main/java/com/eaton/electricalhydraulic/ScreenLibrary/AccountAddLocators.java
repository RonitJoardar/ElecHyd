package com.eaton.electricalhydraulic.ScreenLibrary;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.eaton.electricalhydraulic.TestBase.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AccountAddLocators extends TestBase{

	public AccountAddLocators(AppiumDriver<MobileElement> driver) throws Exception {
		
		this.driver =driver;
		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 2 ,TimeUnit.SECONDS), this);
		
	}
	
	@iOSFindBy(id="hamburger")
	public MobileElement hamburger;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='ACCOUNTS']")
	public MobileElement accountSideMenu;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Add']")
	public MobileElement addAccountButton;
	
	@iOSFindBy(id="txtAccountName")
	public MobileElement accountNameTb;
	
	@iOSFindBy(id="txtAddressLine1")
	public MobileElement accountAddressline1Tb;
	
	@iOSFindBy(id="txtAddressLine2")
	public MobileElement accountAddressline2Tb;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[@name='pickerCountry']/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement accountCountryDD;
	
	@iOSFindBy(xpath="//XCUIElementTypePickerWheel")
	public MobileElement accountDDWheel;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[@name='pickerState']/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public MobileElement accountStateDD;
	
	@iOSFindBy(id="txtCity")
	public MobileElement accountCityTb;
	
	@iOSFindBy(id="txtPostal")
	public MobileElement accountPostalCodeTb;
	
	@iOSFindBy(id="txtPhone")
	public MobileElement mainPhone;
	
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Save']")
	public MobileElement saveBtn;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Add Account']")
	public MobileElement doneBtn;
	
	@iOSFindBy(id="Fail")
	public MobileElement alertText;
	
	@iOSFindBy(id="OK")
	public MobileElement okBtn;
	
	@iOSFindBy(id="YES")
	public MobileElement confirmSave;
	
	public void hamburger() throws Exception
	{
		Thread.sleep(5000);
		hamburger.click();
	}
	
	public void accountSideMenuClick()
	{
		accountSideMenu.click();
	}
	public void addAccountButtonClick()
	{
		addAccountButton.click();
	}
	public void accountNameTb(String accountName)
	{
		accountNameTb.sendKeys(accountName);
		doneBtn.click();
	}
	
	public void accountAddressline1Tb(String addrLine1)
	{
		accountAddressline1Tb.sendKeys(addrLine1);
		doneBtn.click();
	}
	
	public void accountAddressline2Tb(String addrLine2)
	{
		accountAddressline2Tb.sendKeys(addrLine2);
		doneBtn.click();
	}
	
	public void accountCountryDD(String country, AppiumDriver driver)
	{
		this.driver=driver;
		accountCountryDD.click();
		//driver.findElement(By.className("XCUIElementTypePickerWheel")).sendKeys(country);
		
		List wheels = driver.findElements(MobileBy.className("XCUIElementTypePickerWheel"));

		Point p1=((RemoteWebElement) wheels.get(0)).getLocation();
		Dimension d1 = ((RemoteWebElement) wheels.get(0)).getSize();
				//-100 scrolls up (taps the value below the currently selected value)
				

				//+100 scrolls down (taps the value above the currently selected value)
			//	driver.tap(1, p1.getX(), p1.getY() +100, 500);
		for(int i=0; i<60;i++)
		{
		driver.tap(1, p1.getX(), p1.getY() + d1.getHeight() -100, 500);
	
		}
		accountDDWheel.sendKeys(country);
		doneBtn.click();
	}
	
	public void accountStateDD(String state)
	{
		
		accountStateDD.click();
		accountDDWheel.setValue(state);
		doneBtn.click();
	}
	public void accountCityTb(String city)
	{
		accountCityTb.sendKeys(city);
		doneBtn.click();
	}
	public void accountPostalCodeTb(String pcode)
	{
		accountPostalCodeTb.sendKeys(pcode);
		doneBtn.click();
	}
	public void mainPhone(String phone)
	{
		mainPhone.clear();
		mainPhone.sendKeys(phone);
	}
	
	public void savBtnClick()
	{
		saveBtn.click();

	}

	public void okBtnClick() throws Exception
	{
		
		okBtn.click();
		Thread.sleep(3000);
	}
	public void confirmSaveClick()
	{
		confirmSave.click();
		
	}
	public void validate()
	{
		try{
		saveBtn.click();
		Assert.assertTrue(alertText.isDisplayed());
		okBtn.click();
		}
		catch(Exception e){
			
			
			System.out.println("Validation Failed:  \n" +e.getStackTrace());
			
		}
	}
	public void postValidation()
	{
		if(alertText.isDisplayed()==true)
		{
			Assert.assertTrue("Test Failed", false);
			
		}
		
	}
}
