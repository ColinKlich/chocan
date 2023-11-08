package reports;
import accounts.Provider;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
            "Number of Consultations: " + provider.getNumberOfConsultations() + '\n' +
            "Total Fee: " + provider.getTotalFees() + '\n';
        }

        this.formattedReport += 
        "Total number of Providers: " + totalProviders + '\n' +
        "Total number of Consultations: " + totalConsultations + '\n' +
        "Overall Total Fee: " + overallFeeTotal;
    }

    public void print(){
        File report = new File("SummaryReport" + currDate + ".txt");

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
