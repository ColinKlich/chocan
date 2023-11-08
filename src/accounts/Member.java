package accounts;

public class Member  {
    private String memberName;
    private int memberNumber;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String memberStatus;

    public Member(String name, int memberNumber, String address, String city,  String state, int zipCode){
        this.memberName = name;
        this.memberNumber = memberNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.setMemberStatus("Valid");
    }

    public Member(){
        this.memberName = null;
        this.memberNumber = -1;
        this.address = null;
        this.city = null;
        this.state = null;
        this.zipCode = -1;
        this.setMemberStatus(null);
    }

    public String getName() {
        return memberName;
    }

    public int getNumber() {
        return memberNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

	public String getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
	public void setMemberNumber( int memberNumber) {
        this.memberNumber = memberNumber;
	}
	public void setMemberInformation(String name, String address, String city,  String state, int zipCode) {
		this.memberName = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
	}
	
	public void deleteMember (Member memberDelete) {
		memberDelete = new Member();
		memberDelete = null;
	}
}
