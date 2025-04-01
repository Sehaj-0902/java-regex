package com.bridgelabz.regex.basicproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LicensePlateValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter license plate number: ");
        String licenseNumber = sc.nextLine();

        if (isValidLicensePlateNumber(licenseNumber)) {
            System.out.println("The license plate number " + licenseNumber + " is valid.");
        }
        else {
            System.out.println("The license plate number " + licenseNumber + " is invalid.");
        }
    }

    // Method to validate license plate number
    public static boolean isValidLicensePlateNumber(String licenseNumber) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(licenseNumber).matches();
    }
}

/*
Input:
    Enter license plate number: AB1234
Output:
    The license plate number AB1234 is valid.

Input:
    Enter license plate number: A12345
Output:
    The license plate number A12345 is invalid.
 */