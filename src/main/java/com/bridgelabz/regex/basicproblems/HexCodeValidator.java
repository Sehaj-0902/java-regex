package com.bridgelabz.regex.basicproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HexCodeValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hex color code: ");
        String hexCode = sc.nextLine();

        if (isValidHexColorCode(hexCode)) {
            System.out.println("The hex color code " + hexCode + " is valid.");
        }
        else {
            System.out.println("The hex color code " + hexCode + " is invalid.");
        }
    }

    // Method to validate hex color code
    public static boolean isValidHexColorCode(String hexCode) {
        String regex = "^#[a-fA-F0-9]{6}$";
        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(hexCode).matches();
    }
}

/*
Input:
    Enter hex color code: #FFA500
Output:
    The hex color code #FFA500 is valid.

Input:
    Enter hex color code: #ff4500
Output:
    The hex color code #ff4500 is valid.

Input:
    Enter hex color code: #ff00A
Output:
    The hex color code #ff00A is invalid.
 */