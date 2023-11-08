package terminals;

import controllers.AccountsController;

public class MainTerminal {
    public static ManagerTerminal managerTerminal = new ManagerTerminal();
    public static OperatorTerminal operatorTerminal = new OperatorTerminal();
    public static ProviderTerminal providerTerminal = new ProviderTerminal();
    public static AccountsController accountsInformation = new AccountsController();

    
}
