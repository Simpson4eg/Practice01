package com.netcracker2017;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        String[] stringArray = new String[]{"zb", "yb", "za", "fg", "fa", "az"};
        sort(stringArray);
        print(stringArray);
    }

    public static void print(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void sort(String[] args) {
        // or just Arrays.sort(args);
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length - i - 1; j++) {
                if ((args[j].compareTo(args[j + 1])) > 0) {
                    String temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
        }
    }
}
