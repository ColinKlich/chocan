package reports;
import accounts.Provider;
import services.ServiceProvided;
import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProviderReport {

	private String providerName;
	private int providerNumber;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private int numberOfConsultations;
	private int totalFees;
    private List<ServiceProvided> servicesProvided;
    private String formattedReport;
    private String currDate;
    
    //Constructor for the ProviderReport class
	public ProviderReport (Provider provider){
	    this.providerName = provider.getName();
		this.providerNumber = provider.getNumber();
        this.address = provider.getAddress();
        this.city = provider.getCity();
        this.state = provider.getState();
        this.zipCode = provider.getZipCode();
        this.numberOfConsultations = provider.getNumberOfConsultations();
        this.totalFees = provider.getTotalFees();
        this.servicesProvided = provider.getServicesProvided();

        LocalDate date = LocalDate.now(); 
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        currDate = date.format(format);

        this.formattedReport = 
        "Provider Name: " + providerName + '\n' +
        "Provider Number: " + providerNumber + '\n' +
        "Provider Street Address: " + address + '\n' +
        "Provider City: " + city + '\n' +
        "Provider State: " + state + '\n' +
        "Provider Zip Code: " + zipCode + '\n';

        for (ServiceProvided service :  servicesProvided){
            this.formattedReport += 
            "Date of Service: " + service.getServiceDate() + '\n' +
            "Date and time data were recieved by the computer: " + service.getCurrentDate() + '\n' + 
            "Member Name: " + service.getMemberName() + '\n' + 
            "Member Number: " + service.getMemberNumber() + '\n' + 
            "Service Code: " + service.getServiceCode() + '\n' +
            "Fee to be paid: $" + service.getFee() + '\n';
        }
        
        this.formattedReport += 
        "Total number of Consultations with Members: " + numberOfConsultations + '\n' +
        "Total Fee for the Week" + totalFees;
	}

    //Uses the formatted report for the given provider and writes it to the ProviderReport.txt file
	public boolean print(){
        File report = new File(providerName + currDate + ".txt");

        try {
            FileWriter writer = new FileWriter(report.getName());
            writer.write(formattedReport);
            writer.close();
			return true;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
		return false;
	}
	
	public void getProviderReport(int reportNumber) {
		//selects 1 out of 4 provider reports to be displayed for the manager controller
		
		
		if (reportNumber == 1) {
    		System.out.println("Provider Name: Nick Saban");
    		System.out.println("Provder Number: 654-785-345");
    		System.out.println("Provider Street Address: 1213 University Drive");
    		System.out.println("Provider City: Tuscaloosa");
    		System.out.println("Provider State: Alabama");
    		System.out.println("Provider ZIP Code: 35505");
    		System.out.println("Service: Tennessee Beat-Down. Member Name: Vol Unteer. Date: 08-29-2023. Date and Time data were recieved by Computer: 08-29-2023 12:23:33. "
    				+ "Member Number: 111-161-111. Service Code: 423676. Fee to be paid: $5000");
    		System.out.println("Service: Lousiana Pummeling. Member Name: Tiger Mike. Date: 11-04-2023. Date and Time data were recieved by Computer: 11-04-2023 22:23:33. "
    				+ "Member Number: 811-777-111. Service Code: 451176. Fee to be paid: $5000");
    		System.out.println("Service: Auburn Drop-Kick. Member Name: War Eagle. Date: 11-19-2023. Date and Time data were recieved by Computer: 11-20-2023 01:23:34. "
    				+ "Member Number: 999-111-511. Service Code: 455116. Fee to be paid: $5000");
    		System.out.println("Total Number of Consultations: 3");
    		System.out.println("Total Fee for the Week: $15000");
    		
    	}
    	else if (reportNumber == 2) {
    		System.out.println("Provider Name: Big Al");
    		System.out.println("Provder Number: 838-292-567");
    		System.out.println("Provider Street Address: President's Mansion");
    		System.out.println("Provider City: Tuscaloosa");
    		System.out.println("Provider State: Alabama");
    		System.out.println("Provider ZIP Code: 55676");
    		System.out.println("Service: Spirit of Chocolate. Member Name: Willy Wonka. Date: 03-10-2023. Date and Time data were recieved by Computer: 03-22-2023 15:23:33. "
    				+ "Member Number: 111-111-111. Service Code: 455672. Fee to be paid: $6000");
    		System.out.println("Service: Chocolate Fist Bump. Member Name: Stuart R. Bell. Date: 08-30-2023. Date and Time data were recieved by Computer: 08-29-2023 19:23:33. "
    				+ "Member Number: 191-300-004. Service Code: 455673. Fee to be paid: $6000");
    		System.out.println("Service: Chocolate Trunk. Member Name: Master Cat. Date: 08-10-2023. Date and Time data were recieved by Computer: 08-29-2023 16:23:33. "
    				+ "Member Number: 809-483-984. Service Code: 455671. Fee to be paid: $6000");
    		System.out.println("Total Number of Consultations: 3");
    		System.out.println("Total Fee for the Week: $18000");
    	}
    	else if (reportNumber == 3) {
    		System.out.println("Provider Name: Steve Jobs");
    		System.out.println("Provder Number: 553-789-576");
    		System.out.println("Provider Street Address: 3435 IPad Plane");
    		System.out.println("Provider City: Pasadena");
    		System.out.println("Provider State: California");
    		System.out.println("Provider ZIP Code: 93355");
    		System.out.println("Service: iChocolate. Member Name: Bill Gates. Date: 08-29-2023. Date and Time data were recieved by Computer: 08-29-2023 12:23:33. "
    				+ "Member Numer: 576-343-894. Service Code: 455656. Fee to be paid: $10000");
    		System.out.println("Service: NExT Chocolate. Member Name: Barrack Obama. Date: 08-31-2023. Date and Time data were recieved by Computer: 09-29-2023 12:23:33. "
    				+ "Member Number: 151-151-151. Service Code: 455576. Fee to be paid: $10000");
    		System.out.println("Service: Chocolate Pixar Animation. Member Name: Mike Mentzer. Date: 08-23-2023. Date and Time data were recieved by Computer: 09-29-2023 12:23:33. "
    				+ "Member Number: 333-333-333. Service Code: 455476. Fee to be paid: $10000");
    		System.out.println("Total Number of Consultations: 3");
    		System.out.println("Total Fee for the Week: $30000");
    	}
    	else if (reportNumber == 4) {
    		System.out.println("Provider Name: Mr. T");
    		System.out.println("Provder Number: 654-785-200");
    		System.out.println("Provider Street Address: 100 Street Lane");
    		System.out.println("Provider City: Cityville");
    		System.out.println("Provider State: Stateland");
    		System.out.println("Provider ZIP Code: 33345");
    		System.out.println("Service: Chocolate Sandwich. Member Name: Jimmy Newtron. Date: 08-29-2023. Date and Time data were recieved by Computer: 08-29-2023 12:23:33. "
    				+ "Member Number: 567-345-781. Service Code: 455676. Fee to be paid: $5000");
    		System.out.println("Service: Chocolate Milkshake. Member Name: Bill Clinton. Date: 08-29-2023. Date and Time data were recieved by Computer: 08-29-2023 12:23:33. "
    				+ "Member Number: 539-193-575. Service Code: 412676. Fee to be paid: $5000");
    		System.out.println("Service: Chocolate Burger. Member Name: Xi Jingping. Date: 08-29-2023. Date and Time data were recieved by Computer: 08-29-2023 12:23:33. "
    				+ "Member Number: 477-777-897. Service Code: 300676. Fee to be paid: $5000");
    		System.out.println("Total Number of Consultations: 3");
    		System.out.println("Total Fee for the Week: $15000");
    		
    	}
    	return ;
		
		
	}
}
