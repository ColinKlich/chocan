package accounts;

public class Operator {
	private String name;
	private String username;
	private String password;

	public Operator(String name, String username, String password){
        this.name = name;
		this.username= username;
		this.password = password;
    }

	public String getOperatorName() {
        return name;
    }

	public void setOperatorCredentials(String username, String password) {
    this.username = username;
	this.password = password;
    }

}