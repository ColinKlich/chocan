package JUnit;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import accounts.Provider;
import controllers.AccountsController;
import controllers.ManagerController;
import reports.SummaryReport;
import services.Service;
import services.ServiceProvided;
import utilities.Providers;

public class SamuelWisnoffTest {
	ManagerController managerController;
	AccountsController accounts;
	//private List<Provider> providerList;
	SummaryReport summaryReport;
	Provider provider;
	Providers providers;
	ServiceProvided serviceProvided;
	Service service;
	
	//list all of the classes you need
	//Testing for ManagerController and Provider Terminal
	@Before
	public void setUp() throws Exception {
		accounts = new AccountsController();
		managerController = new ManagerController(accounts);
		providers = new Providers();
		service = new Service("Cleaning", 50, 5);
		provider = providers.providerList.get(0);
		accounts.addProvider("Samuel Wisnoff", 123455, "Monkey Lane", "Monkey Town", "MN", 44555);
		serviceProvided = new ServiceProvided(service, "11-20-11 11:11:11", "yaya", 50, 50, "juniper", "George");
		summaryReport = new SummaryReport(providers.providerList);;
	}

	@Test
	public void printSummaryReportTest() {
		assertEquals(true, summaryReport.print());
	}
	
	@Test
	public void validateMembersTest() {
		
	}
	

}
