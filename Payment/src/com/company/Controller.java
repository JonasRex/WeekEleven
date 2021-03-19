package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    private ArrayList<Account> accounts = new ArrayList<>();

    public Controller() {
        loadData();
        checkCardNumber(accounts.get(2).getSpecificValue(4));
    }

    public void loadData() {
        String path = "src/com/company/data.txt";
        String line = "";
        {
            try {
                BufferedReader br = new BufferedReader(new FileReader(path));

                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    // Makes sure that first line doesnt get added as new account
                    if (!values[0].equals("Transaction_date")) {
                        accounts.add(new Account(values));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void printData(int index) {
        for (Account a : accounts) {
            System.out.println(a.getSpecificValue(index));

        }
    }


    public boolean checkCardNumber(String str) {
        int[] ints = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ints[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        for (int i = ints.length - 2; i >= 0; i = i - 2) {
            int j = ints[i];
            j = j * 2;
            if (j > 9) {
                j = j % 10 + 1;
            }
            ints[i] = j;
        }
        int sum = 0;
        for (int anInt : ints) {
            sum += anInt;
        }

        if (sum % 10 == 0) {
            System.out.println(str + " is a valid credit card number.");
            return true;

        } else {
            System.out.println(str + " is an invalid credit card number.");
            return false;
        }
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public String getCreditCardNumb(int index) {
         return accounts.get(index).getSpecificValue(4);
    }
}
