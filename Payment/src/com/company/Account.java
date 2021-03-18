package com.company;

public class Account {
    private String[] values;

    public Account(String[] values) {
        this.values = values;

    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }

    public String getSpecificValue(int index) {
        return values[index];
    }
}





//    private int transDate;
//    private String product;
//    private int price;
//    private String paymentType;
//    private int cardNumber;
//    private String name;
//    private String city;
//    private String state;
//    private String country;
//    private int createdAccountDate;
//    private int lastLogin;
//    private int latitude;
//    private int longitude;
//
//    private
//
//    public Account(int transDate, String product, int price, String paymentType, int cardNumber, String name, String city, String state, String country, int createdAccountDate, int lastLogin, int latitude, int longitude) {
//        this.transDate = transDate;
//        this.product = product;
//        this.price = price;
//        this.paymentType = paymentType;
//        this.cardNumber = cardNumber;
//        this.name = name;
//        this.city = city;
//        this.state = state;
//        this.country = country;
//        this.createdAccountDate = createdAccountDate;
//        this.lastLogin = lastLogin;
//        this.latitude = latitude;
//        this.longitude = longitude;
//    }

