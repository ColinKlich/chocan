package services;

import java.util.ArrayList;
import java.util.List;

public class ProviderDirectory {
    public List<Service> services;

    public ProviderDirectory(){
        this.services =  new ArrayList<Service>();
        Service s1 = new Service("aerobics exercise session", 883948, 30);
        Service s2 = new Service("session with a dietician", 598470, 50);
        this.services.add(s1);
        this.services.add(s2);
    }

    public void printDirectory() {
        for (int i = 0; i < services.size(); i++) {
            System.out.println(services.get(i).getName());
        }
    }
}
