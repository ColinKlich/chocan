//@Author Caleb Dochow
package JUnit;

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import services.*;
import accounts.*;
import controllers.AccountsController;
import terminals.*;
import utilities.Providers;
import java.util.List;

import org.junit.After;
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
		admin = new Manager("admin", "admin", "testing123");
        accounts = new AccountsController();
		member = new Member("John Doe",123456789,"123 1st Street","Tuscaloosa","AL",12345);

       // managerTerminal = new ManagerTerminal(accounts);

    }

    @Test
    public void verifyManagerTest() {
        // Set up System.in to provide the expected inputs
        String input = "admin\n" + "testing123\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());

        // Use setInputSource to provide the custom input source
        managerTerminal.setInputSource(in);

        assertTrue(managerTerminal.verifyManager(admin));
    }

    @Test
    public void verifyProviderTest() {
        assertTrue(providerTerminal.verifyProvider(accounts));
    }

    @Test
    public void getZipCodeTest() {
        assertEquals(12345, member.getZipCode());
    }


}
