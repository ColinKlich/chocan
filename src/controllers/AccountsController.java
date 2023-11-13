package controllers;

import accounts.*;
import java.util.List;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountsController {
    private List<Member> members;
    private List<Provider> providers;
    Scanner myObj = new Scanner(System.in);

    public AccountsController() {
        this.members = new ArrayList<Member>();
        this.providers = new ArrayList<Provider>();
    }

    public List<Member> getMembers() {
        return members;
    }

    public Member getMember(int memberNumber) {
        for (Member member : members) {
            if (member.getNumber() == memberNumber) {
                return member;
            }
        }
        return new Member();
    }

    public Provider getProvider(int providerNumber) {
        for (Provider provider : providers) {
            if (provider.getNumber() == providerNumber) {
                return provider;
            }
        }
        return new Provider();
    }

    public List<Provider> getProviders() {
        return providers;
    }

    public void addMember(String memberName, int memberNumber, String address, String city,
            String state, int zipCode) {
        Member member = new Member(memberName, memberNumber, address, city, state, zipCode);
        this.members.add(member);
    }

    public void addProvider(String providerName, int providerNumber, String address, String city,
            String state, int zipCode) {
        Provider provider =
                new Provider(providerName, providerNumber, address, city, state, zipCode);
        this.providers.add(provider);
    }

    public void deleteMember(String name) {
        members.removeIf(member -> member.getName().equals(name));
    }

    public void deleteProvider(String name) {
        providers.removeIf(provider -> provider.getName().equals(name));
    }

    public void createMember() {
        System.out.println("Member Name: ");
        String name = myObj.nextLine();
        System.out.println("Member Number: ");
        int number = Integer.valueOf(myObj.nextLine());
        System.out.println("Member Street Address: ");
        String address = myObj.nextLine();
        System.out.println("Member City: ");
        String city = myObj.nextLine();
        System.out.println("Member State(XX): ");
        String state = myObj.nextLine();
        System.out.println("Member Zip Code: ");
        int zipCode = Integer.valueOf(myObj.nextLine());
        Member member = new Member(name, number, address, city, state, zipCode);
        this.members.add(member);
        System.out.println("Member Added!" + "\n");
    }

    public void updateMember(String memberName) throws ParseException {
        deleteMember(memberName);
        createMember();
    }

    public void createProvider() {
        System.out.println("Provider Name: ");
        String name = myObj.nextLine();
        System.out.println("Provider Number: ");
        int number = Integer.valueOf(myObj.nextLine());
        System.out.println("Provider Street Address: ");
        String address = myObj.nextLine();
        System.out.println("Provider City: ");
        String city = myObj.nextLine();
        System.out.println("Provider State(XX): ");
        String state = myObj.nextLine();
        System.out.println("Provider Zip Code: ");
        int zipCode = Integer.valueOf(myObj.nextLine());
        Provider provider = new Provider(name, number, address, city, state, zipCode);
        this.providers.add(provider);
        System.out.println("Provider Added!" + "\n");
    }

    public void updateProvider(String providerName) throws ParseException {
        deleteProvider(providerName);
        createProvider();
    }

}
