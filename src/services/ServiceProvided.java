package services;

public class ServiceProvided {
    private Date currentDateTime = now();
    private Date serviceDate;
    private int providerNumber;
    private int memberNumber;
    private int serviceCode;
    private String comments;

    public ServiceProvided(Date serviceDate, int providerNum, int memberNum, int serviceCode, String comments){
        this.serviceDate = serviceDate;
        this.providerNumber = providerNum;
        this.memberNumber = memberNum;
        this.serviceCode = serviceCode;
        this.comments = comments;
    }
}
