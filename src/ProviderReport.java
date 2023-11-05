import java.util.*;

public class ProviderReport {
    String providerName;
    int providerNumber;
    String providerStreetAddress;
    String providerCity;
    String providerState;
    int providerZip;
    List<ProviderService> servicesProvided = new ArrayList<ProviderService>();
    int totalConsultations;
    int totalFee;
}
