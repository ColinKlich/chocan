package JUnit;

import org.junit.Test;

import controllers.AccountsController;
import controllers.ProviderController;
import services.Service;
import services.ProviderDirectory;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.Scanner;

public class KaraMoranTest {
    ProviderDirectory providerDirectory;
    AccountsController accounts;
    ProviderController providerController;
    Scanner scanner = new Scanner(System.in);


    @Before
    public void setUp() throws Exception {

        accounts.addMember("Kara Moran", 123456, "myAddress", "myCity", "myState", 35404);

    }

    @Test
    public void requestProviderDirectoryTest(ProviderDirectory providerDirectory) {
        assertEquals(true, providerDirectory.printDirectory());
    }

    @Test
    public void validateMemberTest(AccountsController accounts) {
        assertEquals(true, providerController.validateMember(accounts, scanner));
    }

    @Test 
    public void testServiceGetName(){
        Service service = new Service("Service 1", 123456, 100);
        assertEquals("Service1", service.getName());
    }
}
