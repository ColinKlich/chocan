package utilities;


import services.ServiceProvided;
import accounts.Provider;
import java.util.*;

public class Providers {
    public List<Provider> providerList;

    public Providers(){
        Provider prov1 = new Provider("Chris Hellen", 66979, "1234 Meadow Ln", "Tuscaloosa", "AL", 12345);
        Provider prov2 = new Provider("Caleb Dochow", 12158, "1234 Meadow Ln", "Tuscaloosa", "AL", 12345);
        Provider prov3 = new Provider("Kara Moran", 60246, "1234 Meadow Ln", "Tuscaloosa", "AL", 12345);
        ServiceProvided service1 = new ServiceProvided("Consultation", "02-19-2003", 12345, "Chris Hellen", 66979, 12345, "Hai Hoang", 12, null);
        prov1.
        providerList.add(prov1);
        providerList.add(prov2);
        providerList.add(prov3);
    }
}