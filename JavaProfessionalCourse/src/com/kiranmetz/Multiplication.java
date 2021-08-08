package com.kiranmetz;

public class Multiplication {

    public void ShowTable (int front) {
        for (int back = 0; back <= 10; back++) {
            System.out.println(front + " * " + back + " = " + front * back);
        }
    }

    public static void main (String [] args) {
        Multiplication multiplication = new Multiplication();

        for (int i = 1; i <= 12; i++) {
            multiplication.ShowTable(i);
            System.out.println("");
        }

//        for (int i = 1; i <= 12; i++){
//            for (int back = 0; back <= 10; back++) {
//                System.out.println(i + " * " + back + " = " + i * back);
//            }
//        }


    }
}
