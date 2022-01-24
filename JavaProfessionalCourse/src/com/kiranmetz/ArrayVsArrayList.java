package com.kiranmetz;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

    public static void main(String[] args) {

        /* Array can hold primitive data types such as int, String, long, boolean, etc */
        String[] friendsArray = new String[4]; //Array has a fixed size
        String[] friends2Array = {"John", "Chris", "Eric", "Luke"};
        int[] numbersArray = new int[4];
        int[] numbersArray2 = {1,2,3,4};

        /* ArrayList can only hold objects, for example if you want to use int, use Integer instead of int */
        ArrayList<String> friendsArrayList = new ArrayList<>(); //ArrayList does not have fixed size
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
        ArrayList<Integer> numberArrayList = new ArrayList<>();
        ArrayList<Integer> numberArrayList2 = new ArrayList<>(Arrays.asList(1,2,3,4));

        /* To get the value from an Array, you need to specify the index that you want.
        * To get the value from an ArrayList, you need to specify the index that you want in .get method */
        System.out.println(friends2Array[0]);
        System.out.println(friendsArrayList2.get(0));

        /* To get the size from an Array, you need to use .length method
        * To get the size from an ArrayList, you need to use .size method */
        System.out.println(friends2Array.length);
        System.out.println(friendsArrayList2.size());

        /* We cannot add/insert another element into an Array but in ArrayList we can */
        friendsArrayList2.add("Kiran");
        System.out.println(friendsArrayList2.get(4));

        /* To set an element in an Array, we can just assign the new value in the specific index
        * */
        friends2Array[0] = "Karlson";
        System.out.println(friends2Array[0]);
        friendsArrayList2.set(0, "Karlson");
        System.out.println(friendsArrayList2.get(0));

        /* We cannot remove an element from an Array, but we can do that in ArrayList */
        friendsArrayList2.remove("Chris");
        System.out.println(friendsArrayList2.get(1));

        /* Printing an Array is pretty useless, printing an ArrayList works perfectly  */
        System.out.println(friends2Array);
        System.out.println(friendsArrayList2);

        for(int i = 0; i < friends2Array.length; i++){
            System.out.println(friends2Array[i]);
        }

    }
}
