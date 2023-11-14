//@Author Caleb Dochow
package JUnit;

import static org.junit.Assert.*;
import services.*;
import accounts.*;
import controllers.AccountsController;
import terminals.*;
import utilities.Members;
import utilities.Providers;
import java.util.List;

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
	List<Service> services;

    @Before
    public void setUp() throws Exception {
        member = new Member("John Doe",123456789,"123 1st Street","Tuscaloosa","AL",12345);

        accounts = new AccountsController();
        managerTerminal = new ManagerTerminal(accounts);
        admin = new Manager("admin", "admin", "testing123");

        providers = new Providers();
        provider = providers.providerList.get(0);
        providerTerminal = new ProviderTerminal(accounts, services);
    }

    @Test
    public void verifyManagerTest() {
        assertTrue(managerTerminal.verifyManager(admin));
    }

    @Test
    public void verifyProviderTest() {
        assertTrue(providerTerminal.verifyProvider(accounts));
    }

    @Test
    public void getZipCodeTest() {
        // Assuming getZipCode() returns a String, you should compare it with a String value.
        assertEquals("12345", member.getZipCode());
    }
}
