package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ServiceProvided {
    private String currentDateTime;
    private String serviceDate;
    private int providerNumber;
    private int memberNumber;
    private int serviceCode;
    private String comments;

    public ServiceProvided(int providerNum, int memberNum, int serviceCode, String comments){
        LocalDate date = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-DD-YY HH:MM:SS");
        this.serviceDate = date.format(format);
        this.providerNumber = providerNum;
        this.memberNumber = memberNum;
        this.serviceCode = serviceCode;
        this.comments = comments;
    }
}
