package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.printData(5);

        for (int i = 0; i < 4; i++) {
            controller.checkCardNumber(controller.getCreditCardNumb(i));
        }
    }
}