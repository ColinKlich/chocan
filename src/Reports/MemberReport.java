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
        address = member.getAddress();
        city = member.getCity();
        state = member.getState();
        zipCode = member.getZipCode();
    }

    public static void print(){

    }
}
