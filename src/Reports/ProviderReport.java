package Reports;
import accounts.Provider;
import java.io.*;
import java.util.*;

public class ProviderReport {

	static String providerName;
	static int providerNumber;
	static String address;
	static String city;
	static String state;
	static int zipCode;
	static List<Class<?>> servicesProvided = new ArrayList<>();
	static int numberOfConsultations;
	static int totalFees;

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

	public static void print(){

        String formattedReport = formatReport();

        try {
            File file = new File("ProviderReport.txt");
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter("ProviderReport.txt");
                writer.write(formattedReport);
                writer.close();
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }   
	}
}
