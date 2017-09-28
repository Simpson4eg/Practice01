package com.netcracker2017;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        print(new String[]{"sdf", "test", "another one"});
    }

    public static void print(String[] args){
        for(String s : args){
            System.out.println(s);
        }
    }
}
