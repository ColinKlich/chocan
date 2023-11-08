package Reports;
import accounts.Provider;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SummaryReport {

    private static List<Class<Provider>> providerList = new ArrayList<>();
    private static int totalProviders = providerList.size();
    private static int totalConsultations;
    private static int overallFeeTotal;

    public SummaryReport (){
        
    }

    private static String formatReport(){
        String formattedReport = "";

        return formattedReport;
    }

    public static void print(){

        String formattedReport = formatReport();

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
