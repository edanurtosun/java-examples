package com.odev;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Araligin ust limitini giriniz: ");
        Scanner girilenSayi = new Scanner(System.in);
        int ustLimit = girilenSayi.nextInt();
        System.out.println(ustLimit); // dogru mu alindi kontrol yapiyorum

        MukemmelSayilar msayi = new MukemmelSayilar(); //MukemmelSayilar sinifina ait nesne olusturuldu
        msayi.mukemmelSayilariBul(ustLimit);

    }

}
