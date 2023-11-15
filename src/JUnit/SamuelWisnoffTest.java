package JUnit;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import accounts.Member;
import accounts.Provider;
import controllers.AccountsController;
import controllers.ManagerController;
import reports.ProviderReport;
import reports.SummaryReport;
import services.Service;
import services.ServiceProvided;
import terminals.ProviderTerminal;
import utilities.Providers;

public class SamuelWisnoffTest {
	ManagerController managerController;
	AccountsController accounts;
	//private List<Provider> providerList;
	SummaryReport summaryReport;
	ProviderReport providerReport;
	Provider provider;
	Providers providers;
	ServiceProvided serviceProvided;
	Service service;
	
	
	Member member;
	
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
		summaryReport = new SummaryReport(providers.providerList);
		providerReport = new ProviderReport(provider);
		
		member = new Member("Bobby", 564578 , "Bob Lane", "BobTown",  "California", 35054);
		
	}

	@Test
	public void printSummaryReportTest() {
		assertEquals(true, summaryReport.print());
	}
	
	@Test
	public void getStateTest() {
		assertEquals("California", member.getState());
	}
	@Test
	public void printProviderReportTest() {
        assertEquals(true, providerReport.print());
    }   
	

}
