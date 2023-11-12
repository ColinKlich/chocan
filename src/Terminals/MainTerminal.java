package terminals;

import java.io.IOException;
import java.text.ParseException;
import java.util.Objects;
import java.util.Scanner;
import controllers.AccountsController;
import services.ProviderDirectory;

public class MainTerminal {
    public static AccountsController accounts = new AccountsController();
    public static ProviderDirectory providerDirectory = new ProviderDirectory();

    public static void main(String[] args) throws ParseException, IOException {
        createData();
        Scanner terminalInput = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("Welcome to ChocAn!");
            System.out.println("Please Choose a Terminal:");
            System.out.println("[1] Provider Terminal");
            System.out.println("[2] Manager Terminal");
            System.out.println("[3] Operator Terminal");
            System.out.println("[4] Run Main Accounting Procedure");
            System.out.println("[End] Close ChocAn");
            String terminal = terminalInput.nextLine();

            if (Objects.equals(terminal, "1")) {
                new ProviderTerminal(accounts);
            } else if (Objects.equals(terminal, "2")) {
                new ManagerTerminal(accounts);
            } else if (Objects.equals(terminal, "3")) {
                new OperatorTerminal(accounts);
            } else if (Objects.equals(terminal, "4")) {
                runMainAccountingProcedure(accounts);
            } else {
                running = false;
                System.out.println("Have a Great Day!!!");
            }
            
        }
        terminalInput.close();


    }

	private static void createData() {
        providerDirectory.addService("session with a dietician", 598470, 50);
        providerDirectory.addService("aerobics exercise session", 88394, 30);
    }

    private static void runMainAccountingProcedure(AccountsController accounts) {
		// TODO Auto-generated method stub
		
	}
}

