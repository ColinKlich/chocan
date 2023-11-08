package Reports;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import accounts.Member;

public class MemberReport{

    private String memberName;
    private int memberNumber;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String formattedReport;

    public MemberReport(Member member){
        this.memberName = member.getName();
		this.memberNumber = member.getNumber();
        this.address = member.getAddress();
        this.city = member.getCity();
        this.state = member.getState();
        this.zipCode = member.getZipCode();

        formattedReport = 
        "Member Name: " + memberName + '\n' +
        "Member Number: " + memberNumber + '\n' +
        "Member Street Address: " + address + '\n' +
        "Member City: " + city + '\n' +
        "Member State: " + state + '\n' +
        "Member Zip Code: " + zipCode + '\n' + 
        "Services Provided: " + '\n';
    }

    public void print(){

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
