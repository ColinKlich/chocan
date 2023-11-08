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
	 * 
	 */
	ManagerTerminal terminal;
	MemberReport memberReport;
	ProviderReport providerReport;
	SummaryReport summaryReport;
	
	public ManagerController() {
		terminal = new ManagerTerminal();
	}
	
	public void getAllReports() {
		summaryReport = new SummaryReport(12345);
		//Create a new summary report constructor that takes in integers and finds some dummy data
		//Put the dummy data in summary report
		//Take in user input to decide what report.
		// static get method would print out all the stuff
		//SummaryReport newReport = SummaryReport.Get(Input)
		//newReport.print()
		summaryReport.print();
		memberReport = new MemberReport(null);
		memberReport.print();
		providerReport = new ProviderReport(null);
		providerReport.print();
		
		
		
		return;
	}
	
	public void getMemberReport() {
		
		return;
	}
	
	public void getProviderReport() {
		
		
		return;
	}
	
	public void getSummaryReport() {
		
		
		return;
	}
	
	
	


}
