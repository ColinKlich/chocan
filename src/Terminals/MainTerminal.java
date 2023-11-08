package terminals;

import controllers.AccountsController;

public class MainTerminal {
    public static AccountsController accounts = new AccountsController();
    public static ManagerTerminal managerTerminal = new ManagerTerminal();
    public static OperatorTerminal operatorTerminal = new OperatorTerminal(accounts);
    public static ProviderTerminal providerTerminal = new ProviderTerminal();

    MainTerminal(){
        
    }
}
