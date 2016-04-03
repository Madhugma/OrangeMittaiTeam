package pages;

import wrappers.OpentapsWrappers;

public class FindLeadPage extends OpentapsWrappers{

	
	public FindLeadPage ClickFindLeads() {
		clickByLink("Find Leads");
		return new FindLeadPage();
	}

	public FindLeadPage EnterFirstname(String Data){
		enterByxpath("(//input[@name='firstName'])[3]", Data);
		return this;
	}

	public FindLeadPage ClickFindLEadsButton(){
		clickByXpath("(//button[@class='x-btn-text'])[7]");
		return this;
	}

	public ViewPage ClickSearchLink(){
		clickByXpath("//table[@class='x-grid3-row-table']/tbody/tr/td[2]/div/a");
		return new ViewPage();
	}
}
