package services;

import java.util.List;

public class ProviderDirectory {
    private List<Service> services;

    public ProviderDirectory(){

    }
    
    public void addService(String name, int code, int fee){
        Service temp = new Service(name, code, fee);
        this.services.add(temp);
    }

    public void deleteService(String name){
        services.removeIf(service -> service.getName().equals(name));
    }
}
