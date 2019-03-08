 package com.eaton.electricalhydraulic.TestBase;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.eaton.electricalhydraulic.ScreenLibrary.AccountAddLocators;
import com.eaton.electricalhydraulic.ScreenLibrary.AccountDetailsLocators;
import com.eaton.electricalhydraulic.ScreenLibrary.AccountListAdvSearchLocators;
import com.eaton.electricalhydraulic.ScreenLibrary.Login;
import com.eaton.electricalhydraulic.ScreenLibrary.OpportunitiesAddLocatorsElectrical;
import com.eaton.electricalhydraulic.ScreenLibrary.OpportunityDetailLocators;
import com.eaton.electricalhydraulic.ScreenLibrary.ProductLocators;
import com.github.genium_framework.appium.support.server.AppiumServer;
import com.github.genium_framework.server.ServerArguments;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

/**
 * This Class acts as the base class for every test. It instantiated all the
 * page element classes. Starts and Stops appium server Before and After a
 * TesSuite Creates and terminates device sessions before and after every test
 * method
 * 
 * @author ronit.joardar
 *
 */
public class TestBase extends com.eaton.electricalhydraulic.Utilities.ExcelReader {

	public AppiumServer _appiumServer;
	public DesiredCapabilities capabilities;
	public AppiumDriverLocalService appiumDriverLocalService;
	
	public AccountAddLocators accadd;
	public AccountListAdvSearchLocators acclistsearch;
	public AccountDetailsLocators accdetail;
	public Login login;
	public OpportunitiesAddLocatorsElectrical oppaddelectrical;
	public OpportunityDetailLocators oppdetail;
	public ProductLocators product;
	
	public TestBase() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public static OS executionOS = OS.IOS;

	public enum OS {
		ANDROID, IOS
	}

	/**
	 * 
	 * @throws Exception
	 */
	  public void loadAccountAddElements() throws Exception 
	  { 
		  accadd = new AccountAddLocators(driver); 
		  }
	  /**
	   * 
	   * @throws Exception
	   */
	  public void loadAccountListAdvSearchElements() throws Exception
	  { 
		  acclistsearch = new AccountListAdvSearchLocators(driver); 
		  }
	  /**
	   * 
	   * @throws Exception
	   */
	  public void loadLoginElements() throws Exception
	  { 
		  login = new Login(driver); 
		  }
	  
	  public void loadAccountDetailElements() throws Exception
	  { 
		  accdetail = new AccountDetailsLocators(driver); 
		  }
	  
	  public void loadElectricalOpportunityAddElements() throws Exception
	  { 
		  oppaddelectrical = new OpportunitiesAddLocatorsElectrical(driver);
		  }
	  
	  public void loadElectricalOpportunityDetailLocatorsElements() throws Exception
	  { 
		  oppdetail = new OpportunityDetailLocators(driver);
		  }
	  
	  public void loadElectricalOpportunityProductLocatorsElements() throws Exception
	  { 
		  product = new ProductLocators(driver);
		  }
	  
	
	/**
	 * Vertical scrolls to the element specifies in Hashmap object
	 * 
	 * @param driver
	 * @throws Exception
	 */
	public void verticalScrollToElement(AppiumDriver<MobileElement> driver) throws Exception {

		MobileElement health = driver
				.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Subscribe Opportunities']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		this.driver = driver;
		String id = ((MobileElement) health).getId();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("direction", "down");
		params.put("element", id);
		js.executeScript("mobile: scroll", params);

	}

	/**
	 * Loads Android or IOS device based on the value specified in the
	 * executionOS enum Runs before every test method
	 * 
	 * @throws Exception
	 */

 @BeforeClass
	//@Test
	public void setup() throws Exception {

			String app_path = System.getProperty("user.dir") + "/VG App/Eaton-iOS-EATON-1.0.24.ipa";
			File app = new File(app_path);
			capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", deviceName);
			capabilities.setCapability("platformName", platformName);
			capabilities.setCapability("platformVersion", platformVersion);
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "ios");
			capabilities.setCapability("automationName", automationName);
			capabilities.setCapability("noReset", true);
			// capabilities.setCapability("fullReset", true);
			capabilities.setCapability("bundleId", bundleId);
			capabilities.setCapability("xcodeConfigFile", System.getProperty("user.dir") + "/appium.xcconfig");
			capabilities.setCapability("udid", udid);
			capabilities.setCapability("updatedWDABundleId", updatedWDABundleId);
			//capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			driver = new IOSDriver<MobileElement>(new URL(localURL), capabilities);

			 //driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Cancel']")).click();
			 //Thread.sleep(3000);
			/*IOSElement login = (IOSElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name='LOGIN']"));
			login.click();
			Thread.sleep(3000);
			IOSElement cancel = (IOSElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Cancel']"));
			cancel.click();
			Thread.sleep(2000);
			IOSElement fingerPrint = (IOSElement) driver.findElement(By.id("Fingerprint-100.png"));
			fingerPrint.click();
			
			cancel.click();
			
			Thread.sleep(2000);
			IOSElement username = (IOSElement) driver.findElement(By.id("usrNamePicker"));
			username.click();
			
			IOSElement picker=(IOSElement) driver.findElement(MobileBy.className("XCUIElementTypePickerWheel"));
			for(int i=0; i<4;i++)
			{
			picker.setValue("ES-SalesRep");
			}
			IOSElement done = (IOSElement) driver.findElement(By.id("EatonLogo"));
			done.click();
			Thread.sleep(2000);
			IOSElement login = (IOSElement) driver.findElement(By.id("LOGIN"));
			login.click();

			IOSElement nextButton = (IOSElement) driver.findElement(By.id("Next"));
			nextButton.click();

			Thread.sleep(5000);
			IOSElement hamburger = (IOSElement) driver.findElement(By.id("hamburger"));
			hamburger.click();
			
			//driver.quit();

			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='ACCOUNTS']")).click();
			
			
			
			

			driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Add']")).click();

			driver.findElement(By.xpath("//XCUIElementTypeOther[8]/XCUIElementTypeOther[1]/XCUIElementTypeTextField"))
					.click();*/

		/*	driver.findElement(MobileBy.className("XCUIElementTypePickerWheel")).setValue("CAN");
			
			driver.findElement(MobileBy.className("XCUIElementTypePickerWheel")).setValue("USA");

			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Add Account']")).click();

			IOSElement state=(IOSElement) driver.findElement(By.xpath("//XCUIElementTypeOther[10]/XCUIElementTypeOther[1]/XCUIElementTypeTextField"));
					state.click();

			driver.findElement(MobileBy.className("XCUIElementTypePickerWheel")).sendKeys("DC");
			
			Thread.sleep(2000);

			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Add Account']")).click();
			
			IOSElement test1= (IOSElement)driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Choose a value']"));
					test1.click();
			
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Linehaul']"))
			.click();
			
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Construction']"))
			.click();
			
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Apply']")).click();
			IOSElement test = (IOSElement) driver.findElement(By.xpath("//XCUIElementTypeOther[20]/XCUIElementTypeOther[1]/XCUIElementTypeTextField"));
			
			scrollToElement(state,test1);
			test.click();*/
			Thread.sleep(5000);
			
		}

	

	public void scrollToElement(MobileElement opportunitiesSideMenuEdit, MobileElement opportunitiesSideMenuAddProduct) {
		
		int x = opportunitiesSideMenuEdit.getLocation().getX();
		int y = opportunitiesSideMenuEdit.getLocation().getY();
		int x1 = opportunitiesSideMenuAddProduct.getLocation().getX();
		int y1 = opportunitiesSideMenuAddProduct.getLocation().getY();
		driver.swipe(x1, y1, x, y, 1);
	}
	
	
		//driver.findElement(By.xpath("//XCUIElementTypeOther[20]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")).click();
	

	/**
	 * Takes and screenshot of failed test cases and quits the driver session
	 * Runs after every test
	 * 
	 * @param result
	 * @throws Exception
	 */
	 @AfterMethod
	public void tear(ITestResult result) throws Exception {

		if (ITestResult.FAILURE == result.getStatus()) {
			captureScreenshot(driver, result.getName());
			System.out.println("Screenshot taken");
		}
		
	}
	 @AfterClass
	 public void close()
	 {
		 driver.quit();
	 }

	/**
	 * Reads data from Excel file based on the sheet name specified in the the
	 * test case data provider method
	 * 
	 * @param testcase
	 * @return
	 * @throws Exception
	 */
	public Object[][] dataProvider(String testcase) throws Exception {
		filePath = System.getProperty("user.dir") + excel_path;
		System.out.println("filepath" + filePath);
		readExcel(filePath);
		int rowNum = getRowCount(testcase);
		int colNum = getCoulumnCount(testcase);

		Object getData[][] = new Object[rowNum - 1][colNum];
		for (int i = 2; i <= rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				getData[i - 2][j] = getCellData(testcase, j, i);
			}
		}
		return getData;
	}

	/**
	 * Starts Appium server runs before test suite
	 * 
	 * @throws Exception
	 */
	// @BeforeTest
	public void startAppiumServer() throws Exception {

		/*
		 * ServerArguments serverArguments = new ServerArguments();
		 * 
		 * serverArguments.setArgument("--address", "127.0.0.1");
		 * 
		 * serverArguments.setArgument("--no-reset", true);
		 * 
		 * serverArguments.setArgument("--local-timezone", true); _appiumServer
		 * = new AppiumServer(new
		 * File("/Applications/Appium.app/Contents/Resources/node/bin/node"),
		 * new File(
		 * "/Applications/AppiumDesktop.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"
		 * ), serverArguments); _appiumServer.startServer();
		 */

		AppiumServiceBuilder builder = new AppiumServiceBuilder()
				.withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"));
		appiumDriverLocalService = builder.build();
		appiumDriverLocalService.start();

	}

	/**
	 * Stops appium server runs after test suite
	 */
	// @AfterTest
	public void test() {
		// _appiumServer.stopServer();

		appiumDriverLocalService.stop();
	}
	
	public boolean IsElementEnabled(AppiumDriver driver,MobileElement element)
	{
	    try
	    {
	    	element.isEnabled();
	        return true;
	    }
	    catch (NoSuchElementException e)
	    {
	        return false;
	    }
	}
	public boolean IsElementPresent(AppiumDriver driver,MobileElement element)
	{
	    try
	    {
	    	element.isDisplayed();
	        return true;
	    }
	    catch (NoSuchElementException e)
	    {
	        return false;
	    }
	}

}
