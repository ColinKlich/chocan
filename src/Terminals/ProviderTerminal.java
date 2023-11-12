package terminals;

import accounts.Provider;
import controllers.AccountsController;
import controllers.ProviderController;
import java.util.Objects;
import java.util.Scanner;

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

                    System.out.println("Provider Terminal");
                    System.out.println("[1] Bill ChocAn");
                    System.out.println("[2] Validate Member");
                    System.out.println("[3] Request Provider Directory");
                    System.out.println("[Quit] Return to Main Menu");

                    String choice = scanner.nextLine();
                    if (Objects.equals(choice, "1")) {
                        billChocAn();
                    } else if (Objects.equals(choice, "2")) {
                        validateMember(accounts);
                    }
                    else if (Objects.equals(choice, "3")) {
                        requestProviderDirectory();
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
