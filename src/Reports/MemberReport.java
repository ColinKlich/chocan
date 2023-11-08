package Reports;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import accounts.Member;

public class MemberReport{

    private String memberName;
    private int memberNumber;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String formattedReport;
    private String currDate;

    public MemberReport(Member member){
        this.memberName = member.getName();
		this.memberNumber = member.getNumber();
        this.address = member.getAddress();
        this.city = member.getCity();
        this.state = member.getState();
        this.zipCode = member.getZipCode();
        LocalDate date = LocalDate.now(); 
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        currDate = date.format(format);

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
        File report = new File(memberName + currDate + ".txt");

        try {
            FileWriter writer = new FileWriter(report.getName());
            writer.write(formattedReport);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	}
}
