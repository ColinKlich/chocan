package JUnit;

import accounts.Provider;
import controllers.ProviderController;
import services.ServiceProvided;
import services.ProviderDirectory;
import terminals.ProviderTerminal;

public class KaraMoranTest {
    //ProviderController providerController;
    ProviderDirectory providerDirectory;

    // test functions bill chocAn and request provider directory
    // test get service code

    // create service to test

    public void setUp() {
        ServiceProvided service = new ServiceProvided("Service1", "11-14-2023", 123456, "Jane Doe", 111111, 222222, "John Doe", 300, "comment");
        ProviderController providerController = new ProviderController();
    }

    private void testBillChocAn() {
        
    }
}
