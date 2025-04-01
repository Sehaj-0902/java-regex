package com.bridgelabz.regex.basicproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        isValidUsername(username);

        if (isValidUsername(username)) {
            System.out.println("The username " + username + " is valid.");
        }
        else {
            System.out.println("The username " + username + " is invalid.");
        }
    }

    // Method to validate username
    public static boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(username).matches();
    }
}

/*
Input:
    Enter username: sehaj_123
Output:
    The username sehaj_123 is valid.

Input:
    Enter username: 123sehaj
Output:
    The username 123sehaj is invalid.

Input:
    Enter username: seh1
Output:
    The username seh1 is invalid.
 */