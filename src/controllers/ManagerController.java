package controllers;

import java.util.List;

import accounts.Member;
import accounts.Provider;
import reports.*;
/*
 * @Author Samuel Wisnoff
 */
public class ManagerController{
	//Goal: design a control system designed solely for Managers
	//Objective #1: Need to have a member report retrieval function
	/*
	 * Need to have options so that you can pick what report you want
	 * Needs to access the current state of the report as designed by the Weekly Accounting Procedure
	 * EDIT: Not using the current state of a dynamic report, instead I am using static dummy data gained through the get Method
	 */
	private List<Provider> providerList;
	public List<Member> memberList;
	
	MemberReport memberReport;
	ProviderReport providerReport;
	SummaryReport summaryReport;
	
	public ManagerController(AccountsController accounts) {
		providerList = accounts.getProviders();
		memberList = accounts.getMembers();
		//printSummaryReport();
	}
	
	
	public void printSummaryReport() {
		SummaryReport summary = new SummaryReport();
		summary.print();
	}

	public void printProviderReport(Provider provider) {
		ProviderReport report = new ProviderReport(provider);
		report.print();
	}

	public void printMemberReport(Member member) {
		MemberReport report = new MemberReport(member);
		report.print();
	}

	public void printAllReports(){
	}


	/*public void printAllMemberReports() {
		//List<Member> memberList = accounts.getMembers();
		for(Member member: memberList) {
			printMemberReport(member);
		}
		
	}

	public void printAllProviderReports() {
		//List<Provider> providerList = accounts.getProviders();
		for(Provider provider: providerList) {
			printProviderReport(provider);
		}
		
	}


	public void getAllReports(int reportNum) {
		summaryReport.getSummaryReport(reportNum);
		/*Create a new summary report constructor that takes in integers and finds some dummy data
		Put the dummy data in summary report
		Take in user input to decide what report.
		static get method would print out all the stuff
		SummaryReport newReport = SummaryReport.Get(Input)
		newReport.print();
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
	} */

}
