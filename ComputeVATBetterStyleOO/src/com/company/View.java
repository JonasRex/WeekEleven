package com.company;

public class View {

    final static String CURRENCY = "Kr";
    public static void doView(double result, String MSG) {
        System.out.printf("Du betaler %.2f%3s i %s%n", result, CURRENCY, MSG);
    }
}
