package controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Member;
import java.util.Scanner;

public class ProviderController {

    public static int DEFAULT_FEE = 0;
    public static int DEFAULT_MEMBER_NUMBER = 000000000;
    Member member;
        
    public ProviderController() {

    }

	/* MOVE to terminal */
    public void billChocAn(int amount, int serviceCode) {
		/*
		  * validate member with card or member number
		  enter date
		  look up service code (enter service name and code is returned)
		  key in service code
		  display service name up to 20 chars or error message
		  optionally enter comments
		  */

		Scanner scanner = new Scanner(System.in);
		


		  

		


    }

	public void requestProviderDirectory() {

	}
}
