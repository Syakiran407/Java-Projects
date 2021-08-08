package com.kiranmetz;

public class Customer {

    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(String name) {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void PrintDetails() {
        System.out.println(getName);
    }
}
