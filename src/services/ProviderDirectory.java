package services;

import java.util.List;

public class ProviderDirectory {
    private List<Service> services;

    public ProviderDirectory(){
        
    }

    public void printDirectory() {
        System.out.println(services);
    }
}
