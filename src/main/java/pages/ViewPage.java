package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewPage extends OpentapsWrappers {
	
	public EditPage clickEdit()
	{
		clickByLink("Edit");
		
		return new EditPage();
		
	}
	
	public void ClickDelete()
	{
		clickByLink("Delete");
	}
	
	public ViewPage() {

		if(!verifyTitle("View Lead | opentaps CRM"))
		{
			Reporter.reportStep("This is not View Page", "FAIL");
		}
		// TODO Auto-generated constructor stub
	}

}
