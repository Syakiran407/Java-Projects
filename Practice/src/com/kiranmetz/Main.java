package com.kiranmetz;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Encrypt();
        Decrypt();

    }

    public static void Encrypt() {
        int n = 5;

        // Creating an empty LinkedList
        LinkedList<String> list = new LinkedList<String>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your message here: ");

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }

        // Displaying the list
        System.out.println("List of your message: " + list);

        String message = list.toString()
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();           //remove trailing spaces from partially initialized arrays;

        System.out.println("Full Message: " + message);

        char[] chars = message.toCharArray();
        System.out.println("Here is your encrypted keys: ");
        for (char c : chars) {
            c += 5;
            System.out.print(c);
        }
    }

    public static void Decrypt() {
        String message;
        int key = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Enter your message to Decrypt: ");
        message = scanner.nextLine().replaceAll(" ", "");

        //convert string into character array. It returns a newly created character array, its length is similar to this string and its contents are initialized with the characters of this string.
        char[] chars = message.toCharArray();

        System.out.println("Your Decrypted Message is: ");
        for (char c : chars) {
            c -= key;
            System.out.print(c);
        }

        System.out.println("");
    }
}
