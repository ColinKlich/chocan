//Colin klich
package controllers;

import utilities.*;
import accounts.*;
import java.util.List;
import java.io.File;
import java.text.ParseException;
import java.util.Scanner;

public class AccountsController {
    Members members;
    Providers providers;
    Scanner myObj = new Scanner(System.in);

    public AccountsController() {
        members = new Members();
        providers = new Providers();
    }

    public List<Member> getMembers() {
        return members.memberList;
    }

    public Member getMember(int memberNumber) {
        for (Member member : members.memberList) {
            if (member.getNumber() == memberNumber) {
                return member;
            }
        }
        return new Member();
    }

    public Provider getProvider(int providerNumber) {
        for (Provider provider : providers.providerList) {
            if (provider.getNumber() == providerNumber) {
                return provider;
            }
        }
        return new Provider();
    }

    public List<Provider> getProviders() {
        return providers.providerList;
    }

    public void addMember(String memberName, int memberNumber, String address, String city,
            String state, int zipCode) {
        Member member = new Member(memberName, memberNumber, address, city, state, zipCode);
        members.memberList.add(member);
    }

    public void addProvider(String providerName, int providerNumber, String address, String city,
            String state, int zipCode) {
        Provider provider =
                new Provider(providerName, providerNumber, address, city, state, zipCode);
        providers.providerList.add(provider);
    }

    public void deleteMember(String name) {
       	for (Member member: members.memberList) {
    		if (member.getName() == name) {
    	        System.out.println("Member Deleted!" + "\n");
    		}
    	}
        members.memberList.removeIf(memberList -> memberList.getName().equals(name));
        String path = System.getProperty("user.dir")+File.separator+"src\\accounts\\accounts_storage\\Member_accounts";
        File memberDir = new File(path);
    	for(File memberFile: memberDir.listFiles()) {
    	    if (memberFile.getName()== name+".txt") { 
    	        memberFile.delete();
    	        break;
    	    }
    	}
    }

    public void deleteProvider(String name) {
    	for (Provider provider: providers.providerList) {
    		if (provider.getName() == name) {
    	        System.out.println("Provider Deleted!" + "\n");
    		}
    	}
        providers.providerList.removeIf(providersList -> providersList.getName().equals(name));
        String path = System.getProperty("user.dir")+File.separator+"src\\accounts\\accounts_storage\\Provider_accounts";
        File providerDir = new File(path);
    	for(File providerFile: providerDir.listFiles()) {
    	    if (providerFile.getName()== name+".txt") { 
    	        providerFile.delete();
    	        break;
    	    }
    	}
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
        members.memberList.add(member);
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
        providers.providerList.add(provider);
        System.out.println("Provider Added!" + "\n");
    }

    public void updateProvider(String providerName) throws ParseException {
        deleteProvider(providerName);
        createProvider();
    }

}
