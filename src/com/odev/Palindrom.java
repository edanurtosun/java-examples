package com.odev;
import java.util.Random;
public class Palindrom {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] izmit = new int[10];//yasadigim sehir olan izmiti int tipli dizi olarak tanimladim

        gizemCicekcilik(izmit);// tanimladigim diziyi rasgele sayilarla doldurmak icin gizemcicekcilik fonksiyonuna gonderdim
        elma(izmit);
        su(izmit);
    }

    public static void gizemCicekcilik(int[] manti) {

        Random r = new Random();
        int altSinir = 11;
        int ustSinir = 1500000;
        int sonuc;

        for (int i = 0; i < 10; i++) {
            sonuc = (int) r.nextInt(ustSinir - altSinir) + altSinir; // sonuc degiskenine  11 ile 1,500,000 arasinda rastgele sayi uretiyorum
            manti[i] = sonuc;// rastgele olusturalan sonuc elemani izmit dizisine aktarilir
        }

        for (int j = 0; j <= 9; j++) {
            System.out.println(manti[j] + " ");
        }
        //elma(manti);
    }

    public static void elma(int[] meyve) {
        /* armstrong olup olmadigini belirlemek icin verilen degerler
        meyve[0]=153;
        meyve[1]=370;
        meyve[2]=407;
        meyve[3]=371;
         */
        int birler, onlar, yuzler, binler, onbinler, yüzbinler, milyon, toplam;

        System.out.println("\nArmstrong Sayılar :");

        for (int i = 0; i < 10; i++) {

            milyon = meyve[i] / 1000000;
            yüzbinler = (meyve[i] % 1000000) / 100000;
            onbinler = (meyve[i] % 100000) / 10000;
            binler = (meyve[i] % 10000) / 1000;
            yuzler = (meyve[i] % 1000) / 100;
            onlar = (meyve[i] % 100) / 10;
            birler = meyve[i] % 10;

            toplam = (int) (Math.pow(milyon, 3) + Math.pow(yüzbinler, 3) + Math.pow(onbinler, 3) + Math.pow(binler, 3) + Math.pow(yuzler, 3) + Math.pow(onlar, 3) + Math.pow(birler, 3));

            if (meyve[i] == toplam) {

                System.out.println(i + ".index " + ":" + meyve[i] + " ARMSTRONG SAYİDİR");
            } else {
                System.out.println(meyve[i] + " ARMSTRONG BİR SAYİ DEGİLDİR");
            }
        }
        //su(meyve);
    }

    public static void su(int[] rize) {
        System.out.println("\nPalindrom metodu");

        /*palindrom sayilari ornek olarak deger verdim
        rize[0] = 111;
        rize[5]= 1551;*/

        int kalan,deger=0;
        int palindrom;

        for (int i = 0; i < 10; i++) {
            palindrom = rize[i];
            int ilkdeger = palindrom;
            int length = String.valueOf(palindrom).length();

            for (int j = 0; j <length ; j++) {
                kalan = palindrom  % 10;
                deger = deger * 10 + kalan;
                palindrom = palindrom /10;
            }

            if(deger == ilkdeger) {
                System.out.println(rize[i] + " palindrom sayıdır.");
            }
            else {
                System.out.println(rize[i]+ " palindrom sayı değildir.");
            }
            deger = 0;


        }


    }


}
