package services;

import java.util.List;

public class ProviderDirectory {
    private List<Service> services;

    public ProviderDirectory(){
        
    }

    public void printDirectory() {
        for (int i = 0; i < services.size(); i++) {
            System.out.println(services.get(i).getName());
        }
    }
}
