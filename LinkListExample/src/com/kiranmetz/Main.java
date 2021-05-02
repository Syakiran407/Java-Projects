package com.kiranmetz;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<String> myList = new LinkedList<String>();

        myList.add("0");

        Scanner scanner = new Scanner(System.in); //take user input

        System.out.println("Please type anything: ");
        int n = 5; //Store 5 List

        for(int i = 0; i < n; i++) {

            myList.add(scanner.nextLine());
        }

        System.out.println("Here are your LinkedList: ");

        for (String s : myList) {
            System.out.println(s);
        }

        System.out.println("Successfully removed: " + myList.removeFirst());
        System.out.println("Here are your remaining LinkedList: " + myList);

    }
}
