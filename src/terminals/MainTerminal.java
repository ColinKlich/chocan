//Colin Klich
package terminals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import accounts.Member;
import accounts.Provider;
import controllers.AccountsController;
import services.Service;

public class MainTerminal {
    public static AccountsController accounts = new AccountsController();
    public static List<Service> providerDirectory = new ArrayList<>();

    public static void main(String[] args) throws ParseException, IOException {
        //imports user accounts
        importData();
        //create services in directory
        providerDirectory.add(new Service("session with a dietician", 598470, 50));
        providerDirectory.add(new Service("aerobics exercise session", 883948, 30));
        Scanner terminalInput = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("Welcome to ChocAn!");
            System.out.println("Please Choose a Terminal:");
            System.out.println("[1] Provider Terminal");
            System.out.println("[2] Manager Terminal");
            System.out.println("[3] Operator Terminal");
            System.out.println("[End] Close ChocAn");
            String terminal = terminalInput.nextLine();

            if (Objects.equals(terminal, "1")) {
                new ProviderTerminal(accounts, providerDirectory);
            } else if (Objects.equals(terminal, "2")) {
                new ManagerTerminal(accounts);
            } else if (Objects.equals(terminal, "3")) {
                new OperatorTerminal(accounts);
            } else {
                running = false;
                storeData();
                System.out.println("Have a Great Day!!!");
            }

        }
        terminalInput.close();


    }

    private static void storeData() {
        List<Member> members = accounts.getMembers();
        for (Member member : members) {
            member.writeToFile();
        }
        List<Provider> providers = accounts.getProviders();
        for (Provider provider : providers) {
            provider.writeToFile();
        }
    }

    private static void importData() throws IOException {
    	String path = System.getProperty("user.dir")+File.separator+"src\\accounts\\accounts_storage\\Member_accounts";
        File dirFile = new File(path);
        File listOfFiles[] = dirFile.listFiles();    	
        for (File file : listOfFiles) {
            try {
                Scanner myReader = new Scanner(file);
                String name = myReader.nextLine();
                int number = Integer.valueOf(myReader.nextLine());
                String address = myReader.nextLine();
                String city = myReader.nextLine();
                String state = myReader.nextLine();
                int zipCode = Integer.valueOf(myReader.nextLine());
                accounts.addMember(name, number, address, city, state, zipCode);
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        

        String path2 = System.getProperty("user.dir")+File.separator+"src\\accounts\\accounts_storage\\Provider_accounts";
        File dirFile2 = new File(path2);
        File listOfFiles2[] = dirFile2.listFiles();    	
        for (File file : listOfFiles2) {
            try {
                Scanner myReader = new Scanner(file);
                String name = myReader.nextLine();
                int number = Integer.valueOf(myReader.nextLine());
                String address = myReader.nextLine();
                String city = myReader.nextLine();
                String state = myReader.nextLine();
                int zipCode = Integer.valueOf(myReader.nextLine());
                accounts.addProvider(name, number, address, city, state, zipCode);
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }


    }
}

