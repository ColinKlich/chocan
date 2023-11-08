package reports;
import accounts.Provider;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SummaryReport {
    private int totalProviders;
    private int totalConsultations;
    private int overallFeeTotal;
    private String formattedReport;

    public SummaryReport (List<Provider> providerList){
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

        try {
            File report = new File("SummaryReport.txt");
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
            FileWriter writer = new FileWriter("SummaryReport.txt");
            writer.write(formattedReport);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	}
}
