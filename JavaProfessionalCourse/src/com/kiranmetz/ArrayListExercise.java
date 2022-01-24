package com.kiranmetz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) {

        ArrayList<String> pokemonArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        int n, t;
        boolean canDelete = false;
        boolean loop = true;
        boolean canSearch = false;
        boolean canUpdate = false;

        while (loop) {

            try {

                System.out.println("Enter/Search/Update/Delete a name or Exit: ");
                input = scanner.nextLine().toLowerCase();

                if (!input.equals("remove") && !input.equals("delete") && !input.equals("exit") && !input.equals("search") && !input.equals("update")) {
                    pokemonArrayList.add(input);
                    System.out.println(pokemonArrayList);
                }

                if (input.equals("remove")) {
                    pokemonArrayList.remove("remove");
                    pokemonArrayList.remove(pokemonArrayList.size() - 1);
                    System.out.println(pokemonArrayList);
                }

                if (input.equals("delete")) {
                    canDelete = true;
                    if (canDelete) {
                        System.out.println("Input index to delete: ");
                        n = scanner.nextInt();
                        scanner.nextLine();
                        pokemonArrayList.remove(n);
                        System.out.println(pokemonArrayList);
                    }
                }

                if (input.equals("search")) {
                    canSearch = true;
                    if (canSearch) {
                        System.out.println("Input the start index");
                        t = scanner.nextInt();
                        System.out.println("Input the end index");
                        n = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Here is your searched index: " + pokemonArrayList.subList(t, n));
                    }
                }

                if (input.equals("update")) {
                    canUpdate = true;
                    if (canUpdate) {
                        System.out.println("Input the index you want to update: ");
                        n = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter the updated name: ");
                        input = scanner.nextLine().toLowerCase();
                        pokemonArrayList.set(n, input);
                        System.out.println(pokemonArrayList);
                    }
                }

                if (input.equals("exit")) {
                    System.out.println("Exiting Program...");
                    loop = false;
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Seems like you don't have anything stored in the ArrayList " + e);
            }

        }

    }
}
