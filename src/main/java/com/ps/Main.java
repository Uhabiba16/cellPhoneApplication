package com.ps;

public class Main {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone("2597153", "iPhone 15 Pro Max", " Verizon", "888-555-1234", "Sandra");
//    cellPhone1.setName("apple");
        System.out.println("What is the serial number? " + cellPhone1.getSerialNumber());
        System.out.println("What model is the phone? " + cellPhone1.getModel());
        System.out.println("Who is the carrier? " + cellPhone1.getCarrier());
        System.out.println("What is the phone number? " + cellPhone1.getPhoneNumber());
        System.out.println("Who is the owner of the phone? " + cellPhone1.getOwner());
    }
}