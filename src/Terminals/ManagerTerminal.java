package Terminals;

import accounts.Manager;
import controllers.AccountsController;
import controllers.ManagerController;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Objects;
import java.util.Scanner;

import Reports.MemberReport;
import Reports.ProviderReport;
import Reports.SummaryReport;

public class ManagerTerminal {
    private boolean verified = false;

    Scanner scanner = new Scanner(System.in);
    Manager admin = new Manager("admin", "admin", "testing123");

    ManagerTerminal(AccountsController accounts){
        boolean running = true;
        while (running) {
            System.out.println("Operator Terminal");
            System.out.println("[1] Login");
            System.out.println("[Quit] Return to Main Menu");
            String terminal = scanner.nextLine();

            if (Objects.equals(terminal, "1")) { //LOGIN
                verified = verifyManager(admin);
                if (verified) {

                    System.out.println("Manager Terminal");
                    System.out.println("[1] Generate Reports");
                    System.out.println("[Quit] Return to Main Menu");
                    String choice = scanner.nextLine();

                    if (Objects.equals(choice, "1")) { //GENERATE REPORTS
                        generateReports(accounts);
                    } else {
                        running = false;
                    }
                }
            }else if(Objects.equals(terminal, "quit")){ //QUIT
                running = false;;
            }
        }
    }

    public boolean verifyManager(Manager admin) {
        System.out.println("Enter Username:");
        String username = scanner.nextLine();

        System.out.println("Enter Password:");
        String password = scanner.nextLine();

        if (Objects.equals(admin.getUsername(), username)
                && Objects.equals(admin.getPassword(), password)) {
            return true;
        } else {
            System.out.println("Incorrect Username or Password.");
            return false;
        }
    }

    public void generateReports(ManagerController reportInformation) {
        boolean running = true;
        while (running) {
            // Display report options
            System.out.println("Generate Reports");
            System.out.println("[1] Get ALL Reports");
            System.out.println("[2] Get Provider Report");
            System.out.println("[3] Get Member Report");
            System.out.println("[4] Get Summary Report");
            System.out.println("[Quit] Return to Manager Menu");

            // Get user input
            String choice = scanner.nextLine();

        }
    }

}
