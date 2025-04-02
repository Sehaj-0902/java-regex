package com.bridgelabz.regex.extractionproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String regex = "[A-Z]\\w+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            System.out.println("Capitalized word: " + matcher.group());
        }
    }
}

/*
Input:
    Enter a sentence: The Eiffel Tower is in Paris and the Statue of Liberty is in New York.
Output:
    Capitalized word: The
    Capitalized word: Eiffel
    Capitalized word: Tower
    Capitalized word: Paris
    Capitalized word: Statue
    Capitalized word: Liberty
    Capitalized word: New
    Capitalized word: York
 */