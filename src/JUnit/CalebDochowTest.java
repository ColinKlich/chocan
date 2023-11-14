//@Author Caleb Dochow
package JUnit;

import static org.junit.Assert.*;

import java.util.Scanner;

import accounts.*;
import controllers.AccountsController;
import terminals.*;
import utilities.Providers;

import org.junit.Before;
import org.junit.Test;

public class CalebDochowTest {
	
	Manager admin;
	ManagerTerminal managerTerminal;
	AccountsController accounts;
	Provider provider;
	ProviderTerminal providerTerminal;
	Member member;
	Providers providers;

	@Before
	public void setUp() throws Exception {
		accounts = new AccountsController();
        managerTerminal = new ManagerTerminal(accounts);
		admin = new Manager("admin", "admin", "testing123");
		providers = new Providers();
		provider = providers.providerList.get(0);
	}

	@Test
	public void verfiyManagerTest() {
        assertTrue(managerTerminal.verifyManager(admin));
	}

	@Test
	public void verifyProviderTest() {
		assertTrue(providerTerminal.verifyProvider(accounts));
	}
	
	@Test
	public void getZipCodeTest() {
		assertEquals("Jane Doe", member.getZipCode());
	}
	

}
