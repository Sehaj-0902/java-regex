package com.bridgelabz.regex.extractionproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String regex = "(https|http)?://(www\\.)?[a-zA-Z0-9]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Email address: " + matcher.group());
        }
    }
}

/*
Input:
    Enter text: Visit https://www.google.com and http://example.org for more info.
Output:
    Email address: https://www.google.com
    Email address: http://example.org
 */