package com.bridgelabz.regex.extractionproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String regex = "[a-zA-Z0-9_.]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Email address: " + matcher.group());
        }
    }
}

/*
Input:
    Enter text: Contact us at support@example.com and info@company.org
Output:
    Email address: support@example.com
    Email address: info@company.org
 */