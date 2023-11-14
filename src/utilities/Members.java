package utilities;

import java.util.*;
import accounts.Member;
import services.ServiceProvided;

public class Members {
    public List<Member> memberList;
    public Members(){
        this.memberList = new ArrayList<Member>();
        Member mem1 = new Member("Hai Hoang", 12235, "1234 Meadow Ln", "Tuscaloosa", "AL", 12345);
        Member mem2 = new Member("Colin Klich", 12114, "1234 Meadow Ln", "Tuscaloosa", "AL", 12345);
        Member mem3 = new Member("Sam Wisnoff", 12345, "1234 Meadow Ln", "Tuscaloosa", "AL", 12345);
        ServiceProvided service1 = new ServiceProvided("Consultation", "02-19-2003", 12345, "Chris Hellen", 66979, 12345, "Hai Hoang", 12, null);
        ServiceProvided service2 = new ServiceProvided("Excercise", "02-19-2004", 12346, "Caleb Dochow", 12158, 12345, "Hai Hoang", 12, null);
        ServiceProvided service3 = new ServiceProvided("Therapy", "02-19-2005", 12347, "Kara Moran", 60246, 12345, "Hai Hoang", 12, null);
        mem1.addServiceUsed(service1);
        mem2.addServiceUsed(service2);
        mem3.addServiceUsed(service3);
        this.memberList.add(mem1);
        this.memberList.add(mem2);
        this.memberList.add(mem3);
    }
}
