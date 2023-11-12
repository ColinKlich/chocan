package Terminals;

import accounts.Provider;
import controllers.AccountsController;
import controllers.ProviderController;
import java.util.Objects;
import java.util.Scanner;
//GOAL: Need to create a validate member function for the provider terminal
public class ProviderTerminal {
    private boolean verified = false;

    Scanner scanner = new Scanner(System.in);
    Provider admin = new Provider("admin", 123456789, "address", "city", "state", 12345);

    ProviderTerminal(AccountsController accounts){
        boolean running = true;
        while (running) {
            System.out.println("Provider Terminal");
            System.out.println("[1] Login");
            System.out.println("[Quit] Return to Main Menu");
            String terminal = scanner.nextLine();

            if (Objects.equals(terminal, "1")) {
                verified = verifyProvider(admin);
                if (verified) {
                	ProviderController controller = new ProviderController();
                    System.out.println("Provider Terminal");
                    System.out.println("[1] Bill ChocAn");
                    System.out.println("[2] Validate Member");
                    System.out.println("[3] Request Provider Directory");
                    System.out.println("[Quit] Return to Main Menu");

                    String choice = scanner.nextLine();
                    if (Objects.equals(choice, "1")) {
                    	//int billingAmount = 0;
                    	//System.out.println("How much would you like to Bill ChocAn? (Input a valid integer amount.)");
                    	//billingAmount = scanner.nextInt();
                        controller.billChocAn();
                    } else if (Objects.equals(choice, "2")) {
                       controller.validateMember();
                    }
                    else if (Objects.equals(choice, "3")) {
                        controller.requestProviderDirectory();
                    }
                     else if (Objects.equals(choice.toLowerCase(), "quit")){
                        running = false;
                    }
                }
            }
        }
    }

    public boolean verifyProvider(Provider admin) {
        System.out.println("Enter Provider Number:");
        String providerNum = scanner.nextLine();

        if (Objects.equals(Integer.toString(admin.getNumber()), providerNum)) {
            return true;
        } else {
            System.out.println("Incorrect Provider Number.");
            return false;
        }
    }
    
}
