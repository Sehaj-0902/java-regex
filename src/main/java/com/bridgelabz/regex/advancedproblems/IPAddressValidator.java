package com.bridgelabz.regex.advancedproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IPAddressValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP address: ");
        String addressIP = sc.nextLine();

        if (isValidIPAddress(addressIP)) {
            System.out.println("The IP address " + addressIP + " is valid.");
        }
        else {
            System.out.println("The IP address " + addressIP + " is invalid.");
        }
    }

    // Method to validate IP address
    public static boolean isValidIPAddress(String addressIP) {
        String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(addressIP).matches();
    }
}

/*
Input:
    Enter IP address: 192.3.0.123
Output:
    The IP address 192.3.0.123 is valid.

Input:
    Enter IP address: 270.1.2.255
Output:
    The IP address 270.1.2.255 is invalid.

Input:
    Enter IP address: 192.0.0.0
Output:
    The IP address 192.0.0.0 is valid.
 */