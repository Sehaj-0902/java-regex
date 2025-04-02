package com.bridgelabz.regex.replacemodifyproblems;

import java.util.Scanner;

public class SpaceReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String replacedText = text.replaceAll("\\s+", " ");

        System.out.println("Original: " + text);
        System.out.println("Formatted: " + replacedText);
    }
}

/*
Input:
    Enter text: This   is    a  text   with    multiple  spaces.
Output:
    Original: This   is    a  text   with    multiple  spaces.
    Formatted: This is a text with multiple spaces.
 */