package pages;

import org.openqa.selenium.internal.FindsByLinkText;

import testcases.TC01_Login;
import wrappers.OpentapsWrappers;

public class CrmsfaPage extends OpentapsWrappers{
	
	public CreateLeadPage clickCreateLead()
	{
		
		clickByLink("Create Lead");
		return new CreateLeadPage();
		
		
	}
	
	public LeadsPage clickLeadTab()
	{
		
		clickByLink("Leads");
		return new LeadsPage();
		
	}

}
