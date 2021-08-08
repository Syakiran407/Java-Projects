package com.kiranmetz;

public class ControlFlow {

    public static void main (String [] args) {

        boolean hungry = true;

        if (!hungry){
            System.out.println("Eat");
        } else {
            System.out.println("Drink");
        }

        int hungerRating = 5;

        if (!(hungerRating < 6)){
            System.out.println("Not hungry");
        } else {
            System.out.println("I am straving");
        }




    }
}
