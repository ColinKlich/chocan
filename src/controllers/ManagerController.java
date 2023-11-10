package controllers;

import Reports.MemberReport;
import Reports.ProviderReport;
import Terminals.ManagerTerminal;
import Reports.SummaryReport;

public class ManagerController {
	//Goal: design a control system designed solely for Managers
	//Objective #1: Need to have a member report retrieval function
	/*
	 * Need to have options so that you can pick what report you want
	 * Needs to access the current state of the report as designed by the Weekly Accounting Procedure
	 * EDIT: Not using the current state of a dynamic report, instead I am using static dummy data gained through the get Method
	 */
	ManagerTerminal terminal;
	MemberReport memberReport;
	ProviderReport providerReport;
	SummaryReport summaryReport;
	/*
	public ManagerController() {
		terminal = new ManagerTerminal();
	}
	*/
	
	public void getAllReports(int reportNum) {
		summaryReport.getSummaryReport(reportNum);
		//Create a new summary report constructor that takes in integers and finds some dummy data
		//Put the dummy data in summary report
		//Take in user input to decide what report.
		// static get method would print out all the stuff
		//SummaryReport newReport = SummaryReport.Get(Input)
		//newReport.print()
		memberReport.getMemberReport(reportNum);
		providerReport.getProviderReport(reportNum);

		
		
		
		return;
	}
	
	public void getMemberReport(int reportNum) {
		memberReport.getMemberReport(reportNum);
		return;
	}
	
	public void getProviderReport(int reportNum) {
		providerReport.getProviderReport(reportNum);
		
		return;
	}
	
	public void getSummaryReport(int reportNum) {
		summaryReport.getSummaryReport(reportNum);
		
		return;
	}
	
	
	


}
