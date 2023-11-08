package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ServiceProvided {
    private String currentDateTime;
    private String serviceDate;
    private int providerNumber;
    private String providerName;
    private int memberNumber;
    private int serviceCode;
    private String comments;
    private String serviceName;
    private int fee;

    public ServiceProvided(String serviceName, String serviceDate, int serviceCode, String providerName, int providerNum, int memberNum, String memberName, int fee, String comments){
        LocalDate date = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-DD-YY HH:MM:SS");
        this.currentDateTime = date.format(format);
        this.serviceDate = serviceDate;
        this.providerNumber = providerNum;
        this.memberNumber = memberNum;
        this.serviceCode = serviceCode;
        this.comments = comments;
        this.fee = fee;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getServiceName() {
        return serviceName;
    }
}
