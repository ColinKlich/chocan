package controllers;

import services.ProviderDirectory;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
/*import java.lang.reflect.Member;*/
import services.ServiceProvided;
import java.util.Objects;
import java.util.Scanner;
import accounts.Member;

public class ProviderController{

    public static int DEFAULT_FEE = 0;
    public static int DEFAULT_MEMBER_NUMBER = 000000000;
    Member member;
	ServiceProvided service = new ServiceProvided("Example Service A", "00-00-0000", 000000, "provider name", 000000, 000000000, "member name", 100, "example comments");
        
    public ProviderController() {
    }

    public void billChocAn(AccountsController accounts) {

		// ensure membership status is valid
		if (Objects.equals(validateMember(accounts), false)) {
			return;
		}

		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();
		scanner.close();
		// do what with date?
		// store in serviceProvided

		boolean unverified = true;

		while (unverified) {
			
			Scanner getVerification = new Scanner(System.in);
			int verification = getVerification.nextInt();
			getVerification.close();

			Scanner readCode = new Scanner(System.in);
			int serviceCode = readCode.nextInt();
			readCode.close();

			if (Objects.equals(serviceCode, 000000)) {
				String serviceName = service.getServiceName();

				for (int i = 0; i < 20; i++)
					System.out.print(serviceName.charAt(i));
			}

			System.out.print("Verify service:");
			System.out.print("[1] Correct");
			System.out.print("[2] Incorrect");		

			if (Objects.equals(verification, 1)) {
				unverified = false;
			}
			else if (Objects.equals(verification, 2)) {
				System.out.print("Reenter service code:");
				unverified = true;
			}
		}

		System.out.print("Amount billed to ChocAn: $" + service.fee);


		System.out.println("Enter comments");
		System.out.println("[1] Yes");
		System.out.println("[2] No");

		Scanner scanner2 = new Scanner(System.in);
		String option = scanner2.nextLine();
		scanner2.close();		

		if (Objects.equals(option, "1")) {
			System.out.println("Enter comments:");
			String enteredComments = scanner.nextLine();
			service.comments = enteredComments;
		}
		else if (Objects.equals(option, "2"))
			return;
		else {
			System.out.println("Invalid input");
			return;
		}
	}

	public void requestProviderDirectory(ProviderDirectory providerDirectory) {
		// print services from providerDirectory

	}

	public boolean validateMember(AccountsController accounts) {
        System.out.print("Enter Member Number:");
		Scanner input = new Scanner(System.in);
		input.close();
        int memberNum = input.nextInt();
		// do what with memberNum?
		member = accounts.getMember(memberNum);

        if (Objects.equals(member.getMemberStatus(), "Valid")) {
			System.out.println("Validated");
			return true;
		}
		else if (Objects.equals(member.getMemberStatus(), "Invalid number")) {
			System.out.println("Invalid number");
			return false;
		}
		else if (Objects.equals(member.getMemberStatus(), "Suspended")) {
			System.out.println("Suspended");
			return false;
		}
		else {
			return false;
		}
    }
}
