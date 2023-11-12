package reports;
import services.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

import accounts.Member;

public class MemberReport{

    private String memberName;
    private int memberNumber;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private List<ServiceProvided> servicesUsed;
    public String formattedReport;
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
        "Member Zip Code: " + zipCode + '\n';

        for (ServiceProvided service : servicesUsed){
            this.formattedReport +=
            "Date of Service: " + service.getServiceDate() + '\n' +
            "Provider Name: " + service.getProviderName() + '\n' + 
            "Service Name: " + service.getServiceName() + '\n';
        }
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
    
    public void getMemberReport(int reportNumber) {
    	//MemberReport report;
    	//4 reports filled with sample info to test functionality
  
    	if (reportNumber == 1) {
    		System.out.println("Member Name: Timmy Turner");
    		System.out.println("Member Number: 654-785-345");
    		System.out.println("Member Street Address: 1213 Wanda Lane");
    		System.out.println("Member City: Dimmsdale");
    		System.out.println("Member State: California");
    		System.out.println("Member ZIP Code: 74456");
    		System.out.println("Service: Chocolate Pixiedusting. Provider Name: Funky Monkey. Date: 08-29-2023");
    		System.out.println("Service: Chocolate Weight Lifting. Provider Name: Arnold Schwartz. Date: 10-23-2777");
    		System.out.println("Service: Gumdrop Ghost Busting. Provider Name: John Cena. Date: 10-10-2010");
    		
    	}
    	else if (reportNumber == 2) {
    		System.out.println("Member Name: Peter Parker");
    		System.out.println("Member Number: 654-222-345");
    		System.out.println("Member Street Address: 1010 Fifth Avenue");
    		System.out.println("Member City: New York");
    		System.out.println("Member State: New York");
    		System.out.println("Member ZIP Code: 78345");
    		System.out.println("Service: Chocolate Web Addiction. Provider Name: Doc Octavius. Date: 08-23-2023");
    		System.out.println("Service: Chocolate Crime Calligraphy. Provider Name: Professor Oak. Date: 10-12-2022");
    		System.out.println("Service: Object Permanence and Chocolate. Provider Name: Bill Nye. Date: 10-5-2017");
    		
    	}
    	else if (reportNumber == 3) {
    		System.out.println("Member Name: Mark Zuckerburg");
    		System.out.println("Member Number: 100-235-345");
    		System.out.println("Member Street Address: 100 Harvard Lane");
    		System.out.println("Member City: Boston");
    		System.out.println("Member State: Massachusetts");
    		System.out.println("Member ZIP Code: 44321");
    		System.out.println("Service: Facebook Chocolate Algorithms. Provider Name: Shrek Ogre. Date: 02-20-2012");
    		System.out.println("Service: The Chocolate Social Network. Provider Name: Aaron Sorkin. Date: 05-28-2023");
    		System.out.println("Service: Illumninati. Provider Name: Agent Coleson. Date: 08-23-2007");
    		
    	}
    	else if (reportNumber == 4) {
    		System.out.println("Member Name: Professsor Layton");
    		System.out.println("Member Number: 654-722-322");
    		System.out.println("Member Street Address: 5534 Chrono Road");
    		System.out.println("Member City: London");
    		System.out.println("Member State: England");
    		System.out.println("Member ZIP Code: 33334");
    		System.out.println("Service: Chocolate Puzzle Solving. Provider Name: Itachi Uchiha. Date: 08-29-2021");
    		System.out.println("Service: The Mystery of Chocolate. Provider Name: Hairy Styles. Date: 07-29-2003");
    		System.out.println("Service: Cat Snatching, Dog Wrangling, and You: A twelve part series about the Chocolate Indsutry in the 70s. Provider Name: Morgan Freeman. Date: 10-10-2010");
    		
    		
    	}
    	return ;
    
    }
}
