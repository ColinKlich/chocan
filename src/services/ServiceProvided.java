package services;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServiceProvided {
    private String currentDateTime;
    public String serviceDate;
    private int providerNumber;
    private String providerName;
    private int memberNumber;
    private int serviceCode;
    public String comments;
    private String serviceName;
    private String memberName;
    public int fee;

    public ServiceProvided(String serviceName, String serviceDate, int serviceCode, String providerName, int providerNum, int memberNum, String memberName, int fee, String comments){
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy kk:mm:ss");
        this.currentDateTime = date.format(formatter);
        this.serviceDate = serviceDate;
        this.providerNumber = providerNum;
        this.memberNumber = memberNum;
        this.memberName = memberName;
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.providerName = providerName;
        this.comments = null;
        this.fee = fee;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public int getProviderNumber(){
        return providerNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getCurrentDate() {
        return currentDateTime;
    }

    public int getFee() {
        return fee;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public int getServiceCode() {
        return serviceCode;
    }
}
