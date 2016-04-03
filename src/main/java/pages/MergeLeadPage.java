package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MergeLeadPage extends OpentapsWrappers {

	public MergeLeadPage() {

		if (!verifyTitle("Merge Leads | opentaps CRM")) {
			Reporter.reportStep("This is not MergeLead Page", "FAIL");
		}
	}

	public MergeLeadPage FromLead(String data) throws InterruptedException {

		clickByXpath("//input[@id='partyIdFrom']/following::img[1]");
		switchToLastWindow();
		enterByname("id", data);
		clickByClassName("x-btn-text");
		Thread.sleep(3000);
		clickByXpath("(//a[@class='linktext'])[1]");
		switchToPrimaryWindow(PrimaryWindow);

		return this;

	}

	public MergeLeadPage toLead(String data) throws InterruptedException {

		clickByXpath("//input[@id='partyIdFrom']/following::img[2]");
		switchToLastWindow();
		enterByname("id", data);
		clickByClassName("x-btn-text");
		Thread.sleep(4000);
		clickByXpath("(//a[@class='linktext'])[1])");
		switchToPrimaryWindow(PrimaryWindow);

		return this;

	}

	public ViewPage mergeButton() {

		clickByName("buttonDangerous");
		acceptAlert();
		return new ViewPage();

	}

}
