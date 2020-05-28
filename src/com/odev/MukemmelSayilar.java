package com.odev;

public class MukemmelSayilar {

    public static void main(String[] args) {
        //main
    }

    public static void mukemmelSayilariBul(int limit){

        //Mukemmel sayi olmasi icin bolenleri toplamı kendisine esit olmali
        int sayac = 6; //en kucuk mukemmel sayi 6 oldugu icin 6dan baslattım
        int toplam = 0;

        int [] mukemmelSayilar = new int[10];
        int index = 0; //mukemmel sayilara eleman ekleyebilmek icin eklendi


        for (int i = sayac; i <= limit; i++) { //alt limit - ust limit arasindaki tum sayilari kontrol ediyor.

            for (int j = 1; j < sayac; j++) {
                if ((sayac % j) == 0) { //sayinin bolumunden kalan 0 oldugunda toplama kat
                    toplam = toplam + j;
                    // sayi = 6 , toplam = 1 + 2 + 3 =6
                }
            }

            if (toplam == sayac) {
                    mukemmelSayilar[index] = toplam; //mukemmelSayilar[index] = sayac;
                    System.out.println(sayac + " mukemmel sayilara eklendi"); //hangi sayinin eklendigini gormek icin
                    index = index +1;
            }

            sayac ++;
            toplam = 0;
        }

        System.out.print("1 ile " +limit +" arasındaki mukemmel sayılar : ");

        for (int i = 0; i < mukemmelSayilar.length; i++) {
            if(mukemmelSayilar[i] != 0){
                System.out.print(mukemmelSayilar[i] + " ");
            }
        }


    }

}
