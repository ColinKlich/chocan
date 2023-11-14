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
        ServiceProvided service2 = new ServiceProvided("Excercise", "02-19-2004", 12346, "Caleb Dochow", 12158, 12345, "Hai Hoang", 12, null);
        ServiceProvided service3 = new ServiceProvided("Therapy", "02-19-2005", 12347, "Kara Moran", 60246, 12345, "Hai Hoang", 12, null);
        prov1.addServicesProvided(service1);
        prov2.addServicesProvided(service2);
        prov3.addServicesProvided(service3);
        providerList.add(prov1);
        providerList.add(prov2);
        providerList.add(prov3);
    }
}