package controllers;

import accounts.*;
import java.util.List;
import java.util.ArrayList;

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

    public void addMember(String memberName, int memberNumber, String address, String city, String state, int zipCode){
        Member member = new Member(memberName, memberNumber, address, city, state, zipCode);
        this.members.add(member);
    }

    public void addProvider(String providerName, int providerNumber, String address, String city, String state,
                            int zipCode){
        Provider provider = new Provider(providerName, providerNumber, address, city, state, zipCode);
        this.providers.add(provider);
    }

    public void deleteMember(String name){
        members.removeIf(member -> member.getName().equals(name));
    }

    public void deleteProvider(String name){
    providers.removeIf(provider -> provider.getName().equals(name));
    }
}
