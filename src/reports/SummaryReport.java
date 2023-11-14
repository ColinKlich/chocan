/*
 * @Author Chris Hellen
 */

package reports;
import accounts.Provider;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SummaryReport {
    private int totalProviders;
    private int totalConsultations;
    private int overallFeeTotal;
    private String formattedReport;
    private String currDate;

    public SummaryReport (List<Provider> providerList){

        LocalDate date = LocalDate.now(); 
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        currDate = date.format(format);

        this.totalProviders = providerList.size();
        for (Provider provider : providerList){
            this.totalConsultations += provider.getNumberOfConsultations();
        }
        for (Provider provider : providerList){
            this.overallFeeTotal += provider.getTotalFees();
        }

        for (Provider provider : providerList){
            this.formattedReport += 
            "Provider: " + provider.getName() + '\n' +
            "\tNumber of Consultations: " + provider.getNumberOfConsultations() + '\n' +
            "\tTotal Fee: " + provider.getTotalFees() + '\n' + '\n';
        }

        this.formattedReport += 
        "Total number of Providers: " + totalProviders + '\n' +
        "Total number of Consultations: " + totalConsultations + '\n' +
        "Overall Total Fee: " + overallFeeTotal;
    }

    public boolean print(){
        File report = new File("SummaryReport" + currDate + ".txt");

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
    
    public void getSummaryReport(int reportNumber) {
    	//SummaryReport report;
    	//4 reports filled with sample info to test functionality
    	
    	if (reportNumber == 1) {
    		System.out.println("Summary Report 11/10/2023");
    		System.out.println("Provider: Doug Sniffmeister. Number of Consultations: 35. Total Fee: $3456");
    		System.out.println("Provider: Pig  Oinkfarmer. Number of Consultations: 25. Total Fee: $345");
    		System.out.println("Provider: Bobby Wasabi. Number of Consultations: 10. Total Fee: $10000");
    		System.out.println("Provider: Elon Musk. Number of Consultations: 1. Total Fee: $55");
    		System.out.println("Total Number of Providers: 4");
    		System.out.println("Total Number of Consultations: 71");
    		System.out.println("Overall Total Fee: $13856");
    		
    	}
    	else if (reportNumber == 2) {
    		System.out.println("Summary Report 9/20/2023");
    		System.out.println("Provider: Big Fish. Number of Consultations: 10. Total Fee: $50");
    		System.out.println("Provider: Freddy Fazbear. Number of Consultations: 10. Total Fee: $300");
    		System.out.println("Provider: Ben Shapiro. Number of Consultations: 5. Total Fee: $100");
    		System.out.println("Provider: Doc McStuffins. Number of Consultations: 1. Total Fee: $50");
    		System.out.println("Total Number of Providers: 4");
    		System.out.println("Total Number of Consultations: 26");
    		System.out.println("Overall Total Fee: $500");
    		
    	}
    	else if (reportNumber == 3) {
    		System.out.println("Summary Report 9/1/2023");
    		System.out.println("Provider: Grunkle Stan. Number of Consultations: 50. Total Fee: $500");
    		System.out.println("Provider: Bill Nye. Number of Consultations: 50. Total Fee: $300");
    		System.out.println("Provider: Doctor Who. Number of Consultations: 7. Total Fee: $1000");
    		System.out.println("Provider: Illidan Stormrage. Number of Consultations: 50. Total Fee: $500");
    		System.out.println("Total Number of Providers: 4");
    		System.out.println("Total Number of Consultations: 157");
    		System.out.println("Overall Total Fee: $2300");
    		
    	}
    	else if (reportNumber == 4) {
    		System.out.println("Summary Report 4/5/2023");
    		System.out.println("Provider: Stuart R. Bell. Number of Consultations: 20. Total Fee: $5000");
    		System.out.println("Provider: Lego City. Number of Consultations: 50. Total Fee: $300");
    		System.out.println("Provider: Jeff Bezos. Number of Consultations: 25. Total Fee: $1000");
    		System.out.println("Provider: LeBron James. Number of Consultations: 50. Total Fee: $500");
    		System.out.println("Total Number of Providers: 4");
    		System.out.println("Total Number of Consultations: 145");
    		System.out.println("Overall Total Fee: $6800");
    		
    	}
    	return ;
    }
}
