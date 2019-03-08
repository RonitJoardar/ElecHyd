package com.eaton.electricalhydraulic.DataProvider;

import org.testng.annotations.DataProvider;

import com.eaton.electricalhydraulic.TestBase.TestBase;

public class AddAccountDataProvider extends TestBase {

	public AddAccountDataProvider() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@DataProvider
	public Object[][] addAccountDataProvider() throws Exception
	{
		Object[][] data=dataProvider("Add Account");
		return data;
	}
}
