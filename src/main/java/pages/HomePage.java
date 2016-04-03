package pages;

import testcases.TC01_Login;
import utils.Reporter;
import wrappers.OpentapsWrappers;

public class HomePage extends OpentapsWrappers{

	public HomePage() {

		if(!verifyTitle("Opentaps Open Source ERP + CRM"))
		{
			Reporter.reportStep("This is not Home Page", "FAIL");
		}
		// TODO Auto-generated constructor stub
	}	

	public CrmsfaPage clickCRMSFA()
	{
		clickByLink("CRM/SFA");
		return new CrmsfaPage();
			}
	
	//public LoginPage clickLogOut() {

	//	clickByClassName("decorativeSubmit");
	//	return new LoginPage();}

	}
















