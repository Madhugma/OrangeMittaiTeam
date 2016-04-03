package pages;

import wrappers.OpentapsWrappers;

public class LeadsPage extends OpentapsWrappers {

	public CreateLeadPage clickonCreateLead()
	{
		clickByLink("Create Lead");
		return new CreateLeadPage();
		
	}
	
	public MergeLeadPage clickonMergeLead()
	{
		clickByLink("Merge Leads");
		return new MergeLeadPage();
		
	}
	
	
	public FindLeadPage clickonFindLead()
	{
		clickByLink("Find Leads");
		return new FindLeadPage();
		
	}
	
	
}
