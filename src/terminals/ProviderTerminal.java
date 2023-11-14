//@Author Caleb Dochow
package terminals;

import accounts.Provider;
import controllers.AccountsController;
import controllers.ProviderController;
import services.Service;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
//GOAL: Need to create a validate member function for the provider terminal
public class ProviderTerminal {
    private boolean verified = false;

    Scanner scanner = new Scanner(System.in);
    //Provider admin = new Provider("admin", 123456789, "address", "city", "state", 12345);

    ProviderTerminal(AccountsController accounts, List<Service> providerDirectory){
        boolean running = true;
        while (running) {
            System.out.println("Provider Terminal");
            System.out.println("[1] Login");
            System.out.println("[Quit] Return to Main Menu");
            String terminal = scanner.nextLine();

            if (Objects.equals(terminal, "1")) {
                verified = verifyProvider(accounts);
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
                        controller.billChocAn(accounts);
                    } else if (Objects.equals(choice, "2")) {
                       controller.validateMember(accounts);
                    }
                    else if (Objects.equals(choice, "3")) {
                        controller.requestProviderDirectory(providerDirectory);
                    }
                     else if (Objects.equals(choice.toLowerCase(), "quit")){
                        running = false;
                    }
                }
            }else if (Objects.equals(terminal.toLowerCase(), "quit")){
                        running = false;
            }
        }
    }

    public boolean verifyProvider(AccountsController accounts) {
        boolean found = false;
        System.out.println("Enter Provider Number:");
        int providerNum = scanner.nextInt();
        List<Provider> providers = accounts.getProviders();
        for(Provider temp: providers){
            if(temp.getNumber() == providerNum){
                found = true;
            }
        }
        if (found) {
            return true;
        } else {
            System.out.println("Incorrect Provider Number.");
            return false;
        }
    }
    
}
