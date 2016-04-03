package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC02_DeleteLead extends OpentapsWrappers {
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC02_CreateLead";
		testCaseName 	= "TC02 - CreateLead (POM)";
		testDescription = "CreateLead to Opentaps using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord,String companyName,String fname,String lname) {

		new LoginPage()
		.enterUsername(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickCreateLead()
		.EnterCompanyName(companyName)
		.EnterFirstName(fname)
		.EnterLastName(lname)
		.clickCreateLead();
		
		
	}
}
