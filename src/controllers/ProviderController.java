package controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Member;
import services.ServiceProvided;
import java.util.Objects;
import java.util.Scanner;

public class ProviderController {

    public static int DEFAULT_FEE = 0;
    public static int DEFAULT_MEMBER_NUMBER = 000000000;
    Member member;
	ServiceProvided service = new ServiceProvided("example service", "00-00-0000", 000000, "provider name", 000000, 000000000, "member name", 100, "example comments");
        
    public ProviderController() {

    }

    public void billChocAn(int amount) {

		validateMember(member);

		
		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();

		Scanner readCode = new Scanner(System.in);
		int serviceCode = scanner.nextInt();

		if (Objects.equals(serviceCode, 000000)) {
			String serviceName = service.getServiceName();

			for (int i = 0; i < 20; i++)
				System.out.print(serviceName.charAt(i)));
		}

		System.out.println("Enter comments");
		System.out.println("[1] Yes");
		System.out.println("[2] No");

		Scanner option = new Scanner(System.in);

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
	

	public void requestProviderDirectory() {

	}
}
