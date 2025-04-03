package com.bridgelabz.regex.replacemodifyproblems;

import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] list = {"damn", "stupid", "idiot"};

        System.out.println("Original sentence: " + sentence);

        for (String str : list) {
            sentence = sentence.replaceAll(str + "\\b", "****");
        }

        System.out.println("Censored sentence: " + sentence);
    }
}

/*
Input:
    Enter a sentence: This is a damn bad sentence with stupid words.
Output:
    Original sentence: This is a damn bad sentence with some stupid words.
    Censored sentence: This is a **** bad sentence with some **** words.
 */