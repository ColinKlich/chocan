package controllers;

import services.*;
import accounts.*;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import accounts.Member;

public class ProviderController {

	ProviderDirectory providerDirectory;
	List<Service> serviceList;
	Service service;
	ServiceProvided serviceProvided;
    Member member;    
	String serviceDate, comments, serviceName;
	int fee, code;    

    public ProviderController() {
		providerDirectory = new ProviderDirectory();
		serviceList = providerDirectory.services;
    }

    public void billChocAn(AccountsController accounts, Provider provider) {

		// ensure membership status is valid
		if (!validateMember(accounts)) {
			return;
		}

		// read date from input and store for service
		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();
		scanner.close();

		serviceDate = date;

		// while loops takes service code from input until provider verifies correct service is displayed
		boolean unverified = true;
		System.out.println("Enter service code: ");

		while (unverified) {

			Scanner readCode = new Scanner(System.in);
			int serviceCode = readCode.nextInt();
			readCode.close();

			for(Service curr : serviceList){
				if (curr.getCode() == serviceCode){
					service = curr;
					if (curr.getName().length() < 20) {
						System.out.println(curr.getName());
					}
					else {
						for (int i = 0; i < 20; i++) {
							System.out.print(curr.getName().charAt(i));
						}
					}
					break;
				}
				System.out.print("Service Code not Found");
				return;
			}

			System.out.print("Verify service:");
			System.out.print("[1] Correct");
			System.out.print("[2] Incorrect");	
			
			Scanner getVerification = new Scanner(System.in);
			int verification = getVerification.nextInt();

			if (Objects.equals(verification, 1)) {
				unverified = false;
			}
			else if (Objects.equals(verification, 2)) {
				System.out.print("Reenter service code:");
				unverified = true;
			}
			else {
				System.out.print("Invalid input");
				unverified = true;
			}
			getVerification.close();
		}

		//prints fee associated with input serviceCode's service
		System.out.print("Amount billed to ChocAn: $" + fee);

		//gives provider option to enter comments
		System.out.println("Enter comments");
		System.out.println("[1] Yes");
		System.out.println("[2] No");

		Scanner scanner2 = new Scanner(System.in);
		int option = scanner2.nextInt();
		scanner2.close();		

		//sets service's comments field equal to input from provider, else returns
		if (option == 1) {
			System.out.println("Enter comments:");
			String enteredComments = scanner.nextLine();
			comments = enteredComments;
		}
		else if (option == 2) {
			return;
		}
		else {
			System.out.println("Invalid input");
			return;
		}
		
		serviceProvided = new ServiceProvided(service, serviceDate, provider.getName(), provider.getNumber(), member.getNumber(), member.getName(), comments);
		member.addServiceUsed(serviceProvided);
		provider.addServicesProvided(serviceProvided);
	}

	public void requestProviderDirectory(List<Service> providerDirectory) {
		// print providerDirectory service list
		for (Service service: providerDirectory){
			System.out.print("Service Name: " +service.getName()+"\n");
			System.out.print("Service Code: "+service.getCode()+"\n");
			System.out.print("Service Fee: "+service.getFee()+"\n");
		}

	}

	public boolean validateMember(AccountsController accounts) {
		// take member number input from provider
        System.out.print("Enter Member Number:");

		Scanner input = new Scanner(System.in);
        int memberNum = input.nextInt();
		// set member equal to Member object with that memberNum
		member = accounts.getMember(memberNum);
		input.close();

		//print member status and return boolean value for valid status or invalid and reason
        if (member.getMemberStatus().equals("Valid")) {
			System.out.println("Validated");
			return true;
		}
		else if (member.getMemberStatus().equals("Invalid number")) {
			System.out.println("Invalid number");
			return false;
		}
		else if (member.getMemberStatus().equals("Suspended")) {
			System.out.println("Suspended");
			return false;
		}
		else {
			return false;
		}

    }
}
