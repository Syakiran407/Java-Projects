package com.kiranmetz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int choice;
        System.out.println("Choose your number here: ");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("Select your number: ");

        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        capitals(choice);
    }

    public static void capitals(int ch){

        switch (ch){
            case 1:
                System.out.println("Malaysia");
                break;
            case 2:
                System.out.println("Brunei");
                break;
            case 3:
                System.out.println("Indonesia");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
