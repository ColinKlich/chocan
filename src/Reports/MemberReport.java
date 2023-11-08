package reports;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import accounts.Member;

public class MemberReport{

    static private String memberName;
    static private int memberNumber;
    static private String address;
    static private String city;
    static private String state;
    static private int zipCode;
    static private List<Class<?>> servicesProvided = new ArrayList<>();

    public MemberReport(Member member){
        memberName = member.getName();
		memberNumber = member.getNumber();
        address = member.getAddress();
        city = member.getCity();
        state = member.getState();
        zipCode = member.getZipCode();
    }

    private static String formatReport(){
        String formattedReport = 
        "Provider Name: " + memberName + '\n' +
        "Provider Number: " + memberNumber + '\n' +
        "Provider Street Address: " + address + '\n' +
        "Provider City: " + city + '\n' +
        "Provider State: " + state + '\n' +
        "Provider Zip Code: " + zipCode + '\n' + 
        "Services Provided: " + '\n';

        return formattedReport;
    }

    public static void print(){

        String formattedReport = formatReport();

        try {
            File report = new File("MemberReport.txt");
            if (report.createNewFile()) {
                System.out.println("File created: " + report.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("MemberReport.txt");
            writer.write(formattedReport);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	}
}
