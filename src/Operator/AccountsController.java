package Operator;

public class AccountsController {
    private List<Member> members;
    private List<Provider> providers;

    public AccountsController(){
        this.members = new ArrayList<Member>();
        this.providers = new ArrayList<Provider>();
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Provider> getProviders() {
        return providers;
    }
}
