package com.corentings.ex1;

import org.jetbrains.annotations.NotNull;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


    public static String removeTrailingZero(@NotNull String s) {
        if (s.contains(".")) {
            s = s.replaceAll("0*$", "");
            if (s.endsWith(".")) {
                s = s.substring(0, s.length() - 1);
            }
        }
        // Remove leading zeros
        s = s.replaceAll("^0*", "");
        if (s.isEmpty()) {
            s = "0";
        }
        return s;

    }

    public static String ex14(float n) {
        return String.format("%010.5f", n);

    }
}
