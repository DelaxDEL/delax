package com.example.model;

public class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public void displayAddress() {
        System.out.println("Address: " + street + ", " + city);
    }
}