package com.odev;
import java.util.Scanner;

public class EnginDemirog {
    public static void main(String[] args) {
        int [] sayilar = new int[]{1,2,3,4,5,6,7,8,9,10};
        boolean sonuc;
        System.out.println("Aranacak sayiyi giriniz : ");
        Scanner girdi = new Scanner(System.in);
        int s = girdi.nextInt();
        sonuc = sayiBul(sayilar,s);

        if(sonuc == true){
            System.out.println(s +" sayilar dizisinde vardır.");
        }
        else{
            System.out.println(s +" sayilar dizisinde yoktur.");
        }

    }

    public static boolean sayiBul(int [] d, int sayi){

        for (int i = 0; i < d.length ; i++) {
            if(sayi == d[i]){
                return true;
            }
        }
        return false;
    }
}
