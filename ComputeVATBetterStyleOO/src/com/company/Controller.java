package com.company;

import java.util.Scanner;

public class Controller {
    final static String MSG = "MOMS";

    public static void runController() {
        double userIn = Dialog.doDiag();

        double moms = VAT.doVAT(userIn);
        View.doView(moms,MSG);
    }
}
