package terminals;

import java.io.IOException;
import java.text.ParseException;
import java.util.Objects;
import java.util.Scanner;
import controllers.AccountsController;

public class MainTerminal {
    public static AccountsController accounts = new AccountsController();

    public static void main(String[] args) throws ParseException, IOException {
        //accounts.readMemberData();
        //accounts.readProviderData();
        boolean running = true;
        while (running) {
            Scanner terminalInput = new Scanner(System.in);
            System.out.println("Welcome to ChocAn!");
            System.out.println("Please Choose a Terminal:");
            System.out.println("[1] Provider Terminal");
            System.out.println("[2] Manager Terminal");
            System.out.println("[3] Operator Terminal");
            System.out.println("[4] Run Main Accounting Procedure");
            System.out.println("[End] Close ChocAn");
            String terminal = terminalInput.nextLine();

            if (Objects.equals(terminal, "1")) {
                ProviderTerminal(accounts);
            } else if (Objects.equals(terminal, "2")) {
                ManagerTerminal(accounts);
            } else if (Objects.equals(terminal, "3")) {
                OperatorTerminal(accounts);
            } else if (Objects.equals(terminal, "4")) {
                runMainAccountingProcedure(accounts);
            } else {
                //accounts.storeMemberData();
                //accounts.storeProviderData();
                running = false;
                System.out.println("Have a Great Day!!!");
            }
        }


    }
}

