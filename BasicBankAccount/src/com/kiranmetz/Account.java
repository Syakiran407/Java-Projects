package com.kiranmetz;

import java.util.Arrays;

public class Account {

    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void PrintDetails(){
        System.out.println(getName() + ", " + getAge());
    }
}
