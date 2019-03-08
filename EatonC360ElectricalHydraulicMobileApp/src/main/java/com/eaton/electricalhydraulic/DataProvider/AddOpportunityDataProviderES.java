package com.eaton.electricalhydraulic.DataProvider;

import org.testng.annotations.DataProvider;

import com.eaton.electricalhydraulic.TestBase.TestBase;

public class AddOpportunityDataProviderES extends TestBase {

	public AddOpportunityDataProviderES() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@DataProvider
	public Object[][] addOpportunityDataProvider() throws Exception
	{
		Object[][] data=dataProvider("Add Opportunity");
		return data;
	}
	
	@DataProvider
	public Object[][] editOpportunityDataProvider() throws Exception
	{
		Object[][] data=dataProvider("Edit Opportunity");
		return data;
	}
}
