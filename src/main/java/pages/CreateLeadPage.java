package pages;

import testcases.TC01_Login;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{
	
	
	public CreateLeadPage EnterCompanyName(String data)
	{
		enterById("createLeadForm_companyName", data);
		
		return this;
		
	}
	
	public CreateLeadPage EnterFirstName(String data)
	{
		enterById("createLeadForm_firstName", data);
		
		return this;
		
	}
	
	public CreateLeadPage EnterLastName(String data)
	{
		enterById("createLeadForm_lastName", data);
		
		return this;
		
	}
	
	public CreateLeadPage clickCreateLead()
	{
		clickByClassName("smallSubmit");
		
		return this;
		
	}
	
	
	}
	


