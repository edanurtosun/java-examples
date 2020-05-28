package com.odev;

public class MainProduct {

    public static void main(String[] args) {
        /*Product product1 = new Product();
        product1.setName("laptop");

        Product product2 = new Product();
        product2.setName("mause");

        *//*
        System.out.println(product1.getName());
        System.out.println(product2.getName());
        *//*

        Product [] urunler = new Product[]{product1,product2};

        for (int i = 0; i < urunler.length ; i++) {
            System.out.println(urunler[i].getName());
        }*/

        //polimorfizm ornegi
        CreditManager creditManager = new CreditManager();
        creditManager.add();
        creditManager.calculate();

        MortgageManager mortgageManager = new MortgageManager();
        mortgageManager.add();

        CreditManager[] credits = new CreditManager[3];
        credits[0] = new MortgageManager();
        credits[1] = new VehicleManager();
        credits[2] = new OfficerManager();

        for (int i = 0; i < credits.length ; i++) {
            credits[i].calculate(); // polimorfizm
        }

    }
}
