package reports;
import accounts.Provider;
import java.io.*;

public class ProviderReport {

	private String providerName;
	private int providerNumber;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private int numberOfConsultations;
	private int totalFees;
    private String formattedReport;
    
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

        this.formattedReport = 
        "Provider Name: " + providerName + '\n' +
        "Provider Number: " + providerNumber + '\n' +
        "Provider Street Address: " + address + '\n' +
        "Provider City: " + city + '\n' +
        "Provider State: " + state + '\n' +
        "Provider Zip Code: " + zipCode + '\n' + 
        "Services Provided: " + '\n' + 
        "Total number of Consultations with Members: " + numberOfConsultations + '\n' +
        "Total Fee for the Week" + totalFees;
	}

    //Uses the formatted report for the given provider and writes it to the ProviderReport.txt file
	public void print(){

        try {
            File report = new File("ProviderReport.txt");
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
            FileWriter writer = new FileWriter("ProviderReport.txt");
            writer.write(formattedReport);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	}
}
