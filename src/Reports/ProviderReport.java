package Reports;
import accounts.Provider;
import java.io.*;
import java.util.*;

public class ProviderReport {

	static private String providerName;
	static private int providerNumber;
	static private String address;
	static private String city;
	static private String state;
	static private int zipCode;
	static private List<Class<?>> servicesProvided = new ArrayList<>();
	static private int numberOfConsultations;
	static private int totalFees;
    
    //Constructor for the ProviderReport class
	public ProviderReport (Provider provider){
	    providerName = provider.getName();
		providerNumber = provider.getNumber();
        address = provider.getAddress();
        city = provider.getCity();
        state = provider.getState();
        zipCode = provider.getZipCode();
        numberOfConsultations = provider.getNumberOfConsultations();
        totalFees = provider.getTotalFees();
	}

    //Formats all relevant info into a printable report 
    private static String formatReport(){
        String formattedReport = 
        "Provider Name: " + providerName + '\n' +
        "Provider Number: " + providerNumber + '\n' +
        "Provider Street Address: " + address + '\n' +
        "Provider City: " + city + '\n' +
        "Provider State: " + state + '\n' +
        "Provider Zip Code: " + zipCode + '\n' + 
        "Services Provided: " + '\n' + 
        "Total number of Consultations with Members: " + numberOfConsultations + '\n' +
        "Total Fee for the Week" + totalFees;

        return formattedReport;
    }

    //Uses the formatted report for the given provider and writes it to the ProviderReport.txt file
	public static void print(){

        String formattedReport = formatReport();

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
