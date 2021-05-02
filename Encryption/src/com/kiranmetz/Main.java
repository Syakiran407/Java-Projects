package com.kiranmetz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Encrypt();
        Decrypt();
    }

    public static void Encrypt() {
        String message;
        int key = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("" +
                "============================================ " +
                "Starting Encryption and Decryption Message Program" +
                "============================================");

        System.out.print("Enter your message to encrypt: ");
        message = scanner.nextLine();

        //convert string into character array. It returns a newly created character array, its length is similar to this string and its contents are initialized with the characters of this string.
        char[] chars = message.toCharArray();

        System.out.println("Your Encrypted Message is: ");

        for (char c: chars) {
            c += key;
            System.out.print(c);
        }

    }

    public static void Decrypt(){
        String message;
        int key = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Enter your message to Decrypt: ");
        message = scanner.nextLine().replaceAll(" ", "");

        //convert string into character array. It returns a newly created character array, its length is similar to this string and its contents are initialized with the characters of this string.
        char[] chars = message.toCharArray();

        System.out.println("Your Decrypted Message is: ");
        for (char c: chars) {
            c -= key;
            System.out.print(c);
        }
        System.out.println("");
    }
}
