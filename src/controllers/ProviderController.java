package controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Member;

public class ProviderController {

    public static int DEFAULT_FEE = 0;
    public static int DEFAULT_MEMBER_NUMBER = 000000000;
    Member member;
        
    public ProviderController() {

    }

    public void billChocAn(int amount, int serviceCode) {
        /*
         * access List of servicesProvided to get totalfee
         */

		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);

		System.out.println("Enter member number: ");

		int memberNumber = 0;
		try {
			String fromUser = br.readLine();
			memberNumber = Integer.parseInt(fromUser);
		} catch (Exception e) {
			memberNumber = DEFAULT_MEMBER_NUMBER;
		}

		/*
		 * 
		 */

        


         System.out.println("Fee owed to provider: $" + totalFee);
    }

	public void requestProviderDirectory() {

	}
}
