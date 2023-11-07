package Reports;
import accounts.Member;

public class MemberReport{

    static String memberName;
    static int memberNumber;
    static String address;
    static String city;
    static String state;
    static int zipCode;

    public void MemberReport(Member member){
        memberName = member.getName();
		memberNumber = member.getNumber();
        address = member.address;
        city = member.city;
        state = member.state;
        zipCode = member.zipCode;
    }

    public static void print(){

    }
}
