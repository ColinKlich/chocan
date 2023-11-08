package Terminals;

import accounts.Provider;
import controllers.AccountsController;
import controllers.ProviderController;
import java.util.Objects;
import java.util.Scanner;

public class ProviderTerminal {
    private boolean verified = false;

    Scanner scanner = new Scanner(System.in);
    Provider admin = new Provider("admin", "admin", "testing123"); //NEEDS TO BE ADDED

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
                    System.out.println("[Quit] Return to Main Menu");

                    String choice = scanner.nextLine();
                    if (Objects.equals(choice, "1")) {
                        billChocAn();
                    } else if (Objects.equals(choice, "2")) {
                        validateMember(accounts);
                    } else if (Objects.equals(choice.toLowerCase(), "quit")){
                        running = false;
                    }
                }
            }
        }
    }

    public boolean verifyProvider(Provider admin) {
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
    
}
