package pages;

import wrappers.OpentapsWrappers;

public class EditPage extends OpentapsWrappers {
	
	public EditPage editDescription(String data)
	{
		
		enterById("updateLeadForm_description", data);
		return this;
		
	}
	

	public ViewPage clickUpdate()
	{
		clickByClassName("smallSubmit");
		return new ViewPage() ;
	}
	
}
